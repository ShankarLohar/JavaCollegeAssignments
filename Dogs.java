
//20BAI10040 - Shankar Lohar Assignment ka Part 2 : Q1
import java.util.Scanner;

class Dogs {
    private String name;
    private String breed;
    private String size;
    private String color;
    private int age;

    public Dogs(int age, String name, String breed, String size, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.size = size;
        this.color = color;
    }

    public void setDogName(String name) {
        this.name = name;
    }

    public String getDogName() {
        return "The dog name is " + name;
    }

    public void setDogBreed(String breed) {
        this.breed = breed;
    }

    public String getDogBreed() {
        return "The dog breed is " + breed;
    }

    public void setDogSize(String size) {
        this.size = size;
    }

    public String getDogSize() {
        return "The dog size is " + size;
    }

    public void setDogColor(String color) {
        this.color = color;
    }

    public String getDogColor() {
        return "The dog color is " + color;
    }

    public void setDogAge(int age) {
        this.age = age;
    }

    public String getDogAge() {
        return "The dog age is " + age;
    }

    public String eat() {
        return "The dog is eating...";
    }

    public String sleep() {
        return "The dog is sleeping...";
    }

    public String run() {
        return "The dog is running...";
    }

    public String sit() {
        return "The dog is sitting...";
    }

    public static void main(String[] args) {

        System.out.println("Enter age of Puppy : ");
        System.out.println("Enter age of Mani : ");
        System.out.println("Enter age of Tiger : ");
        System.out.println("Enter breed of Puppy : ");
        System.out.println("Enter breed of Mani : ");
        System.out.println("Enter breed of Tiger : ");
        System.out.println("Enter size of Puppy : ");
        System.out.println("Enter size of Mani : ");
        System.out.println("Enter size of Tiger : ");
        System.out.println("Enter color of Puppy : ");
        System.out.println("Enter color of Mani : ");
        System.out.println("Enter color of Tiger : ");
        System.out.println();

        Scanner intInput = new Scanner(System.in);
        int puppyAge = intInput.nextInt();
        int maniAge = intInput.nextInt();
        int tigerAge = intInput.nextInt();
        Scanner strInput = new Scanner(System.in);
        String puppyBreed = strInput.nextLine();
        String maniBreed = strInput.nextLine();
        String tigerBreed = strInput.nextLine();
        String puppySize = strInput.nextLine();
        String maniSize = strInput.nextLine();
        String tigerSize = strInput.nextLine();
        String puppyColor = strInput.nextLine();
        String maniColor = strInput.nextLine();
        String tigerColor = strInput.nextLine();

        Dogs puppy = new Dogs(puppyAge, "Puppy", puppyBreed, puppySize, puppyColor);
        Dogs mani = new Dogs(maniAge, "Mani", maniBreed, maniSize, maniColor);
        Dogs tiger = new Dogs(tigerAge, "Tiger", tigerBreed, tigerSize, tigerColor);

        intInput.close();
        strInput.close();

        System.out.println();
        System.out.println("You have the following Dog data...");
        System.out.println();
        System.out.println(puppy.getDogName());
        System.out.println(puppy.getDogBreed());
        System.out.println(puppy.getDogSize());
        System.out.println(puppy.getDogColor());
        System.out.println(puppy.getDogAge());
        System.out.println(puppy.eat());
        System.out.println(puppy.sleep());
        System.out.println("............................");
        System.out.println(mani.getDogName());
        System.out.println(mani.getDogBreed());
        System.out.println(mani.getDogSize());
        System.out.println(mani.getDogColor());
        System.out.println(mani.getDogAge());
        System.out.println(mani.run());
        System.out.println(mani.sit());
        System.out.println("............................");
        System.out.println(tiger.getDogName());
        System.out.println(tiger.getDogBreed());
        System.out.println(tiger.getDogSize());
        System.out.println(tiger.getDogColor());
        System.out.println(tiger.getDogAge());
        System.out.println(tiger.eat());
        System.out.println(tiger.run());
        System.out.println(tiger.sit());
        System.out.println(tiger.sleep());
    }
}