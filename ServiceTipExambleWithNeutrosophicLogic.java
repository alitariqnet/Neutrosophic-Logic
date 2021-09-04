package org.cloudbus.cloudsim.examples;

/**
 * @author Ali Tariq
 * www.github.com/alitariqnet
 * alibabapk@aol.com
 * */
public class NeutrosophicLogic {

	public static void main(String[] args) {

		Double service = serviceMembershipPoor(7);
		System.out.println(service);
	}
	
	// Service membership function for getting value for poor service
	public static double serviceMembershipPoor(int a) {
		
	if(a<=0)
		return 1.0;
	
	else if (a>0 && a<=7)
		return (7-a)/(7-0);

	return 0.0;
	}
	
	// Service membership function for getting value for good service
	public static double serviceMembershipGood(int a) {
		
		if(a<=3)
			return 0.0;
		
		else if (a>3 && a<10)
			return (a-3)/(10-3);

		return 1.0;
		}
	
	// Service non-membership function for getting value for poor service
	public static double serviceNonMembershipPoor(int a) {
		
	if(a<0)
		return 0.0;
	
	if (a>0 && a<5)
		return 0.0;
	
	if(a>5)
		return 0.0;
	
	return 0.0;
	}// TODO 
	
	// Service non-membership function for getting value for good service
	public static double serviceNonMembershipGood(int a) {
		
		if(a<0)
			return 0.0;
		
		if (a>0 && a<5)
			return 0.0;
		
		if(a>5)
			return 0.0;
		
		return 0.0;
	}// TODO
	
	// Service indeterminate function for getting value for poor service
	public static double serviceIndeterminatePoor(int a) {
		
	if(a<0)
		return 0.0;
	
	if (a>0 && a<5)
		return 0.0;
	
	if(a>5)
		return 0.0;
	
	return 0.0;
	}// TODO
	
	// Service indeterminate function for getting value for good service
	public static double serviceIndeterminateGood(int a) {
		
	if(a<0)
		return 0.0;
	
	if (a>0 && a<5)
		return 0.0;
	
	if(a>5)
		return 0.0;
	
	return 0.0;
	}// TODO
	
	public static double foodMembership(int a) {
	
		
		return 0.0;
	}
public static double foodNonMembership(int a) {
	
		
		return 0.0;
	}
public static double foodIndeterminate(int a) {
	
	
	return 0.0;
}
	public static Double environmentMembership(int a) {
	
		return 0.0;
	}
	public static Double environmentNonMembership(int a) {
		
		return 0.0;
	}
	public static Double environmentIndeterminate(int a) {
		
		return 0.0;
	}
	
	public static Double min(Double a,Double b) {
		if (a<b)
			return a;
		else
			return b;
	}
	public static Double max(Double a,Double b) {
		if (a>b)
			return a;
		else
			return b;
	}
	
}
