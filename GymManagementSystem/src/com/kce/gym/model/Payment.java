package com.kce.gym.model;

public class Payment {
    private Member member;
    private double amount;
    private String method;
    private boolean success;

    public Payment() {}

    public Payment(Member member, double amount, String method, boolean success) {
        this.member = member;
        this.amount = amount;
        this.method = method;
        this.success = success;
    }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getMethod() { return method; }
    public void setMethod(String method) { this.method = method; }

    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }

    @Override
    public String toString() {
        return "Payment [Member=" + member.getName() + ", Amount=" + amount +
               ", Method=" + method + ", Success=" + success + "]";
    }
}
