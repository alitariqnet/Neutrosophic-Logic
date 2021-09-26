package org.cloudbus.cloudsim.examples;

import java.lang.Math;
/**
 * @author Ali Tariq
 * www.github.com/alitariqnet
 * alibabapk@aol.com
 * */
public class WaiterServiceTipNeutrosophicLogic {

	public static void main(String[] args) {
		
		double poorServiceM = ServiceMembership(6,"POOR");
		double poorServiceNM = ServiceNonMembership(6,"POOR");
		double poorServiceI = ServiceIndeterminate(6,"POOR");
		double goodServiceM = ServiceMembership(6,"GOOD");
		double goodServiceNM = ServiceNonMembership(6,"GOOD");
		double goodServiceI = ServiceIndeterminate(6,"GOOD");
		
		System.out.println(poorServiceM+" "+poorServiceNM+" "+poorServiceI);
		System.out.println(goodServiceM+" "+goodServiceNM+" "+goodServiceI);
		
		double rancidFoodM = FoodMembership(2,"rancid");
		double rancidFoodNM = FoodNonMembership(2,"rancid");
		double rancidFoodI = FoodIndeterminate(2,"rancid");
		double deliciousFoodM = FoodMembership(2,"delicious");
		double deliciousFoodNM = FoodNonMembership(2,"delicious");
		double deliciousFoodI = FoodIndeterminate(2,"delciious");
		
		System.out.println(rancidFoodM+" "+rancidFoodNM+" "+rancidFoodI);
		System.out.println(deliciousFoodM+" "+deliciousFoodNM+" "+deliciousFoodI);
		
		double dirtyEnvironmentM = EnvironmentMembership(8,"dirty");
		double dirtyEnvironmentNM = EnvironmentNonMembership(8,"dirty");
		double dirtyEnvironmentI = EnvironmentIndeterminate(8,"dirty"); 
		double cleanEnvironmentM = EnvironmentMembership(8,"clean");
		double cleanEnvironmentNM = EnvironmentNonMembership(8,"clean");
		double cleanEnvironmentI = EnvironmentIndeterminate(8,"clean"); 
		
		System.out.println(dirtyEnvironmentM+" "+dirtyEnvironmentNM+" "+dirtyEnvironmentI);
		System.out.println(cleanEnvironmentM+" "+cleanEnvironmentNM+" "+cleanEnvironmentI);
	}
	
	// Membership function for Service
	public static double ServiceMembership(double a, String cat) {

		if(cat.equalsIgnoreCase("POOR")) {
			if(a<=0)
				return 1.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 0.0;
		}

		if(cat.equalsIgnoreCase("GOOD")) {
			if(a<=3)
				return 0.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 1.0;
		}

		return 0.0;
	}
	
	// Non-membership function for Service
	public static double ServiceNonMembership(double a,String cat) {
		if(cat.equalsIgnoreCase("POOR")) {
			if(a<0)
				return 0.0;

			if (a>0 && a<7)
				return (a-0)/(7-0);

			return 1.0;

		} 

		if(cat.equalsIgnoreCase("GOOD")) {
			if(a<=3)
				return 1.0;

			if (a>3 && a<10)
				return (10-a)/(10-3);

			return 0.0;
		}
		return 0.0;
	}
	
	// Indeterminate function for Service
	public static double ServiceIndeterminate(double a, String cat) {
		if(cat.equalsIgnoreCase("POOR")) {
			if(a<=0)
				return 1.0;

			if (a>0 && a<8)
				return ((8-a)/(8-0))*0.5;

			return 0.5;
		}

		if(cat.equalsIgnoreCase("GOOD")) {

			if(a<=2)
				return 0.0;

			if (a>2 && a<10)
				return ((a-2)/(10-2))*0.5;

			return 0.5;
		}
		return 0.0;
	}
	
	// Membership function for Food
	public static double FoodMembership(double a, String cat) {
		if(cat.equalsIgnoreCase("RANCID")) {
			if(a<=0)
				return 1.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 0.0;
		}
		if(cat.equalsIgnoreCase("DELICIOUS")) {

			if(a<=3)
				return 0.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 1.0;
		}
		return a;
	}
	
	// Non-membership function for rancid food
	public static double FoodNonMembership(double a, String cat) {
		if(cat.equalsIgnoreCase("RANCID")){
			if(a<=0)
				return 0.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 1.0;

		}
		if(cat.equalsIgnoreCase("DELICIOUS")){

			if(a<=3)
				return 1.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 0.0;
		}
		return a;
	}
	
	// Indeterminate function for Food
	public static double FoodIndeterminate(double a, String cat) {
		if(cat.equalsIgnoreCase("RANCID")){
			if(a<=0)
				return 0.5;

			if (a>0 && a<8)
				return ((8-a)/(8-0))*0.5;

			return 0.0;
		}
		if(cat.equalsIgnoreCase("DELICIOUS")){

			if(a<=2)
				return 0.0;

			if (a>2 && a<10)
				return ((a-2)/(10-2))*0.5;

			return 0.5;
		}
		return a;
	}
	
	// Membership function for environment
	public static double EnvironmentMembership(double a, String cat) {
		if(cat.equalsIgnoreCase("dirty")){
			if(a<=0)
				return 1.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 0.0;
		}
		
		if(cat.equalsIgnoreCase("clean")){

			if(a<=3)
				return 0.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 1.0;
		}
		return a;
	}
	// Non-membership function for dirty environment
	public static double EnvironmentNonMembership(double a, String cat) {
		if(cat.equalsIgnoreCase("dirty")){
			if(a<=0)
				return 0.0;

			if (a>0 && a<7)
				return (7-a)/(7-0);

			return 1.0;
		}
		if(cat.equalsIgnoreCase("clean")){

			if(a<=3)
				return 0.0;

			if (a>3 && a<10)
				return (a-3)/(10-3);

			return 1.0;
		}
		return a;
	}
	
	// Indeterminate function for dirty environment
	public static double EnvironmentIndeterminate(double a, String cat) {
		if(cat.equalsIgnoreCase("dirty")){
			if(a<=0)
				return 0.5;

			if (a>0 && a<8)
				return ((8-a)/(8-0))*0.5;

			return 0.0;

		}
		if(cat.equalsIgnoreCase("clean")) {

			if(a<=2)
				return 0.0;

			if (a>2 && a<10)
				return ((a-2)/(10-2))*0.5;

			return 0.5;
		}return a;
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
