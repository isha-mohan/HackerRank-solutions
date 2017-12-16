   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   int height(Node root)
   {
       if(root == null)
           return 0;
       else
       {
           int lDepth = height(root.left);
           int rDepth = height(root.right);
           if(lDepth > rDepth)
               return (lDepth+1);
           else
               return (rDepth+1);
       }
   }
   void levelOrder(Node root) {
      int h = height(root);
       for(int i=1;i<=h;i++)
           printGivenLevel(root,i);
    }
   void printGivenLevel(Node root, int level)
   {
       if(root == null)
           return;
       if(level == 1)
           System.out.print(root.data+" ");
       else if(level > 1)
       {
           printGivenLevel(root.left,level-1);
           printGivenLevel(root.right,level-1);
       }
   }
