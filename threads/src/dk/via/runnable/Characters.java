package dk.via.runnable;

public class Characters implements Runnable {
  private int letters;
  public Characters(int letters) {
    this.letters = letters;
  }

  @Override
  public void run() {
    for(int i = 0; i < letters; i++) {
      for (char c = 'A'; c <= 'Z'; c++) {
        System.out.println(c);
      }
    }
  }
}