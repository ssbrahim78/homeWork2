package homeWork2;

import java.util.Scanner;

public class Pizza {
	
	
	
	
	
	String address ;
	int order;
	public double price = 10.5;
	
	public Pizza () {  // default constructor
		
	}
	
	public Pizza(String address) {// constructor with parameters
	this.address=address;		
	System.out.println("the pizza place is in "+ address);
		}
	//public Pizza1 (int order, double price) {
	//this.order=order;
	//this.price=price;
	//}
	public  void getPromotion() {
	System.out.println("get 1 free pizza  after your fifth orders");
	
		
	}
	

	public static void main(String[] args) {
		
		
		double price=10.50;
		Pizza address = new Pizza("New York");
		Pizza promotion = new Pizza();
		promotion.getPromotion();
		
		Scanner Order = new Scanner(System.in);
		//System.out.println("please enter your order");
		int i;
		int orders=0;
		int order=1;
		 double total;
		 
		for (orders=1;orders<=5;orders++) {
		System.out.println("please enter your order ");	
		 order = Order.nextInt();
		  total=(price*order);
		System.out.println("the total to pay is "+ total);
		 
		}
		
		//Pizza total = new Pizza();
	     // total.getTotalPrice();
       
		 
		 total=(price*order)-price;
		if(order>0) {
		System.out.println("the total to pay  with promotion is "+ total );
		}else {
			System.out.print("please make an order");
		}
		
			

		}
	}

   


