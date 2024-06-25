import java.util.LinkedList;
public class removeFirst_removeLast {
    public static void main(String args[]){
        LinkedList <String> color=new LinkedList<>();
        color.add("red");
        color.add("black");
        color.add("white");
        color.add("green");
        color.add("pink");
        System.out.println("LinkedList: " + color);
        color.removeFirst(); // remove the first element
        System.out.println("First Element:" + color);
        color.removeLast(); //remove the last element
        System.out.println("Last Element:" + color);
       }
}
/*
 OUTPUT:
 LinkedList: [red, black, white, green]
First Element:[pink, red, black, white, green]
Last Element:[pink, red, black, white, green, violet]
 */
