package tugas2;

// import org.w3c.dom.Node;

public class Node {
    Film  data;
    Node prev, next;

    Node(Node prev, Film data, Node next)
    {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}