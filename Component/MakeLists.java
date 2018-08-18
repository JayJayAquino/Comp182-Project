package Component;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class MakeLists
{
  public ArrayList<String> partsList;
  public ArrayList<Integer> finalPriceList;
  public ArrayList<String> selectionList;
  public ArrayList<String> cpuList;
  public ArrayList<Integer> priceList;

  

  public MakeLists()
  {
     partsList = new ArrayList<String>();
     finalPriceList = new ArrayList<Integer>();
     selectionList = new ArrayList<String>();
     cpuList = new ArrayList<String>();
     priceList = new ArrayList<Integer>();


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

    selectionList.add("Return to main menu");
    selectionList.add("Case");
    selectionList.add("Cooler");
    selectionList.add("CPU");
    selectionList.add("GPU");
    selectionList.add("Monitor");
    selectionList.add("MotherBoard");
    selectionList.add("Peripherals");
    selectionList.add("PSU");
    selectionList.add("RAM");
    selectionList.add("Memory");
    selectionList.add("Display List");
  }
}
