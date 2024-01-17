package ConditionalStatements;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int f=0, s=1, t;
        System.out.println(f);
        System.out.println(s);
        for(int i=0;i<n-2;i++){

            t=f+s;
            System.out.println(t);
            f=s;
            s=t;

        }
    }
}