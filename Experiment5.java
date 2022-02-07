class Student {
    private String name, id;
    private double gpa;

    public Student(String name, String id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "The Student name " + name + " id is " + id + " and gpa is " + gpa + " .";
    }

}

class Undergrad extends Student {
    private int year;

    public Undergrad(String name, String id, double gpa, int year) {
        super(name, id, gpa);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "The Student name " + super.getName() + " id is " + super.getId() + " and gpa is " + super.getGpa()
                + " year of passing is " + year + " .";
    }
}

class Graduate extends Student {
    private String thesisTitle;

    public Graduate(String name, String id, float gpa, String thesisTitle) {
        super(name, id, gpa);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public String toString() {
        return "The Student name " + super.getName() + " id is " + super.getId() + " and gpa is " + super.getGpa()
                + " thesis title is " + thesisTitle + " .";
    }

}

public class Experiment5 {
    public static void main(String[] args) {
        Student shankar = new Student("Shankar Lohar", "20BAI10040", 8.45);
        System.out.println(shankar.toString());;
        Undergrad lohar = new Undergrad("Lohar Shankar", "20BAI10040", 8.45, 2024);
        System.out.println(lohar.toString());;
        Graduate futureShankar = new Graduate("Future Shankar Lohar", "20BAI10040", 9,
                "Artificial Intelligence and Machine Learning");
        System.out.println(futureShankar.toString());;
    }
}
