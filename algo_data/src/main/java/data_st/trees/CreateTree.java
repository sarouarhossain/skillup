package data_st.trees;

public class CreateTree {
  public static void main(String[] args) {
    TreeC tree = new TreeC();
    tree.createTree();
    System.out.println("InOrder: ");
    tree.inOrderTraverse(tree.rootNode);

    System.out.println();
    System.out.println("PreOrder: ");
    tree.preOrderTraverse(tree.rootNode);

    System.out.println();
    System.out.println("PostOrder: ");
    tree.postOrderTraverse(tree.rootNode);

    System.out.println("Node: " + tree.nodeCount(tree.rootNode));
    System.out.println("Height: " + tree.heightCount(tree.rootNode));
    System.out.println("Leaf: " + tree.leafCount(tree.rootNode));

    System.out.println("TopView: ");
    tree.topView(tree.rootNode);
  }
}
