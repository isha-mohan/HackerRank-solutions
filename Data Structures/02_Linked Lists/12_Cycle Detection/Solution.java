/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node temp = head;
    HashSet<Node> hashSet = new HashSet<Node>();
    while(temp!=null)
    {
        if(hashSet.contains(temp))
            return true;
        hashSet.add(temp);
        temp = temp.next;
    }
    return false;
}
