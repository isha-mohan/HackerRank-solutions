/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    int length = 0; 
    Node temp = head;
    while(temp!=null)
    {
        temp = temp.next;
        length++;
    }
    if(length==1 || position==0)
        return deleteAtHead(head);
    else if(length == position-1)
        return deleteAtLast(head);
    else
        return deleteInBetween(head,position);
}

Node deleteAtHead(Node head)
{
    Node temp = head;
    if(head == null)
        return null;
    else
    {
        head = temp.next;
    }
    return head;
}

Node deleteAtLast(Node head)
{
    Node temp = head;
    while(temp.next!=null)
    {
        temp = temp.next;
    }
    temp.next = null;
    return head;
}

Node deleteInBetween(Node head,int position)
{
    Node temp = head;
    for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;
    temp.next = temp.next.next;
    return head;
}

