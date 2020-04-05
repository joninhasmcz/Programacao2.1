package project2;

public class Doctor extends Employees
{
    private String crmEmployees;

    public Doctor(String nameEmployees, String emailEmployees, String cpfEmployees, String salaryEmployees, String phoneEmployees, String crmEmployees)
    {
        super(nameEmployees, emailEmployees, cpfEmployees, salaryEmployees, phoneEmployees);
        this.crmEmployees = crmEmployees;
    }
    public String getCrm()
    {
        return crmEmployees;
    }
    public void setCrm(String crmEmployees)
    {
        this.crmEmployees = crmEmployees;
    }

}