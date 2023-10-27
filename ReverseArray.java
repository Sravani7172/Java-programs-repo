import java.util.Collections;
import java.util.LinkedList;
public class ReverseArray {
class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList1 {
    ListNode head;

    public void add(int value) {
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

//public class ReverseList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Present list: " + list);

        Collections.reverse(list);

        System.out.println("Reverse list: " + list);

        LinkedList1 List = new LinkedList1();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);

        System.out.println("Original list:");
        List.display();

        List.reverse();

        System.out.println("Reversed list:");
        List.display();
    }
 }

    
}
