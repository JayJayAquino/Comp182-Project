import java.util.Scanner;
import java.io.IOException;

public class List {
	
   public static void log(String s){
      System.out.println(s); 
   }

   public static void log(String s1, int v1) {
      System.out.println(s1 + v1);
   }

   public static void log(int[] array) {
	   for(int i = 0; i < array.length; i++) {
		   System.out.println("array[" + i + "]=" + array[i]);
	   }
   }

   public static void printOption(){
	   log(" [0]Exit \n [1]CPU \n [2]Case \n [3]GPU \n [4]MotherBoard \n [5]PSU \n [6]RAM \n [7]Monitor \n [8]Peripherals List  \n [9]Storage List \n [10] list what you chose");
   }
	   
   public void sList(){
   boolean exit = false;
   int opt =0;
   while(!exit){
	   Scanner myScanner = new Scanner(System.in);
	   printOption();            
       boolean selection;
       do{//do
    	  try{//try   
    		   opt = Integer.parseInt(myScanner.nextLine());
    		   selection = false;
    	   }//try
    	   catch(Exception e){//catch
    		 log("please type in number");
    		 selection = true;
    	   }//catch
       }while(selection);//do +while
       switch(opt){
          case 0:
         
        	  exit = true; //this make while loop end
        	  log("you just clicked exit, we will go back to main menu");

        	  break;

          case 1 :
        	  log("List of cpu is:");
        	  
        	  break;

		  case 2 : 
			  log("List of Case is:");

			  break;
		
		  case 3 :
			  log("List of Gpu is:");
     
			  break;  
		
		  case 4 :
		  
			  log("List of MotehrBoard is:");

			  break;
		
		  case 5 :
			  log("List of PSU is:");

			  break;   
		            
		  case 6 :
			  log("List of RAM is:");

			  break;   
		
		  case 7 :
			  log("List of Monitor is:");

			  break;   
		
		  case 8 :
			  log("List of Peripherals List is:");

			  break;
		       
		  case 9 :
			  log("List of Storage List is:");
	
			  break;   
				               
		  case 10 :			  
			  log("the list you chose will be:");
			  	Calculation cal = new Calculation();
			  	cal.currentChosen();
			  break;
		  
		  default :
			  		               
			  log("you typed wrong! you must type between 1~9!");
			  break;
		}//end switch
   }//end while 
  }
   
}
