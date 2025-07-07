class LL{
    Node start;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insert(int v){
        Node newnode=new Node(v);
        if(start==null){
            start=newnode;
            return;
        }
        
        Node t=start;
        while(t.next!=null){
            t=t.next;
        }
        t.next=newnode;
        
    }
    public void middle(int a,int v){
        Node newn=new Node(v);
        Node tp=start;
        while(tp!=null){
            if(a==tp.data){
                newn.next=tp.next;
                tp.next=newn;
            }
            tp=tp.next;
        }
    
    }
public void move(int v) {
    if (start == null || start.data == v) return; 
    Node prev = null, curr = start;
    while (curr != null && curr.data != v) {
        prev = curr;
        curr = curr.next;
    }
    if (curr == null) return; 
    prev.next = curr.next;
    curr.next = start;
    start = curr;
}

    public void display(){
        Node tp=start;
        while(tp!=null){
            System.out.print(tp.data+" ");
            tp=tp.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		LL a=new LL();
		a.insert(10);
		a.insert(20);
		a.insert(30);
		a.insert(40);
		a.middle(20,90);
		a.move(30);
		a.display();
	}
}