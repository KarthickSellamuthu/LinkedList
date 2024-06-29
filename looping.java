import java.util.LinkedList;
public class looping {
    public static void main(String args[]){
            LinkedList<String> color=new LinkedList<>();
            color.add("blue");
            color.add("black");
            color.add("green");
            color.add("red");
            color.add("violet");
            color.add("pink");
            System.out.println("LinkedList:" + color);
            //using the for each condition
            for(String a:color){
                System.out.println(a);
            }
    }
}
/*
 OUTPUT:
 LinkedList:[blue, black, green, red, violet, pink]
blue
black
green
red
violet
pink
 */