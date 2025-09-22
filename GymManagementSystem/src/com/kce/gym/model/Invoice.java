package com.kce.gym.model;

public class Invoice {
    private Member member;
    private Plan plan;
    private double subtotal;
    private double tax;
    private double penalty;
    private double totalAmount;
    private boolean paid;

    public Invoice() {}

    public Invoice(Member member, Plan plan, double subtotal, double tax, double penalty, double totalAmount, boolean paid) {
        this.member = member;
        this.plan = plan;
        this.subtotal = subtotal;
        this.tax = tax;
        this.penalty = penalty;
        this.totalAmount = totalAmount;
        this.paid = paid;
    }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }

    public Plan getPlan() { return plan; }
    public void setPlan(Plan plan) { this.plan = plan; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }

    public double getTax() { return tax; }
    public void setTax(double tax) { this.tax = tax; }

    public double getPenalty() { return penalty; }
    public void setPenalty(double penalty) { this.penalty = penalty; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }

    public boolean isPaid() { return paid; }
    public void setPaid(boolean paid) { this.paid = paid; }

    @Override
    public String toString() {
        return "Invoice [Member=" + member.getName() + ", Plan=" + plan.getPlanName() +
               ", Subtotal=" + subtotal + ", Tax=" + tax + ", Penalty=" + penalty +
               ", Total=" + totalAmount + ", Paid=" + paid + "]";
    }
}
