//CPU sub-class
package Component;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class CPUList{
  static public void main(String[] args){
    ArrayList<String> cpuList = new ArrayList<String>();
    ArrayList<String> partsList = new ArrayList<String>();
    ArrayList<Integer> priceList = new ArrayList<Integer>();
    ArrayList<Integer> finalPriceList = new ArrayList<Integer>();
    Iterator<String> cpuIter;
    Iterator<Integer> priceIter;

    cpuList.add("Return to Select screen");
    priceList.add(0);
    cpuList.add("CPU1");
    priceList.add(1500);
    cpuList.add("CPU2");
    priceList.add(1600);
    cpuList.add("CPU3");
    priceList.add(1700);
    cpuList.add("CPU4");
    priceList.add(1800);
    cpuList.add("CPU5");
    priceList.add(1900);
    cpuList.add("CPU6");
    priceList.add(2000);
    cpuList.add("CPU7");
    priceList.add(2100);
    cpuList.add("CPU8");
    priceList.add(2200);
    cpuList.add("CPU9");
    priceList.add(2500);
    cpuList.add("CPU10");
    priceList.add(2700);

    int cpuSize = cpuList.size() - 1;
    int priceSize = partsList.size() - 1;

    System.out.println("Number of CPU's available: " + cpuSize + "\n");

    System.out.println("List of CPU's: ");
    cpuIter = cpuList.listIterator();
    priceIter = priceList.listIterator();

    while(cpuIter.hasNext()){
      String cpuNextItem = cpuIter.next();
      System.out.print(cpuList.indexOf(cpuNextItem)+") " + cpuNextItem + " ");

      int priceNextItem = priceIter.next();
      if(priceNextItem == 0)
      {
        System.out.println("\n");
      }else{
        System.out.println("Price is: " + priceNextItem);
      }

    }

    Scanner reader = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = reader.nextInt();
    for(int i = 0; i <= cpuSize; i++ )
    {
      if(n == 0){
        //return
      }else if(n == i){
        partsList.add(cpuList.get(n));
        System.out.println(partsList.get(0));
        finalPriceList.add(priceList.get(n));
        System.out.println(finalPriceList.get(0));
      }
    }
    reader.close();
  }
}
