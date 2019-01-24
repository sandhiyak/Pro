import java.util.*;
public class ball {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String x=sc.next();
          String y=sc.next();
          StringBuffer sb1=new StringBuffer(x);
          StringBuffer sb2=new StringBuffer(y);
          for(int i=0;i<sb1.length();i++)
          {
        	  for(int j=0;j<sb2.length();j++)
        	  {
        		  if(sb1.charAt(i)==sb2.charAt(j))
        			  sb2.deleteCharAt(j);
        	  }
          }
          System.out.println(sb2.length());
	}

}
