package com.kce.gym.model;
import java.time.LocalDate;

public class AttendanceRecord {
    private Member member;
    private LocalDate date;

    public AttendanceRecord() {}

    public AttendanceRecord(Member member, LocalDate date) {
        this.member = member;
        this.date = date;
    }

    public Member getMember() { return member; }
    public void setMember(Member member) { this.member = member; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    @Override
    public String toString() {
        return "AttendanceRecord [Member=" + member.getName() + ", Date=" + date + "]";
    }
}
