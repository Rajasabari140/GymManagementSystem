package com.kce.gym.main;
import java.util.Scanner;
import com.kce.gym.model.Member;
import com.kce.gym.service.MemberService;

public class GymMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MemberService memberService = new MemberService();

        while (true) {
            System.out.println("\n===== GYM MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Member");
            System.out.println("2. View All Members");
            System.out.println("3. Remove Member");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Member ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Membership Type: ");
                    String membershipType = scanner.nextLine();
                    Member newMember = new Member(id, name, age, membershipType);
                    memberService.addMember(newMember);
                    break;
                case 2:
                    memberService.listMembers();
                    break;
                case 3:
                    System.out.print("Enter Member ID to remove: ");
                    int removeId = scanner.nextInt();
                    memberService.removeMember(removeId);
                    break;
                case 4:
                    System.out.println("Exiting... Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
