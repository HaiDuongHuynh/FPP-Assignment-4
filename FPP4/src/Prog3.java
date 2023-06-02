public class Prog3 {
    public static int computeSum(int[] arr, int n){
        if(n == 0){
            return 0;
        }
        return arr[n-1] + computeSum(arr,n-1);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int sum = computeSum(array, array.length);
        System.out.println("Sum of the array is: " + sum);
    }
}
