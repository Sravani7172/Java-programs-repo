import java.util.Collections;
import java.util.LinkedList;

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
}

public class LinkedlistReverse {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("Present list: " + list);
        Collections.reverse(list);
        System.out.println("Reverse list: " + list);
        //without using reverse
        LinkedList1 List = new LinkedList1();
        List.append(1);
        List.append(2);
        List.append(3);
        List.append(4);
        System.out.println("present list:");
        List.display();
        List.reverse();
        System.out.println("reverse list:");
        List.display();
    }
}
 
        