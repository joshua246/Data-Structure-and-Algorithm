public class SinglyLinkedList {
  private SinglyNode head;
  private SinglyNode tail;
  public SinglyLinkedList() {
    head = null;
    tail = null;
  }
  public int traverseSum() {
    int sum = 0;
    SinglyNode current = head;
    SinglyNode previous = null;
    while (current != null) {
      sum += current.getValue();
      previous = current;
      current = current.next;
    }
    return sum;
  }
  public void traverseDisplay() {
    SinglyNode current = head;
    SinglyNode previous = null;
    while(current != null) {
      System.out.print(current.getValue() + " ");
      previous = current;
      current = current.next;
    }
  }  
  public void addFirst(SinglyNode newNode) {
    if (newNode == null) {
  	  return;
  	} else {
  		if (head == null) {
  			newNode.next = null;
  			head = newNode;
  			tail = newNode;
  		} else {
  			newNode.next = head;
  			head = newNode;
  		}
  	}
  }
  public void insertAfter(SinglyNode previous,SinglyNode newNode) {
  	if (newNode == null){
  		return;
  	} else {
  		if (previous == null) {
  			addFirst(newNode);
  		} else if (previous == tail) {
        			addLast(newNode);
  		} else {
  			SinglyNode next = previous.next;
  			previous.next = newNode;
  			newNode.next = next;
  		}
  	}
  }
  public void addLast(SinglyNode newNode) {
    if (newNode == null) {
      return;
    } else {
      newNode.next = null;
      if (head == null) {
        head = newNode;
        tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }
  }
  public void removeFirst() {
  	if (head == null) {
  	  return;
  	} else {
  		if (head == tail) {
  			head = null;
  			tail = null;
  		} else {
  			head = head.next;
  		}
  	}
  }
  public void removeLast() {
  	if (tail == null) {
  		return;
  	} else {
  		if (head == tail) {
  			head = null;
  			tail = null;
  		} else {
  			SinglyNode previousToTail = head;
  			while (previousToTail.next != tail) {
  				previousToTail = previousToTail.next;
  			}
  			tail = previousToTail;
  			tail.next = null;
  		}
  	}
  }
  public void removeNext(SinglyNode previous) {
  	if (previous == null) {
  		removeFirst();
  	} else if (previous.next == tail) {
  		tail = previous;
  		tail.next = null;
  	} else if (previous == tail) {
  		return;
  	} else {
  		previous.next = previous.next.next;
  	}
  }
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList(); 
    SinglyNode node1 = new SinglyNode(5);
    SinglyNode node2 = new SinglyNode(-1);
    SinglyNode node3 = new SinglyNode(16);
    SinglyNode node4 = new SinglyNode(2);
    list.addFirst(node1);
    list.insertAfter(node1,node2);
    list.insertAfter(node2,node3);
    list.addLast(node4);
    System.out.print("Content of Linked-list: ");
    list.traverseDisplay();
    System.out.println();
    System.out.println("Summation of Linked-list: " + list.traverseSum()); 
  }
}