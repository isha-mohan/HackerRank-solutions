/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    Node temp1 = headA, temp2 = headB;
    if(temp1 == null && temp2 == null)
            return 1;
    else if(temp1 == null && temp2!=null)
        return 0;
    else if(temp1!=null && temp2 == null)
        return 0;
    else
    {
        int length1 = 0, length2 = 0;
        while(temp1!=null)
        {
            length1++;
            temp1 = temp1.next;
        }
        while(temp2!=null)
        {
            length2++;
            temp2 = temp2.next;
        }
        if(length1!=length2)
            return 0;
        else
        {
            temp1 = headA;
            temp2 = headB;
            while(temp1!=null)
            {
                if(temp1.data!=temp2.data)
                    return 0;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return 1;
        }
    }
}
