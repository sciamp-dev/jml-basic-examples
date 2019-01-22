/*
    Define in JML the contract ensuing the following specifications:
    - times not null
    - times strictly increasing
    - return an object of type TimeInterval with a temporal range having as two extremes contiguous points of times
    - timePoint must be equal or greater of the minor end and strictly lower of the major end
*/

public class TimeInterval {
    private float low;
    private float high;

    public float getLow() {
        // ...
    }

    public float getHigh() {
        //...
    }

    public static TimeInterval getInterval(float[] times, float timePoint) {}
}