import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class food {

		private void timeEsstimate(String order) {
			int second,minute,hour,m=0,h=0;
			GregorianCalendar date = new GregorianCalendar();
		      second = date.get(Calendar.SECOND);
		      minute = date.get(Calendar.MINUTE);
		      hour = date.get(Calendar.HOUR);
		      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
		      int s;
		        s = second + (60 * minute) + (3600 * hour);
		     
		        int t=45*60;
		        s=s+t;
		        
		        if(s >= 3600){
		            h=s/3600;
		            s=s-h*3600;
		           
		          } if(s>=60){
		            m=s/60;
		            s=s-m*60;
		           
		          }
		         
		        // System.out.println( h + " : " + m );
		        System.out.println("Your Order will be reached at "+h + " : " + m+":"+s);
		        
		}
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        boolean quit= false;
	        int sum=0;
	        int appetizers1=200,appetizers2=20,appetizers3=400,appetizers4=100,soup1=400,
	        		soup2=100,dish1=100,dish2=10,dish3=2,
	        		dish4=7,dish5=9,dish6=7,other1=2,other2=2,other3=2;
	        String order="";
	        System.out.println("*****************************  Cafe  *****************************");
	        System.out.println("\n");
	        System.out.println("Please select your food..");
	        do{
	        	System.out.println("ITEM"+"\t\tPrice");
	        	System.out.println("\t\t\t\tAppetizers");
	            
	            System.out.println("1.appetizers1"+"\t"+"200");
	            System.out.println("2.appetizers2"+"\t"+"20");

	        	System.out.println("\t\t\t\tSoups");

	            System.out.println("3.soup1"+"\t\t"+"400");
	            System.out.println("4.soup2"+"\t\t"+"100");
	        	System.out.println("\t\t\t\tMain Course");

	            System.out.println("5.dish1"+"\t\t"+"200");
	            System.out.println("6.dish2"+"\t\t"+"20");

	        	System.out.println("\t\t\t\tother");

	            System.out.println("7.other1"+"\t"+"200");
	            System.out.println("8.other2"+"\t"+"20");

	            System.out.println("9.Finish Order");
	            
	            int choice=input.nextInt();
	            
	            switch(choice){
	                case 1:System.out.println("appetizers1"+"\n");
	                        sum=sum+appetizers1;
	                        order=order.concat("appetizers1"+"\n");
	                        
	                    break;
	                case 2:
	                    System.out.println("appetizers2");
	                    sum=sum+appetizers2;
	                    order=order.concat("appetizers2"+"\n");
	                    
	                       break;
	                case 3:
	                    System.out.println("soup1");
	                    sum=sum+soup1;
	                    order=order.concat("soup1"+"\n");
	                      break;
	                case 4:
	                    System.out.println("soup2");
	                    sum=sum+soup2;
	                    order=order.concat("soup2"+"\n");
	                    break;
	    	            
		               case 5:System.out.println("dish1"+"\n");
		                        sum=sum+dish1;
		                        order=order.concat("dish1"+"\n");
		                        
		                    break;
		                case 6:
		                    System.out.println("dish2");
		                    sum=sum+dish2;
		                    order=order.concat("dish2"+"\n");
		                    
		                       break;
		                case 7:
		                    System.out.println("other1");
		                    sum=sum+other1;
		                    order=order.concat("other1"+"\n");
		                      break;
		                case 8:
		                    System.out.println("other2");
		                    sum=sum+other2;
		                    order=order.concat("other2"+"\n");
		                    break;
	                case 9:
	                     quit=true;
	                     
	                    break;
	                default:
	                    System.out.println("Wrong input");
	            }
	        
	        }while(!quit);
	       
	        System.out.println("Your Orders are:\n"+order);
	        System.out.println("Your total bill="+sum);
	        food food1=new food();
	        food1.timeEsstimate(order);
	         System.out.println("Thank you");
	    
	        
	        
	        
	    
	    }
	    
	

	
	}


