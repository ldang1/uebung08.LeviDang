package h2;

public class H2_main {

    public static void main(String[] args) {
        SimpleList myList = new SimpleList();

        // Werte wie im Beispiel einfügen
        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        System.out.println("Liste nach append:");
        printList(myList); // Erwartet: 12,45,66,12,45,60

        // insertAfter(45, 4)
        myList.insertAfter(45, 4);
        System.out.println("Nach insertAfter(45, 4):");
        printList(myList); // Erwartet: 12,45,4,66,12,45,60

        // findFirst(45) – zeigt nur den Wert des Knotens
        Node first45 = myList.findFirst(45);
        System.out.println("findFirst(45) liefert: "
                + (first45 != null ? first45.value : "null"));

        // delete(45)
        myList.delete(45);
        System.out.println("Nach delete(45):");
        printList(myList); // Erwartet: 12,4,66,12,45,60
    }

    // Hilfsmethode zum Ausgeben der Liste (verwendet nur public API + Node-Felder)
    private static void printList(SimpleList list) {
        Node current = list.getFirst();
        boolean first = true;
        while (current != null) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print(current.value);
            first = false;
            current = current.next;
        }
        System.out.println();
    }
}
