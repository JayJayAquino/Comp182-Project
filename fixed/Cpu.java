import java.util.Scanner;

class Cpu{
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

   public void cpuList(){
	  Scanner myScanner = new Scanner(System.in);
	  log("please choose what CPU are you going to buy");
      // put array list(show the list of cpu
      int cList = 0;
      boolean cExit = false;
      int cPrice = 0;
      int deliver = 0;
      
      
      //boolean 
      while(!cExit){
    	  boolean selection;
    	  do{//do
    		  try{//try   
    			  cList = Integer.parseInt(myScanner.nextLine());
                  selection = false;
              }//try
              catch(Exception e){//catch
            	  log("please type in number");
                  selection = true;
              }//catch
    	  }while(selection);//do +while
    	  switch(cList){  
            case 0:
            	log("you decided to quit whith out chosing your cpu");
            	cExit = true;
            	cPrice += 0;
            	break;
            	
            case 1 :
                log("you chose to buy ----and the price will be ----");                
                cPrice += 0;
                cExit = true;
            break;
            
            case 2 :
                log("you chose to buy");                
                cPrice += 0;
                cExit = true;
            break;	

            case 3 :
                log("you chose to buy");                
                cPrice += 0;
                cExit = true;
            break;	

            case 4 :
                log("you chose to buy");                
                cPrice += 0;
                cExit = true;
            break;	

            case 5 :
                log("you chose to buy");                
                cPrice += 0;
                cExit = true;
            break;	

            case 6 :
                log("you chose to buy");                
                cPrice += 0;
                cExit = true;
            break;	

            case 7 :
                log("you chose to buy");                
                cPrice += 0;
                cExit = true;
            break;	

            case 8 :
                log("you chose to buy");                
                cPrice += 0;
                cExit = true;
            break;

            case 9 :
                log("you chose to buy");                
                cPrice += 0;
                cExit = true;
            break;	


            }
      }
   }
}   