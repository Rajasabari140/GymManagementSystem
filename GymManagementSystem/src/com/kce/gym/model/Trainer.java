package com.kce.gym.model;

public class Trainer {
    private int trainerId;
    private String name;
    private String specialty;

    public Trainer() {}

    public Trainer(int trainerId, String name, String specialty) {
        this.trainerId = trainerId;
        this.name = name;
        this.specialty = specialty;
    }

    public int getTrainerId() { return trainerId; }
    public void setTrainerId(int trainerId) { this.trainerId = trainerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    @Override
    public String toString() {
        return "Trainer [ID=" + trainerId + ", Name=" + name + ", Specialty=" + specialty + "]";
    }
}
