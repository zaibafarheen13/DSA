package College_Wallah.Linked_List;

public class MiddleElement {

    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data=data;
        }
     }

    public Node MiddleEle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

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
        MiddleElement obj=new MiddleElement();

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        //Node g=new Node(80);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        //f.next=g;
        //g.next=null;
        
        obj.display(a);
        Node ans=obj.MiddleEle(a);
        System.out.println("Middle element of linked list: "+ans.data);
    }
}
