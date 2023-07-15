import java.util.LinkedList;

class MyQueue<T> {
      private LinkedList<T> elements = new LinkedList<>();
      public MyQueue() { }
      public MyQueue(LinkedList<T> linkedList) {
         this.elements = linkedList;
      }
      public void enqueue(T element) {
         elements.addLast(element);
      }
      public T dequeue() {
         return elements.removeFirst();
      }
      public T first() {
         return elements.getFirst();
      }
   }