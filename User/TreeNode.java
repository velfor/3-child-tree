package User;

class TreeNode {
    public User user;
    public TreeNode friend1 = null;
    public TreeNode friend2 = null;
    public TreeNode friend3 = null;

    public TreeNode(String name) {
        user = new User(name);
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "user=" + user +
                '}';
    }
}