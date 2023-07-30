class validateBinarySearch {

    private long INF = Long.MAX_VALUE;
    boolean isAValidBST = true;

    public boolean isValidBST(TreeNode root) {
        evaluateIfValidBSTWhileTraversing(-INF, INF, root);
        return this.isAValidBST; //of the same class instance variable
    }

    // pass the threshold and update it
    public void evaluateIfValidBSTWhileTraversing(long lowerBound, long upperBound, TreeNode root){
        if(root == null){return;}
        if (root.val <= lowerBound|| root.val >= upperBound ){
            this.isAValidBST = false;
            return;
        }

        //traverse left 
        evaluateIfValidBSTWhileTraversing(lowerBound, root.val,root.left);
        //traverse to the right side
        evaluateIfValidBSTWhileTraversing(root.val, upperBound, root.right); 

        
        return; 
    }
}