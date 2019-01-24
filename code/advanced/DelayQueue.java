/*
    Defines a queue where the head is the first element expired.
    If no element is exipird, head doesn't exists and poll() returns null.
    The queue doesn't contain duplicates.
*/

public class DelayQueue<E> implements Collection<E> {

    // Builds an empty queue
    public DelayQueue() {
        // ...
    }

    // Insert x in the queue if not already entered. Exipre time is expressed in second from the current time
    // Returns false if x is already entered
    public boolean add(E x, long exipireTime) {
        // ..
    }

    // Removes all of the elements
    public void clear() {
        // ..
    }

    // Returns null if the queue is empty, otherwise returns - without deleting it - the head
    // If head doesn't exists returns the element with the nearest expiration time
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