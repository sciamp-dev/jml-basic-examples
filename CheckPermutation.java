/*
    Write the JML specification knowing that:
    - the method returns true if y is a permutation of x, else it returns false
    - there are no duplicates in x and y
*/

public class CheckPermutation {
    
    //@ requires x != null
    //@     && y!= null
    //@     && x.length == y.length
    //@     && (\forall int i = 0; i >= 0 && i < x.length; 
    //@             (\forall j = i; j >= i && j < x.length; x[j] != x[i]))
    //@     && (\forall int i = 0; i >= 0 && i < y.length; 
    //@             (\forall j = i; j >= i && j < y.length; y[j] != y[i]));
    //@ ensures (\result == true) <==> (\forall int i = 0; i >= 0 && i <= x.length; 
    //@                                     (\exist int j; j >= 0 && j <= y.length; x[i] == y[j]));
    public static boolean isPermutation(int x[], int y[]) {
        // ...
    }

    /*
        Comment:
        In the official solution x.length == y.length is not in the requires, which it doesn't make sense to me.
        In that case the JML should be as follows
    */

    //@ requires x != null
    //@     && y!= null
    //@     && (\forall int i = 0; i >= 0 && i < x.length; 
    //@             (\forall j = i; j >= i && j < x.length; x[j] != x[i]))
    //@     && (\forall int i = 0; i >= 0 && i < y.length; 
    //@             (\forall j = i; j >= i && j < y.length; y[j] != y[i]));
    //@ ensures (\result == true) <==> (x.length == y.length) && (\forall int i = 0; i >= 0 && i <= x.length; 
    //@                                     (\exist int j; j >= 0 && j <= y.length; x[i] == y[j]));
    public static boolean isPermutation(int x[], int y[]) {
        // ...
    }

    //@ ensures (\result == true) <==> (x.length == y.length) && (\forall int i = 0; i >= 0 && i <= x.length; 
    //@                                     (\exist int j; j >= 0 && j <= y.length; x[i] == y[j]));
    //@ signals (NullPointerException npe) (x == null || y == null);
    //@ signals (DuplicateException de) ();
    public static boolean isPermutation(int x[], int y[])
        throws NullPointerException, DuplicateException {
            // ...
        }

    /*
        Second version, we don't take anymore into consideration the clause "there are no duplicates in x and y"
    */

    //@ requires x != null
    //@     && y!= null
    //@     && x.length == y.length;
    //@ ensures (\result == true) <==> (\forall int i = 0; i >= 0 && i <= x.length; 
    //@                                     (\num_of int j; j >= 0 && j <= x.length; x[i] == x[j]) == (\num_of int k; k >= 0 && k <= y.length; x[i] == y[k]));
    public static boolean isPermutation(int x[], int y[]) {
        // ...
    }
}