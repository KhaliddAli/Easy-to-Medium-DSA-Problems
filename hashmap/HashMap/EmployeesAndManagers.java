import java.util.*;


public class EmployeesAndManagers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Map<String,String> emp = new HashMap<String, String>();
        for(int i=0;i<n;++i){
			emp.put(sc.next(),sc.next());
        }
        EmpUnderManager(emp);
        sc.close();
    }
    public static void EmpUnderManager(Map<String, String> emp)
	{
		HashMap<String , ArrayList<String>> map = new HashMap<>();
        String ceo = "";
        for(String employe : emp.keySet()){
            String myManager = emp.get(employe);

            if(myManager.equals(employe)){
                ceo = myManager;
                continue;
            }

            if(map.containsKey(myManager)){
                ArrayList<String> temp = map.get(myManager);
                temp.add(employe);
                map.put(myManager , temp);
            }
            else{
                ArrayList<String> temp = new ArrayList<>();
                temp.add(employe);
                map.put(myManager , temp);
            }
        }

        for(String s : map.keySet()){
			System.out.print(s+" ");
            System.out.println(map.get(s));
        }
		
        TreeMap<String , Integer> ans = new TreeMap<>();

        cnt(map , ceo , ans);

        for(String s : ans.keySet()){
            System.out.print(s+" ");
            System.out.println(ans.get(s));
        }

	}

    static int cnt(HashMap<String , ArrayList<String>> map , String ceo , TreeMap<String , Integer> ans){
        if(!map.containsKey(ceo)){
            ans.put(ceo , 0);
            return 1;
        }

        int count = 0;

        for(String emp : map.get(ceo)){
            count += cnt(map , emp , ans);
        }

        ans.put(ceo , count);
        return count+1;
    }
}