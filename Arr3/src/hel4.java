import java.util.*;


public class hel4 {
	
	public static void main(String[] args){
		
		int a[]={1,2,3,4};
		int b[]={5,6};
		int c[]=new int[a.length+b.length];
		int count=0;
		
		for(int i=0;i<a.length;i++){
			
			c[i]=a[i];
			
			count++;
			
			
		}
		
		
		for(int j=0;j<b.length;j++){
			
			c[count++]=b[j];
			
				
		}
		
		
	for(int i=0;i<c.length;i++){
		
		System.out.println(c[i]);
		
	}
		
		
		
		
		
		
	}

	
	
	

}
