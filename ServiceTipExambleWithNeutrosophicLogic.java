package org.cloudbus.cloudsim.examples;

/**
 * @author Ali Tariq
 * www.github.com/alitariqnet
 * alibabapk@aol.com
 * This is an example of waiter service tip example with neutrosophic logic.
 * */
public class WaiterServiceTipNeutrosophicLogic {

	public static void main(String[] args) {

	}
	
	// Membership function for poor service
	public static double poorServiceMembership(int a) {
		
		if(a<=0)
			return 1.0;

		else if (a>0 && a<=7)
			return (7-a)/(7-0);

		return 0.0;
	}
	
	// Membership function for good service
	public static double goodServiceMembership(int a) {
		
		if(a<=3)
			return 0.0;
		
		else if (a>3 && a<10)
			return (a-3)/(10-3);

		return 1.0;
		}
	
	// Non-membership function for poor service
	public static double poorServiceNonMembership(int a) {
		
		if(a<0)
			return 0.0;

		if (a>0 && a<=7)
			return (a-0)/(7-0);

		return 1.0;
	}
	
	// Non-membership function for good service
	public static double goodServiceNonMembership(int a) {
		
		if(a<=3)
			return 1.0;

		if (a>3 && a<=10)
			return (10-a)/(10-3);

		return 0.0;
	}
	
	// Indeterminate function for poor service
	public static double poorServiceIndeterminate(int a) {
		
		if(a<=0)
			return 1.0;

		else if (a>0 && a<=8)
			return ((8-a)/(8-0))*0.5;

		return 0.0;
	}
	
	// Indeterminate function for good service
	public static double goodServiceIndeterminate(int a) {
		
		if(a<=2)
			return 0.0;

		else if (a>2 && a<10)
			return ((a-2)/(10-2))*0.5;

		return 1.0;
	}
	// Membership function for rancid food
	public static double rancidFoodMembership(int a) {
		
		if(a<=0)
			return 1.0;

		else if (a>0 && a<=7)
			return (7-a)/(7-0);

		return 0.0;
	}
	// Membership function for delicious food
	public static double deliciusFoodMembership(int a) {
		
		if(a<=0)
			return 1.0;

		else if (a>0 && a<=7)
			return (7-a)/(7-0);

		return 0.0;
	}
	// Non-membership function for rancid food
	public static double rancidFoodNonMembership(int a) {
		
		if(a<=3)
			return 0.0;

		else if (a>3 && a<10)
			return (a-3)/(10-3);

		return 1.0;
	}
	// Non-membership function for delicious food
	public static double deliciousFoodNonMembership(int a) {
		
		if(a<=3)
			return 0.0;

		else if (a>3 && a<10)
			return (a-3)/(10-3);

		return 1.0;
	}
	// Indeterminate function for delicious food
	public static double deliciousFoodIndeterminate(int a) {
	
		if(a<=2)
			return 0.0;

		else if (a>2 && a<10)
			return ((a-2)/(10-2))*0.5;

		return 1.0;
	}
	// Indeterminate function for rancid food
	public static double rancidFoodIndeterminate(int a) {
		
		if(a<=0)
			return 1.0;

		else if (a>0 && a<=8)
			return ((8-a)/(8-0))*0.5;

		return 0.0;
	}
	// Membership function for clean environment
	public static double cleanEnvironmentMembership(int a) {
		
		if(a<=3)
			return 0.0;

		else if (a>3 && a<10)
			return (a-3)/(10-3);

		return 1.0;
	}
	// Membership function for dirty environment
	public static double dirtyEnvironmentMembership(int a) {
		
		if(a<=0)
			return 1.0;

		else if (a>0 && a<=7)
			return (7-a)/(7-0);

		return 0.0;
	}
	// Non-membership function for clean environment
	public static double cleanEnvironmentNonMembership(int a) {
		
		if(a<=3)
			return 0.0;

		else if (a>3 && a<10)
			return (a-3)/(10-3);

		return 1.0;
	}
	// Non-membership function for dirty environment
	public static double dirtyEnvironmentNonMembership(int a) {
		
		if(a<=3)
			return 0.0;

		else if (a>3 && a<10)
			return (a-3)/(10-3);

		return 1.0;
	}
	// Indeterminate function for clean environment
	public static double cleanEnvironmentIndeterminate(int a) {
		
		if(a<=2)
			return 0.0;

		else if (a>2 && a<10)
			return ((a-2)/(10-2))*0.5;

		return 1.0;
	}
	// Indeterminate function for dirty environment
	public static double dirtyEnvironmentIndeterminate(int a) {
		
		if(a<=0)
			return 1.0;
	
		else if (a>0 && a<=8)
			return ((8-a)/(8-0))*0.5;

		return 0.0;
	}
	// Two parameters min function
	public static double min(double a,double b) {
		if (a<b)
			return a;
		return b;
	}
	// Three parameters min function
	public static double min(double a,double b, double c) {
		if (a<b&&a<c)
			return a;
		else if (b<a&&b<c)
			return b;
		return c;
	}
	// Two parameters max function
	public static double max(double a,double b) {
		if (a>b)
			return a;
		return b;
	}
	// Three parameters max function
	public static double max(double a,double b, double c) {
		if (a>b&&a>c)
			return a;
		else if (b>a&&b>c)
			return b;
		return c;
	}
}
