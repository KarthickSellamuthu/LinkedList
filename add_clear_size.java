import java.util.LinkedList;
public class add_clear_size{
    public static void main(String args[]){
        LinkedList <String> color=new LinkedList<>();
        color.add("red"); //index 0
        color.add("black"); //index 1
        color.add("white"); //index 2
        color.add("green"); //index 3
        color.add("pink"); //index 4
        System.out.println("LinkedList: " + color); //print the color element
        color.clear(); //clear all the element
        System.out.println("After the clearing the element");
        color.add("violet"); 
        color.add("purple"); 
        color.add("orange");
        System.out.println("Second LinkedList: " + color);
        System.out.println("The size of the Element : " + color.size()); // print the size of the element
}
}
/*
 LinkedList: [red, black, white, green, pink]
After the clearing the element
Second LinkedList: [violet, purple, orange]
The size of the Element : 3
 */
