/*
    Define in JML the contract ensuing the following specifications:
    - times not null
    - times strictly increasing
    - return an object of type TimeInterval with a temporal range having as two extremes contiguous points of times
    - timePoint must be equal or greater then the minor end and strictly lower then the major end
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

    //@ requires times != null
    //@     && (\forall int i = 0; i >= 0 && i < (times.length - 1); times[i] < times[i+1]);
    //@ ensures (\exist int j; j >=0 && j < (times.length - 1); (times[j] ==  \result.getLow() && times[j+1] == \result.getHigh))
    //@     && timePoint >= \result.getLow()
    //@     && timePoint < \result.getHigh();
    public static TimeInterval getInterval(float[] times, float timePoint) {
        // ...
    }
}