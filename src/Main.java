
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(1);
        list.addAtTail(2);
        list.addAtTail(3);

        System.out.println("Size of the list: " + list.getSize());

        System.out.println("Element at index 1: " + list.get(1));
    }
}

