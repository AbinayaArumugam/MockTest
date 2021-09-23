package com.mocktest;

import java.util.Scanner;

public class ContiguousSubArray {
    public static int[] findSubArr(int[] arr,int key) {
        int sum = 0;
        int a=0;
       int[] res=new int[2];
        int j;
        for (int i = 0; i < arr.length; i++) {
            for (j = i; j < arr.length; j++) {
                sum += arr[j];
             int   l = j;
             int   k = i;
                if (sum == key) {
                    res[a++]=k+1;
                    res[a++]=l+1;
                   return res;
                }
            }
            sum=0;
        }
        return res;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length");
        int length=in.nextInt();
        int[] arr=new int[length];
        System.out.println("Enter the Elements");
        for (int i=0;i<length;i++){
            arr[i]=in.nextInt();
            }
        System.out.println("Enter the sum value");
        int key=in.nextInt();
        int[] res=findSubArr(arr,key);
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        }
}
