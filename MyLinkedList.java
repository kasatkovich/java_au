import java.util.Iterator;

class MyIterator<E> implements Iterator<E> {
    int index;
    MyLinkedList<E> list;

    MyIterator(MyLinkedList<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list.size >= index + 1;
    }

    @Override
    public E next() {
        return list.get(index++);
    }
}

class Node<T> {
    T val;
    Node<T> next, prev;

    Node(T val) {
        this.val = val;
    }
}

class MyLinkedList<T> implements Iterable<T> {
    int size;
    Node<T> start, end;

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(this);
    }

T get(int index) {
    Node<T> head = start;
    if (index >= size || index < 0) {
        return null;
    }
    for (int i = 0; i < index; i++) {
        head = head.next;
    }
    return head.val;
    }

public void addAtHead(T val) {
    Node<T> node = new Node<>(val);
        if (size == 0) start = end = node;
        else start = node;
        ++size;
    }
public void addAtTail(T val) {
     Node node = new Node(val);
     if (size == 0) start = end = node;
     else {
         end.next = node;
         start = node;
    }
     ++size;
    }
void addAtIndex(int index, T val) {
     if (index == 0) {
         addAtHead(val);
         return;
     }

      if (index == size) {
          addAtTail(val);
          return;
      }

       if (index > size || index < 0) {
          return;
      }

        Node<T> add = new Node<>(val);
        Node<T> head = start;

        for (int i = 0; i < index; i++) {
            head = head.next;
        };

        add.prev = head.prev;
        add.next = head;
        head.prev.next = add;
        head.prev = add;
        size++;
    }
void deleteAtIndex(int index) {
      if (index == 0) {
            if (size == 1) {
                start = null;
                end = null;
            } else {
                start.next.prev = null;
                start = start.next;
            }
            size--;
            return;
       }

      if (index == size - 1) {
            end.prev.next = null;
            end = end.prev;
            size--;
            return;
       }

      if (index >= size || index < 0) {
            return;
      }

      Node<T> head = start;
        for (int i = 0; i < index; i++) {
            head = head.next;
        }

        head.prev.next = head.next;
        head.next.prev = head.prev;
        size--;
    }
}
