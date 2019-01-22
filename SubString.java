/*
    Write a specific in JML that gives sense to the method, given the following example:
    - text = [abbcdddeff], chunk = [bcddd] -> returns true
    - text = [abbcdddeff], chunk = [baadd] -> returns false
*/

public class SubString {
    // Since chunk is a substring of text, we can say that chunk.legth must be equal or lower then text.length
    // We clearly don't want null parameters
    // The method returns true only if chunk is sub string of text
    
    //@ requires text != null
    //@     && chunk != null
    //@     && chunk.length <= text.length;
    //@ ensures (\exist int i; i >= 0 && i < text.length; 
    //@             (\forall int j = 0; j >= 0 && j < chunk.length; text[j+i] == chunk[j])
    //@         ) <==> \result == true;
    public static boolean subString(char[] text, char[] chunk) {
        // ...
    }

    //@ ensures (\exist int i; i >= 0 && i < text.length; 
    //@             (\forall int j = 0; j >= 0 && j < chunk.length; text[j+i] == chunk[j])
    //@         ) <==> \result == true;
    //@ signals (NullPointerException npe) (text == null || chunk == null);
    //@ signals (InvertedLengthException ile) (chunk.length > text.length);
    public static boolean subString(char[] text, char[] chunk)
        throws NullPointerException, InvertedLengthException {
            // ...
        }
}