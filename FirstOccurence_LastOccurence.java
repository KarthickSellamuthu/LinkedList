import java.util.LinkedList;
public class FirstOccurence_LastOccurence {
    public static void main(String args[]){
        LinkedList<String> color=new LinkedList<>();
        color.add("blue");
        color.add("red");
        color.add("green");
        color.add("red");
        color.add("violet");
        color.add("blue");
        System.out.println(color);
        color.removeFirstOccurrence("red");//
        System.out.println("First Occurrence of red is :" +color);
         color.removeLastOccurrence("blue");
        System.out.println("Last Occurrence of blue is :" +color);
}
    }
/*
OUTPUT:
 [blue, red, green, red, violet, blue]
First Occurrence of red is :[blue, green, red, violet, blue]
Last Occurrence of blue is :[blue, green, red, violet]
 */