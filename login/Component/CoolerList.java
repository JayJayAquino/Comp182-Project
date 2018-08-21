//Cooler sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class CoolerList{
  static public void main(String[] args){
    ArrayList<String> coolerList = new ArrayList<String>();
    Iterator<String> iter;

    coolerList.add("Cooler1");
    coolerList.add("Cooler2");
    coolerList.add("Cooler3");
    coolerList.add("Cooler4");
    coolerList.add("Cooler5");
    coolerList.add("Cooler6");
    coolerList.add("Cooler7");
    coolerList.add("Cooler8");
    coolerList.add("Cooler9");
    coolerList.add("Cooler10");

    System.out.println("Number of Cooler's available: " + coolerList.size());

    System.out.println("List of Cooler's: ");
    iter = coolerList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(coolerList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
