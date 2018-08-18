//CPU sub-class
package Component;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class CPUList{
  public void cpu(ArrayList<String> partsList,
   ArrayList<Integer> finalPriceList,
   ArrayList<String> cpuList,
   ArrayList<Integer> priceList,
    ArrayList<String> selectionList){
    Component component = new Component();
    Iterator<String> cpuIter;
    Iterator<Integer> priceIter;

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
        component.componentSelect(selectionList,
        cpuList,
        priceList,
        partsList,
        finalPriceList);
      }
    }
    reader.close();
  }
}
