import java.util.Collections;
import java.util.LinkedList;
public class ReverseList {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Present list:"+list);
        Collections.reverse(list);
        System.out.println("Reverse list:"+list);

    }
    //without using reverse
    class ListNode {
      int data;
      ListNode next;
  
      public ListNode(int data) {
          this.data = data;
          this.next = null;
      }
  }
    public class LinkedList1 {
      ListNode head;
  
      public void append(int value) {
          ListNode newNode = new ListNode(value);
          if (head == null) {
              head = newNode;
          } else {
              ListNode current = head;
              while (current.next != null) {
                  current = current.next;
              }
              current.next = newNode;
          }
      }
      public void reverse() {
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

        public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    LinkedList1 list = new LinkedList1();
    list.append(1);
    list.append(2);
    list.append(3);
    list.append(4);

    System.out.println("Original list:");
    list.display();

    list.reverse();

    System.out.println("\nReversed list:");
    list.display();

  }
}