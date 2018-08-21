import java.util.ArrayList;
import java.util.Iterator;

public class Calculation {
	ArrayList<Integer> tCost = new ArrayList<Integer>();
	ArrayList<String> cChosen = new ArrayList<String>();
	
	public void totalCost() {
		int totalC = 0;
		for(int i = 0; i <= tCost.size()-1; i++) {
			totalC += tCost.get(i);
		}
		System.out.print(totalC);
	}

  	public void currentChosen() {
  		for(int j = 0; j<=cChosen.size()-1; j++) {
  			System.out.println(cChosen.get(j));
  		}
  	}
  	
  	public void addList(String list) {
  		cChosen.add(list);
  	}
  	
  	public void addCost(int k) {
  		tCost.add(k);
  	}
  	
  	public void removeAll() {
  		for(int l = 0; l <=cChosen.size()-1; l++) {
  			cChosen.remove(l);
  		}
  		for(int o = 0; o <=tCost.size()-1; o++) {
  			tCost.remove(o);
  		}
  	}
}
