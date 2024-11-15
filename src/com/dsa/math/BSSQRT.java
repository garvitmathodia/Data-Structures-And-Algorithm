package com.dsa.math;

public class BSSQRT {
	public static void main(String[] args) {
		int n = 40;
		int p =3;
		System.out.println(sqrt(n , p));
	}
	
	static double sqrt(int n , int p) {
		int s = 0;
		int e = n;
		double root  = 0.0;
		
		while(s<=e) {
			int m = s + (e-s)/2;
			
			if(m*m==n) {
				return m ;
			}
			
			if(m*m>n) {
				e = m-1;
			}else {
				s = m+1;
			}
		}
		double incre = 0.1;
		for(int i =0 ; i<p ; i++) {
			while(root*root<=n) {
				root +=incre;
			}
			root -= incre;
			incre = incre/10;
		}
		
		return root;
	}
}
