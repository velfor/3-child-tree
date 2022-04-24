package User;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class MyTree{
    private TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }

    public MyTree(){    }
    public static TreeNode addToTree(TreeNode curr, String name)  {
        if(curr == null) return new TreeNode(name);
        else{
            if(name.hashCode() <= 2_000_000) curr.friend1=addToTree(curr.friend1, name);
            else if (name.hashCode() > 2_000_000 && name.hashCode() <= 4_000_000) curr.friend2=addToTree(curr.friend2, name);
            else  if (name.hashCode() > 4_000_000)  curr.friend3=addToTree(curr.friend3, name);
            //else return newNode;
        }
        return curr;
    }
    public void add(String name){
        root = addToTree(root, name);
    }
    public static void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.friend1);
            System.out.print(" " + node.user);
            traverseInOrder(node.friend2);
            traverseInOrder(node.friend3);
        }
    }
    public void printTree() {
        Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
        Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
        currentLevel.add(root);
        while (!currentLevel.isEmpty()) {
            Iterator<TreeNode> iter = currentLevel.iterator();
            while (iter.hasNext()) {
                TreeNode currentNode = iter.next();
                if (currentNode.friend1 != null) {
                    nextLevel.add(currentNode.friend1);
                }
                if (currentNode.friend2 != null) {
                    nextLevel.add(currentNode.friend2);
                }
                if (currentNode.friend3 != null) {
                    nextLevel.add(currentNode.friend3);
                }
                System.out.print(currentNode.user.getName() + " ");
            }
            System.out.println();
            currentLevel = nextLevel;
            nextLevel = new LinkedList<TreeNode>();
        }

    }
}
