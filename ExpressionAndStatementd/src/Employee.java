public class Employee {
    private int employeeID;
    private String employeeName;
    private String employeeDesignation;
    private String employeeCompany;

    public void setemployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public int getemployeeID(){
        return employeeID;
    }

    public String getemployeeName(){
        return employeeName;
    }

    public void setemployeeName(String employeeName){
        this.employeeName = employeeName;
    }

    public void setemployeeDesignation(String employeeDesignation){
        this.employeeDesignation = employeeDesignation;
    }

    public String getemployeeDesignation(){
        return employeeDesignation;
    }

    public void setemployeeCompany(String employeeCompany){
        this.employeeCompany = employeeCompany;
    }

    public String getemployeeCompany(){
        return employeeCompany;
    }

    public String makeString(){
        String str = "\n Emp. Id: "+getemployeeID()+"\n Emp. Name: "+getemployeeName()
                +"\n Designation: "+getemployeeDesignation()
                +"\n Company: "+getemployeeCompany()+"";
        return str;
    }

}
