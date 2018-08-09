//Name:Haemin Lee
import java.util.Scanner;
import java.io.IOException;

public class User{
   
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
            log(" [0]Exit \n [1]Computer Parts \n [2]List \n [3]Delivery \n [4]Check Out \n [5]Clear)");
   }

   
   public static void main(String[] args){
      Scanner myScanner = new Scanner(System.in);

      ////////////////////////////////////////////////////////////////stating menu/////////////////////////////////////////////////////////////////////////////
      boolean exit = false;
      int opt = 0;
      while(!exit){
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
               log("you just clicked exit, have a good day!");
               break;
            case 1 :
               log("this is");
               
               break;
            case 2 : 
               log("this is");
               
               break;
            case 3 :
               log("this is");
                
               break;  
            case 4 :
               log("you entered to check out! thanks for buying our product"); 
               CheckOut co = new CheckOut();
               co.information();
               exit = true;
               break;
            case 5 :
               log("this is"); 
               
               break;   
                        
            default :
               
               log("you typed wrong! you must type between 1~6!");
               break;
         }//end switch
     
      }//end while
      myScanner.close();
 ////////////////////////////////////////////////////////finish save setting/////////////////////////////////////////////////
   }//end main
}//end class