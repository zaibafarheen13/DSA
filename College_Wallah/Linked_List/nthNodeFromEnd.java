package College_Wallah.Linked_List;

public class nthNodeFromEnd {
    
 public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
 }

 public static Node nthNodeFromEndMethod(Node head,int n){
    Node temp=head;
    int size=0;
    
    while(temp!=null){
        size++;
        temp=temp.next;
    }

    temp=head;
    int m=size-n;
    for(int i=0;i<m;i++){
        temp=temp.next;
    }
    return temp;
 }

 public static void main(String args[]){
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

    Node test=nthNodeFromEndMethod(a,2);
    System.out.println(test.data);
 }
}
