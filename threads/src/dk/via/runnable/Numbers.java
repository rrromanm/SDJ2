package dk.via.runnable;

public class Numbers implements Runnable {
  private int numbers;
  private int startNum;
  public Numbers(int numbers, int startNum) {
    this.numbers = numbers;
    this.startNum = startNum;
  }

  @Override
  public void run() {;
    for(int i = 0; i < numbers; i++) {
      System.out.println(startNum+=1);
    }
  }
}