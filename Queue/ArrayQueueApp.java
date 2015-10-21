public class ArrayQueueApp {
  public static void main(String[] args) {
    ArrayQueue arrque = new ArrayQueue(10);
    System.out.println("QSIZE: " + arrque.QSIZE);    
      arrque.enqueue(1);
      arrque.enqueue(2);
      arrque.enqueue(3);
      arrque.enqueue(4);
      arrque.enqueue(5);
      arrque.enqueue(6);
      arrque.enqueue(7);
      arrque.enqueue(8);
      arrque.enqueue(9);
      arrque.enqueue(10);
      arrque.enqueue(11); // error, QSIZE isFull
    System.out.println();
    System.out.println("________________________");
      arrque.showQueue();
    System.out.println();
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println(arrque.dequeue());
    System.out.println(arrque.dequeue());
    System.out.println(arrque.dequeue());
      arrque.enqueue(11); // will be enqueued
    System.out.println();
    System.out.println("+++++++++++++++++++++++++");
      arrque.showQueue();
    System.out.println();
    System.out.println("Queue Front: " + arrque.peekFront());
    System.out.println("Queue Rear: " + arrque.peekRear());
  }
}