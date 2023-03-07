import java.util.Scanner;

public class MergeSort {
    public static Node mergesort(Node head){
		if(head == null || head.next == null){
			return head;
		}
		Node slow = head;
		Node fast = head;
		while(fast.next!= null && fast.next.next!= null){
			slow = slow.next;
			fast = fast.next.next;
		}
		Node mid = slow.next;
		slow.next = null;
		head = mergesort(head);
		mid = mergesort(mid);
		Node out = merge(head , mid);
		return out;
    }
	public static Node merge(Node n1 , Node n2){
		Node dummy = new Node(-1);
		Node curr = dummy;
		while(n1!=null&&n2!=null){
			if(n1.data<=n2.data){
				curr.next = n1;
				n1 = n1.next;
			}
			else{
				curr.next = n2;
				n2 = n2.next;
			}
			curr = curr.next;
		}
		if(n1!=null){
			curr.next = n1;
		}
		if(n2!=null){
			curr.next = n2;
		}
		return dummy.next;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL list = new LL();
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();
            list.addLast(a);
        }
        list.head = mergesort(list.head);
        LL.Display(list.head);
        sc.close();
    }
}