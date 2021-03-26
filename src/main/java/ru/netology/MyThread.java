package ru.netology;

public class MyThread extends Thread {

    @Override
    public void run() {
        try{
            while (!Thread.currentThread().isInterrupted()){
                Thread.sleep(2500);
                System.out.printf("Я %s. Всем привет!\n", Thread.currentThread().getName());
            }
        }
        catch (InterruptedException ex){

        }
        finally{
            System.out.printf("%s завершен\n", Thread.currentThread().getName());
        }
    }


}
