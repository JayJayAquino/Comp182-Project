//PSU sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class PSUList{
  static public void main(String[] args){
    ArrayList<String> psuList = new ArrayList<String>();
    Iterator<String> iter;

    psuList.add("PSU1");
    psuList.add("PSU2");
    psuList.add("PSU3");
    psuList.add("PSU4");
    psuList.add("PSU5");
    psuList.add("PSU6");
    psuList.add("PSU7");
    psuList.add("PSU8");
    psuList.add("PSU9");
    psuList.add("PSU10");

    System.out.println("Number of PSU's available: " + psuList.size());

    System.out.println("List of PSU's: ");
    iter = psuList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(psuList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
