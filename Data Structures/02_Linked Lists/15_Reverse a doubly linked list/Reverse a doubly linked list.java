/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if(head == null)
        return null;
    Node temp = null;
    Node curr = head;
    while(curr != null)
    {
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;
        curr = curr.prev;
    }
    if(temp!=null)
        head = temp.prev;
    return head;
}
