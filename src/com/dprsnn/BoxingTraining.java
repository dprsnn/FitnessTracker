package com.dprsnn;

public class BoxingTraining extends Training{

    public BoxingTraining(double weight, double time, int pulse) {
        super(weight, time, pulse);
    }

    @Override
    public void info() {
        System.out.println("Тип тренування - бокс, Тривалість: " + super.getTime() + ". Кілокалорії: " + super.burnCalories());
    }
}
