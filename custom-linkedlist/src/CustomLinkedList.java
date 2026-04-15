import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Iterator;

public class CustomLinkedList<T extends Serializable> extends AbstractCollection implements Cloneable {

    private Node<T> head;

    private Node<T> tail;

    private int length;

    public static class Node<T> {

        private T value;

        private Node<T> next;

        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        void setNext(Node next) {
            this.next = next;
        }

        public T getValue() {
            return value;
        }

        public Node deepCopy() throws CloneNotSupportedException {
            return new Node(value, next != null ? next.deepCopy() : null);
        }

        @Override
        public String toString() {
            return new StringBuilder()
                    .append("Значение: " + value)
                    .append(next != null ? " -> Узел: " + next : "")
                    .toString();
        }
    }

    public CustomLinkedList(T value) {
        head = new Node(value, null);
        tail = this.head;
        length++;
    }

    public Node getHead() {
        return head;
    }


    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node nextNode = head;
            Node prevNode = head;

            @Override
            public boolean hasNext() {
                return nextNode != null;
            }

            @Override
            public Object next() {
                prevNode = nextNode;
                nextNode = nextNode.next;
                return nextNode;
            }

            @Override
            public void remove() {
                prevNode.next = nextNode.next;
                nextNode.next = null;
                nextNode = prevNode.next;
                length--;
            }
        };
    }

    @Override
    public boolean add(Object value) {
        Node node = new Node((Element) value, null);
        tail.setNext(node);
        tail = node;
        length++;
        return true;
    }

    @Override
    public void clear() {
        super.clear();
        length = 0;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("HEAD: ")
                .append(head.toString())
                .append(" -> ")
                .append(tail.toString())
                .toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CustomLinkedList customLinkedList = (CustomLinkedList) super.clone();
        customLinkedList.setHead(head.deepCopy());
        return customLinkedList;
    }
}
