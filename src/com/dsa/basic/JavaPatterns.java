package com.dsa.basic;

public class JavaPatterns {
	public static void main(String[] args) {
//		pattern17(5);
		pattern30(5);
	}
	
	static void pattern30(int n) {
		
		for(int i = 1 ; i<=n ; i++) {
			
		}
	}
	
	static void pattern29(int n) {
		 
		for (int i = 1; i <2*n; i++) {
            int m = n;
            for(int j = 1 ; j<2*n ;j++) {
            	System.out.print(m+" ");
            	if(j<i) {
            		m--;
            	} 
            	if(i+j>=2*n) {
            		m++;
            	}
            }
            System.out.println();
		}
}		
	
	static void pattern28(int n) {
		 
		for (int i = 1; i <=n; i++) {
            for(int j = 1 ; j<=n ; j++) {
            	if(i==1 || i==n || j==1 || j==n) {
            		System.out.print("*");
            	}else {
            		System.out.print(" ");
            	}
            	
            }
            System.out.println();
        }
}		
	
	
	static void pattern27(int n) {
		 
		for (int i = 0; i < n; i++) {
            char currentChar = (char) ('E' - i);
            for (int j = 0; j <= i; j++) {
                System.out.print(currentChar);
                currentChar++;
            }
            System.out.println();
        }
}		
	
	static void pattern26(int n) { 
		for (int row = 1; row <=n; row++) {	
			for(int space = 1 ; space<=n-row ; space++) {
				System.out.print(" ");
			}
			char a = 'A';
			int breakpoint = (2*row-1)/2;
			for(int col = 1 ; col<=2*row-1 ; col++) {
				System.out.print(a);
				if(col<=breakpoint) a++;
				else a--;
			}
			System.out.println();
		}
	}
	
	static void pattern25(int n) {
		char a = 'A'; 
		for (int row = 1; row <=n; row++) {
			for(int col = 1 ; col<=row ; col++) {
				System.out.print(a);
			}
			a++;
			System.out.println();
		}
	}
	
	static void pattern24(int n) {
		for (int row = 1; row <=n; row++) {
			char a = 'A'; 
			for(int col = 1 ; col<=n-row+1 ; col++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
	
	static void pattern23(int n) {
		for (int row = 1; row <=n; row++) {
			char a = 'A'; 
			for(int col = 1 ; col<=row ; col++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}
	
	static void pattern22(int n) {
		int count = 1;
		for (int row = 1; row <=n; row++) {
			for(int col = 1 ; col<=row ; col++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	static void pattern21(int n) {
		for (int row = 1; row <=n; row++) {
			for(int col = 1 ; col<=row ; col++) {
				System.out.print(col);
			}
			
			for(int space = 1 ; space<=2*(n-row) ; space++) {
				System.out.print(" ");
			}
			
			for(int col = row ; col>=1 ; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	static void pattern20(int n) {
		int start = 1;
		for (int row = 1; row <=n; row++) {
			if(row%2==0) {
				start = 0;
			}else {
				start = 1;
			}
			for(int col = 1 ; col<=row ; col++) {
				System.out.print(start);
				start = 1-start;
			}
			System.out.println();
		}
	}
	
	static void pattern19(int n) {
		for (int row = 1; row <=2*n-1; row++) {
			int col1 = row<=n ? row : 2*n-row;
			for(int col = 1 ; col<=col1 ; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern18(int n) {
		for (int row = n; row >=1; row--) {
			
			for(int space=1 ; space<=n-row ; space++) {
				System.out.print(" ");
			}
			
			for (int col = 1; col <= 2*row-1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern17(int n) {
		for (int row = 1; row <= n; row++) {
			
			for(int space=1 ; space<=n-row ; space++) {
				System.out.print(" ");
			}
			
			for (int col = 1; col <= 2*row-1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern16(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
	
	static void pattern15(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}
	
	static void pattern14(int n) {
	    int originalN = n;
	    n = 2*n-1;
	    for (int row = 0; row <n; row++) {
	        for (int col = 0; col <n; col++) {
	            int atEveryIndex = originalN - Math.min(Math.min(row, col), Math.min(n -1- row, n -1- col));
	            System.out.print(atEveryIndex + " ");
	        }
	        System.out.println();
	    }
	}

	
	
	static void pattern13(int n) {
		for(int row = 1 ; row <= 2*n ; row++) {
			int space = row>n ? 2*n - row   : row-1;
			
			for(int s = 0 ; s<space ; s++) {
				System.out.print(" ");
			}
			
			int col = row>n ? row-n : n-row+1;
			for(int c = 0 ; c<col ; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
	static void pattern12(int n) {
        for (int row = 1 ; row <=n; row++) {
        	
        	for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
        	

        	for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
            
           
            System.out.println();
        }
    }
	
	static void pattern11(int n) {
        for (int row = n ; row >=1; row--) {
        	
        	for (int space = n; space >row; space--) {
				System.out.print(" ");
			}
        	

        	for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
            
           
            System.out.println();
        }
    }
	
	static void pattern10(int n) {
        for (int row = 1 ; row <=n; row++) {
        	
        	for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
        	

        	for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
            
           
            System.out.println();
        }
    }
	
	static void pattern9(int n) {
        for (int row = n ; row >=1; row--) {
        	
        	for (int space = n; space > row; space--) {
				System.out.print(" ");
			}

        	for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}
            
           
            System.out.println();
        }
    }

	static void pattern8(int n) {
		for (int row = 1; row <= n; row++) {
			
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}

			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	static void pattern7(int n) {
		for (int row = 1; row <= n; row++) {

			for (int space = 1; space < row; space++) {
				System.out.print(" ");
			}

			for (int col = row; col <= n; col++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	static void pattern6(int n) {
		for (int row = 1; row <= n; row++) {

			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}

			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int row = 0; row <= 2 * n; row++) {
			int c = row > n ? 2 * n - row : row;
			for (int col = 0; col < c; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern1(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
