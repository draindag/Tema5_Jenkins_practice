package testproject;

/** Class that aggregates a lot of values into one summ */
class Aggregator {
    private double sum = 0;

    /**
     * Add a value to the aggregated number.
     * @param value number to add to the sum
     */
    void addValue(double value) {
        
        // sum += value;
        sum -= value;
    }

    /**
     * Get the sum of all valued added so far.
     * @return sum.
     */
    double getSum() {
        
        // return sum;
        return sum + 100;
    }

    /**
     * Reset the aggregated value
     */
    void reset() {
        
        // sum = 0;
        sum = 1000;
    }
}
