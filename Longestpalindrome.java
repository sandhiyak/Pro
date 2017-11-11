import java.util.*;
public class Longestpalindrome{
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	   TreeMap<Integer,String> tm=new TreeMap<Integer,String>(); 
	   String str=sc.next();
	   for(int i=0;i<str.length();i++)
	   {
		   for(int j=i+1;j<=str.length();j++)
		   {
			   String s=new String();
			   String s1=new String();
			   s=str.substring(i, j);
			   StringBuffer sb=new StringBuffer(s);
			   s1=sb.reverse().toString();
			   if(s1.equals(s))
			   {
				   tm.put(s1.length(),s1);
			   }
		   }
	   }
	   String r=tm.lastEntry().toString();
	   System.out.println(r.substring(2));
	 }
}
