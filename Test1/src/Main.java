/**Задача 1. Межпоточный диалог*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainThreadGroup = new ThreadGroup("main");
        Thread thread = new Thread(mainThreadGroup, new MyThread("Поток 1"));
        Thread thread1 = new Thread(mainThreadGroup, new MyThread("Поток 2"));
        Thread thread2 = new Thread(mainThreadGroup, new MyThread("Поток 3"));
        Thread thread3 = new Thread(mainThreadGroup, new MyThread("Поток 4"));
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        Thread.sleep(15000);
        mainThreadGroup.interrupt();
    }
}
