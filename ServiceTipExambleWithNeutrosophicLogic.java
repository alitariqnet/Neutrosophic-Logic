package org.cloudbus.cloudsim.examples;

/**
 * @author Ali Tariq
 * www.github.com/alitariqnet
 * alibabapk@aol.com
 * */
public class NeutrosophicLogic {

	public static void main(String[] args) {

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
	
	if (a>0 && a<=7)
		return (a-0)/(7-0);
	
	return 1.0;
	}
	
	// Service non-membership function for getting value for good service
	public static double serviceNonMembershipGood(int a) {
		
		if(a<=3)
			return 1.0;
		
		if (a>3 && a<=10)
			return (10-a)/(10-3);

		return 0.0;
	}
	
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
	
	public static double foodMembershipRancid(int a) {
	if(a<=0)
		return 1.0;
	
	else if (a>0 && a<=7)
		return (7-a)/(7-0);

	return 0.0;
	}
	public static double foodNonMembershipDelicious(int a) {
	if(a<=3)
		return 0.0;

	else if (a>3 && a<10)
		return (a-3)/(10-3);

	return 1.0;
	}
	public static double foodIndeterminateDelicious(int a) {
	
	return 0.0;
	}
	public static double foodIndeterminateRancid(int a) {
	
	return 0.0;
	}
	public static Double environmentMembershipClean(int a) {
	if(a<=3)
		return 0.0;

	else if (a>3 && a<10)
		return (a-3)/(10-3);

	return 1.0;
	}
	public static Double environmentMembershipDirty(int a) {
	if(a<=0)
		return 1.0;
	
	else if (a>0 && a<=7)
		return (7-a)/(7-0);

	return 0.0;
	}
	public static Double environmentNonMembershipClean(int a) {
		
		return 0.0;
	}
	public static Double environmentNonMembershipDirty(int a) {
		
		return 0.0;
	}
	public static Double environmentIndeterminateClean(int a) {
		
		return 0.0;
	}
	public static Double environmentIndeterminateDirty(int a) {
		
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
