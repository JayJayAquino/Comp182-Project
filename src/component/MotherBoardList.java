package Component;

import java.util.Scanner;

public class MotherBoardList {
	 public void motherBoard() {
			MakeLists make = new MakeLists();
		    Calculation cal = new Calculation();
		    System.out.print("Enter a number: ");
			   boolean exit = false;
			   int opt =0;
			   while(!exit){
					System.out.println("List of MotherBoard's: ");
					System.out.println("[0]Return to Select screen");
				   for(int i = 0; i < make.motherBoardList.size(); i++) {
					   int number = i + 1;
						System.out.println("[" + number + "]"+make.motherBoardList.get(i) + " price" + make.motherBoardPriceList.get(i));
					}

				   Scanner myScanner = new Scanner(System.in);
			            
			       boolean selection;
			       do{//do
			    	  try{//try   
			    		   opt = Integer.parseInt(myScanner.nextLine());
			    		   selection = false;
			    	   }//try
			    	   catch(Exception e){//catch
			    		 System.out.println("please type in number");
			    		 selection = true;
			    	   }//catch
			       }while(selection);//do +while
			       
			       switch(opt){
			          case 0:
			         
			        	  exit = true;
			        	  System.out.println("you just clicked exit, we will go back to main menu");
			
			        	  break;
			
			          case 1 :
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;
			         

			        	  break;
			
					  case 2 : 
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;
						  	
						  break;
					
					  case 3 :
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;

			     
						  break;  
					
					  case 4 :
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;
					  

			
						  break;

					
					  case 5 :
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;

			
						  break;   
					            
					  case 6 :
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;

			
						  break;   
					
					  case 7 :
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;

			
						  break;   
					
					  case 8 :
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;

						  break;
					       
					  case 9 :
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;

						  break;   
							               
					  case 10 :			  
			            	cal.addList(make.motherBoardList.get(opt));
			            	cal.addCost(make.motherBoardPriceList.get(opt));
			            	System.out.println("you chose to buy " + make.motherBoardList.get(opt) + " and price will be " + make.motherBoardPriceList.get(opt)+"$");
			            	exit = true;

						  break;
					  
					  default :
						  		               
						  System.out.println("you typed wrong! you must type between 0~10!");
						  break;
					}//end switch
			   }//end while 		 
	 }

}
