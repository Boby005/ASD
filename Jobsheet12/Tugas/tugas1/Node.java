package tugas1;

public class Node {
    Faksinasi  data;
    Node prev, next;

    Node(Node prev, Faksinasi data, Node next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}