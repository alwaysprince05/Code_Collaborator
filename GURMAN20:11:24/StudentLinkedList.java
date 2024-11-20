class Node {
    int roll_no;
    String name;
    boolean is_present = false;
    Node next;

    Node(int roll_no, String name, Boolean is_present) {
        this.roll_no = roll_no;
        this.name = name;
        this.is_present = is_present;
        this.next = null;
    }
}

public class StudentLinkedList {
    public static void main(String[] args) {
        Node A = new Node(12, "Rolex", true);
        Node B = new Node(23, "Prince", false);
        Node C = new Node(34, " Anurag ", true);
        Node D = new Node(39, "Rahul", true);

        A.next = D;
        D.next = B;
        B.next = C;
        C.next = null;
        Node head = A;
        System.out.println(A.next.name);
        while (head != null) {
            System.out.println("Student details : " + head.roll_no + " " + head.name + " " 
+ head.is_present);
            head = head.next;
        }
    }
}
