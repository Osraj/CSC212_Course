package L04_ADT_List_DLL;

public class Main {
    public static void main(String[] args) {
        // Initialize a new DoubleLinkedList of Integer type
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        // Check if the list is empty
        System.out.println("Is the list empty? " + list.empty());

        // Insert elements into the list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("Data of current node (after inserting 10, 20, 30): " + list.retrieve());

        // Update the current node's data
        list.update(25);
        System.out.println("Data of current node (after updating to 25): " + list.retrieve());

        // Move to the first node and display its data
        list.findFirst();
        System.out.println("Data of the first node: " + list.retrieve());

        // Move to the next node and display its data
        list.findNext();
        System.out.println("Data of the next node: " + list.retrieve());

        // Check if the current node is the last node
        System.out.println("Is current node the last node? " + list.last());

        // Move to the next node and check again
        list.findNext();
        System.out.println("Data of the next node: " + list.retrieve());
        System.out.println("Is current node the last node now? " + list.last());

        // Remove the current node
        list.remove();
        System.out.println("After removing the current node, data of the new current node: " + list.retrieve());
    }
}
