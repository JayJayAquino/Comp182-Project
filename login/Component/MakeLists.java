package Component;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class MakeLists
{
  public ArrayList<String> partsList; // user selected parts list
  public ArrayList<Integer> finalPriceList; // price of all selected parts
  public ArrayList<String> selectionList; // list of parts user can purchase
  public ArrayList<String> cpuList;
  public ArrayList<Integer> cpuPriceList;



  public MakeLists()
  {
     partsList = new ArrayList<String>();
     finalPriceList = new ArrayList<Integer>();
     selectionList = new ArrayList<String>();
     cpuList = new ArrayList<String>();
     cpuPriceList = new ArrayList<Integer>();


    cpuList.add("Return to Select screen");
    cpuPriceList.add(0);
    cpuList.add("CPU1");
    cpuPriceList.add(1500);
    cpuList.add("CPU2");
    cpuPriceList.add(1600);
    cpuList.add("CPU3");
    cpuPriceList.add(1700);
    cpuList.add("CPU4");
    cpuPriceList.add(1800);
    cpuList.add("CPU5");
    cpuPriceList.add(1900);
    cpuList.add("CPU6");
    cpuPriceList.add(2000);
    cpuList.add("CPU7");
    cpuPriceList.add(2100);
    cpuList.add("CPU8");
    cpuPriceList.add(2200);
    cpuList.add("CPU9");
    cpuPriceList.add(2500);
    cpuList.add("CPU10");
    cpuPriceList.add(2700);

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
