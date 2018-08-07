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
      log("please choose what CPU are you going to buy");
      log("[0] Quit [1] [2] [3] [4] [5] [6] [7] [8] [9]");
      int cList = 0;
      boolean cExit = false;
      //boolean 
      while(!cExit){
            switch(cList){
            
            case 0:
            	log("you decided to quit whith out chosing your cpu");
            	cExit = true;
            	
            	break;
            	
            case 1 :
                log("you chose to buy");                
            

            break;
            
            case 2 :
                log("you chose to buy");                
            
            break;	

            case 3 :
                log("you chose to buy");                
            
            break;	

            case 4 :
                log("you chose to buy");                
            
            break;	

            case 5 :
                log("you chose to buy");                
            
            break;	

            case 6 :
                log("you chose to buy");                
            
            break;	

            case 7 :
                log("you chose to buy");                
            
            break;	

            case 8 :
                log("you chose to buy");                
            
            break;

            case 9 :
                log("you chose to buy");                
            
            break;	


            }
      }
   }
}   