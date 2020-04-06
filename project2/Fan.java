package project2;

public class Fan extends Employees
{
    private String fantypeEmployees;
    private String fanvalueEmployees;
    private String fanfitEmployees;

    public Fan(String nameEmployees, String emailEmployees, String cpfEmployees, String salaryEmployees, String phoneEmployees, String fantypeEmployees, String fanvalueEmployees, String fanfitEmployees)
    {
        super(nameEmployees, emailEmployees, cpfEmployees, salaryEmployees, phoneEmployees);
        this.fantypeEmployees = fantypeEmployees;
        this.fanvalueEmployees = fanvalueEmployees;
        this.fanfitEmployees = fanfitEmployees;
    }
    public String getFantype()
    {
        return fantypeEmployees;
    }
    public void setFantype(String fantypeEmployees)
    {
        this.fantypeEmployees = fantypeEmployees;
    }
    public String getFanvalue()
    {
        return fanvalueEmployees;
    }
    public void setFanvalue(String fanvalueEmployees)
    {
        this.fanvalueEmployees = fanvalueEmployees;
    }

}