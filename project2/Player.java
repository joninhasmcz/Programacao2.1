package project2;

public class Player extends Employees
{
    private String typeEmployees;
    private String fitEmployees;

    public Player(String nameEmployees, String emailEmployees, String cpfEmployees, String salaryEmployees, String phoneEmployees, String typeEmployees, String fitEmployees)
    {
        super(nameEmployees, emailEmployees, cpfEmployees, salaryEmployees, phoneEmployees);
        this.typeEmployees = typeEmployees;
        this.fitEmployees = fitEmployees;
    }
    public String getType()
    {
        return typeEmployees;
    }
    public void setType(String typeEmployees)
    {
        this.typeEmployees = typeEmployees;
    }
    public String getFit()
    {
        return fitEmployees;
    }
    public void setFit(String fitEmployees)
    {
        this.fitEmployees = fitEmployees
    }
}