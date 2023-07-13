import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lib {

   public static List<Integer> randomList(int num) {
      Random random = new Random();
      ArrayList<Integer> numbers  = new ArrayList<>(num);
      for (int i = 0; i < num; i++) {
         int randomNumber = random.nextInt(100);
         numbers.add(randomNumber);
      }
      return numbers;
   }
   public static void printList(List<Integer> numbers) {
      for (int i = 0; i < numbers.size(); i++) {
         System.out.println("Элемент №"+(i+1) +": "+ numbers.get(i));
      }
      System.out.println();
   }
   
   
   public static List<Integer> removeEvenNumbers(List<Integer> numbers){
      numbers.removeIf(n -> n % 2 == 0);
      return numbers;
   }
   public static void findMinNum(List<Integer> numbers) {
      int min = numbers.get(0);
      for (int i = 0; i < numbers.size(); i++) {
         if (numbers.get(i) < min) min = numbers.get(i);
      }
      System.out.println("Минимальное значение в списке: " + min);
      System.out.println();
   }
   public static void findMaxNum(List<Integer> numbers){
      int max = numbers.get(0);
      for (int i = 0; i < numbers.size(); i++) {
         if (numbers.get(i) > max) max = numbers.get(i);
      }
      System.out.println("Максимальное значение в списке: " + max);
      System.out.println();
   }
   public static void findAverageNum(List<Integer> numbers){
      int size = numbers.size();
      int counter = 0;
      for (int i = 0; i < numbers.size(); i++) {
         counter +=numbers.get(i);
      }
      int sum = counter / size;
      System.out.println("Среднее значение в списке: "+ sum);
      System.out.println();
   }
}
