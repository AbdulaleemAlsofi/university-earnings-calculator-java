
package university;

public class University {

    public static void main(String[] args) {
        
        Student stu= new Student();
        Employee emp= new Employee();
        Teacher tea= new Teacher();
        
        System.out.println("******** Welcome ********");
        
        
        System.out.println("Employee Data");
        
        emp.setId(12345);
		emp.setName("Ali");
		emp.setAddress("Al-Awadi street");
		emp.setSalary(2500);
		emp.setBonus(10000);
		emp.setDeduction(500);
		emp.print();
                
                System.out.println("*******************************************************");
        
        
         System.out.println("Teacher Data");
        
         tea.setId(12345);
		tea.setName("Shoog");
		tea.setAddress("Al-Awadi street");
		tea.setSubject("Netowrk programming");
		tea.setNo_of_hours(5);
		tea.setHour_rate(2000);
		tea.print();
                
                System.out.println("*******************************************************");
                
                  System.out.println("Student Data");
		
		stu.setId(12345);
		stu.setName("Abdulaleem");
		stu.setAddress("Al-Awadi street");
		stu.setMajor("Cyber Securite");
		stu.setLevel(2);
		stu.setLivingSalary(100000);
		stu.print();
                
                System.out.println("******** End ********");
    }
    
}

// Eng.Abdulaleem Alsofi
