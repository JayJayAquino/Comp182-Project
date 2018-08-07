import java.util.Scanner;
import java.io.IOException;

public class CheckOut{
   
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
            log(" [0]Exit \n [1]Information \n [2]List \n [3]Delivery \n [4]Order \n [5]Clear)");
   }

   
   public void information(){
      Scanner myScanner = new Scanner(System.in);
      String name = "";
      String address = "";
      String phone = "";
      ////////////////////////////////////////////////////////////////name address phone///////////////////////////////////////////////////////////////////////
      do{//do
         try{//try
            log("please enter your name, with more than 3 alphabet");
            name = myScanner.nextLine();                                  
            }//try
            catch(Exception e){//catch                     
               log("error! please re-enter your name");
            }//catch
         }while(name.length()<=3);//do
      do{
         try{    
            log("enter your address");
            address = myScanner.nextLine();
         }
         catch(Exception e){
            log("error! please re- enter your address");
         }
      }while(address.length()<=15);
      do{
         try{
            log("enter your phone number");
            phone = myScanner.nextLine();
         }
         catch(Exception e){
             log("error! please type in number with area code!");
         }
      }
      while(phone.length()<=10 && phone.length()>=7);   
   }
      //log("your total payment is ---- and it will take ---of delivery day")


}