package com.dprsnn;

public class RunningTraining extends Training{
    private double distance;

    public RunningTraining(double weight, double time, int pulse, double distance) {
        super(weight, time, pulse);
        this.distance = distance;
    }

    @Override
    public void info() {
        System.out.println("Тип тренування - біг. Тривалість: " + super.getTime() + ". Дистанція: " + distance + ". Кілокалорії: " + super.burnCalories());
    }
}
