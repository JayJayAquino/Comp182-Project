//CPU sub-class
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class CPUList{
  static public void main(String[] args){
    ArrayList<String> cpuList = new ArrayList<String>();
    ArrayList<String> testList = new ArrayList<String>();
    Iterator<String> iter;

    cpuList.add("Return to Select screen");
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

    int size = cpuList.size() - 1;

    System.out.println("Number of CPU's available: " + size);

    System.out.println("List of CPU's: ");
    iter = cpuList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(cpuList.indexOf(nextItem)+") "
      + nextItem);
    }

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = reader.nextInt();
    for(int i = 0; i <= size-1; i++ )
    {
      if(n == 0){
        //return
      }else if(n == i){
        testList.add(cpuList.get(n));
        System.out.println(testList.get(0));
      }
    }
    reader.close();
  }
}
