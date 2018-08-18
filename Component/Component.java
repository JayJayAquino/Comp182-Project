package Component;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Component
{
  MakeLists ob;
public Component(){
    ob = new MakeLists();
  }


  public void componentSelect(ArrayList<String> selectionList,
   ArrayList<String> cpuList,
   ArrayList<Integer> priceList,
   ArrayList<String> partsList,
   ArrayList<Integer> finalPriceList)
  {
    Iterator<String> selectionListIter;

    selectionListIter = selectionList.listIterator();

    while(selectionListIter.hasNext())
    {
      String selectionNextItem = selectionListIter.next();
      System.out.println(selectionList.indexOf(selectionNextItem)+") " + selectionNextItem + " ");
    }


    Scanner reader = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n = reader.nextInt();
      if (n == 3)
      {
        CPUList cpu = new CPUList();
        cpu.cpu(ob.partsList, ob.finalPriceList, ob.cpuList, ob.priceList, ob.selectionList);
      }else if(n == 11){
        System.out.println(partsList.size());
        // int partsListSize = partsList.size() - 1;
        // for(int j = 0; j <= partsListSize; j++)
        // {
        //   System.out.println(partsList.get(j));
        // }
      }
  }

    static public void main(String[] args)
    {

      Component ob2 = new Component();
      ob2.componentSelect(ob2.ob.selectionList, ob2.ob.cpuList, ob2.ob.priceList,ob2.ob.partsList, ob2.ob.finalPriceList);

    }
}
