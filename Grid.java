package com.mocktest;

import java.util.Scanner;

public class Grid {
    static int[] x={-1,-1,-1,0,0,1,1,1};
    static int[] y={-1,0,1,-1,1,-1,0,1};

   public static void findWord(char[][] arr,String word,int R,int C){
      for (int i=0;i<R;i++){
          for (int j=0;j<C;j++){
              if(search(arr,i,j,word,R,C)){
                  System.out.println(i+" "+j);
              }
          }
      }
    }
    public static boolean search(char[][] arr,int row,int col,String word,int R,int C){
       if(arr[row][col]!=word.charAt(0)){
           return false;
       }
       int len=word.length();
       for (int i=0;i<8;i++) {
           int k;
           int rowDir = row + x[i];
           int colDir = col + y[i];
           for (k = 1; k < len; k++) {
               if (rowDir >= R || rowDir < 0 || colDir >= C || colDir < 0) {
                   break;
               }
               if (arr[rowDir][colDir] != word.charAt(k)) {
                   break;
               }
               rowDir += x[i];
               colDir += y[i];
           }
           if (k == len) {
               return true;
           }
       }
       return false;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int R=in.nextInt();
        System.out.println("Enter the no of columns");
        int C=in.nextInt();
        char[][] arr=new char[R][C];
        System.out.println("Enter the Elements");
        for (int i=0;i<R;i++){
            for (int j=0;j<C;j++){
                arr[i][j]=in.next().charAt(0);
            }
        }
        System.out.println("Enter the word");
        String word=in.next();
        findWord(arr,word,R,C);
    }
}
