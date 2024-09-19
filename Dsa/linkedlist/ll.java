package linkedlist;
class Node{
    int data;
    Node next;
    Node head;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}



public class ll {

    private static Node convertarr2LL(int []arr){
        Node head = new Node(arr[0]);
        Node mover =head;
        for(int i =1 ; i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;

    }
    private static Node deleteStart(Node head ){
        if (head== null) return head;
        head = head.next;
        return head ;
    }
    private static Node deleteLast(Node head ){
        if (head == null || head.next == null) return head;
        Node temp = head; 
        while (temp.next.next != null) {
            temp=temp.next;
        }
        temp.next= null;
        return head ;
    }

    private static void print (Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" <=> ");
            temp =temp.next;
        }
        System.out.println();
    }
 
    private static Node deleteAtIndex(Node head , int x){
        if (head == null) return head;
        if (x == 0) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev= null;
        int c =0;
        while (temp!=null){
            c++;
            if(c==x){
                prev.next= prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    private static Node deleteEl(Node head , int el){
        if (head == null) return head;
        if (head.data == el) {
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev= null;
  
        while (temp!=null){
      
            if(temp.data==el){
                prev.next= prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }
private static Node insertHead(Node head , int val ){
    Node newNode = new Node(val, head);
    return newNode;
}
private static Node insertTail(Node head , int val){
    if(head ==null) new Node(val); 
    Node temp = head;
    while (temp.next!=null){
        temp=temp.next;
      }
      Node newNode = new Node(val);
        temp.next=newNode;
      return head;
}
private static Node insertAtIndex(Node head , int el,int k ){
    if(head == null){
        if(k==1){
            return new Node(el);
        }
        else {
            return head;
        }
    }
    if(k==1) return new Node(el);
    Node temp = head;
    int count = 0;
    while(temp != null){
        count++;
        if(count == k-1){
            Node x= new Node(el,temp.next);
            temp.next=x;
            break;
        }
        temp = temp.next;
    }return head;

}

private static Node insertBeforeValue(Node head , int el,int val ){
    if(head == null)return null;
    if(head.data==val) return new Node(el,head);

    Node temp = head;
    while(temp.next != null){
        if(temp.next.data==val){
            Node x= new Node(el,temp.next);
            temp.next=x;
            break;
        }
        temp = temp.next;
    }return head;

}

public static Node findMiddle(Node head)
    {
        // Write your code here.
        Node slow = head;
        Node fast = head;
        
        while(fast !=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int arr [] ={2,4,6,8,9,10};
        Node head = (convertarr2LL(arr));
        //  head = deleteLast(head);
        //  print(head);
        // //  System.out.println(" ");
        // head= deleteStart(head);
        
    //  head = deleteAtIndex(head, 0);
    
    //  head = deleteEl(head, 8);
    // head = insertAtIndex(head, 69,4); 
    head =findMiddle(head);
    print(head);
    }
}
