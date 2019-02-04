import java.util.*;
public class Average{
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int x=0,s1=0,s2=0;
        while(x<n)
        {  
          for(int i=0;i<=x;i++)
          {
              s1=s1+arr[i];       
          }
          float avg1=s1/(x+1);
          for(int i=x+1;i<n;i++)
          {
              s2=s2+arr[i];
          }
          float avg2=s2/(n-x);
          if(avg1==avg2)
          {
              System.out.print("(");
              for(int i=0;i<=x;i++)
              {
              System.out.print(arr[i]+" ");
              }
              System.out.print(")"+",");
              System.out.print("(");
              for(int i=x+1;i<n;i++)
              {
              System.out.print(arr[i]+" ");
              }
              System.out.print(")");
          }
          else
          {
              x=x+1;
          }
        }
     }
}
