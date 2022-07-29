package org.example;

import com.sun.source.tree.Tree;

public class BinarySearchTreeTraversal {


    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {
//                    20
//                5          25
//            3       10              30
//
//
//    20,5,3
        TreeNode treeNode = new TreeNode(20, new TreeNode(5,
                new TreeNode(3, null, null), new TreeNode(10, null, null)),
                new TreeNode(25, null, new TreeNode(30, null, null)));

        leftViewTraversal(treeNode);

    }

    private static void leftViewTraversal(TreeNode treeNode) {

        if (treeNode != null) {
            System.out.println(treeNode.data);
            leftViewTraversal(treeNode.left);
        }


    }


}
