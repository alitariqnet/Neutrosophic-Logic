package org.cloudbus.cloudsim.examples;

import java.lang.Math;
/**
 * @author Ali Tariq
 * www.github.com/alitariqnet
 * alibabapk@aol.com
 * */
public class WaiterServiceTipNeutrosophicLogic {

	static int POOR = 1;
	static int GOOD = 2;
	static int RANCID = 1;
	static int DELICIOUS = 2;
	static int DIRTY = 1;
	static int CLEAN = 2;

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

		ServiceMembership(6,POOR);
		ServiceNonMembership(6,POOR);
		ServiceIndeterminate(6,POOR);
		ServiceMembership(6,GOOD);
		ServiceNonMembership(6,GOOD);
		ServiceIndeterminate(6,GOOD);

		System.out.println(poorServiceM+" "+poorServiceNM+" "+poorServiceI);
		System.out.println(goodServiceM+" "+goodServiceNM+" "+goodServiceI);

		FoodMembership(2,RANCID);
		FoodNonMembership(2,RANCID);
		FoodIndeterminate(2,RANCID);
		FoodMembership(2,DELICIOUS);
		FoodNonMembership(2,DELICIOUS);
		FoodIndeterminate(2,DELICIOUS);

		System.out.println(rancidFoodM+" "+rancidFoodNM+" "+rancidFoodI);
		System.out.println(deliciousFoodM+" "+deliciousFoodNM+" "+deliciousFoodI);

		EnvironmentMembership(8,DIRTY);
		EnvironmentNonMembership(8,DIRTY);
		EnvironmentIndeterminate(8,DIRTY); 
		EnvironmentMembership(8,CLEAN);
		EnvironmentNonMembership(8,CLEAN);
		EnvironmentIndeterminate(8,CLEAN); 

