package dev.lpa;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prime Number from 1 to 100
		
		//int count=0;
		
		String primeNumbers = "";
		int i=0;
		int num=0;
		
		for(i=1; i<=100; i++) {
			
			int count=0;
			
			for(num=i;num>=1;num--) {
				if(i % num == 0) {
					count++;
				}
					
			}
			
			
			if(count==2) {
				primeNumbers = primeNumbers + i + " ";
			
		}	
			
		}
		
		
		System.out.println("Prime numbers from 1 to 100 are :");
	    System.out.println(primeNumbers);

	}

}
