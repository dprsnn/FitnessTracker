package com.dprsnn;

public class CrossfitTraining extends Training{
    private int projectileWeight;

    public CrossfitTraining(double weight, double time, int pulse, int projectileWeight) {
        super(weight, time, pulse);
        this.projectileWeight = projectileWeight;
    }

    @Override
    public void info() {
        System.out.println("Тип тренування - кросфіт. Тривалість: " + super.getTime() + ". Середня вага штанги: " + projectileWeight + ". Кілокалорії: " + super.burnCalories());
    }
}
