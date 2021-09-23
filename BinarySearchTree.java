package com.mocktest;

import java.util.List;
import java.util.Scanner;

public class BinarySearchTree {
    class Node{
        int data;
        Node left,right;
        Node(int item){
            data=item;
            right=left=null;
        }
    }
    static Node root;
    Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<= root.data){
            root.left=insert(root.left,data);
        }
        else {
            root.right=insert(root.right,data);
        }
        return root;
    }

    Node trim(Node root,int low,int high){
        if(root==null){
            return null;
        }
        root.left=trim(root.left,low,high);
        root.right=trim(root.right,low,high);
        if(root.data<low){
          return trim(root.right,low,high);
        }
        if(root.data>high) {
          return trim(root.left,low,high);
        }

        return root;
    }

   void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
   }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int size=in.nextInt();
        BinarySearchTree tree=new BinarySearchTree();
        Node root=null;
        for(int i=0;i<size;i++){
            root= tree.insert(root,in.nextInt());
        }
        System.out.println("Enter the low value");
        int low=in.nextInt();
        System.out.println("Enter the high value");
        int high=in.nextInt();
       // tree.preOrder(root);
        root=tree.trim(root,low,high);
        tree.preOrder(root);
    }
}
