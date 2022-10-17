import java.util.Random;

public class EmployeePresentOrAbsentUC1 {
    public static void main(String[] args){
        Random random = new Random();
        int rdm = random.nextInt(10);
        System.out.println(rdm);
        if(rdm>5) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
