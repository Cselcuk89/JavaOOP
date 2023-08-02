package javaOop;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extrahours){
        return baseSalary + (hourlyRate *extrahours);
    }
    public void setBaseSalary(int baseSalary){
        if (baseSalary<=0)
            throw new IllegalArgumentException("Base salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
    public void setHourlyRate(int hourlyRate){
        if (hourlyRate<=0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }
    public int getHourlyRate(){
        return hourlyRate;
    }
}
