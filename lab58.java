
public class lab58 {
	static void mini(int arr[])
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
		}
		System.out.println(min);
	}
public static void main(String ar[])
{
	lab58 a=new lab58();
	int arrr[]={12,25,1,7};
	mini(arrr);
}
}
