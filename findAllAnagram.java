import java.util.*;
public class findAllAnagram
{
    public static ArrayList<String> findAlllAnagram(String[] arr,int n){
        ArrayList<String> ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isAnagram(arr[i],arr[j])){
                    ans.add(arr[i]+" ");
                    ans.add(arr[j]+" ");
                }
            }

        }
        if(ans.size()==0){
            ans.add("No Anagram");
        }
        return ans;
    }
    public static  boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length() && i<s2.length();i++){
            char ch=s1.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            char ch1=s2.charAt(i);
            map2.put(ch1,map2.getOrDefault(ch1,0)+1);

        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        list=findAlllAnagram(arr,n);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

    }
}
