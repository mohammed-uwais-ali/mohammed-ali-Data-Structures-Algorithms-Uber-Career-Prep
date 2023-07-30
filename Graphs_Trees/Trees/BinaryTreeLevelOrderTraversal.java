class BinaryTreeLevelOrderTraversal {
    
    //traversive approach where each iteration of the forloop represents that level and then you add it to the result list
    public List<List<Integer>> levelOrder(TreeNode root) {
        List <List<Integer>> result = new LinkedList<List<Integer>>(); // will only hold integer
        if(root == null){ //null point exception 
            return result; 
        }
        Queue <TreeNode> queue = new LinkedList<TreeNode>(); //will hold all nodes
        queue.add(root);

        while(!queue.isEmpty()){
            //explore that specific root.nodes
            int currentLengthOfQueue = queue.size();
            List<Integer> currentLevelVal = new LinkedList<Integer>();
            
            for(int i = 0; i < currentLengthOfQueue; i++){
                TreeNode poppedNode = queue.poll();
                if(poppedNode.left != null){queue.add(poppedNode.left);}
                if(poppedNode.right != null){queue.add(poppedNode.right);}
                currentLevelVal.add(poppedNode.val);
            }
            
            result.add(currentLevelVal);
        }
    
        return result;
    }
    