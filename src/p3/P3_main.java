package p3;
import java.util.Arrays;
public class P3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {238};
		int [] b = {437};
		System.out.println(Arrays.toString(elementwiseMultiply(a, b)));

	}
	
	public static int[] elementwiseMultiply(int[] arr1, int[] arr2){
		if(arr1.length != arr2.length){
		return null;
		}
		int[] result = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++){
		result[i] = arr1[i]*arr2[i];
		}
		return result;
		}
	

}
