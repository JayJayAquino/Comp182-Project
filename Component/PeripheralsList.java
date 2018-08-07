//Peripherals sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class peripheralsList{
  static public void main(String[] args){
    ArrayList<String> peripheralsList = new ArrayList<String>();
    Iterator<String> iter;

    peripheralsList.add("Mouse1");
    peripheralsList.add("Mouse2");
    peripheralsList.add("Mouse3");
    peripheralsList.add("Keyboard 1");
    peripheralsList.add("Keyboard 2");
    peripheralsList.add("Keyboard 3");
    peripheralsList.add("Headset 1");
    peripheralsList.add("Headset 2");
    peripheralsList.add("Headset 3");
    peripheralsList.add("MousePad 1");

    System.out.println("Number of Peripherals's available: " + peripheralsList.size());

    System.out.println("List of Peripherals's: ");
    iter = peripheralsList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(peripheralsList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
