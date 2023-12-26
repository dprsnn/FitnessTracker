package com.dprsnn;

public class Main {

    public static void main(String[] args) {
        Training training = new RunningTraining(60, 60, 120, 20);
        Training training1 = new RunningTraining(85, 30, 140, 10);
        Training training2 = new CrossfitTraining(100, 50, 90, 50);
        Training training3 = new BoxingTraining(75, 90, 110);

        Training[] trainings = new Training[]{training, training1, training2, training3};

        for (Training tr : trainings){
            tr.info();
        }

    }
}
