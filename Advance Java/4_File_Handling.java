import java.io.*;
import java.util.Scanner;

class FileCreate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String filePath = "C:\\Users\\Pccoe\\Desktop\\TYITB96\\newFile.txt";

        while (true) {
            System.out.println("Menu:");
            System.out.println("1) Add data");
            System.out.println("2) Read data");
            System.out.println("3) Calculate and display top 3 students");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addData(filePath);
                    break;
                case 2:
                    readData(filePath);
                    break;
                case 3:
                    calculateAndDisplayTop3(filePath);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void addData(String filePath) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            Scanner input = new Scanner(System.in);

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter Roll Number: ");
                String rollNumber = input.next();
                System.out.println("Enter Name: ");
                String name = input.next();
                System.out.println("Enter Marks of Subject 1: ");
                int mark1 = input.nextInt();
                System.out.println("Enter Marks of Subject 2: ");
                int mark2 = input.nextInt();
                System.out.println("Enter Marks of Subject 3: ");
                int mark3 = input.nextInt();

                // Calculate the average marks
                double average = (mark1 + mark2 + mark3) / 3.0;

                writer.write(rollNumber + "\t" + name + "\t" + mark1 + "\t" + mark2 + "\t" + mark3 + "\t" + average + "\n");
            }

            writer.close();
            System.out.println("Data added successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readData(String filePath) {
        try {
            FileReader fr = new FileReader(filePath);
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void calculateAndDisplayTop3(String filePath) {
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;
            Student[] students = new Student[5];
            int count = 0;

            // Read student data into objects
            while ((line = br.readLine()) != null && count < 5) {
                String[] parts = line.split("\t");
                if (parts.length >= 6) {
                    String rollNumber = parts[0];
                    String name = parts[1];
                    int mark1 = Integer.parseInt(parts[2]);
                    int mark2 = Integer.parseInt(parts[3]);
                    int mark3 = Integer.parseInt(parts[4]);
                    double average = Double.parseDouble(parts[5]);
                    students[count] = new Student(rollNumber, name, mark1, mark2, mark3, average);
                    count++;
                }
            }

            // Sort the students based on average marks
            for (int i = 0; i < students.length - 1; i++) {
                for (int j = 0; j < students.length - 1 - i; j++) {
                    if (students[j].getAverage() < students[j + 1].getAverage()) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }

            // Display the top 3 students
            System.out.println("Top 3 Students:");
            for (int i = 0; i < 3 && i < students.length; i++) {
                System.out.println(students[i]);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class Student {
    private String rollNumber;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;
    private double average;

    public Student(String rollNumber, String name, int mark1, int mark2, int mark3, double average) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return rollNumber + "\t" + name + "\t" + mark1 + "\t" + mark2 + "\t" + mark3 + "\t" + average;
    }
}

