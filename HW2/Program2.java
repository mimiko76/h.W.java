import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
   public static void main(String[] args) {
      int[] array = {5, 2, 10, 1, 8};
      bubbleSort(array);
   }
   public static void bubbleSort(int[] array) {
      try (FileWriter logFile = new FileWriter("log.txt")) {
         for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
               if (array[j] > array[j + 1]) {
                  int temp = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = temp;
               }
            }
            logFile.write(arrayToString(array) + System.lineSeparator());
            }
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public static String arrayToString(int[] array) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < array.length; i++) {
         sb.append(array[i]);
         if (i != array.length - 1) {
            sb.append(", ");
         }
      }
      return sb.toString();
   }
}
