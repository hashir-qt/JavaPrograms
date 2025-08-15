import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 4, 6, 1, 2, 7, 0, 3, 5, 9};
        System.out.println(array.length);
        bubbleSort(array);

        for(int i : array){
            System.out.println(i);
        }
    
    }
    public static void bubbleSort(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
             if (array[j] > array[j+1]) {
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
             }
            }
        }
// int[] array = new int[10];
// Random rand = new Random();
//   for(int i = 0; i < array.length; i++){
//     array[i] = rand.nextInt(10000000);
//   }
// boolean swappedit = true;
//   while (swappedit) {
//     swappedit = false;
  
//  for(int i = 0; i < array.length - 1; i++){
//     if(array[i] > array[i+1]){
//         swappedit = true;
//         int temp = array[i];
//         array[i] = array[i+1];
//         array[i +1] = temp;
//     }
//  }
// }
//    printArray(array);

//     }
//     private static void printArray(int[] array){
//         for(int i = 0; i < array.length; i++ ){
//             System.out.println(array[i]);
//         }
//     }
}
}