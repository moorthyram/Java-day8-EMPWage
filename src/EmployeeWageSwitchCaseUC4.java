import java.util.Random;

public class EmployeeWageSwitchCaseUC4 {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHr = 20;
    public static void main(String[] args){
        int empHrs = 0;
        int empWage = 0;
        //computation
        Random random = new Random();
        int empCheck = random.nextInt(3);
        System.out.println(empCheck);
        switch (empCheck) {
            case isFullTime:
                empHrs = 8;
                break;
            case isPartTime:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        empWage = (empHrs * empRatePerHr);
        System.out.println("Employee salary is:"+empWage);
    }

}
