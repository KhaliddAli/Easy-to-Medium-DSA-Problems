import java.util.*;
public class SwapKthNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int n , k;
        n = sc.nextInt();
        k = sc.nextInt();
        Node curr = head;
        for(int i=0 ; i<n ; i++){
            int d = sc.nextInt();
            if(head==null){head = new Node(d);
                curr = head;
            }
            else{
                curr.next = new Node(d);
                curr = curr.next;
            }
            
        }
        Node res = swapKthNode(head , k);
        Node temp = res;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next; 
        }
        sc.close();
    }
    public static Node swapKthNode(Node head , int k){
        int l = len(head);
        int n = l-k;
        Node curr1 = head;
        Node prev1 = curr1;
        Node curr2 = head;
        Node prev2 = curr2;

        for(int i=0; i<n ; i++){
            prev1 = curr1;
            curr1 = curr1.next;
        }
        for(int i=0;i<k-1;i++){
            prev2 = curr2;
            curr2 = curr2.next;
        }

        if(curr1 == head){
            Node temp = curr2.next;
            curr2.next = curr1.next;
            curr1.next = temp;
            prev2.next = curr1;
            head = curr2;
        }
        else{
            prev1.next = curr2;
            prev2.next = curr1;
            Node temp = curr2.next;
            curr2.next = curr1.next;
            curr1.next = temp;
        }
        return head;
        

    }
    public static int len(Node head){
        Node curr = head;
        int cnt =0;
        while(curr!=null){
            curr = curr.next;
            cnt++;
        }
        return cnt;
    }
}
