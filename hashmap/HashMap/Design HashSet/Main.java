import java.util.*;

class Solution {
	
    LinkedList<Integer> hash[];
    int size = 750000;
    Solution(){
        hash = new LinkedList[size];
    }

    public int hashFn(int key){
        return key%size;
    }
    public void add(int key) {
        //Complete the function
        int i = hashFn(key);

        if(hash[i] == null){
            hash[i] = new LinkedList<>();   
        }

        if(hash[i].indexOf(key)== -1){
            hash[i].add(key);
        }
    }

    public void remove(int key) {
        //Complete the function
        int i = hashFn(key);

        if(hash[i] == null) return;

        if(hash[i].indexOf(key) != -1){
            hash[i].remove(hash[i].indexOf(key));
        }
    }

    public boolean contains(int key) {
        //Complete the function
        int i = hashFn(key);
        if( hash[i] == null ||  hash[i].indexOf(key) == -1) return false;
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();
        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();
            if (choice == 1) {
                // Add
                Obj.add(key);
            } else if (choice == 2) {
                // contains
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                // remove
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}