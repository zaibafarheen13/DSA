package College_Wallah.Linked_List;

public class IntersectionLL {

    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data=data;
        }
     }

    public Node Intersection(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;

        int size1=0;
        while(temp1!=null){
            size1++;
            temp1=temp1.next;
        }

        int size2=0;
        while(temp2!=null){
            size2++;
            temp2=temp2.next;
        }

        temp1=head1;
        temp2=head2;

        int m;
        if(size1>size2){
            m=size1-size2;
            for(int i=0;i<m;i++){
                temp1=temp1.next;
            }
        }
        else{
            m=size2-size1;
            for(int i=0;i<m;i++){
                temp2=temp2.next;
            }
        }

        
        while(temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return temp2;
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
        IntersectionLL obj=new IntersectionLL();

        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node g=new Node(100);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
    
        a.next=b;
        b.next=c;
        c.next=d;
        g.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
        
        obj.display(a);
        Node ans=obj.Intersection(a,g);
        System.out.println("Value of Intersection: "+ans.data);
    }

}

