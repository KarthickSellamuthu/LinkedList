import java.util.LinkedList;
public class condition_Statement {
    public static void main(String args[]){
        LinkedList<String> tech=new LinkedList<>();
        tech.add("c,c++");
        tech.add("java");
        tech.add("SQL");
        tech.add("React");
        tech.add("Angular");
        System.out.println("Linkedlist : " + tech);
        //check the element is present in the tech or not
        if(tech.contains("SQL")){
            System.out.println("SQL is Present");
       }
       else{
        System.out.println("SQL is not Present");
       }
    }
    }
/*
 OUTPUT:
Linkedlist : [c,c++, java, SQL, React, Angular]
SQL is Present 
 */