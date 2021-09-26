package org.cloudbus.cloudsim.examples;

import java.lang.Math;
/**
 * @author Ali Tariq
 * www.github.com/alitariqnet
 * alibabapk@aol.com
 * */
public class WaiterServiceTipNeutrosophicLogic {
	int POOR = 1;
	int GOOD = 2;
	int RANCID = 3;
	int DELICIOUS = 4;
	int DIRTY = 5;
	int CLEAN = 6;
			static double poorServiceM = 0;
			static double poorServiceNM = 0;
			static double poorServiceI = 0;
			static double goodServiceM = 0;
			static double goodServiceNM = 0;
			static double goodServiceI = 0;

			static double rancidFoodM = 0;
			static double rancidFoodNM = 0;
			static double rancidFoodI = 0;
			static double deliciousFoodM = 0;
			static double deliciousFoodNM = 0;
			static double deliciousFoodI = 0;
			
			static double dirtyEnvironmentM = 0;
			static double dirtyEnvironmentNM = 0;
			static double dirtyEnvironmentI = 0; 
			static double cleanEnvironmentM = 0;
			static double cleanEnvironmentNM = 0;
			static double cleanEnvironmentI = 0; 
			
	public static void main(String[] args) {
		
		poorServiceM = ServiceMembership(6,1);
		poorServiceNM = ServiceNonMembership(6,1);
		poorServiceI = ServiceIndeterminate(6,1);
		goodServiceM = ServiceMembership(6,2);
		goodServiceNM = ServiceNonMembership(6,2);
		goodServiceI = ServiceIndeterminate(6,2);
		
		System.out.println(poorServiceM+" "+poorServiceNM+" "+poorServiceI);
		System.out.println(goodServiceM+" "+goodServiceNM+" "+goodServiceI);
		
		rancidFoodM = FoodMembership(2,3);
		rancidFoodNM = FoodNonMembership(2,3);
		rancidFoodI = FoodIndeterminate(2,3);
		deliciousFoodM = FoodMembership(2,4);
		deliciousFoodNM = FoodNonMembership(2,4);
		deliciousFoodI = FoodIndeterminate(2,4);
		
		System.out.println(rancidFoodM+" "+rancidFoodNM+" "+rancidFoodI);
		System.out.println(deliciousFoodM+" "+deliciousFoodNM+" "+deliciousFoodI);
		
		dirtyEnvironmentM = EnvironmentMembership(8,5);
		dirtyEnvironmentNM = EnvironmentNonMembership(8,5);
		dirtyEnvironmentI = EnvironmentIndeterminate(8,5); 
		cleanEnvironmentM = EnvironmentMembership(8,6);
		cleanEnvironmentNM = EnvironmentNonMembership(8,6);
		cleanEnvironmentI = EnvironmentIndeterminate(8,6); 
		
		System.out.println(dirtyEnvironmentM+" "+dirtyEnvironmentNM+" "+dirtyEnvironmentI);
		System.out.println(cleanEnvironmentM+" "+cleanEnvironmentNM+" "+cleanEnvironmentI);
	}
	
	// Membership function for Service
	public static double ServiceMembership(double a, int b) {

		if(b==1) {
			if(a<=0)
				return 1.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 0.0;
		}

		if(b==2) {
			if(a<=3)
				return 0.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 1.0;
		}
		System.out.println("Invalid category in ServiceMembership");
		return 0.0;
	}
	
	// Non-membership function for Service
	public static double ServiceNonMembership(double a,int b) {
		if(b==1) {
			if(a<0)
				return 0.0;

			if (a>0 && a<7)
				return (a-0)/(7-0);

			return 1.0;

		} 

		if(b==2) {
			if(a<=3)
				return 1.0;

			if (a>3 && a<10)
				return (10-a)/(10-3);

			return 0.0;
		}
		System.out.println("Invalid category in ServiceNonMembership");
		return 0.0;
	}
	
	// Indeterminate function for Service
	public static double ServiceIndeterminate(double a, int b) {
		if(b==1) {
			if(a<=0)
				return 1.0;

			if (a>0 && a<8)
				return ((8-a)/(8-0))*0.5;

			return 0.5;
		}

		if(b==2) {

			if(a<=2)
				return 0.0;

			if (a>2 && a<10)
				return ((a-2)/(10-2))*0.5;

			return 0.5;
		}
		System.out.println("Invalid category in ServiceIndeterminate");
		return 0.0;
	}
	
	// Membership function for Food
	public static double FoodMembership(double a, int b) {
		if(b==3) {
			if(a<=0)
				return 1.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 0.0;
		}
		if(b==4) {

			if(a<=3)
				return 0.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 1.0;
		}
		System.out.println("Invalid category in FoodMembership");
		return a;
	}
	
	// Non-membership function for rancid food
	public static double FoodNonMembership(double a, int b) {
		if(b==3){
			if(a<=0)
				return 0.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 1.0;

		}
		if(b==4){

			if(a<=3)
				return 1.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 0.0;
		}
		System.out.println("Invalid category in FoodNonMembership");
		return a;
	}
	
	// Indeterminate function for Food
	public static double FoodIndeterminate(double a, int b) {
		if(b==3){
			if(a<=0)
				return 0.5;

			if (a>0 && a<8)
				return ((8-a)/(8-0))*0.5;

			return 0.0;
		}
		if(b==4){

			if(a<=2)
				return 0.0;

			if (a>2 && a<10)
				return ((a-2)/(10-2))*0.5;

			return 0.5;
		}
		System.out.println("Invalid category in FoodIndeterminate");
		return a;
	}
	
	// Membership function for environment
	public static double EnvironmentMembership(double a, int b) {
		if(b==5){
			if(a<=0)
				return 1.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 0.0;
		}
		
		if(b==6){

			if(a<=3)
				return 0.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 1.0;
		}
		System.out.println("Invalid category in EnvironmentMembership");
		return a;
	}
	// Non-membership function for dirty environment
	public static double EnvironmentNonMembership(double a, int b) {
		if(b==5){
			if(a<=0)
				return 0.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 1.0;
		}
		if(b==6){

			if(a<=3)
				return 0.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 1.0;
		}
		System.out.println("Invalid category in EnvironmentNonMembership");
		return a;
	}
	
	// Indeterminate function for dirty environment
	public static double EnvironmentIndeterminate(double a, int b) {
		switch(b) {
	case 5:{
		if(b==5){
			if(a<=0)
				return 0.5;

			if (a>0 && a<8)
				return ((8-a)/(8-0))*0.5;

			return 0.0;

		}}
	case 6:{
		if(b==6) {

			if(a<=2)
				return 0.0;

			if (a>2 && a<10)
				return ((a-2)/(10-2))*0.5;

			return 0.5;
		}}
		
	default: 
		System.out.println("Invalid category in EnvironmentIndeterminate");
	return a;
		}
	}
	// Two parameters min function
	public static double min(double a,double b) {
		
		return min(a,b);
	}
	// Two parameters max function
	public static double max(double a,double b) {
		
		return max(a,b);
	}
	// Three parameters min function
	public static double min(double a,double b, double c) {
		
		return min(c,min(a,b));
	}
	// Three parameters max function
	public static double max(double a,double b, double c) {
		
		return max(c,max(a,b));
	}
	
}
