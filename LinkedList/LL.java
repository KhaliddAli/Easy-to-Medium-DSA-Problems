class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}
public class LL {
    Node head;
    Node tail;

    public static void Display(Node ele) {
        if(ele == null){
            return;
        }
        System.out.print(ele.data + " ");
        Display(ele.next);
        return;
    }
    public void addLast(int data) {
        Node nn = new Node(data);
        if(head == null){
            head = tail = nn;
        }
        else{
            tail.next = nn;
            tail = nn;
        }
    }

    public int GetElement(int i){
        Node curr = head;
        int cnt = 0;
        while(curr != null){
            if(cnt == i){return curr.data;}
            curr = curr.next ;
            cnt++;
        }
        return -1;
    }
    public Node GetNode(int n) {
        Node curr = head;
        for(int i=0 ; i<n ; i++){
            if(curr == null){
                return curr;
            }
            curr = curr.next;
        }
        return curr;
    }
    public void addFirst(int data){
        Node nn = new Node(data);
        if(head == null){
            head = tail = nn;
        }
        else{
            nn.next = head;
            head = nn;
        }
    }
    public void Add_At(int index , int data) {
        if(index ==0){
            addFirst(data);
        }
        else{
            Node curr = GetNode(index-1);
            Node temp = new Node(data);
            temp.next = curr.next;
            curr.next = temp;
        }
    }
    public int Len(){
        Node cur = head;
        int cnt = 0;
        while(cur != null){
            cur = cur.next;
            cnt++;
        }
        return cnt;
    }
    public Node removeLast(){
        Node curr = GetNode(Len()-2);
        Node out = tail;
        curr.next = null;
        tail = curr;
        return out;
    }
    public void remove(int i){
        Node cur = GetNode(i);
        Node cur2 = GetNode(i-1);
        cur2.next = cur.next;
        cur.next = null;
    }
}