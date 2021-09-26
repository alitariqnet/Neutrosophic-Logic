package org.cloudbus.cloudsim.examples;

import java.lang.Math;
/**
 * @author Ali Tariq
 * www.github.com/alitariqnet
 * alibabapk@aol.com
 * */
public class WaiterServiceTipNeutrosophicLogic {

			private static double poorServiceM = 0.0;
			private static double poorServiceNM = 0.0;
			private static double poorServiceI = 0.0;
			private static double goodServiceM = 0.0;
			private static double goodServiceNM = 0.0;
			private static double goodServiceI = 0.0;
			
			private static double rancidFoodM = 0.0;
			private static double rancidFoodNM = 0.0;
			private static double rancidFoodI = 0.0;
			private static double deliciousFoodM = 0.0;
			private static double deliciousFoodNM = 0.0;
			private static double deliciousFoodI = 0.0;
			
			private static double dirtyEnvironmentM = 0.0;
			private static double dirtyEnvironmentNM = 0.0;
			private static double dirtyEnvironmentI = 0.0;
			private static double cleanEnvironmentM = 0.0;
			private static double cleanEnvironmentNM = 0.0;
			private static double cleanEnvironmentI = 0.0;
			
	public static void main(String[] args) {
		
		ServiceMembership(6,"POOR");
		ServiceNonMembership(6,"POOR");
		ServiceIndeterminate(6,"POOR");
		ServiceMembership(6,"GOOD");
		ServiceNonMembership(6,"GOOD");
		ServiceIndeterminate(6,"GOOD");
		
		System.out.println(poorServiceM+" "+poorServiceNM+" "+poorServiceI);
		System.out.println(goodServiceM+" "+goodServiceNM+" "+goodServiceI);
		
		FoodMembership(2,"rancid");
		FoodNonMembership(2,"rancid");
		FoodIndeterminate(2,"rancid");
		FoodMembership(2,"delicious");
		FoodNonMembership(2,"delicious");
		FoodIndeterminate(2,"delciious");
		
		System.out.println(rancidFoodM+" "+rancidFoodNM+" "+rancidFoodI);
		System.out.println(deliciousFoodM+" "+deliciousFoodNM+" "+deliciousFoodI);
		
		EnvironmentMembership(8,"dirty");
		EnvironmentNonMembership(8,"dirty");
		EnvironmentIndeterminate(8,"dirty"); 
		EnvironmentMembership(8,"clean");
		EnvironmentNonMembership(8,"clean");
		EnvironmentIndeterminate(8,"clean"); 
		
		System.out.println(dirtyEnvironmentM+" "+dirtyEnvironmentNM+" "+dirtyEnvironmentI);
		System.out.println(cleanEnvironmentM+" "+cleanEnvironmentNM+" "+cleanEnvironmentI);
	}
	
	// Membership function for Service
	public static void ServiceMembership(double a, String cat) {

		if(cat.equalsIgnoreCase("POOR")) {
			if(a<=0)
				poorServiceM = 1.0;

			if (a>0 && a<7)
				poorServiceM =  (7-a)/(7-0);

			poorServiceM = 0.0;
		}

		if(cat.equalsIgnoreCase("GOOD")) {
			if(a<=3)
				goodServiceM = 0.0;

			if (a>3 && a<10)
				goodServiceM = (a-3)/(10-3);

			goodServiceM = 1.0;
		}
	}
	
	// Non-membership function for Service
	public static void ServiceNonMembership(double a,String cat) {
		if(cat.equalsIgnoreCase("POOR")) {
			if(a<0)
				poorServiceNM = 0.0;

			if (a>0 && a<7)
				poorServiceNM = (a-0)/(7-0);

			poorServiceNM = 1.0;

		} 

		if(cat.equalsIgnoreCase("GOOD")) {
			if(a<=3)
				goodServiceNM = 1.0;

			if (a>3 && a<10)
				goodServiceNM = (10-a)/(10-3);

			goodServiceNM = 0.0;
		}
	}
	
