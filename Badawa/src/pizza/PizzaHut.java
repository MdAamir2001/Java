package pizza;
import java.util.*;
public class PizzaHut {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		CustomerReport customerReport = new CustomerReport(3);
		//with parameterized
//		for(int cust_count=0;cust_count<3;cust_count++)
//		{
//			
//			System.out.println("Enter the Customer Name : ");
//			String cust_Name=sc.nextLine();
//			System.out.println("Enter the Customer Address :");
//			String cust_Address=sc.nextLine();
//			
//			
//			Customer customer=new Customer(cust_Name,cust_Address);
//			Customer.printBillNo();
//			System.out.println("\t\tDate:"+new Date());
//			customer.display();
//			customerReport.addCustomer(customer);
//		}
//		System.out.println("\n Customer Report : ");
//		customerReport.printList();
//		//without parameterized
//		//Customer default_customer=new Customer();
//		
//		
//		//default_customer.display();
//		
//		//customer.display();	
//		
//		 while (true) {
//	            System.out.println("Choose an option:\n1. Italian Pizza\n2. Mexican Pizza\n3.Exit");
//	            int choice = sc.nextInt();
//	            if(choice==3)
//	            {
//	            	System.out.println("Exiting...");
//	            	break;
//	            }
// 
	            System.out.print("Enter pizza name: ");
	            sc.nextLine(); // Consume the newline character
	            String name = sc.nextLine();
 
	            System.out.print(" type (veg or non-veg): ");
	            String type = sc.nextLine();
 
	            System.out.print("Enter toppings : ");
	            String[] toppings = sc.nextLine().split(", ");
 
	            System.out.print("time for preparation: ");''/'.'
	            float timeForPreparation = sc.nextFloat();
	            sc.nextLine();
	            
	            System.out.print("Size : ");
	            String size= sc.nextLine();
 
 
//	            Pizza pizza=null;
//	            if (choice == 1) {
//	            	  try {
//	            		  pizza = new ItalianPizza(type, toppings, name, timeForPreparation,size);
//	                
//	                  } catch (InvalidPizzaTypeException | InvalidPizzaSizeException e) {
//	                      System.out.println("Exception: " + e.getMessage());
//	                  }
//	              
//	            }
////	            } else {
////	                pizza = new MexicanPizza(type, toppings, name, timeForPreparation);
////	            }
// 
	            System.out.println(pizza.toString());
	        }
        
 
	}
 
}