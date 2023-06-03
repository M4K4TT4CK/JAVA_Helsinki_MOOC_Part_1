
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        // int index = 0;
        // while (index < array.length) {
        //     System.out.print(array[index] + ", ");
        //     index++;
        // }
        int index = 0;
        while(true){
            if (index >= array.length){
                break;
            }
            System.out.print(array[index]);
            index++;
            if (index < array.length){
                System.out.print(", ");
            }
       }
    }
}
