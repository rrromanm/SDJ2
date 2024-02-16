package dk.via.list;

public class Start
{
  public static void main(String[] args)
  {
    ListContainer list = new ListContainer();
    ListCount count = new ListCount(list);
    Thread t1 = new Thread(count);
    Thread t2 = new Thread(count);

    t1.start();
    t2.start();
  }
}
