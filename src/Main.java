public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();
        // Iterator iter = list.iterator();

        list.addFirst("One");
        list.addLast("TWO");
        list.addLast("Three");
        list.addLast("Four");
        list.addLast("Five");
        list.addFirst("Zero");
        list.addFirst("Minus one");
        list.addFirst("Minus two");
        list.addLast("Test");


       while (list.hasNext()) {
            System.out.println(list.next());
        }

        while (list.hasPrevious()) {
            System.out.print(list.previous()+ " ");
        }

    }
}
