package dk.via.runnable;

public class Start {
  public static void main(String[] args) throws InterruptedException {
    Thread numbersThread1 = new Thread(new Numbers(25000, 0));
    Thread numbersThread2 = new Thread(new Numbers(25000, 25000));
    Thread numbersThread3 = new Thread(new Numbers(25000, 50000));
    Thread numbersThread4 = new Thread(new Numbers(25000, 75000));
    Thread charactersThread = new Thread(new Characters(33));

    numbersThread1.start();
    numbersThread1.join();
    numbersThread2.start();
    numbersThread2.join();
    numbersThread3.start();
    numbersThread3.join();
    numbersThread4.start();
    numbersThread4.join();
    charactersThread.start();
    charactersThread.join();
    System.out.println("Finished");
  }
}