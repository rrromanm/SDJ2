package dk.via.printer;

public class Start
{
  public static void main(String[] args)
  {
    Printer printer = new Printer(5);
    Thread t = new Thread(printer);
    t.start();
  }

}
