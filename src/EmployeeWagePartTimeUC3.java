import java.util.Random;

public class EmployeeWagePartTimeUC3 {
    public static void main(String[] args){
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHr = 20;
        int empHrs = 0;
        //computation
        Random random = new Random();
        int empCheck = random.nextInt(3);
        System.out.println(empCheck);
        if(isPartTime == empCheck) {
            empHrs = 4;
        }
        else if(isFullTime == empCheck) {
            empHrs = 8;
        }
        else{
            empHrs = 0;
        }
        int salary = (empHrs * empRatePerHr);
        System.out.println("Employee salary is:"+salary);
    }
}
