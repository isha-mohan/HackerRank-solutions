	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        if(root == null)
            return -1;
        else
        {
            int lDepth = height(root.left);
            int rDepth = height(root.right);
            if(lDepth>rDepth)
                return (lDepth+1);
            else
                return (rDepth+1);
        }
    }
