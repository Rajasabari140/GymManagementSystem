package com.kce.gym.service;

import java.util.ArrayList;
import java.util.List;
import com.kce.gym.model.Member;

public class MemberService {
    private List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Member added: " + member.getName());
    }
    public void removeMember(int memberId) {
        members.removeIf(m -> m.getMemberId() == memberId);
        System.out.println("Member removed with ID: " + memberId);
    }

    public Member searchMember(int memberId) {
        for (Member m : members) {
            if (m.getMemberId() == memberId) {
                return m;
            }
        }
        return null;
    }

    public void listMembers() {
        if (members.isEmpty()) {
            System.out.println("No members found!");
        } else {
            System.out.println("Member List:");
            for (Member m : members) {
                System.out.println(m);
            }
        }
    }
}
