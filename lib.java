import java.util.Scanner;
public class lib {
   static void calculateTriangularNumber(int n) {
      System.out.println((n * (n + 1)) / 2);
}
   static void printPrimeNumbers() {
      for (int i = 2; i <= 1000; i++) {
         boolean isPrime = true;
         for (int j = 2; j < i; j++) {
               if (i % j == 0) {
                  isPrime = false;
                  break;
               }
         }
         if (isPrime) {
            System.out.println(i);
      }
   }
}
   public class Calculator {
      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Введите первое число: ");
         double num1 = scanner.nextDouble();
         System.out.print("Введите операцию (+, -, *, /): ");
         char operator = scanner.next().charAt(0);
         System.out.print("Введите второе число: ");
         double num2 = scanner.nextDouble();
         double result;
         switch (operator) {
               case '+':
               result = num1 + num2;
               break;
            case '-':
               result = num1 - num2;
               break;
            case '*':
               result = num1 * num2;
               break;
            case '/':
               result = num1 / num2;
               break;
            default:
               System.out.println("Неверная операция");
               return;
      }
      System.out.println("Результат: " + result);
   }
}
}