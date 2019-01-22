/*
    Write the JML specification given the following informations:
    - P1 stands for first exam, P2 stands for second exam and L stands for laboratory
    - every exam gives until 13 points, one must obtain at least 6 points in each one, if not must redo both exams
    - lab gives 4 point at max, one must obtain at least 2 points, if not must redo the whole course
    - in order to pass the exam P1+P2=16 and P1+P2+L=18, if not must redo both exams
    - method returns the final result or 0 if one must redo both exams or -1 if one must redo the whole course
*/
public class CourseResult {
    
    //@ requires P1 >= 0
    //@     && P1 <= 13
    //@     && P2 >= 0
    //@     && P2 <= 13
    //@     && L >= 0
    //@     && L <= 4;
    //@ ensures (\result == -1) <==> (L < 2)
    //@     && (\result == 0) <==> (P1 < 6 || P2 < 6 || P1+P2 < 16) && (L >=  2)
    //@     && (\result == P1+P2+L) <==> (P1 >= 6 && P2 >= 6 && L >= 2 && P1+P2 >= 16 && P1+P2+L >= 18);
    public static int computeScore(int P1, int P2, int L) {
        // ...
    }
}