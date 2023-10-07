package College_Wallah.Linked_List;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }

    public Node(int data,Node next){
        this.data=data;
        this.next=null;
    }
}

public class BasicLL {
    Node head;
    int size;
    Node tail;

    public BasicLL(){
        this.size=0;
    }

    public void insertFirst(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;

        if(tail==null){
            tail=head;
        }
        size++;
        }

    public  void insertLast(int data){
        if(tail==null){
            insertFirst(data);
            return;
        }
        Node newnode=new Node(data);
        tail.next=newnode;
        newnode.next=null;
        tail=newnode;
        size+=1;

    }

    public void insert(int data, int index) {
        if (index == 0) {
            insertFirst(data);
            return;
        }
        if (index == size) {
            insertLast(data);
            return;
        }

        Node temp = head;
        Node temp2=head;;
        for (int i = 1; i <=index; i++) {
            if(i<index){
                temp = temp.next;
            }
            else{
                temp2=temp.next;
            }
        }

        Node node = new Node(data, temp.next);
        temp.next = node;
        node.next=temp2;

        size++;
    }

    public int deleteLast(){
       if(size<=1){
        deleteFirst();
       }
       Node secondLast=get(size-2);
       int val=tail.data;
       tail=secondLast;
       tail.next=null;
       return val;
    }

    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public int deleteFirst(){
        int val=head.data;
        head=head.next;
        size--;
        if(head==null){
            tail=null;
        }
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.data;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int data) {
        Node node = head;
        while (node != null) {
            if (node.data == data) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String args[]){
        BasicLL obj=new BasicLL();
        System.out.print("Insert First: ");
        obj.insertFirst(10);
        obj.insertFirst(20);
        obj.insertFirst(30);
        obj.display();
        System.out.print("Insert Last: ");
        obj.insertLast(100);
        obj.insertLast(200);
        obj.insertLast(300);
        obj.display();
        System.out.print("Insert At 2nd position: ");
        obj.insert(25,2);
        obj.display();
        System.out.print("Delete First: ");
        obj.deleteFirst();
        obj.display();
        System.out.print("Delete Last: ");
        obj.deleteLast();
        obj.display();
        System.out.print("Delete at 2nd position: ");
        obj.delete(2);
        obj.display();
        obj.find(1);
    }


}
