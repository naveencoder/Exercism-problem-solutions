class DoublyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;

    void push(T value) {
        Node<T> node = new Node<>(value);
        node.prev = last;
        if (last != null) {
            last.next = node;
        }
        last = node;
        if (first == null) {
            first = node;
        }
    }

    T pop() {
        T value = last.value;
        if (first == last) {
            first = null;
        }
        last = last.prev;
        if (last != null) {
            last.next = null;
        }
        return value;
    }

    T shift() {
        T value = first.value;
        if (last == first) {
            last = null;
        }
        first = first.next;
        if (first != null) {
            first.prev = null;
        }
        return value;
    }

    void unshift(T value) {
        Node<T> node = new Node<>(value);
        node.next = first;
        if (first != null) {
            first.prev = node;
        }
        first = node;
        if (last == null) {
            last = node;
        }
    }

    private static class Node<T> {
        final T value;
        Node<T> prev;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }
}