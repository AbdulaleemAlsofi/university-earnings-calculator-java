
package university;


public class Student extends Person implements Info {
    
    private String major;

    private int level;

    private int LivingSalary;

    public int getLivingSalary() {
        return LivingSalary;
    }

    public void setLivingSalary(int LivingSalary) {
        this.LivingSalary = LivingSalary;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
        double Student = LivingSalary;
	return Student;
    }
     public Student(){
    }

    public Student(String major, int level, int LivingSalary) {
        this.major = major;
        this.level = level;
        this.LivingSalary = LivingSalary;
    }

  public void print() {
	
	System.out.println("Strudent id = "+this.id);
	System.out.println("Strudent name= "+this.name);
	System.out.println("Strudent Addrees= "+this.address);
	System.out.println("Strudent major= "+major);
	System.out.println("Strudent level= "+level);
	System.out.println("Strudent living salary= "+LivingSalary);
	System.out.println("Strudent Earning= "+getEarning());
}
}
