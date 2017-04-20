package com.quanlt.conditionwatcher;

/**
 * Created by quanlt on 4/20/17.
 */
public abstract class Instruction {
    public String getDescription(){
        return "Operation timeout";
    }

    public boolean checkCondition() {
        try {
            apply();
            return true;
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public abstract void apply();
}
