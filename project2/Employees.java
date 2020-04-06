package project2;

public class Employees
{
    private String nameEmployees;
    private String emailEmployees;
    private String cpfEmployees;
    private String salaryEmployees;
    private String phoneEmployees;

    public Employees(String nameEmployees, String emailEmployees, String cpfEmployees, String salaryEmployees, String phoneEmployees)
    {
        this.nameEmployees = nameEmployees;
        this.emailEmployees = emailEmployees;
        this.cpfEmployees = cpfEmployees;
        this.salaryEmployees = salaryEmployees;
        this.phoneEmployees = phoneEmployees;
    }
    public String getName()
    {
        return nameEmployees;
    }
    public void setName(String nameEmployees)
    {
        this.nameEmployees = nameEmployees;
    }
    public String getEmail()
    {
        return emailEmployees;
    }
    public void setEmail(String emailEmployees)
    {
        this.emailEmployees = emailEmployees;
    }
    public String getCpf()
    {
        return cpfEmployees;
    }
    public void setCpf(String cpfEmployees)
    {
        this.cpfEmployees = cpfEmployees;
    }
    public String getSalary()
    {
        return salaryEmployees;
    }
    public void setSalary(String salaryEmployees)
    {
        this.salaryEmployees = salaryEmployees;
    }
    public String getPhone()
    {
        return phoneEmployees;
    }
    public void setPhone(String phoneEmployees)
    {
        this.phoneEmployees = phoneEmployees;
    }



}