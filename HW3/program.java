import java.util.ArrayList;
import java.util.Scanner;
public class program {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         System.out.printf("Какой длинны создать список: ");
         int lengthList = scanner.nextInt();
         ArrayList<Integer> list = (ArrayList<Integer>) lib.randomList(lengthList);
         while(true){
            System.out.println("Выберете действие со списком: \n 1: Вывести список \n 2: Удалить из элемента все четные числа \n 3: Найти минимальное значение \n 4: Найти максимальное значение \n 5: Найти среднее значение \n 6: Завершить работу");
            int choice = scanner.nextInt();
            if (choice == 1) lib.printList(list);
            else if(choice == 2) lib.removeEvenNumbers(list);
            else if(choice == 3) lib.findMinNum(list);
            else if (choice == 4 )lib.findMaxNum(list);
            else if (choice == 5) lib.findAverageNum(list);
            else if (choice == 6) break;
         }
      }
   }
}