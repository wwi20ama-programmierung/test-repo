package de.dhbw;

public class BaseObject {
    @Override
    public String toString() {
        return "Ich bin " + getClass().getName();
    }
}
