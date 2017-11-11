import java.util.*;
public class Passwordcreation{
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
       String fn=sc.next();
       String ln=sc.next();
       String pin=sc.next();
       int n=sc.nextInt();
	   StringBuffer sb=new StringBuffer();
       if(fn.length()>ln.length())
       {
    	   sb.append(fn.charAt(0));
    	   sb.append(ln);
       }
       else if(fn.length()==ln.length())
       {
    	  for(int j=0;j<fn.length();j++)
    	  {
    		  if(fn.charAt(j)>ln.charAt(j))
    		  {
    			  sb.append(fn.charAt(0));
    			  sb.append(ln);
    	    	   break;
    		  }
    		  else if(fn.charAt(j)==ln.charAt(j))
    		  { }
    		  else
    		  {
    			  sb.append(ln.charAt(0));
    			  sb.append(fn);
    	    	   break;
    		  }
    	  }
       }
       else
       {
    	   sb.append(ln.charAt(0));
    	   sb.append(fn);
       }
       sb.append(pin.charAt(n-1));
	   String s=String.valueOf(n);
	   for(int i=0;i<pin.length();i++)
	   {
		   String y=String.valueOf(pin.charAt(i));
		   if(s.equals(y))
		   {
			   int o=pin.length()-i;
		   sb.append(String.valueOf(o));
		   }
	   }
	   for(int i=0;i<sb.length();i++)
	   {
		   if(Character.isUpperCase(sb.charAt(i)))
		   {
			   System.out.print(Character.toLowerCase(sb.charAt(i)));
		   }
		   else if(Character.isLowerCase(sb.charAt(i)))
		   {
			  System.out.print(Character.toUpperCase(sb.charAt(i)));
		   }
		   else
		   System.out.print(sb.charAt(i));
	   }
	}
}
