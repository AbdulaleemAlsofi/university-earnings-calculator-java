
package university;


public class Employee extends Person implements Info{
    
    private int salary;

    private int bonus;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    private int deduction;

    public int getDeduction() {
        return deduction;
    }

    public void setDeduction(int deduction) {
        this.deduction = deduction;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
     @Override
    public int getId() {
        return id;
    }
    @Override
    public void setId(int id) {
        this.id = id;
    }
     @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public double getEarning() {
        int Employee=salary+bonus+deduction;
	return Employee;
    }

    public Employee() {
    }

    public Employee(int salary, int bonus, int deduction) {
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }
    
    public void print() {
	
	System.out.println("Strudent id = "+this.id);
	System.out.println("Strudent name= "+this.name);
	System.out.println("Strudent Addrees= "+this.address);
	System.out.println("Employee salary= "+salary);
	System.out.println("Employee bonus= "+bonus);
	System.out.println("Employee deduction= "+deduction);
	System.out.println("Strudent Earning= "+getEarning());
}
    
}
