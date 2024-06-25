import java.util.LinkedList;
public class set_size {
    public static void main(String args[]){
        LinkedList<String> color=new LinkedList<>();
        color.add("blue");
        color.add("yellow");
        color.add("red");
        color.add("pink");
        color.add("green");
        System.out.println("The Size of the Element: " + color.size());
        color.set(2,"grey");
        System.out.println("Replace the Element:" + color);
    }
}
/*
 OUTPUT:
 The Size of the Element: 5
Replace the Element:[blue, yellow, grey, pink, green]
 */
