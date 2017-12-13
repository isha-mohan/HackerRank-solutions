/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    Node tempA = headA;
    Node tempB = headB;
    HashSet<Node> hashSet = new HashSet<Node>();
    while(tempA!=null)
    {
        hashSet.add(tempA);
        tempA = tempA.next;
    }
    while(tempB!=null)
    {
        if(hashSet.contains(tempB))
            return tempB.data;
        tempB = tempB.next;
    }
    return -1;
}
