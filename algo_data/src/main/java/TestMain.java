import data_st.LinkedListTest;
import data_st.SinglyLinkedListNode;
import data_st.array_a.LeftRotation;
import warmup.RepeatedString;

public class TestMain {
  public static void main(String[] args) {

    SinglyLinkedListNode node1 = new SinglyLinkedListNode(11);
    SinglyLinkedListNode node2 = new SinglyLinkedListNode(9);
    SinglyLinkedListNode node3 = new SinglyLinkedListNode(2);
    SinglyLinkedListNode node4 = new SinglyLinkedListNode(9);
    SinglyLinkedListNode node5 = new SinglyLinkedListNode(1);

    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    SinglyLinkedListNode n = LinkedListTest.deleteNode(node1,1);
    while (n.next != null){
      System.out.println(n.data);
      n = n.next;
    }
  }
}
