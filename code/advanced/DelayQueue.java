/*
    Defines a queue where the head is the first element expired.
    If no element is expired, head doesn't exists and poll() returns null.
    The queue doesn't contain duplicates.

    Observer methods: peek(), iterator(), getExipirationDate(), toArrayList()
*/

//@ public invariant (\forall E e; this.contains(e); 
//@                         !(\exists E e2; this.contains(e2); e2 == e && this.indexOf(e2) != this.indexOf(e)));
public class DelayQueue<E> implements Collection<E> {

    // Builds an empty queue
    public DelayQueue() {
        // ...
    }

    // Insert x in the queue if not already entered. Expire time is expressed in second from the current time
    // Returns false if x is already entered

    //@ requires x != null
    //@     && expireTime >= 0;
    //@ ensures this.contains(x) <==> !(\old(this.contains(x)))
    //@     && ((\result == true) ==> (getExipirationDate(x) == expireTime
    //@         && this.size() == \old(this.size() + 1)
    //@         && (\forall E e; this.contains(e) && e != x;
    //@                 (\exists E e2; \old(this.contains(e2)); e2 == e && getExipirationDate(e2) == getExipirationDate(e))));
    public boolean add(E x, long expireTime) {
        // ..
    }

    // Removes all of the elements
    public void clear() {
        // ..
    }

    // Returns null if the queue is empty, otherwise returns - without deleting it - the head
    // If head doesn't exists returns the element with the nearest expiration time

    //@ ensures ((\result == null) <==> (this.size() == 0))
    //@     && ((\result == this.get(0)) <==> this.get(0) != null)
    //@     && ((\result == this.toArrayList().get(0)) <==> this.get(0) == null)
    //@     && (\forall E e; this.contains(e); 
    //@             (\exists E e2; \old(this.contains(e2)) && \old(this.toArrayList().indexOf(e2)) != this.toArrayList().indexOf(e);
    //@                 e2 == e));
    public E peek() {
        // ..
    }

    // Returns and delete the queue's head, follows the definition otherwise
    public E pool() {
        // ...
    }

    // Returns an iterator to every queue's element, ordered by exipiration time
    public Iterator<E> iterator() {
        // ...
    }

    // Return an array containing all of the queue's elements, ordered by expiration time
    public ArrayList<E> toArrayList() {
        // ...
    }

    // Returns the expiration time of e at the call's time. If x doesn't belong to the queue throws an exeption
    public long getExipirationDate(E e) throws NotFoundException {
        // ...
    }
}