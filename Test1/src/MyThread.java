public class MyThread extends Thread {
    public MyThread(String nameThread) {
        super(nameThread);
        System.out.println("Создан поток: " + getName());
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2000);
                System.out.println("Всем привет! Я " + getName());
            }
        } catch (InterruptedException err) {

        } finally {
            System.out.println(getName() + " завершен");
        }
    }
}


