
public class ArraySum {
	public int sumOfArray(Integer[] a, int index)
	{
		//use a counter during recursion and once it equals the index, 
		//return the number inside that index
		if(index == 0)
		{
			return a[0];
		}
		
		return a[index] + sumOfArray(a,index-1);
	}
}
