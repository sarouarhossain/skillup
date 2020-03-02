package data_st.trees;

import java.util.Queue;

public class TreeNode {
  public Integer data;
  public TreeNode leftNode;
  public TreeNode rightNode;

  public void create(Integer data) {
    this.data = data;
  }

  public void insertLeft(TreeNode treeNode, Integer data, Queue<TreeNode> queue) {
    TreeNode newNode = new TreeNode();
    newNode.data = data;
    treeNode.leftNode = newNode;
    queue.add(newNode);
  }

  public void insertRight(TreeNode treeNode, Integer data, Queue<TreeNode> queue) {
    TreeNode newNode = new TreeNode();
    newNode.data = data;
    treeNode.rightNode = newNode;
    queue.add(newNode);
  }

  @Override
  public String toString() {
    return "TreeNode{"
        + "data="
        + data
        + ", leftNode="
        + leftNode
        + ", rightNode="
        + rightNode
        + '}';
  }
}
