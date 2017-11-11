import java.util.*;
public class Squareofsums{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int x=0,y=0,j=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				x++;
			}
		}
		int arr[]=new int[x];
		for(int i=0;i<arr.length;i++)
		{
			for(j=y;j<=str.length();j++)
			{
				if(Character.isDigit(str.charAt(j)))
				{y++;
					arr[i]=Character.getNumericValue(str.charAt(j));
					break;
				}
				else
				{y++;}
			}
		}
		Arrays.sort(arr);
		int sum=0,sum1=0,gum=1,sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+(arr[arr.length-1]*arr[i]);
			gum=gum*(arr[0]+arr[i]);
		}
		sum1=(sum%9==0)?9:sum%9;
		sum2=(gum%9==0)?9:gum%9;
		int d3=Math.min(sum1, sum2);
		System.out.println(d3*d3);
	}
}
