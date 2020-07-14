package acazia.test;

public class BackEndTest {
	
	public static void main(String[] args) {
		BackEndTest obj = new BackEndTest();
		int [] a = {4,0,1};
		int n = 5 ;
		int [] b = obj.mutateTheArray(n, a);
		for(int element: b) {
			System.out.println(element);
		}
		
	}
	
	public int[] mutateTheArray(int length, int[] array ) {
		int [] result = new int[length];
		for(int i = 0; i < length; i ++) {
			result[i] = caculateElementValue(i, array);
		}
		return result;
	}
	
	private int caculateElementValue(int index, int[] array) {
		
		int elementValue = 0;
		int arrayLength = array.length;
		if(arrayLength == 0 || index > arrayLength - 1) {
			elementValue = 0;
		} else if(index == 0 && arrayLength == 1) {
			elementValue = array[index];
		} else if(index > 0 && index < arrayLength - 1) {
			elementValue = array[index - 1] + array[index] + array[index + 1];
		} else if(index == 0) {
			elementValue = array[index] + array[index + 1];
		} else if(index == arrayLength - 1) {
			elementValue = array[index - 1] + array[index];
		}
		
		return elementValue;
	}
}
