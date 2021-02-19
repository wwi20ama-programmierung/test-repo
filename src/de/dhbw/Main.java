package de.dhbw;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter(0);

        for (int i = 0; i < 100; i++) {
            counter.increment();
            System.out.println("Der aktuelle Wert ist: " + counter.getCounterValue());
        }

        System.out.println(counter);
    }
}
