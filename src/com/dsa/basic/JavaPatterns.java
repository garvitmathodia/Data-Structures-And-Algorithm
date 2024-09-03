package com.dsa.basic;

public class JavaPatterns {
	public static void main(String[] args) {
		pattern25(5);
	}

	static void pattern25(int n) {
		for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
	}

	static void pattern24(int n) {
		int k = 0;
        for(int i = 1 ; i<=2*n-1 ; i++){
			k = (i <= n) ? ++k : --k;		
            for(int j = 1 ; j<=2*n-1 ; j++){
           	if(j==n+1-k || j==n-1+k) {
           		System.out.print("*");
           	}else {
           		System.out.print(" ");
           	}
            }
            System.out.println();
        }
	}

	static void pattern23(int n) {
		int k = 0;
        for(int i = 1 ; i<=2*n-1 ; i++){
			k = (i <= n) ? ++k : --k;
			int l = 1;
            for(int j = 1 ; j<=n ; j++){
           	if(j>=n+1-k) {
           		System.out.print(l);
				l++;
           	}else {
           		System.out.print(" ");
           	}
            }
            System.out.println();
        }
	}

	static void pattern22(int n) {
        for(int i = 1 ; i<=n; i++){
			int k = n-i;
            for(int j = 1 ; j<=n ; j++){
           	if(j<=n+1-i) {
           		System.out.print(k);
				k--;
           	}else {
           		System.out.print(" ");
           	}
            }
            System.out.println();
        }
	}

	static void pattern21(int n) {
        for(int i = 1 ; i<=n; i++){
            for(int j = 1 ; j<=2*n-1 ; j++){
           	if(j>=i && j<=2*n-i) {
           		System.out.print("*");
           	}else {
           		System.out.print(" ");
           	}
            }
            System.out.println();
        }
	}


	static void pattern20(int n) {
		int k = 0;
        for(int i = 1 ; i<=2*n-1 ; i++){
			k = (i <= n) ? ++k : --k;
            for(int j = 1 ; j<=n ; j++){
           	if(j<=k) {
           		System.out.print("*");
           	}else {
           		System.out.print(" ");
           	}
            }
            System.out.println();
        }
	}
	
	static void pattern19(int n) {
		int k = 0;
        for(int i = 1 ; i<=2*n-1 ; i++){
			k = (i <= n) ? ++k : --k;
            for(int j = 1 ; j<=2*n-1 ; j++){
           	if(j>=n+1-k && j<=n-1+k) {
           		System.out.print("*");
           	}else {
           		System.out.print(" ");
           	}
            }
            System.out.println();
        }
	}

	static void pattern18(int n) {
		for (int i = 1; i <= n; i++) {
			char ch = 'A';
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j <= n + 1 - i || j >= n - 1 + i) {
					System.out.print(ch);
					if(j<n) {
						ch++;
					}else {
						ch--;
					}
				} else {
					System.out.print(" ");
					if(j==n) ch--;
				}

			}
			System.out.println();
		}

	}

	static void pattern17(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (i != n) {
					if (j == n + 1 - i || j == n - 1 + i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if (j >= n + 1 - i || j <= n - 1 + i) {
						System.out.print("*");
					}
				}

			}
			System.out.println();
		}
	}

	static void pattern16(int n) {
		for (int i = 1; i <= n; i++) {
			int k = 1;
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j >= n + 1 - i && j <= n - 1 + i) {
					System.out.print(k);
					if (j < n) {
						k++;
					} else {
						k--;
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern15(int n) {
		for (int i = 1; i <= n; i++) {
//        	boolean k = true;
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j <= n + 1 - i || j >= n - 1 + i) {
					System.out.print("*");
//                    k = false;
				} else {
					System.out.print(" ");
//                    k = true;
				}
			}
			System.out.println();
		}
	}

	static void pattern14(int n) {
		for (int i = 1; i <= n; i++) {
			boolean k = true;
			for (int j = 1; j <= 2 * n - 1; j++) {
				if (j >= 6 - i && j <= 4 + i && k) {
					System.out.print("*");
					k = false;
				} else {
					System.out.print(" ");
					k = true;
				}
			}
			System.out.println();
		}
	}

	static void pattern13(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i > 1 && i < n) {
					if (j == 1 || j == 2 * i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	static void pattern12(int n) {

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern11(int n) {

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern10(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern9(int n) {

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = n - i + 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {

		for (int i = 1; i <= n; i++) {
//			space
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
//			stars
			for (int j = n - i + 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {

		for (int i = 1; i <= 2 * n - 1; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {

					System.out.print("*");
				}
			} else {
				for (int j = 1; j <= 2 * n - i; j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

	static void pattern4(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern1(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
