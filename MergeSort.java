package com.mocktest;

import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] arr,int start,int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            mSort(arr,start,mid,end);
        }
    }
    public static void mSort(int[] arr,int start,int mid,int end){
       int n1=mid-start+1;
       int n2=end-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[i];
        }
        for(int i=mid;i<n2;i++){
            right[i-mid]=arr[i];
        }
        int i=0,j=0,k=start;
        while (i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }
            else {
                arr[k]=right[j];
                j++;
            }
           k++;
        }
        while (i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while (j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the Elements");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        mergeSort(arr,0,length-1);
    }
}
