package com.dprsnn;

public abstract class Training {
    private double weight;
    private double time;
    private int pulse;

    public Training(double weight, double time, int pulse) {
        this.weight = weight;
        this.time = time;
        this.pulse = pulse;
    }

    public Training() {
    }

    public abstract void info();

    public double getTime() {
        return time;
    }

    public double burnCalories() {
        return 0.014 * this.weight * time * (0.12 * pulse - 7);
    }
}
