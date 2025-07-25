import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static double average(int[] grades){
    return (grades[0] + grades[1] + grades[2]) /3;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int min = 100;
        int max = 0;
        System.out.println("Enter number of students: ");
        int studentsNumber = input.nextInt();// for int
        input.nextLine();// for  next Strting


        for (int i = 0; i< studentsNumber; i++){
            System.out.println((i+1) + ". Students");
            System.out.println("Your name: ");
            String name = input.nextLine();
            System.out.println("Your surname: ");
            String surname = input.nextLine();

            int[] grades = new int[3];
            for (int j =0; j <3; j++){
                while(true) {
                    System.out.println((j+1) + ". enter your note (0-100): ");
                    int enteredNote = input.nextInt();

                    if (enteredNote >=0 && enteredNote <=100){
                        grades[j] = enteredNote;

                        if (enteredNote > max) {
                            max = enteredNote;
                        } else if (enteredNote < min) {
                            min = enteredNote;
                        }
                        break;
                    }else {
                        System.out.println("Invalid value");
                    }
                }
            }
            input.nextLine();
            double avg = average(grades);

            System.out.println("Name: " + name);
            System.out.println("Surname: " + surname);
            System.out.println("Grade: " + grades[0] + "," + grades[1] + "," + grades[2]);
            System.out.println("Average: " + avg);

            if (avg >= 50){
                System.out.println("Pass");
            }else {
                System.out.println("Fail");
            }



        }
        System.out.println("Highest grade: " + max);
        System.out.println("Lowest grade : " + min);

        //before strech goals
        /* System.out.println("Enter the student is name: ");
        String name = input.nextLine();
        System.out.println("Enter the student is surname: ");
        String surname = input.nextLine();*/

        //before stretch goals
        /*int[] notes = new int[2];
        for (int i = 0; i<3; i++){
            while (true){
                System.out.println((i+1) +" .Enter your grade(0-100): " );
                notes[i] = input.nextInt();

                if (grades[i] >= 0 && grades[i] <= 100){
                    break;
                }else {
                    System.out.println("Invalid value");
                }

            }
        }


        double ave = average(notes);
        System.out.println("According to the entered data; ");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        for (int i =0; i<3; i++){
            System.out.println((i+1) + ". Grade = " + grades[i]);
        }
        System.out.println("Average: " + avg);

        if (ave >= 50) {
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
        }*/

    }


}