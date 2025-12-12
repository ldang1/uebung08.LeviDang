package h2;

public class Node {
    Node next;   // Verweis auf den Nachfolgeknoten
    int value;   // gespeicherter Wert

    public Node(int value) {
        this.value = value;
        this.next = null; // wie gefordert
    }
}

