package College_Wallah.Linked_List;

public class DeletingMiddleElement {
    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data=data;
        }
     }

    public void DeleteMiddleEle(Node head){
        if(head.next==null){
            return;
        }
        
        Node slow=head;
        Node fast=head;

        if(head.next==null){
            return;
        }
        while(fast.next.next!=null && fast.next.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
    }

     
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String args[]){
        DeletingMiddleElement obj=new DeletingMiddleElement();

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        //Node f=new Node(60);
        //Node g=new Node(80);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        //e.next=f;
        //f.next=null;
        //f.next=g;
        //g.next=null;
        
        obj.display(a);
        obj.DeleteMiddleEle(a);
        System.out.println("Deleting Middle element of linked list: ");
        obj.display(a);
    }
}
