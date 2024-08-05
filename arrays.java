import java.util.*;

public class arrays {
    public static void main(String[] args) {
        ArrayList <Integer> li = new ArrayList<>();
        //add elements 
        li.add(1);
        li.add(18);
        li.add(45);
        li.add(17);
        li.add(7);
        li.add(33);
        System.out.println(li);
        //get elements 

        int el = li.get(4);
        System.out.println(el);

        //add el  at specific index
        li.add(4,99);
        System.out.println(li);

        // set elements
        li.set(4,101);
        System.out.println(li);

        // delete elements 
        li.remove(0);
        System.out.println(li);

       int s= li.size();
       System.out.println(s);

       for (int i = 0;i<li.size();i++){
        System.out.print(li.get(i));
       }
       System.out.println(" " );
       
       Collections.sort(li);
       System.out.println(li);

    
    
    }




}
