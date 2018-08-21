//CASE sub-class

import java.util.ArrayList;
import java.util.Iterator;

public class CaseList{
  static public void main(String[] args){
    ArrayList<String> caseList = new ArrayList<String>();
    Iterator<String> iter;

    caseList.add("CASE1");
    caseList.add("CASE2");
    caseList.add("CASE3");
    caseList.add("CASE4");
    caseList.add("CASE5");
    caseList.add("CASE6");
    caseList.add("CASE7");
    caseList.add("CASE8");
    caseList.add("CASE9");
    caseList.add("CASE10");

    System.out.println("Number of CASE's available: " + caseList.size());

    System.out.println("List of CASE's: ");
    iter = caseList.listIterator();
    while(iter.hasNext()){
      String nextItem = iter.next();
      System.out.println(caseList.indexOf(nextItem)+") "
      + nextItem);
    }
  }
}
