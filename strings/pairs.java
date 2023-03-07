import java.util.*;

public class pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int i=0 ; i<n ; i++)
                        a[i] = sc.nextInt();
                int k = sc.nextInt();
                //sorting the array so all the pairs will be in sorted order
                Arrays.sort(a);
                //System.out.println(Arrays.toString(a));
                ArrayList<ArrayList<Integer>> list = new ArrayList<>();
                //finding all the possible pairs from the given array and storing all the pairs in 2d ArrayList or Grid ;
                for(int i =0 ; i<n ; i++){
                        for(int j=i+1 ; j<n ; j++){
                                if(a[j] - a[i] < k){
                                        //creating a temporary arraylist to append it in out main arraylist.
                                        ArrayList<Integer> temp = new ArrayList<Integer>();
                                        //appending the values or pair to temp arraylist
                                        temp.add(a[i]);
                                        temp.add(a[j]);
                                        //appending the temporary arraylist carrying the pair to main list
                                        list.add(temp);
                                }
                        }
                }
                
                //taking a pointer to iterate over list in reverse order since the pairs are also in sorted order.
                int p1 = list.size()-1;
               // System.out.println(list.get(p1-1));
                while(p1>0){
                        //taking flag to keep check on dublicate values in pairs
                        boolean flag = false;
                        for(int i=0 ; i<2 ; i++){
                                //checking if the pair present at pointer have any dublicates from the pair before it
                               if(list.get(p1).get(i) == list.get(p1-1).get(0) || list.get(p1).get(i) == list.get(p1-1).get(1) ){
                                        flag = true;
                                       break;
                               }
                                
                               
                        }
                        if(flag == true){
                                //if there is any same element in both pair removing the pair at p1-1 index 
                                list.remove(p1-1);
                                p1--;
                        }
                        else{
                                p1--;
                        }
                }
                 //System.out.print(list);
                int sum =0;
                for(ArrayList<Integer> i : list ){
                        for(int j : i){
                                sum+=j;
                        }
                }
                System.out.println(sum);
                sc.close();
    }
}
