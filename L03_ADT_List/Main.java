package L03_ADT_List;

public class Main {
    public static void main(String[] args) {
        // ╭──────────────────────────────────────────────────╮
        // │             🌟 Test LinkedList 🌟               │
        // ╰──────────────────────────────────────────────────╯
        System.out.println("Testing LinkedList:");
        List<Integer> linkedList = new LinkedList<>();

        // Insert elements into the LinkedList
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);

        // Print the elements in the LinkedList
        System.out.println("Elements in LinkedList:");
        printList(linkedList);

        // Remove the first element in the LinkedList
        linkedList.remove();
        System.out.println("After removing the first element:");
        printList(linkedList);

        // ╭──────────────────────────────────────────────────╮
        // │              🌟 Test ArrayList 🌟               │
        // ╰──────────────────────────────────────────────────╯

        System.out.println("\nTesting ArrayList:");
        List<String> arrayList = new ArrayList<>(5);

        // Insert elements into the ArrayList
        arrayList.insert("A");
        arrayList.insert("B");
        arrayList.insert("C");

        // Print the elements in the ArrayList before the update
        System.out.println("Elements in ArrayList:");
        printList(arrayList);

        // Update the second element in the ArrayList
        arrayList.findFirst(); // Move the current index to the first element
        arrayList.findNext(); // Move to the second element
        arrayList.update("D");
        System.out.println("After updating the second element:");
        printList(arrayList);

        // Print the elements in the ArrayList before the remove
        System.out.println("Elements in ArrayList:");
        printList(arrayList);

        // Remove the third element in the ArrayList (index 2)
        arrayList.findFirst(); // Move to the first element
        arrayList.findNext(); // Move to the second element
        arrayList.findNext(); // Move to the third element
        arrayList.remove();

        System.out.println("After removing the third element:");
        printList(arrayList);
    }

    // Helper method to print the elements in a list
    private static void printList(List<?> list) {
        list.findFirst();
        while (!list.last()) {
            System.out.print(list.retrieve() + " ");
            list.findNext();
        }
        System.out.println(list.retrieve());
    }
}
