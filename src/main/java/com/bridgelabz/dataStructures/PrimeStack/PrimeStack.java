package com.bridgelabz.dataStructures;

import java.util.ArrayList;
import java.util.List;

import com.Bridgelabz.utility.Utility;

public class PrimeStack {

	public static void main(String[] args) {
		Utility utility=new Utility();
		int a[]=new int[1000];
		int l=0;
		int n = 1000;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i<n; i++){

			list.add(i);
		}
		System.out.println(list);
		for (int i = 0; i<list.size()-1; i++){
            if (!isPrime(list.get(i))){
                list.remove(list.get(i));
                i--;
            }
        }
		System.out.println(list);
		for(Object ele:list)
		{	
			a[l]=(int)ele;
			l++;

		}
		System.out.println("the prime numbers are:");
		for (int prime : a) {
			if (prime != 0)
				System.out.print(" " + prime);
		}System.out.println("the anagram numbers are");
		System.out.println("the anagram numbers are");
		for (int k = 0; k < l; k++) {
			for (int m = k + 1; m < l; m++) {
				char[] x = ("" + a[k]).toCharArray();
				char[] y = ("" + a[m]).toCharArray();
				if ((utility.areAnagram(x, y)) == true)

				{
					System.out.print(" " + a[k] + "---" + a[m] + " ");
					utility.add(String.valueOf(a[k]));
					utility.add(String.valueOf(a[m]));
				}
			}
		}
		System.out.println();
		String rev = utility.display();
		String[] revdata = rev.split(" ");
		System.out.println(revdata[2]);
		for (int i = 0; i < revdata.length; i++) {
			System.out.println(revdata[i] );
		}

	}

	private static boolean isPrime(Integer t) {
		 boolean itIs = true;
	        for (int i = 2; i < t; i++){
	            if(t%i == 0){
	                itIs = false;  
	            }
	        }
	        return itIs;	
	}

}
