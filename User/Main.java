package User;

/**
 * Created by velfor on 24.04.2022.
 */
public class Main {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        tree.add("Valeria");
        for (int i = 0; i < 120; i++){
            int tempNum = (int)(Math.random()*UsersData.arr_name.length);
            tree.add(UsersData.arr_name[tempNum]);
        }
        tree.printTree();

    }
}
