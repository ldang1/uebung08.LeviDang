package h2;

public class SimpleList {

    Node head; // Kopfknoten

    public SimpleList() {
        // Kopfknoten mit Dummywert, next zunächst null (leere Liste)
        head = new Node(Integer.MIN_VALUE);
    }

    // Liefert den ersten "echten" Knoten oder null, wenn keiner da ist
    public Node getFirst() {
        return head.next; // ist bei leerer Liste null
    }

    // Liefert den letzten Knoten oder null, wenn kein Wert gespeichert ist
    public Node getLast() {
        if (head.next == null) {
            return null; // Liste enthält nur Kopfknoten
        }

        Node current = head.next;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    // Fügt newValue am Ende der Liste an
    public void append(int newValue) {
        Node newNode = new Node(newValue);

        if (head.next == null) {
            // Liste ist leer -> neuer Knoten ist der erste
            head.next = newNode;
        } else {
            // an das Ende der Liste anhängen
            Node last = getLast();
            last.next = newNode;
        }
    }

    // Sucht den ersten Knoten, der value speichert; gibt Node oder null zurück
    public Node findFirst(int value) {
        Node current = head.next; // ab erstem echten Knoten

        while (current != null) {
            if (current.value == value) {
                return current;
            }
            current = current.next;
        }

        return null; // nichts gefunden
    }

    // Fügt newValue hinter dem ersten Knoten mit Wert preValue ein
    public boolean insertAfter(int preValue, int newValue) {
        Node preNode = findFirst(preValue);
        if (preNode == null) {
            return false; // kein Knoten mit preValue gefunden
        }

        Node newNode = new Node(newValue);
        newNode.next = preNode.next;
        preNode.next = newNode;

        return true;
    }

    // Löscht den ersten Knoten mit Wert value; gibt true bei Erfolg
    public boolean delete(int value) {
        Node previous = head;      // startet beim Kopfknoten
        Node current = head.next;  // erster "echter" Knoten

        while (current != null) {
            if (current.value == value) {
                // current aus der Liste entfernen
                previous.next = current.next;
                return true;
            }
            previous = current;
            current = current.next;
        }

        // kein Knoten mit diesem value gefunden
        return false;
    }
}
