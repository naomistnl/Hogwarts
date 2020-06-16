public class Person {
    private String empName;
    private String gender;
    private int birthdate;
    private String address;
    private String postcode;

    public Person(String newName, String newGender, int newBirthdate, String newAddress, String newPostcode) {
        //Constructor
        empName = newName;
        gender = newGender;
        birthdate = newBirthdate;
        address = newAddress;
        postcode = newPostcode;
    }

    //getters and setters

    public void setName(String empName) {
        this.empName = empName;
    }
    public String getEmpName() {
        return empName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }
    public Integer getBirthdate() {
        return birthdate;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public String getPostcode() {
        return postcode;
    }
}