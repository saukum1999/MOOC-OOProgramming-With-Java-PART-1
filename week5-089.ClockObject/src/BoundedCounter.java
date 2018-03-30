
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int up) {
        this.value = 0;
        this.upperLimit = up;
    }

    public void next() {
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() {
        if (value < 10) {
            return ("0" + this.value);
        } else {
            return ("" + this.value);
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int a) {
        if (a >= 0) {
            if( a <= upperLimit)
                this.value = a;
            //else
            //    this.value = 0;
            
        }
    }
}

