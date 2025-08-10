class Solution {

    public boolean isIdentical(TreeNode root, TreeNode subroot){

        if(root == null && subroot == null){
            return true;
        }

        if(root == null || subroot == null){
            return false;
        }

        if(root.val == subroot.val){

            return isIdentical(root.left, subroot.left) && isIdentical (root.right, subroot.right);
        }
        return false;


    }

    public boolean isSubtree(TreeNode root, TreeNode subroot) {


        if(subroot == null){
            return true; // if the subroot is null its ok match root 
        }

        if(root == null){
            return false; // because i need to mathch to the subroot == root but root is null so can't match
        }
            if(root.val == subroot.val){ // if the root.val equal to the subroot val return the identical(root,subroot);
                if(isIdentical(root, subroot)){
                    return true;
                }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
      
  }
}
