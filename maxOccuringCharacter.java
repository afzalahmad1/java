import java.util.*;

public class maxOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(maxOccur(s));
    }
    public static char maxOccur(String s){
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxFreq=0;
        char ans=s.charAt(0);
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int freq=map.get(ch);
            if(freq>maxFreq){
                maxFreq=freq;
                ans=ch;
            }
            else if(freq==maxFreq && ans>ch){
                ans=ch;
            }
        }
        return ans;
    }
}
