package data_st;

public class LinkedListTest {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        int counter = 0;
        //position--;
        SinglyLinkedListNode currentNode = head;
        if(position == 0){
            newNode.next = currentNode;
            head = newNode;
            return head;
        }


        while(true){

            if(counter == position-1){
                if(currentNode.next == null){
                    currentNode.next = newNode;
                    break;
                }else{
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
            }
            counter++;
            currentNode = currentNode.next;
        }
        return head;

    }

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode temp;
        if(position == 0){
            temp = head;
            head = temp.next;
            return head;
        }

        System.out.println("a: "+head.data);

        SinglyLinkedListNode currentNode = head;
        for(int i=0; i<position-1;i++ ){
            currentNode = currentNode.next;
        }

        System.out.println("c: "+currentNode.data);


        temp = currentNode.next;

        System.out.println("t: "+temp.data);

        if(temp.next != null){
            currentNode.next = temp.next;
        }

        System.out.println("a: "+head.data);


        return head;
    }
}
