
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        // int[] array = {78};
        System.out.println(sumOfNumbersInArray(array));
        
    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i]; // must add list name to i array[i] to get proper numbers if there is only one
        }
        return sum;
    }
}
