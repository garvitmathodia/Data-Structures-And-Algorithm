package com.dsa.striverpattern;

public class Main {

    public static void main(String[] args) {
        int n = 5;
        p19(n);
    }


    public static  void p19(int n){
        for(int i = 1; i<=2*n-1 ; i++){
            for(int j = 1 ; j<=2*n ; j++){
                if(i<=n && (j<=i || j>=2*n-i+1)){
                    System.out.print("*");
                }else if(i>n){
                    if(j<=2*n-i || j>=i+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static  void p18(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j<=n ; j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }else if(j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p17(int n) {
        for(int i=0;i<n;i++){
            for(char ch =(char)(int)('A'+n-1-i);ch<=(char)(int)('A'+n-1);ch++){
                
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void p16(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i) {
                    if (j < n) {
                        System.out.print(ch++);
                    } else {
                        System.out.print(ch--);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p15(int n) {
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            ch++;
        }
    }

    public static void p14(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n; j++) {
                if (j <= n - i + 1) {
                    System.out.print(ch++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p13(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j <= i) {
                    System.out.print(ch++);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p12(int n) {
        int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(k++ + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p11(int n) {
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= 2 * n; j++) {
                if (j <= i || j >= 2 * n - i + 1) {
                    if (j <= n) {
                        System.out.print(k++);
                    } else {
                        System.out.print(--k);
                    }
                } else {
                    if (j <= n) {
                        k++;
                    } else {
                        --k;
                    }
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p10(int n) {
        for (int i = 1; i <= n; i++) {
            int k = (i % 2 == 0) ? 0 : 1;
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(k);
                    k = 1 - k;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p9(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i <= n && j <= i) {
                    System.out.print("*");
                } else if (i > n && j <= 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p8(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (i <= n && j >= n + 1 - i && j <= n - 1 + i) {
                    System.out.print("*");
                } else if (i > n && j >= i - n && j <= 2 * n - (i - n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= i && j <= 2 * n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j >= n + 1 - i && j <= n - 1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i + 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
