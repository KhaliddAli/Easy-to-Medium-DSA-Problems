import java.util.*;

public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list1 = new LL();
        LL list2 = new LL();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0; i<n ; i++){
            int data = sc.nextInt();
            list1.addLast(data);
        }
        for(int i=0; i<m ; i++){
            int data = sc.nextInt();
            list2.addLast(data);
        }
        System.out.println();
        sc.close();
        //merge 2 sorted LinkedLists :
        Node out  = mergeLL(list1 , list2);
        LL.Display(out);
    }
    public static Node mergeLL(LL l1 , LL l2){
        Node dummy = new Node(-1);
        Node curr = dummy;
        Node n1 = l1.head;
        Node n2 = l2.head;
        while(n1 != null && n2!= null){
            Node n1Next = n1.next;
            Node n2Next = n2.next;
            if(n1.data<n2.data){
                curr.next = n1;
                n1 = n1Next;
                curr = curr.next;
            }
            else{
                curr.next = n2;
                n2 = n2Next;
                curr = curr.next;
            }
        }
        if(n1==null){
            curr.next = n2;
        }
        if(n2==null){
            curr.next = n2;
        }
        return dummy.next;
    }
}
