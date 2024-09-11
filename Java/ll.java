import java.util.LinkedList;

public class ll {
    Node head;
            class Node{
               String data;
                Node next;

                Node(String data ){ 
                    this.data= data ;
                    this.next=null;

                }
            }
            
            public void addFirst(String data ){
                Node newNode =new Node(data);

                if(head==null){
                    head = newNode;
                    
                }
            }

    public static void main(String[] args) {
            ll li=new ll();














        
        // LinkedList<Integer> li = new LinkedList<Integer>();
        // li.add(07);
        // li.add(9);
        // li.add(11);
        // System.out.println(li);
        // li.addFirst(27);
        // System.out.println(li);
        // li.addLast(2003);
        // System.out.println(li);
    }
}
