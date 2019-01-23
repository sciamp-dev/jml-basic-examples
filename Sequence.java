/*
    Questions:
    a) Write a public invariant for the class and the JML specification for enter and change methods. 
    b) Write the representation invariant given the partial implementation
*/

// A sequence of elements of type T

//@ public invariant (\forall String key; allKeys().contains(key);
//@                     (\forall String key2; allKeys().contains(key2); key2 != key || allKeys().indexOf(key) == allKeys().indexOf(key2));
//@ private invariant (size == 0 <==> first == null)
//@     && (size > 0) ==> (* The number of elements linked is equal to size *)
//@         && (* There aren't elements with the same next *);
public class Sequence<T> {
    protected Node<T> first;
    protected int size;

    class Node<T> {
        protected String key;
        protected T info;
        protected Node<T> next;
    }

    // Initilizes an empty sequence
    public Sequence() {
        first = null;
        size = 0;
    }

    // Insert info at the start of the sequence, assuming key doesn't exists

    //@ requires key != null
    //@     && !allKeys().contains(key)
    //@     && info != null
    //@ ensures size() == \old(size()) + 1
    //@     && lookup(key) == info
    //@     && (\forall String k; k != key && allKeys().contains(k);
    //@             (\exists String k2; \old(allKeys()).contains(k2);
    //@                 k2 == k && \old(lookup(k2)) == lookup(k) && \old(allKeys().indexOf(key2)) + 1 == allKeys().indexOf(key))
    //@     && allKeys().get(0) == key;
    public void enter(String key, T info) {
        Node<T> node = new Node();
        node.key = key;
        node.info = info;
        node.next = first;
        first = node;
        size++;
    }

    // Removes the elements with key key
    public void delete(String key) {
        // ...
    }

    // Alter the element with key key, assuming the element exists

    //@ requires key != null
    //@     && info != null
    //@     && lookup(key) != null;
    //@ ensures lookup(key) == info
    //@     && (\forall String k; allKeys().contains(k);
    //@             (\exists String k2; \old(allKeys().contains(k2));
    //@                 k2 == k1
    //@                 && \old(allKeys().indexOf(k2)) == allKeys().indexOf(k) 
    //@                 && (\old(lookup(k2)) == lookup(k) || k == key)));
    public void change(String key, T info) {
        // ...
    }

    // Returns the element with key key, null if key doesn't exist
    public /*@ pure */ T lookup(String key) {
        // ...
    }

    // Returns all of the keys ordered by the sequence
    public /*@ pure */ ArrayList<String> allKeys() {
        // ...
    }

    // Returns the number of elements in the sequence
    public /*@ pure */ int size() {
        return size;
    }
}