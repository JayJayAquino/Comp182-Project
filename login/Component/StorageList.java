//STORAGE sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class StorageList{
  static public void main(String[] args){
    ArrayList<String> storageList = new ArrayList<String>();
    Iterator<String> iter;

    storageList.add("STORAGE1");
    storageList.add("STORAGE2");
    storageList.add("STORAGE3");
    storageList.add("STORAGE4");
    storageList.add("STORAGE5");
    storageList.add("STORAGE6");
    storageList.add("STORAGE7");
    storageList.add("STORAGE8");
    storageList.add("STORAGE9");
    storageList.add("STORAGE10");

    System.out.println("Number of STORAGE available: " + storageList.size());

    System.out.println("List of STORAGE: ");
    iter = storageList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(storageList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
