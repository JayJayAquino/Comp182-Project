//CPU sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class CPUList{
  static public void main(String[] args){
    ArrayList<String> cpuList = new ArrayList<String>();
    Iterator<String> iter;

    cpuList.add("CPU1");
    cpuList.add("CPU2");
    cpuList.add("CPU3");
    cpuList.add("CPU4");
    cpuList.add("CPU5");
    cpuList.add("CPU6");
    cpuList.add("CPU7");
    cpuList.add("CPU8");
    cpuList.add("CPU9");
    cpuList.add("CPU10");

    System.out.println("Number of CPU's available: " + cpuList.size());

    System.out.println("List of CPU's: ");
    iter = cpuList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(cpuList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
