
package university;


public class Teacher extends Person implements Info{
    
    private String subject;
  
    private int no_of_hours;
  
    private int hour_rate;

    public int getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(int hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getNo_of_hours() {
        return no_of_hours;
    }

    public void setNo_of_hours(int no_of_hours) {
        this.no_of_hours = no_of_hours;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
        int student=no_of_hours*hour_rate;
	return student;
    }

    public Teacher() {
    }

    public Teacher(String subject, int no_of_hours, int hour_rate) {
        this.subject = subject;
        this.no_of_hours = no_of_hours;
        this.hour_rate = hour_rate;
    }
    
    
public void print() {
	
	System.out.println("Strudent id = "+this.id);
	System.out.println("Strudent name= "+this.name);
	System.out.println("Strudent Addrees= "+this.address);
	System.out.println("Teacher subject     = "+subject);
	System.out.println("Teacher no_of_hours = "+no_of_hours);
	System.out.println("Teacher hour_rate   = "+hour_rate);
	System.out.println("Strudent Earning= "+getEarning());
}
    
}
