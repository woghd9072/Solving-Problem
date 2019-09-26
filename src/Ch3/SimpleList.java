package Ch3;

public class SimpleList {
    Node head;
    Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        tail = head.next;
    }

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
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeFirst() {
        Node p = head;
        head = head.next;
        p.next = null;
    }

    public void removeLast() {
        if (head != null) {
            Node p = head, prev = null;
            while (p.next != null) {
                prev = p;
                p = p.next;
            }
            if (prev != null) prev.next = null;
            else head = null;
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

    public String get(int i) {
        String v="";
        for (Node p=head; p != null; p=p.next) {
            int cnt = 0;
            if (i == cnt) v = "" + p.data;
            cnt++;
        }
        return v;
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
