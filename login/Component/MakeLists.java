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
<<<<<<< HEAD:login/Component/MakeLists.java
=======
  public ArrayList<String> caseList;
  public ArrayList<Integer> casePriceList;
  public ArrayList<String> coolerList;
  public ArrayList<Integer> coolerPriceList;
  public ArrayList<String> gpuList;
  public ArrayList<Integer> gpuPriceList;
  public ArrayList<String> monitorList;
  public ArrayList<Integer> monitorPriceList;
  public ArrayList<String> motherBoardList;
  public ArrayList<Integer> motherBoardPriceList;
  public ArrayList<String> peripheralsList;
  public ArrayList<Integer> peripheralsPriceList;
  public ArrayList<String> psuList;
  public ArrayList<Integer> psuPriceList;
  public ArrayList<String> ramList;
  public ArrayList<Integer> ramPriceList;
  public ArrayList<String> storageList;
  public ArrayList<Integer> storagePriceList;
>>>>>>> 1eb8507c1b2231c46666b5ad316d2819d173dd57:Component/MakeLists.java



  public MakeLists()
  {
     partsList = new ArrayList<String>();
     finalPriceList = new ArrayList<Integer>();
     selectionList = new ArrayList<String>();
     cpuList = new ArrayList<String>();
     cpuPriceList = new ArrayList<Integer>();
<<<<<<< HEAD:login/Component/MakeLists.java

=======
     caseList = new ArrayList<String>();
     casePriceList = new ArrayList<Integer>();
     gpuList = new ArrayList<String>();
     gpuPriceList = new ArrayList<Integer>();
     monitorList = new ArrayList<String>();
     monitorPriceList = new ArrayList<Integer>();
     motherBoardList = new ArrayList<String>();
     motherBoardPriceList = new ArrayList<Integer>();
     peripheralsList = new ArrayList<String>();
     peripheralsPriceList = new ArrayList<Integer>();
     psuList = new ArrayList<String>();
     psuPriceList = new ArrayList<Integer>();
     ramList = new ArrayList<String>();
     ramPriceList = new ArrayList<Integer>();
     storageList = new ArrayList<String>();
     storagePriceList = new ArrayList<Integer>();
>>>>>>> 1eb8507c1b2231c46666b5ad316d2819d173dd57:Component/MakeLists.java

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
<<<<<<< HEAD:login/Component/MakeLists.java
=======

    caseList.add("CASE1");
    casePriceList.add(100);
    caseList.add("CASE2");
    casePriceList.add(100);
    caseList.add("CASE3");
    casePriceList.add(100);
    caseList.add("CASE4");
    casePriceList.add(100);
    caseList.add("CASE5");
    casePriceList.add(100);
    caseList.add("CASE6");
    casePriceList.add(100);
    caseList.add("CASE7");
    casePriceList.add(100);
    caseList.add("CASE8");
    casePriceList.add(100);
    caseList.add("CASE9");
    casePriceList.add(100);
    caseList.add("CASE10");
    casePriceList.add(100);

    coolerList.add("Cooler1");
    coolerPriceList.add(50);
    coolerList.add("Cooler2");
    coolerPriceList.add(50);
    coolerList.add("Cooler3");
    coolerPriceList.add(50);
    coolerList.add("Cooler4");
    coolerPriceList.add(50);
    coolerList.add("Cooler5");
    coolerPriceList.add(50);
    coolerList.add("Cooler6");
    coolerPriceList.add(50);
    coolerList.add("Cooler7");
    coolerPriceList.add(50);
    coolerList.add("Cooler8");
    coolerPriceList.add(50);
    coolerList.add("Cooler9");
    coolerPriceList.add(50);
    coolerList.add("Cooler10");
    coolerPriceList.add(50);

    gpuList.add("Graphics Card 1");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 2");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 3");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 4");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 5");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 6");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 7");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 8");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 9");
    gpuPriceList.add(300);
    gpuList.add("Graphics Card 10");
    gpuPriceList.add(300);

    monitorList.add("Monitor1");
    monitorPriceList.add(150);
    monitorList.add("Monitor2");
    monitorPriceList.add(150);
    monitorList.add("Monitor3");
    monitorPriceList.add(150);
    monitorList.add("Monitor4");
    monitorPriceList.add(150);
    monitorList.add("Monitor5");
    monitorPriceList.add(150);
    monitorList.add("Monitor6");
    monitorPriceList.add(150);
    monitorList.add("Monitor7");
    monitorPriceList.add(150);
    monitorList.add("Monitor8");
    monitorPriceList.add(150);
    monitorList.add("Monitor9");
    monitorPriceList.add(150);
    monitorList.add("Monitor10");
    monitorPriceList.add(150);

    motherBoardList.add("MotherBoard1");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard2");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard3");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard4");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard5");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard6");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard7");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard8");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard9");
    motherBoardPriceList.add(250);
    motherBoardList.add("MotherBoard10");
    motherBoardPriceList.add(250);

    peripheralsList.add("Mouse1");
    peripheralsPriceList.add(50);
    peripheralsList.add("Mouse2");
    peripheralsPriceList.add(50);
    peripheralsList.add("Mouse3");
    peripheralsPriceList.add(50);
    peripheralsList.add("Keyboard 1");
    peripheralsPriceList.add(50);
    peripheralsList.add("Keyboard 2");
    peripheralsPriceList.add(50);
    peripheralsList.add("Keyboard 3");
    peripheralsPriceList.add(50);
    peripheralsList.add("Headset 1");
    peripheralsPriceList.add(50);
    peripheralsList.add("Headset 2");
    peripheralsPriceList.add(50);
    peripheralsList.add("Headset 3");
    peripheralsPriceList.add(50);
    peripheralsList.add("MousePad 1");
    peripheralsPriceList.add(50);

    psuList.add("PSU1");
    psuPriceList.add(150);
    psuList.add("PSU2");
    psuPriceList.add(150);
    psuList.add("PSU3");
    psuPriceList.add(150);
    psuList.add("PSU4");
    psuPriceList.add(150);
    psuList.add("PSU5");
    psuPriceList.add(150);
    psuList.add("PSU6");
    psuPriceList.add(150);
    psuList.add("PSU7");
    psuPriceList.add(150);
    psuList.add("PSU8");
    psuPriceList.add(150);
    psuList.add("PSU9");
    psuPriceList.add(150);
    psuList.add("PSU10");
    psuPriceList.add(150);

    ramList.add("RAM1");
    ramPriceList.add(80);
    ramList.add("RAM2");
    ramPriceList.add(80);
    ramList.add("RAM3");
    ramPriceList.add(80);
    ramList.add("RAM4");
    ramPriceList.add(80);
    ramList.add("RAM5");
    ramPriceList.add(80);
    ramList.add("RAM6");
    ramPriceList.add(80);
    ramList.add("RAM7");
    ramPriceList.add(80);
    ramList.add("RAM8");
    ramPriceList.add(80);
    ramList.add("RAM9");
    ramPriceList.add(80);
    ramList.add("RAM10");
    ramPriceList.add(80);

    storageList.add("STORAGE1");
    storagePriceList.add(100);
    storageList.add("STORAGE2");
    storagePriceList.add(100);
    storageList.add("STORAGE3");
    storagePriceList.add(100);
    storageList.add("STORAGE4");
    storagePriceList.add(100);
    storageList.add("STORAGE5");
    storagePriceList.add(100);
    storageList.add("STORAGE6");
    storagePriceList.add(100);
    storageList.add("STORAGE7");
    storagePriceList.add(100);
    storageList.add("STORAGE8");
    storagePriceList.add(100);
    storageList.add("STORAGE9");
    storagePriceList.add(100);
    storageList.add("STORAGE10");
    storagePriceList.add(100);
>>>>>>> 1eb8507c1b2231c46666b5ad316d2819d173dd57:Component/MakeLists.java

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
