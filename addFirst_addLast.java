import java.util.LinkedList;
class addFirst_addLast{
    public static void main(String args[]){
        LinkedList <String> color=new LinkedList<>();
        color.add("red");
        color.add("black");
        color.add("white");
        color.add("green");
        System.out.println("LinkedList: " + color);
        color.addFirst("pink");//add the first element
        System.out.println("First Element:" + color);
        color.addLast("violet");//add the last element
        System.out.println("Last Element:" + color);
       }
} 
/* 
LinkedList: [red, black, white, green]
First Element:[pink, red, black, white, green]
Second Element:[pink, red, black, white, green, violet]
*/