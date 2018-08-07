//RAM sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class RAMList{
  static public void main(String[] args){
    ArrayList<String> ramList = new ArrayList<String>();
    Iterator<String> iter;

    ramList.add("RAM1");
    ramList.add("RAM2");
    ramList.add("RAM3");
    ramList.add("RAM4");
    ramList.add("RAM5");
    ramList.add("RAM6");
    ramList.add("RAM7");
    ramList.add("RAM8");
    ramList.add("RAM9");
    ramList.add("RAM10");

    System.out.println("Number of RAM available: " + ramList.size());

    System.out.println("List of RAM: ");
    iter = ramList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(ramList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
