package de.dhbw;

public class Counter extends BaseObject {
    private int counter;

    public Counter(int startValue) {
        this.counter = startValue;
    }

    // Counter um 1 hochzählen, immer, wenn Methode aufgerufen wird
    public void increment() {
        this.counter++;
        // this.counter = this.counter + 1;
    }

    public int getCounterValue() {
        return this.counter;
    }

    @Override
    public String toString() {
        return "Der Wert ist " + this.counter;
    }
}
