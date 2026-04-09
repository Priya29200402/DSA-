import java.util.Arrays;
class OddNumberCount{
	public static void main(String [] args){
		int[] array={1,2,3,4,5,7};
		int count=getOddNumberCount(array);
		System.out.println("Array Elemens:"+Arrays.toString(array));
		System.out.println("Odd Numbers:"+count);
		
	}
	static int getOddNumberCount(int[] array){
		int count=0;
		for(int num: array){
			if(num%2 != 0){
				count ++;
			}
		}
		return count;
		
	}
}