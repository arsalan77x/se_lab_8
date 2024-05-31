package main.java.parser;

public class ReduceStrategy implements ActionStrategy {
    @Override
    public String apply(int number) {
        return "r" + number;
    }
}