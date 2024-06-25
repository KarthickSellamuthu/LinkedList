import java.util.LinkedList;
public class clear {
    public static void main(String args[]){
        LinkedList<String> color=new LinkedList<>();
        color.add("blue");
        color.add("red");
        color.add("green");
        color.add("red");
        color.add("violet");
        color.add("blue");
        System.out.println("LinkedList:" + color);
        color.clear();//clear the all the element
        System.out.println("After the Clearing the Element" );
}
}
/*
 OUTPUT:
 LinkedList:[blue, red, green, red, violet, blue]
After the Clearing the Element
 */