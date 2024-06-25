import java.util.LinkedList;
public class Bankloan_Of_Eligibility{
    public static void main(String args[]){
        LinkedList<String> require=new LinkedList<>();
         require.add("Aadhaar");
         require.add("Pan Card");
         require.add("Cibil Score");
         System.out.println(require);
         //require for apply the bankloan of eligibility
         if(require.contains("Aadhaar")&&require.contains("Pan Card")&&require.contains("Cibil Score")){ // And condition mean given condtion is trues
            System.out.println("You are Eligible");
         }
         else{
            System.out.println("You are not Eligible");
         }
}
}
/*
 OUTPUT:
 [Aadhaar, Pan Card, Cibil Score]
You are Eligible
*/