import java.util.*;
import java.lang.*;
import java.io.*;

public class maxSeq
{
	public static int greaterSequenceNumber(int n){
		int ans=0;
		boolean flag=true;
		for(int i=n;i>=0;i--){
            flag=true;
			int temp=i;
			while(temp>0){
				int val=temp;
				int rem1=val%10;
				val=val/10;
				int rem2=val%10;
				if(rem2>rem1){
					flag=false;
					break;
				}else{
					ans=i;
				}
				temp=temp/10;
			}
			if(flag==true){
				return ans;
			}
		}
		return ans;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(greaterSequenceNumber(n));
	}
}