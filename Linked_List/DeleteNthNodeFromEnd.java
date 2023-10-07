package College_Wallah.Linked_List;

public class DeleteNthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data=data;
        }
     }

     public static Node DeleteNthNodeFromEndMethod(Node head,int n){
        Node fast=head;
        Node slow=head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        if(fast==null){
            head=head.next;
            return head;
        }

        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
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
        DeleteNthNodeFromEnd obj=new DeleteNthNodeFromEnd();

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
    
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        
        obj.display(a);
        a=DeleteNthNodeFromEndMethod(a,6);
        obj.display(a);
     }
}
