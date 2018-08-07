//Monitor sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class monitorList{
  static public void main(String[] args){
    ArrayList<String> monitorList = new ArrayList<String>();
    Iterator<String> iter;

    monitorList.add("Monitor1");
    monitorList.add("Monitor2");
    monitorList.add("Monitor3");
    monitorList.add("Monitor4");
    monitorList.add("Monitor5");
    monitorList.add("Monitor6");
    monitorList.add("Monitor7");
    monitorList.add("Monitor8");
    monitorList.add("Monitor9");
    monitorList.add("Monitor10");

    System.out.println("Number of Monitor's available: " + monitorList.size());

    System.out.println("List of Monitor's: ");
    iter = monitorList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(monitorList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
