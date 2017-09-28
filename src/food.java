import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class food {
	
		private void takeAway_Delivery() {    //choice for take away or Deliver at your doorstep
			System.out.println("Please decide ...");
			Scanner input = new Scanner(System.in);
		    boolean quit= false;
		
			System.out.println("1. Take away");
			System.out.println("2. Deliever at my doorstep");
			System.out.println("\nEnter your choice");
			int choice=input.nextInt();
            
            switch(choice){
	            
	            case 1:     //for take away
	            	System.out.println("Enter the time (in minutes) when you want to pick your order.");
	        		int timeToPick = input.nextInt();
	        		if(timeToPick<15) { System.out.println("Minimum time for cooking is 15 min.");
	        		timeToPick = 15;}
	        		
	        		String a= timeEstimate(timeToPick);      
	        		System.out.println("Take your order away in " + timeToPick + "min.\n");
	        		
                    break;
	            case 2:        //for home delivery
	            	int timeToDeliver=30;
	            	timeEstimate(timeToDeliver);
	            	break;
	            	
	            default:
                System.out.println("Wrong input");
	            }

		}
		
		public String timeEstimate(int time) {   //time estimation
			int second,minute,hour,m=0,h=0;
			GregorianCalendar date = new GregorianCalendar();
		    second = date.get(Calendar.SECOND);    //access desktop time
		    minute = date.get(Calendar.MINUTE);
		    hour = date.get(Calendar.HOUR);
		    System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
		    int s;
		    s = second + (60 * minute) + (3600 * hour);  //time conversion in seconds
		     
	        int t=45*60;
	        s=s+t;
		        
	        if(s >= 3600){
	            h=s/3600;
	            s=s-h*3600;
		           
	         }
	         if(s>=60){
	            m=s/60;
	            s=s-m*60;
		           
	         }
		         
		       String ready=h + " : " + m+" : "+s;
	        System.out.println("Your Order will be reached at "+h + " : " + m+" : "+s);
	        return ready;
		        
		}
		
		public static void main(String[] args) {
			 Scanner input = new Scanner(System.in);
			 boolean quit= false;
			 int sum=0;
			 int Salad=200,Chips=120,Ginger_bread=140
			     ,Cheese_nuggets=150,Chicken_corn_Soup=800,
			     Vegetable_Soup=600,Chicken_burger=300,Chicken_steak=750,Pizza=1100,
			     Lasagna=900,Chicken_wings=350,Chicken_Paratha_roll=220
			     ,Cold_drink=2,Ice_cream=2,Juice=2;
			 String order="";
			 System.out.println("*****************************  Cafe  *****************************");
			 System.out.println("Please select your food...");
	         do{
				System.out.println("ITEM"+"\t\t\tPrice");
				System.out.println("----------------------------Appetizers---------------");
				
				System.out.println("1.Salad"+"\t\t\t"+"200");
				System.out.println("2.Chips"+"\t\t\t"+"120");
				System.out.println("3.Ginger bread"+"\t\t"+"140");
				System.out.println("4.Cheese nuggets"+"\t"+"150");
				
				System.out.println("----------------------------Soups-------------------");
				
				System.out.println("5.Chicken corn Soup"+"\t"+"800");
				System.out.println("6.Vegetable Soup"+"\t"+"600");
				
				System.out.println("----------------------------Main Course--------------");
				
				System.out.println("7.Chicken burger"+"\t"+"300");
				System.out.println("8.Chicken steak"+"\t\t"+"750");
				System.out.println("9.Pizza"+"\t\t\t"+"1100");
				System.out.println("10.Lasagna"+"\t\t"+"900");
				System.out.println("11.Chicken wings"+"\t"+"350");
				System.out.println("12.Chicken Paratha roll"+"\t"+"220");
				
				System.out.println("----------------------------Other--------------------");
				
				System.out.println("13.Cold drink"+"\t\t"+"90");
				System.out.println("14.Ice cream"+"\t\t"+"120");
				System.out.println("15.Juice"+"\t\t"+"240");
				
				System.out.println("16.Finish Order");
				
				int choice=input.nextInt();
				switch(choice){
				    case 1:System.out.println("Salad"+"\n");
				    	   sum=sum+Salad;
				    	   order=order.concat("Salad"+"\n");
				        
				    break;
				    case 2:
				    	   System.out.println("Chips");
				    	   sum=sum+Chips;
				    	   order=order.concat("Chips"+"\n");
				    
				    break;
				    case 3:
				    	   System.out.println("Ginger bread");
				    	   sum=sum+Ginger_bread;
				    	   order=order.concat("Ginger bread"+"\n");
				    break;
				    case 4:
				    	   System.out.println("Cheese nuggets");
				    	   sum=sum+Cheese_nuggets;
				    	   order=order.concat("Cheese nuggets"+"\n");
				    break; 
				    case 5:
					       System.out.println("Chicken corn Soup"+"\n");
				           sum=sum+Chicken_corn_Soup;
				           order=order.concat("Chicken corn Soup"+"\n");
				        
				    break;
				    case 6:
				    	   System.out.println("Vegetable Soup");
				    	   sum=sum+Vegetable_Soup;
				    	   order=order.concat("Vegetable Soup"+"\n");
				    
				    break;
				    case 7:
				    	   System.out.println("Chicken burger");
				    	   sum=sum+Chicken_burger;
				    	   order=order.concat("Chicken burger"+"\n");
				    break;

				    case 8:
				    	   System.out.println("Chicken steak");
				    	   sum=sum+Chicken_steak;
				    	   order=order.concat("Chicken steak"+"\n");
				    break;
				    case 9:
				    	   System.out.println("Pizza");
				    	   sum=sum+Pizza;
				    	   order=order.concat("Pizza"+"\n");
				    break;
				    case 10:
				    	   System.out.println("Lasagna");
				    	   sum=sum+Lasagna;
				    	   order=order.concat("Lasagna"+"\n");
				    break;
				    case 11:
				    	   System.out.println("Chicken wings");
				    	   sum=sum+Chicken_wings;
				    	   order=order.concat("Chicken wings"+"\n");
				    break;
				    case 12:
				    	   System.out.println("Chicken Paratha roll");
				    	   sum=sum+Chicken_Paratha_roll;
				    	   order=order.concat("Chicken Paratha roll"+"\n");
				    break;
				    case 13:
				    	   System.out.println("Cold drink");
				    	   sum=sum+Cold_drink;
				    	   order=order.concat("Cold drink"+"\n");
				    break;
				    case 14:
				    	   System.out.println("Ice cream");
				    	   sum=sum+Ice_cream;
				    	   order=order.concat("Ice cream"+"\n");
				    break;
				    case 15:
				    	   System.out.println("Juice");
				    	   sum=sum+Juice;
				    	   order=order.concat("Juice"+"\n");
				    break;
				    case 16:
				    	   quit=true;
				     
				    break;

				    default:
				    	   System.out.println("Wrong input");
				}
	        
	        }while(!quit);
	        System.out.println("\n");
	        food food1=new food();
	        food1.takeAway_Delivery();
	       // food1.timeEstimate(20);
	        System.out.println("Your Orders are:\n"+order);
	        System.out.println("\t\t\t\tYour total bill="+sum);
	        System.out.println("Thank you");

	    }

	}


