package baitap;

import java.util.Scanner;

public class ExArray {
    private static int input(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static void output(int n,int[]array){
        array=new int[n];
        for(int i=1;i<=array.length;i++){
            System.out.println("nhap cac phan tu"+i);
            array[i]=input();


        }


    }

    public static void main(String[] args) {
        int n;
        int array[];
        System.out.println("nhap gia tri cua n");
        n= input();




    }
}
