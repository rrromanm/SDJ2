package dk.via.list;

public class ListCount extends Thread
{
  private ListContainer list;
  public ListCount(ListContainer list){
    this.list = list;
  }
  @Override public void run()
  {
    synchronized (list){
      for (int i = 0; i < 1000000; i++)
      {
        list.add(i);
      }
      System.out.println(list.size());
    }
  }
}
