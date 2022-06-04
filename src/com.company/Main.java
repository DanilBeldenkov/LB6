package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter x:");
        int num1=new Scanner(System.in).nextInt();
        System.out.println("Enter y:");
        int num2=new Scanner(System.in).nextInt();
        System.out.println("Enter z:");
        int num3=new Scanner(System.in).nextInt();
        Formula formm = new Formula (num1,num2,num3);
        formm.displayFormula();
    }
}

class Formula {
    float x;
    float y;
    float z;
    public Formula(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void displayFormula() {
        double l = Math.sqrt(x * x + y * y + z * z);
        System.out.println("Длина вектора :" + l);
    }
}