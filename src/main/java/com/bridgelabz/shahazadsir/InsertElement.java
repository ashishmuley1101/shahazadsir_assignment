package com.bridgelabz.shahazadsir;

import java.util.Scanner;

public class InsertElement {

    public static void main(String[] args) {

        int a[]= {2,5,12,56,73,90,1};
        int b[] = new int[a.length+1];
        int indexPosition;
        int element;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the index position do want to enter : ");
        indexPosition = scan.nextInt();
        System.out.print("Enter the element : ");
        element = scan.nextInt();

        System.out.println("Before inserting the element : ");
        for (int i =0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();

        for (int i = 0;i<indexPosition;i++){
            b[i]=a[i];
        }

        b[indexPosition] = element;

        for (int i=indexPosition+1;i<b.length;i++){
            b[i] = a[i-1];
        }

        System.out.println("After inserting the element : ");

        for (int i =0; i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