		System.out.println(dirtyEnvironmentM+" "+dirtyEnvironmentNM+" "+dirtyEnvironmentI);
		System.out.println(cleanEnvironmentM+" "+cleanEnvironmentNM+" "+cleanEnvironmentI);
	}

	// Membership function for Service
	public static void ServiceMembership(double a, int b) {
		switch(b) {
		case 1: 
		{
			if(a<=0)
				poorServiceM =  1.0;
			else if (a>0 && a<7)
				poorServiceM =  (7-a)/(7-0);
			else
				poorServiceM =  0.0;
			break;
		}
		case 2: 
		{
			if(a<=3)
				goodServiceM =  0.0;
			else if (a>3 && a<10)
				goodServiceM =  (a-3)/(10-3);
			else
				goodServiceM =  1.0;
			break;
		}
		default:
			System.out.println("Invalid category in ServiceMembership");
			break;
		}
	}

	// Non-membership function for Service
	public static void ServiceNonMembership(double a,int b) {
		switch(b) {
		case 1: 
		{
			if(a<0)
				poorServiceNM =  0.0;
			else if (a>0 && a<7)
				poorServiceNM =  (a-0)/(7-0);
			else
				poorServiceNM =  1.0;
			break;
		} 

		case 2: 
		{
			if(a<=3)
				goodServiceNM =  1.0;
			else if (a>3 && a<10)
				goodServiceNM =  (10-a)/(10-3);
			else
				goodServiceNM =  0.0;
			break;
		}
		default:
			System.out.println("Invalid category in ServiceNonMembership");
			break;
		}
	}

	// Indeterminate function for Service
	public static void ServiceIndeterminate(double a, int b) {
		switch(b) {
		case 1: 
		{
			if(a<=0)
				poorServiceI =  1.0;
			else if (a>0 && a<8)
				poorServiceI =  ((8-a)/(8-0))*0.5;
			else
				poorServiceI =  0.5;
			break;
		}

		case 2: 
		{
			if(a<=2)
				goodServiceI =  0.0;
			else if (a>2 && a<10)
				goodServiceI =  ((a-2)/(10-2))*0.5;
			else
				goodServiceI =  0.5;
			break;
		}
		default:
			System.out.println("Invalid category in ServiceIndeterminate");
			break;
		}
	}

	// Membership function for Food
	public static void FoodMembership(double a, int b) {
		switch(b) {
		case 1: 
		{
			if(a<=0)
				rancidFoodM =  1.0;
			else if (a>0 && a<7)
				rancidFoodM =  (7-a)/(7-0);
			else
				rancidFoodM =  0.0;
			break;
		}
		case 2: 
		{
			if(a<=3)
				deliciousFoodM =  0.0;
			else if (a>3 && a<10)
				deliciousFoodM =  (a-3)/(10-3);
			else
				deliciousFoodM =  1.0;
			break;
		}
		default:
			System.out.println("Invalid category in FoodMembership");
			break;
		}
	}

	// Non-membership function for rancid food
	public static void FoodNonMembership(double a, int b) {
		switch(b) {
		case 1: 
		{
			if(a<=0)
				rancidFoodNM =  0.0;
			else if (a>0 && a<7)
				rancidFoodNM =  (7-a)/(7-0);
			else
				rancidFoodNM =  1.0;
			break;
		}
		case 2: 
		{
			if(a<=3)
				deliciousFoodNM =  1.0;
			else if (a>3 && a<10)
				deliciousFoodNM =  (a-3)/(10-3);
			else
				deliciousFoodNM =  0.0;
			break;
		}
		default:
			System.out.println("Invalid category in FoodNonMembership");
			break;
		}
	}

	// Indeterminate function for Food
	public static void FoodIndeterminate(double a, int b) {
		switch(b) {
		case 1: 
		{
			if(a<=0)
				rancidFoodI =  0.5;
			else if (a>0 && a<8)
				rancidFoodI =  ((8-a)/(8-0))*0.5;
			else
				rancidFoodI =  0.0;
			break;
		}
		case 2: 
		{
			if(a<=2)
				deliciousFoodI =  0.0;
			else if (a>2 && a<10)
				deliciousFoodI =  ((a-2)/(10-2))*0.5;
			else
				deliciousFoodI =  0.5;
			break;
		}
		default:
			System.out.println("Invalid category in FoodIndeterminate");
			break;
		}
	}

	// Membership function for environment
	public static void EnvironmentMembership(double a, int b) {
		switch(b) {
		case 1: 
		{
			if(a<=0)
				dirtyEnvironmentM =  1.0;
			else if (a>0 && a<7)
				dirtyEnvironmentM =  (7-a)/(7-0);
			else
				dirtyEnvironmentM =  0.0;
			break;
		}
		case 2: 
		{
			if(a<=3)
				cleanEnvironmentM =  0.0;
			else if (a>3 && a<10)
				cleanEnvironmentM =  (a-3)/(10-3);
			else
				cleanEnvironmentM =  1.0;
			break;
		}
		default:
			System.out.println("Invalid category in EnvironmentMembership");
			break;
		}
	}
	// Non-membership function for dirty environment
	public static void EnvironmentNonMembership(double a, int b) {
		switch(b) {
		case 1: 
		{
			if(a<=0)
				dirtyEnvironmentNM =  0.0;
			else if (a>0 && a<7)
				dirtyEnvironmentNM =  (7-a)/(7-0);
			else
				dirtyEnvironmentNM =  1.0;
			break;
		}
		case 2: 
		{
			if(a<=3)
				cleanEnvironmentNM =  0.0;
			else if (a>3 && a<10)
				cleanEnvironmentNM =  (a-3)/(10-3);
			else
				cleanEnvironmentNM =  1.0;
			break;
		}
		default:
			System.out.println("Invalid category in EnvironmentNonMembership");
			break;
		}
	}

	// Indeterminate function for dirty environment
	public static void EnvironmentIndeterminate(double a, int b) {
		switch(b) {
		case 1:{
			if(a<=0)
				dirtyEnvironmentI =  0.5;
			else if (a>0 && a<8)
				dirtyEnvironmentI =  ((8-a)/(8-0))*0.5;
			else
				dirtyEnvironmentI =  0.0;
			break;
		}
		case 2:{
			if(a<=2)
				cleanEnvironmentI =  0.0;
			else if (a>2 && a<10)
				cleanEnvironmentI =  ((a-2)/(10-2))*0.5;
			else
				cleanEnvironmentI =  0.5;
			break;
		}
		default: 
			System.out.println("Invalid category in EnvironmentIndeterminate");
			break;
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
