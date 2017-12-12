/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    int length = 0;
    Node temp = head;
    while(temp!=null)
    {
        temp = temp.next;
        length++;
    }
    if(head == null || position == 0)
        return insertAtFront(head,data);
    else if(position == length)
        return insertAtEnd(head,data);
    else
        return insertInBetween(head,data,position);
    
}

Node insertInBetween(Node head, int data, int position)
{
    Node prev = head;
    for(int i = position;i>1;i--)
    {
        prev = prev.next;
    }
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = prev.next;
    prev.next = newNode;
    return head;
}

Node insertAtEnd(Node head,int data) {
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    Node last = head;
    if(last == null)
    {
        head = newNode;
        return head;
    }
    else
    {
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next = newNode;
        last = newNode;
        return head;
    }
}

Node insertAtFront(Node head,int x) {
    Node newNode = new Node();
    newNode.data = x;
    if(head == null)
    {
        newNode.next = null;
        head = newNode;
        return head;
    }
    else
    {
        newNode.next = head;
        head = newNode;
        return head;
    }
}
