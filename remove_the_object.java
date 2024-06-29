import java.util.LinkedList;
public class remove_the_object {
    public static void main(String args[]){
        LinkedList <String> color=new LinkedList<>();
        color.add("red");
        color.add("black");
        color.add("white");
        color.add("green");
        color.add("pink");
        System.out.println("LinkedList: " + color);
        color.remove("green"); // remove the object elment
        System.out.println("After the Removing the Object Element is: " + color);
    }
}
/*
 OUTPUT:
LinkedList: [red, black, white, green, pink]
After the Removing the Object Element is: [red, black, white, pink]
 */