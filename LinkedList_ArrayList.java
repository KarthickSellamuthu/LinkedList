import java.util.LinkedList;
import java.util.ArrayList;
public class LinkedList_ArrayList {
    public static void main(String args[]){
        LinkedList<String> color=new LinkedList<>();
        color.add("red");
        color.add("green");
        color.add("pink");
        System.out.println("LinkedList : " + color); //print the linkedlist element
        ArrayList<String> name=new ArrayList<>();
        name.add("Ram");
        name.add("rohit");
        name.add("rahul");
        System.out.println("ArrayList : " + color); //print the Arraylist element
        color.addAll(name); // add the color element to the name element
        System.out.println("Linkedlist and ArrayList adding of element is:" + color); // adding color and name   
    }
    }
    /*
     OUTPUT
     LinkedList : [red, green, pink]
ArrayList : [red, green, pink]
Linkedlist and ArrayList adding of element is:[red, green, pink, Ram, rohit, rahul]
     */
