package Ch3;

public class SimpleList {
    Node head, tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
//    public void addFirst(int data){
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//    }

//    public void addLast(int data) {
//        Node newNode = new Node(data);
//        if (head != null) {
//            Node p = head;
//            while (p.next != null) p = p.next;
//            p.next = newNode;
//        } else head = newNode;
//    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

//    public void removeFirst() {
//        Node p = head;
//        head = head.next;
//        p.next = null;
//    }

    public void removeFirst() {
        if (head == null) throw new RuntimeException();
        else if (head.next == null) head = tail = null;
        else {
            head.next.prev = null;
            head = head.next;
        }
    }

//    public void removeLast() {
//        if (head != null) {
//            Node p = head, prev = null;
//            while (p.next != null) {
//                prev = p;
//                p = p.next;
//            }
//            if (prev != null) prev.next = null;
//            else head = null;
//        } else throw new RuntimeException();
//    }

    public void removeLast() {
        if (head == null) throw new RuntimeException();
        else if (head.next == null) head = tail = null;
        else {
            tail.next.prev = null;
            tail = tail.prev;
        }
    }

    public int size() {
        int size = 0;
        Node p = head;
        while (p.next != null) {
            p = p.next;
            size++;
        }
        return size;
    }

    public int get(int i) {
        Node p = head;
        if (i<0 || i>=size()) throw new RuntimeException();
        while (i>0) {
            p = p.next;
            i--;
        }
        return p.data;
    }

    @Override
    public String toString() {
        String v="";
        for (Node p=head; p!=null; p=p.next){
            if(v.length()>0) v+="->";
            v+=p.data;
        }
        return v;
    }
}
