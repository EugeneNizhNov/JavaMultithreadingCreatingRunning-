import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    private String treadName;
    private int count = 0;

    public MyThread(String threadName) {
        this.treadName = threadName;
    }

    @Override
    public String call() throws Exception {
        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(2000);
                Thread.currentThread().setName(treadName);
                System.out.println("Всем привет! Я " + Thread.currentThread().getName());
                count++;
            }
        } catch (InterruptedException err) {
        } finally {
            System.out.println(Thread.currentThread().getName() + " завершен");
        }
        return "Количество выведенных сообщений: " + Integer.toString(count) + " поток " + Thread.currentThread().getName();
    }
}
