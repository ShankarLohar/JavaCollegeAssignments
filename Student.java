// 20BAI10040 - Shankar Lohar Assignment Part 2 : Q2
import java.util.Scanner;

class Student {
    private String name;
    private String dob;
    private String contactno;
    private String subjectGrade;
    private int ageYear;
    private int ageDays;

    public Student(int ageYear, int ageDays, String name, String dob, String contactno, String subjectGrade) {
        this.ageYear = ageYear;
        this.ageDays = ageDays;
        this.name = name;
        this.contactno = contactno;
        this.subjectGrade = subjectGrade;
        this.dob = dob;
    }

    public void display() {
        System.out.println("The student name is..." + name);
        System.out.println("The student age is..." + ageYear + "Years and " + ageDays + " days.");
        System.out.println("The student contactno is..." + contactno);
        System.out.println("The student subject Grade is..."
                + subjectGrade);
        System.out.println("The student dob is..." + dob);
    }

    public static void main(String[] args) {
        System.out.println("Enter Student Name : ");
        System.out.println("Enter Student Contact : ");
        System.out.println("Enter Student Grade : ");
        System.out.println("Enter Student DOB : ");
        System.out.println("Enter Student Age in Years : ");
        System.out.println("Enter Student Age in Days : ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String contact = input.nextLine();
        String grade = input.nextLine();
        String dob = input.nextLine();
        int ayear = input.nextInt();
        int adays = input.nextInt();
        Student Anubhav = new Student(ayear, adays, name, dob, contact, grade);
        input.close();
        Anubhav.display();
    }
}