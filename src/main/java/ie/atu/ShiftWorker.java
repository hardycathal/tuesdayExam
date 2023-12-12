package ie.atu;
import java.util.Scanner;


public class ShiftWorker {
    private String name;
    private String gender;
    private int age;
    private int shift;

    public ShiftWorker(){
        Scanner scanner = new Scanner(System.in);
        String gender;
        String name;
        int shift;
        int age;

        System.out.println("Enter Name: ");
        name = scanner.nextLine();
        try{
            if(name.length() < 6 || name.length() > 21) {
                throw new IllegalArgumentException("Name must be between 6 and 21 characters.");
            }this.name = name;
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter Gender: ");
        gender = scanner.nextLine();
        try{
            if(gender.equals("Man") || gender.equals("Woman") || gender.equals("Non-binary")){
                this.gender = gender;
            }else{
                throw new IllegalArgumentException("Must be 'Man', 'Woman' or 'Non-Binary'");
            }
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter shift: ");
        shift = scanner.nextInt();
        try{
            if(shift < 1 || shift > 2){
                throw new IllegalArgumentException("Shift must be either 1(day) or 2(night).");
            }this.shift = shift;
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter Age: ");
        age = scanner.nextInt();
        try{
            if(age < 18){
                throw new IllegalArgumentException("Must be 18 or over!");

            }this.age = age;
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(toString());

    }



    public ShiftWorker(String name, String gender, int age, int shift) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.shift = shift;
    }


    @Override
    public String toString() {
        return "ShiftWorker{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", shift=" + shift +
                '}';
    }
}
