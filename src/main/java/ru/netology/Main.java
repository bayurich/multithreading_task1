package ru.netology;

public class Main {
    public static void main(String[] args) {

        System.out.println("Создаю потоки...");
        ThreadGroup threadGroup = new ThreadGroup("группа 1");
        Thread thread1 = new Thread(threadGroup, new MyThread(),"поток 1");
        Thread thread2 = new Thread(threadGroup, new MyThread(),"поток 2");
        Thread thread3 = new Thread(threadGroup, new MyThread(),"поток 3");
        Thread thread4 = new Thread(threadGroup, new MyThread(),"поток 4");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            Thread.sleep(15000);
            threadGroup.interrupt();
            System.out.println("Завершаю все потоки.");
            Thread.sleep(3);
            threadGroup.destroy();
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
