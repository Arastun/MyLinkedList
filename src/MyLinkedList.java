import java.util.Iterator;


/**
 * Created by Root on 13.02.2016.
 */
public class MyLinkedList<E> implements Iterator<E> {



    public MyLinkedList(){

    }

    E value;
    private Node first;
    private Node last;
    private int index;
    private Node curr;


    private static class Node<E> {

        E value;
        Node next;
        Node prev;
        public Node() {

        }

        public Node(E value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst (E value) {

        if (isEmpty()) {

            Node newNode = new Node();
            newNode.value = value;
            last = newNode;
            first = last;
            curr = first;
            ++index;
        }

        else {
            Node exNewNode = first;
            Node newNode = new Node();
            newNode.value = value;
            newNode.next = exNewNode;
            exNewNode.prev = newNode;
            first = newNode;
            curr = first;
            ++index;
        }
    }

    public void addLast (E value) {

        if (isEmpty()) {

            Node newNode = new Node();
            newNode.value = value;
            last  = newNode;
            first = last;
            curr = first;
        }

        else {

            Node previous = last;
            last = new Node();
            last.value = value;
            previous.next = last;
            last.prev = previous;

        }
        index++;
    }


    @Override
    public boolean hasNext() {
        if ((index == 0) || (curr == null)) return false;
        else return true;
    }


    @Override
    public E next() {

        Node temp = curr;
        curr = curr.next;
        return (E)temp.value;

    }


    public boolean hasPrevious() {
        if  (last != first.prev) return true;
        else return false;
    }


    public E previous() {
        Node temp = last;
        last =last.prev;
        return (E)temp.value;

    }

    public int nextIndex() {
        return index +1;
    }

    public int previousIndex() {
        return index -1;
    }


    public void removeFirst() {
       curr = first.next;
        first = first.next;
    --index;

    }

    public void removeLast() {
        Node temp = last.prev;
        last = null;
        temp.next = null;
        last = temp;

        --index;
    }


    public E get (int idx){

        if (idx > index) {
            throw new ArrayIndexOutOfBoundsException("Out of index");
        }

         Node temp = first;


        for (int i = 0 ; i < idx; i++) {
            temp = temp.next;

        }
            return (E)temp.value;
    }


    public void set(E item, int idx) {

        Node temp = first;

        for (int i = 0 ; i < idx; i++) {
            temp = temp.next;
        }
           temp.value = item;
    }


    public boolean isEmpty(){
        return (index == 0);
    }

}
