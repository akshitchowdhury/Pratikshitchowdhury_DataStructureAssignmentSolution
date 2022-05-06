package com.assignmentQ2;

import com.assignmentQ2.BSTconverter.Node;
public class DriverBST {

	public static void main(String[] args)  {
        //The input tree is assumed to be a valid binary search tree
       
		//connecting BSTconverter to Driver class
		BSTconverter tree = new BSTconverter();
        
        tree.root =new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(10);
        tree.root.right.left = new Node(55);
      
        
       
        
        BSTconverter.curr=null;
        tree.bsttoSkew(tree.root);
        tree.root = BSTconverter.newroot;
        //System.out.println("");
        System.out.println("Skewed Tree:");
        
        while(BSTconverter.newroot!=null){
            System.out.print(BSTconverter.newroot.data+" ");
            BSTconverter.newroot=BSTconverter.newroot.right;
        }

}
}