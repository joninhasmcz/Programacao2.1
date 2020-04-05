package project2;

public class Driver extends Employees
{
    private String cnhEmployees;

    public Driver(String nameEmployees, String emailEmployees, String cpfEmployees, String salaryEmployees, String phoneEmployees, String cnhEmployees)
    {
        super(nameEmployees, emailEmployees, cpfEmployees, salaryEmployees, phoneEmployees);
        this.cnhEmployees = cnhEmployees;
    }
    public String getCnh()
    {
        return cnhEmployees;
    }
    public void setCnh(String cnhEmployees)
    {
        this.cnhEmployees = cnhEmployees;
    }

}