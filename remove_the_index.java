import java.util.LinkedList;
public class remove_the_index {
    public static void main(String args[]){
        LinkedList <String> color=new LinkedList<>();
        color.add("red"); //index 0
        color.add("black"); //index 1
        color.add("white"); //index 2
        color.add("green"); //index 3
        color.add("pink"); //index 4
        System.out.println("LinkedList: " + color);
        color.remove(2); // remove the index elment
        System.out.println("After the Removing the Index Element is: " + color);
    }
}
/*
 OUTPUT:
 LinkedList: [red, black, white, green, pink]
After the Removing the Index Element is: [red, black, green, pink]
 */