	// Indeterminate function for Service
	public static void ServiceIndeterminate(double a, String cat) {
		if(cat.equalsIgnoreCase("POOR")) {
			if(a<=0)
				poorServiceI = 1.0;

			if (a>0 && a<8)
				poorServiceI = ((8-a)/(8-0))*0.5;

			poorServiceI = 0.5;
		}

		if(cat.equalsIgnoreCase("GOOD")) {

			if(a<=2)
				goodServiceI = 0.0;

			if (a>2 && a<10)
				goodServiceI = ((a-2)/(10-2))*0.5;

			goodServiceI = 0.5;
		}
	}
	
	// Membership function for Food
	public static void FoodMembership(double a, String cat) {
		if(cat.equalsIgnoreCase("RANCID")) {
			if(a<=0)
				rancidFoodM = 1.0;

			if (a>0 && a<7)
				rancidFoodM = (7-a)/(7-0);

			rancidFoodM = 0.0;
		}
		if(cat.equalsIgnoreCase("DELICIOUS")) {

			if(a<=3)
				deliciousFoodM = 0.0;

			if (a>3 && a<10)
				deliciousFoodM = (a-3)/(10-3);

			deliciousFoodM = 1.0;
		}
	}
	
	// Non-membership function for rancid food
	public static void FoodNonMembership(double a, String cat) {
		if(cat.equalsIgnoreCase("RANCID")){
			if(a<=0)
				rancidFoodNM = 0.0;

			if (a>0 && a<7)
				rancidFoodNM = (7-a)/(7-0);

			rancidFoodNM = 1.0;

		}
		if(cat.equalsIgnoreCase("DELICIOUS")){

			if(a<=3)
				deliciousFoodNM = 1.0;

			if (a>3 && a<10)
				deliciousFoodNM = (a-3)/(10-3);

			deliciousFoodNM = 0.0;
		}
	}
	
	// Indeterminate function for Food
	public static void FoodIndeterminate(double a, String cat) {
		if(cat.equalsIgnoreCase("RANCID")){
			if(a<=0)
				rancidFoodI = 0.5;

			if (a>0 && a<8)
				rancidFoodI = ((8-a)/(8-0))*0.5;

			rancidFoodI = 0.0;
		}
		if(cat.equalsIgnoreCase("DELICIOUS")){

			if(a<=2)
				deliciousFoodI = 0.0;

			if (a>2 && a<10)
				deliciousFoodI = ((a-2)/(10-2))*0.5;

			deliciousFoodI = 0.5;
		}
	}
	
	// Membership function for environment
	public static void EnvironmentMembership(double a, String cat) {
		if(cat.equalsIgnoreCase("dirty")){
			if(a<=0)
				dirtyEnvironmentM = 1.0;

			if (a>0 && a<7)
				dirtyEnvironmentM = (7-a)/(7-0);

			dirtyEnvironmentM = 0.0;
		}
		
		if(cat.equalsIgnoreCase("clean")){

			if(a<=3)
				cleanEnvironmentM = 0.0;

			if (a>3 && a<10)
				cleanEnvironmentM = (a-3)/(10-3);

			cleanEnvironmentM = 1.0;
		}
	}
	
	// Non-membership function for dirty environment
	public static void EnvironmentNonMembership(double a, String cat) {
		if(cat.equalsIgnoreCase("dirty")){
			if(a<=0)
				dirtyEnvironmentNM = 0.0;

			if (a>0 && a<7)
				dirtyEnvironmentNM = (7-a)/(7-0);

			dirtyEnvironmentNM = 1.0;
		}
		if(cat.equalsIgnoreCase("clean")){

			if(a<=3)
				cleanEnvironmentNM = 0.0;

			if (a>3 && a<10)
				cleanEnvironmentNM = (a-3)/(10-3);

			cleanEnvironmentNM = 1.0;
		}
	}
	
	// Indeterminate function for dirty environment
	public static void EnvironmentIndeterminate(double a, String cat) {
		if(cat.equalsIgnoreCase("dirty")){
			if(a<=0)
				dirtyEnvironmentI = 0.5;

			if (a>0 && a<8)
				dirtyEnvironmentI = ((8-a)/(8-0))*0.5;

			dirtyEnvironmentI = 0.0;

		}
		if(cat.equalsIgnoreCase("clean")) {

			if(a<=2)
				cleanEnvironmentI = 0.0;

			if (a>2 && a<10)
				cleanEnvironmentI = ((a-2)/(10-2))*0.5;

			cleanEnvironmentI = 0.5;
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
