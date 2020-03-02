package data_st.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeC {
  public TreeNode rootNode;
  public Queue<TreeNode> queue = new LinkedList<>();

  public void createTree() {
    Scanner sc = new Scanner(System.in);
    rootNode = new TreeNode();

    System.out.println("Enter root value: ");
    Integer data = Integer.parseInt(sc.next());
    rootNode.data = data;
    queue.add(rootNode);

    while (!queue.isEmpty()) {
      TreeNode tnode = queue.poll();

      System.out.println("Enter left child of " + tnode.data + ", enter -1 if it is empty: ");
      Integer ldata = Integer.parseInt(sc.next());
      if (ldata != -1) {
        TreeNode lnode = new TreeNode();
        lnode.data = ldata;
        tnode.leftNode = lnode;
        queue.add(lnode);
      }

      System.out.println("Enter right child of " + tnode.data + ", enter -1 if it is empty: ");
      Integer rdata = Integer.parseInt(sc.next());
      if (rdata != -1) {
        TreeNode rnode = new TreeNode();
        rnode.data = rdata;
        tnode.rightNode = rnode;
        queue.add(rnode);
      }
    }
  }

  public void preOrderTraverse(TreeNode node) {
    if (node != null) {
      System.out.print(node.data);
      System.out.print(" ");
      preOrderTraverse(node.leftNode);
      preOrderTraverse(node.rightNode);
    }
  }

  public void inOrderTraverse(TreeNode node) {
    if (node != null) {
      inOrderTraverse(node.leftNode);
      System.out.print(node.data);
      System.out.print(" ");
      inOrderTraverse(node.rightNode);
    }
  }

  public void postOrderTraverse(TreeNode node) {
    if (node != null) {
      postOrderTraverse(node.leftNode);
      postOrderTraverse(node.rightNode);
      System.out.print(node.data);
      System.out.print(" ");
    }
  }

  public Integer nodeCount(TreeNode node) {
    if (node != null) {
      Integer x = nodeCount(node.leftNode);
      Integer y = nodeCount(node.rightNode);
      return x + y + 1;
    }
    return 0;
  }

  public Integer heightCount(TreeNode node) {
    if (node != null) {
      Integer x = heightCount(node.leftNode);
      Integer y = heightCount(node.rightNode);
      if (x >= y) {
        return x + 1;
      } else {
        return y + 1;
      }
    }
    return 0;
  }

  public Integer leafCount(TreeNode node) {
    if (node != null) {
      Integer x = leafCount(node.leftNode);
      Integer y = leafCount(node.rightNode);
      if (x == y && x.equals(0)) {
        return 1;
      } else {
        return x + y;
      }
    }
    return 0;
  }
}
