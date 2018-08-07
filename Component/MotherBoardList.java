//MotherBoard sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class MotherBoardList{
  static public void main(String[] args){
    ArrayList<String> motherBoardList = new ArrayList<String>();
    Iterator<String> iter;

    motherBoardList.add("MotherBoard1");
    motherBoardList.add("MotherBoard2");
    motherBoardList.add("MotherBoard3");
    motherBoardList.add("MotherBoard4");
    motherBoardList.add("MotherBoard5");
    motherBoardList.add("MotherBoard6");
    motherBoardList.add("MotherBoard7");
    motherBoardList.add("MotherBoard8");
    motherBoardList.add("MotherBoard9");
    motherBoardList.add("MotherBoard10");

    System.out.println("Number of MotherBoard's available: " + motherBoardList.size());

    System.out.println("List of MotherBoard's: ");
    iter = motherBoardList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(motherBoardList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
