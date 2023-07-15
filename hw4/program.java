import java.util.LinkedList;
import java.util.Scanner;
public class program{
   public static void main(String[] args) {

      try (Scanner scanner = new Scanner(System.in)) {
         //System.out.printf("Какой длинны создать список: ");
         int lengthList =  10;//scanner.nextInt();
         LinkedList <Integer> list = (LinkedList<Integer>) lib.randomList(lengthList);
         lib.printList(list);
         list = lib.reverse(list);
         lib.printList(list);
      }
   MyQueue<Integer> queue = new MyQueue<>();
   queue.enqueue(1);
   queue.enqueue(2);
   queue.enqueue(3);
   System.out.println(queue.first()); 
   int removedElement = queue.dequeue();
   System.out.println(removedElement);
   System.out.println(queue.first());
   }
}