/**Задача 2. Межпоточный диалог со счетчиком**/
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(4);
        List<MyThread> myThreadList = new ArrayList<>();
        myThreadList.add(new MyThread("Первый"));
        myThreadList.add(new MyThread("Второй"));
        myThreadList.add(new MyThread("Третий"));
        myThreadList.add(new MyThread("Четвертый"));
        /**полуение результаты выполнения всех задач**/
 /*     List<Future<String>> futureList = threadPool.invokeAll(myThreadList);
        for (Future<String> future : futureList){
        System.out.println(future.get());
        }
 */
        /**полуение результата от одной задачи**/
        System.out.println("Полученный результат: " + threadPool.invokeAny(myThreadList));
        threadPool.shutdown();
    }
}
