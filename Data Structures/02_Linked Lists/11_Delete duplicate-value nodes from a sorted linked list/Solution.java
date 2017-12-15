/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node prev = head;
    Node next = head.next;
    while(next!=null)
    {
        if(prev.data == next.data)
        {
            prev.next = next.next;
            next = prev.next;
        }
        else
        {
            next = next.next;
            prev = prev.next;
        }
    }
    return head;
}
