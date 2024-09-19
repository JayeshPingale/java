
package linkedlist;

class Node {
    int data;
    Node next;
    Node back;

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }
}

public class doublell {

    private static Node convertArr2DLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println();
    }
    private static Node deleteheadDLL(Node head){
        if (head==null || head.next==null) return null;
        Node prev = head; 
        head= head.next;
        head.back =null;
        prev.next = null;
        return head ;

    }
    private static Node deleteTailDLL(Node head){
        if (head==null || head.next==null) return null;
        Node tail = head ;
        while (tail.next!=null){
            tail = tail.next ;
        }
       Node prev = tail.back;
       prev.next = null ;
        tail.back = null ;
     
        return head; 
    }
private static Node deletekthNode(Node head, int x) {

        
        if(head == null ) return null;
        int c=0;
        Node temp = head;
        while(temp != null){
            c++;
            if(c==x) {
                break;
            }
            temp=temp.next;
            
        }
             Node back1 = temp.back;
             Node front = temp.next;
             
             
        if(back1==null && front == null){
                    return null;
                }
        else if(back1==null){
            Node p= head;
            head=head.next;
            p.next=null;
            head.back =null;
            return head;
                }
            else if(front == null){
                Node tail = head ;
                while (tail.next!=null){
                tail = tail.next ;
                 }
                 Node prev1 = tail.back;
                 prev1.next = null ;
                tail.back = null ;
                  return head; 
                  }
               
                    back1.next = front;
                    front.back=back1;
                    temp.next=null;
                    temp.back=null;
                
                return head;
            }

            private static Node insertATHead(Node head, int el){
                if(head ==null ) return new Node(el);
               Node temp = new Node(el, head, null);
               head = temp;
                return head;
            }

            private static Node insertATTail(Node head, int el){
                if(head ==null ) return new Node(el);
                Node temp = head;
                while (temp.next!=null){
                    temp=temp.next;
                }
               Node newNode = new Node(el, null, temp);
               temp.next= newNode;
                return head;
            } 
            private static Node insertBeforeTail(Node head, int el){
                if(head.next==null ) return insertATHead(head, el);
                Node temp = head;
                while (temp.next!=null){
                    temp=temp.next;
                }
                Node prev= temp.back;
               Node newNode = new Node(el, temp, prev);
               prev.next= newNode;
               temp.back=newNode;
                return head;
            }
            private static Node insertATkthEL(Node head, int el,int k){
                
                if(k==1||head.next==null ) return insertATHead(head, el);
                int c=0;
                Node temp = head;
                while (temp!=null) {
                    c++;
                    if(c==k) {
                            break;
                    }
                    temp=temp.next;                    
                }
                Node prev= temp.back;
                Node newNode = new Node(el, temp, prev);
                prev.next=newNode;
                temp.back=newNode;
                        return head;    
            
            }

            private static Node reverseDLL(Node head){
                if(head==null){
                    return head;
                }
                Node last = null;
                Node current = head;
                while(current != null){
                    last = current.back;
                    current.back=current.next;
                    current.next=last;
                    current=current.back;
                    }
                    return last.back;
            
            }
    public static void main(String[] args) {
        int arr[] = {69, 2, 3, 4, 5};
        Node head = convertArr2DLL(arr);
        print(head);
        // head = deleteheadDLL(head);
        // print(head);
        // head = deleteTailDLL(head);
        // print(head);
        // head = deletekthNode(head, 3);
        // head = insertATHead(head, 27);
        // head = insertATTail(head, 99);
        // head = insertBeforeTail(head, 88);
       
        // head = insertATkthEL(head, 101, 3);
        head =reverseDLL(head);
        print(head);

    }
}
