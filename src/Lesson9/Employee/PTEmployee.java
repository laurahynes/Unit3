package Lesson9.Employee;

public class PTEmployee extends Employee {
    
    public PTEmployee(){
        super();
    }

    @Override
    public double getPay() {
        totalPay += rate*hours;//adding to totalPay
        return hours * rate;
    }
    
}
