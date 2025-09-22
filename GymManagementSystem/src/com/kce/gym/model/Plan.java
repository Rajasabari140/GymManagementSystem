package com.kce.gym.model;

public class Plan {
    private int planId;
    private String planName;
    private double price;
    private int durationMonths;

    public Plan() {}

    public Plan(int planId, String planName, double price, int durationMonths) {
        this.planId = planId;
        this.planName = planName;
        this.price = price;
        this.durationMonths = durationMonths;
    }

    public int getPlanId() { return planId; }
    public void setPlanId(int planId) { this.planId = planId; }

    public String getPlanName() { return planName; }
    public void setPlanName(String planName) { this.planName = planName; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getDurationMonths() { return durationMonths; }
    public void setDurationMonths(int durationMonths) { this.durationMonths = durationMonths; }

    @Override
    public String toString() {
        return "Plan [ID=" + planId + ", Name=" + planName + ", Price=" + price + ", Duration=" + durationMonths + " months]";
    }
}
