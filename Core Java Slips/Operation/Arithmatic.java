package java_Slips.Operation;

import java.util.Scanner;

public class Arithmatic {

    public float addition(float x, float y){
        float f , s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        f = sc.nextFloat();
        System.out.println("Enter the Second number");
        s = sc.nextFloat();
        return (f+s);
    }
    public float subtraction(float x, float y){
        float f , s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        f = sc.nextFloat();
        System.out.println("Enter the Second number");
        s = sc.nextFloat();
        return (f-s);
    }

    public static void main(String[] args) {
        Arithmatic a = new Arithmatic();
        a.addition(5,5);
        a.subtraction(5,5);
    }

}
