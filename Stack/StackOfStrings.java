public class StackOfStrings {
  private final int SIZE_LIMIT = 10; private int counter = 0;
  private String[] names = new String[this.SIZE_LIMIT];
  public StackOfStrings() {}
  private boolean isEmpty() {
    if (this.counter == 0) {
      return true;
    } 
    return false;
  }
  private boolean isFull() {
    if (this.SIZE_LIMIT == this.counter) {
      return true;
    } 
    return false;
  }
  public void push(String name) {
    if (this.isFull()) {
      System.out.println("Stack is full.");
    } else {
      this.names[this.counter] = name;
      this.counter++;
    }
  }
  public String pop() {
    if (this.isEmpty()) {
      System.out.println("Stack is empty.");
      return "EMPTY";
    } else {
      String name = this.names[this.counter-1];
      this.names[this.counter-1] = null;
      this.counter--;
      return name;      
    }
  }
  public void displayStack() {
    for (int i = 0; i < this.SIZE_LIMIT; i++) {
      System.out.println(this.names[i]);
    }
  }
  public int size() {
    return this.counter;
  }
}