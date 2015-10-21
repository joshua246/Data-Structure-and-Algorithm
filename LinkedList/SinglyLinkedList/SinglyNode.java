public class SinglyNode {
  private int value;
  public SinglyNode next; 
  public SinglyNode(int value) {
    this.value = value;
    next = null;
  }
  public int getValue() {
  	return this.value;
  }
}