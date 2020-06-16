public class Employee extends Person{
    private int empNo;
    private String dept;
    private int startdate;
    private int salary;
    private String email;

    public Employee(String name, String gender, Integer birthdate, String address, String postcode,
                    int empNo, String dept, int startdate, int salary, String email)
    {
        //super constructor calls the objects from the parent class
        super(name, gender, birthdate, address, postcode);
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }
}
