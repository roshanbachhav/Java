package java_Slips.Operation;

import java.util.Scanner;

public class Maximum {
    public int max(int x , int y){
       int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no");
        a = sc.nextInt();
        System.out.println("Enter second no");
        b = sc.nextInt();
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Maximum m = new Maximum();
        m.max(5 , 5);
    }
}
