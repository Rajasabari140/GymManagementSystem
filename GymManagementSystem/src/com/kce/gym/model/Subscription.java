package com.kce.gym.model;

import java.time.LocalDate;

public class Subscription {
    private Member member;
    private Plan plan;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean active;

    public Subscription() {}

    public Subscription(Member member, Plan plan, LocalDate startDate, LocalDate endDate, boolean active) {
        this.member = member;
        this.plan = plan;
        this.startDate = startDate;
        this.endDate = endDate;
        this.active = active;
    }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }

    public Plan getPlan() { return plan; }
    public void setPlan(Plan plan) { this.plan = plan; }

    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }

    public LocalDate getEndDate() { return endDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    @Override
    public String toString() {
        return "Subscription [Member=" + member.getName() + ", Plan=" + plan.getPlanName() +
               ", Start=" + startDate + ", End=" + endDate + ", Active=" + active + "]";
    }
}
