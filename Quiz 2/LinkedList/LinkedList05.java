package LinkedList;

public class LinkedList05 {
    private Node05 head;

    public void tambahMahasiswa(Mahasiswa05 mhs) {
        Node05 newNode = new Node05(mhs);
        if (head == null) {
            head = newNode;
        } else {
            Node05 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void hapusMahasiswa(String nim) {
        if (head == null)
            return;

        if (head.data.getNim().equals(nim)) {
            head = head.next;
            return;
        }
        Node05 temp = head;
        while (temp.next != null && !temp.next.data.getNim().equals(nim)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Mahasiswa05 cariMahasiswa(String nim) {
        Node05 temp = head;
        while (temp != null) {
            if (temp.data.getNim().equals(nim)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void cetakSemuaMahasiswa() {
        Node05 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}