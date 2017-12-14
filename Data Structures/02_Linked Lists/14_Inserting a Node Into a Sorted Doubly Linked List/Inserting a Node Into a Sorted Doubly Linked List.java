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

Node SortedInsert(Node head,int data) {
    if(head==null)
    {
        Node newNode  = new Node();
        newNode.data = data;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        return head;
    }
    Node node = head;
    while(node != null)
    {
        if(node.data >= data)
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.prev = node.prev;
            newNode.next = node;
            node.prev = newNode;
            if(newNode.prev == null)
            {
                head = newNode;
                break;
            }
            else
            {
                newNode.prev.next = newNode;
                break;
            }
        }
        if(node.next == null)
        {
            Node newNode = new Node();
            newNode.data = data;
            newNode.next = null;
            newNode.prev = node;
            node.next = newNode;
            break;
        }
        node = node.next;
    }
    return head;
}
