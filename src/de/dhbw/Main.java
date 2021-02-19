package de.dhbw;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter(0);

        for (int i = 0; i < 100; i++) {
            counter.increment();
        }

        System.out.println(counter);
    }
}
