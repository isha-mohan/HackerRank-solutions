/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node headA, Node headB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
    Node result = null;
    if(headA==null)
        return headB;
    if(headB==null)
        return headA;
    if(headA.data <= headB.data)
    {
        result = headA;
        result.next = mergeLists(headA.next,headB);
    }
    else
    {
        result = headB;
        result.next = mergeLists(headA,headB.next);
    }
    return result;
}
