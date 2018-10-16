package org;
import java.util.*;



public class hel3 {
	
	public static void main(String[] args) {
		
	
	
	int a[]={1,2,7};
	
	int sum=0;
	int total_element=4;
	
	int exp=total_element*((total_element+1)/2);
	
	for(int i :a){
		
		sum+=i;
		
	}
	
	
	System.out.println(exp-sum);
	
	}
}
