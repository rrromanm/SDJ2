package dk.via.list;

import java.util.ArrayList;

public class ListContainer
{
  private ArrayList<Integer> list;
  public ListContainer(){
   list = new ArrayList<Integer>();
  }
  public synchronized void add(int i){
    list.add(i);
  }
  public synchronized int size(){
    return list.size();
  }
}
