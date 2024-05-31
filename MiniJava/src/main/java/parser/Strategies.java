package main.java.parser;

import parser.ActionStrategies.AcceptStrategy;
import parser.ActionStrategies.ActionStrategy;
import parser.ActionStrategies.ReduceStrategy;
import parser.ActionStrategies.ShiftStrategy;

public enum Strategies {
    shift(new ShiftStrategy()), reduce(new ReduceStrategy()), accept(new AcceptStrategy());

    private ActionStrategy strategy;

    Strategies(ActionStrategy strategy) {
        this.strategy = strategy;
    }

    public ActionStrategy getStrategy() {
        return strategy;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}