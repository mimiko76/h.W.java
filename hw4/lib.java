import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class lib {
   public static LinkedList<Integer> randomList(int num) {
   Random random = new Random();
   LinkedList <Integer> numbers = new LinkedList<>();
   for (int i = 0; i < num; i++) {
      int randomNumber = random.nextInt(100);
      numbers.add(randomNumber);
   }
   return numbers;
   }
   public static void printList(LinkedList<Integer> numbers) {
      for (int i = 0; i < numbers.size(); i++) {
         System.out.println("Элемент №"+(i+1) +": "+ numbers.get(i));
      }
      System.out.println();
   }
   public static <T> LinkedList<T> reverse (LinkedList<T> list){
      int size = list.size();
      for (int i = 0; i < size / 2; i++) {
         T temp = list.get(i);
         list.set(i, list.get(size - i - 1));
         list.set(size - i - 1, temp);
      }
      return list;
   }

}