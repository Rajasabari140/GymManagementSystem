package com.kce.gym.model;

public class Member {
    private int memberId;
    private String name;
    private int age;
    private String membershipType;

    public Member() {}

    public Member(int memberId, String name, int age, String membershipType) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.membershipType = membershipType;
    }

    public int getMemberId() { return memberId; }
    public void setMemberId(int memberId) { this.memberId = memberId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getMembershipType() { return membershipType; }
    public void setMembershipType(String membershipType) { this.membershipType = membershipType; }

    @Override
    public String toString() {
        return "Member [ID=" + memberId + ", Name=" + name + ", Age=" + age + ", Membership=" + membershipType + "]";
    }
}
