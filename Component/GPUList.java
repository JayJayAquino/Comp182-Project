//CPU sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class GPUList{
  static public void main(String[] args){
    ArrayList<String> gpuList = new ArrayList<String>();
    Iterator<String> iter;

    gpuList.add("Graphics Card 1");
    gpuList.add("Graphics Card 2");
    gpuList.add("Graphics Card 3");
    gpuList.add("Graphics Card 4");
    gpuList.add("Graphics Card 5");
    gpuList.add("Graphics Card 6");
    gpuList.add("Graphics Card 7");
    gpuList.add("Graphics Card 8");
    gpuList.add("Graphics Card 9");
    gpuList.add("Graphics Card 10");

    System.out.println("Number of GPU's available: " + gpuList.size());

    System.out.println("List of GPU's: ");
    iter = gpuList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(gpuList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
