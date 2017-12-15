/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    int length = 0;
    Node temp = head;
    while(temp!=null)
    {
        length++;
        temp = temp.next;
    }
    int positionFromFront = length-n;
    temp = head;
    while(--positionFromFront>0)
    {
        temp = temp.next;
    }
    return temp.data;
}
