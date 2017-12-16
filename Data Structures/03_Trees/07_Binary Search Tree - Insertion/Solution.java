 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
       if(root == null)
       {
           Node newNode = new Node();
           newNode.data = value;
           newNode.left = null;
           newNode.right = null;
           root = newNode;
           return root;
       }
    if(root.data > value)
    {
        root.left = Insert(root.left,value);
    }
    else if(root.data < value)
    {
        root.right = Insert(root.right,value);
    }
    return root;
    }


