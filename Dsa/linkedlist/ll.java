package linkedlist;
class node{
    int data;
    node next;
    node head;

    node(int data1,node next1){
        this.data=data1;
        this.next=next1;
    }

    node(int data1){
        this.data=data1;
        this.next=null;
    }
}



public class ll {

    private static node convertarr2LL(int []arr){
        node head = new node(arr[0]);
        node mover =head;
        for(int i =1 ; i<arr.length;i++){
            node temp = new node(arr[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;

    }
    private static node deleteStart(node head ){
        if (head== null) return head;
        head = head.next;
        return head ;
    }
    private static node deleteLast(node head ){
        if (head == null || head.next == null) return head;
        node temp = head; 
        while (temp.next.next != null) {
            temp=temp.next;
        }
        temp.next= null;
        return head ;
    }

    private static void print (node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp =temp.next;
        }
        System.out.println();
    }
 
    private static node deleteAtIndex(node head , int x){
        if (head == null) return head;
        if (x == 0) {
            head = head.next;
            return head;
        }

        node temp = head;
        node prev= null;
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

    private static node deleteEl(node head , int el){
        if (head == null) return head;
        if (head.data == el) {
            head = head.next;
            return head;
        }

        node temp = head;
        node prev= null;
  
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
private static node insertHead(node head , int val ){
    node newNode = new node(val, head);
    return newNode;
}
private static node insertTail(node head , int val){
    if(head ==null) new node(val); 
    node temp = head;
    while (temp.next!=null){
        temp=temp.next;
      }
        node newNode = new node(val);
        temp.next= newNode;
      return head;
}
private static node insertAtIndex(node head , int el,int k ){
    if(head == null){
        if(k==1){
            return new node(el);
        }
        else {
            return head;
        }
    }
    if(k==1) return new node(el);
    node temp = head;
    int count = 0;
    while(temp != null){
        count++;
        if(count == k-1){
            node x= new node(el,temp.next);
            temp.next=x;
            break;
        }
        temp = temp.next;
    }return head;

}

private static node insertBeforeValue(node head , int el,int val ){
    if(head == null)return null;
    if(head.data==val) return new node(el,head);

    node temp = head;
    while(temp.next != null){
        if(temp.next.data==val){
            node x= new node(el,temp.next);
            temp.next=x;
            break;
        }
        temp = temp.next;
    }return head;

}

    public static void main(String[] args) {
        int arr [] ={2,4,6,8,9,10};
        node head = (convertarr2LL(arr));
        //  head = deleteLast(head);
        //  print(head);
        // //  System.out.println(" ");
        // head= deleteStart(head);
        
    //  head = deleteAtIndex(head, 0);
    
    //  head = deleteEl(head, 8);
    head = insertBeforeValue(head, 69,4); 
    
    print(head);
    }
}
