package DSA;
class LL{
    Node head;
    class Node{
       String data;
       Node next;
       Node(String data){
        this.data=data;
        this.next=null;
       }
    }
public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
   } 

public void addLast(String data){
 Node newNode = new Node(data);
 if(head==null){
    head = newNode;
    return;
 }
 Node currNode = head;
 while(currNode.next!=null){
    currNode = currNode.next;
 }
 currNode.next = newNode;
}
public void printList(){
    Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data+"->");

        currNode = currNode.next;
    }
    System.out.println("null");
}
public void deleteFirst(){
    if(head == null){
        return;
    }
    head = head.next;
}
public void deleteLast(){
    if(head==null){
        return;
    }
    if(head.next == null){
        head = null;
        return;
    }
    Node lastNode = head.next;
    Node secondLast = head;

    while(lastNode.next!=null){
        lastNode = lastNode.next;
        secondLast = secondLast.next;
    }
    secondLast.next = null;
}
public void reverseIterate(){
    if(head == null || head.next == null){
        return;
    }
    Node prevNode = head;
    Node currNode = head.next;

    while(currNode!=null){
        Node nextNode = currNode.next;
        currNode.next = prevNode;

        prevNode = currNode;
        currNode = nextNode;
    }
    head.next = null;
    head = prevNode;
}
public Node reverseRecursive(Node head){
    if(head==null || head.next==null){
      return head;
    }
    Node newHead = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;

    return newHead;

}
public static void main(String[] args) {
    LL list = new LL();
    list.addFirst("1");
    list.addLast("2");
    list.addLast("3");
    list.addLast("4");
    list.printList();
    // list.deleteFirst();
    // list.printList();
    // list.reverseIterate();
    // list.printList();
    list.head=list.reverseRecursive(list.head);
    list.printList();

}
}