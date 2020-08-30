public class SalesPerson {
    private String id;
    private String name;
    private String gender;
    private double basicSalary;
    private double allowance;
    
    public SalesPerson(){
        
    }

    public SalesPerson(String id, String name, String gender,double basicSalary, double allowance){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public double getBasicSalary(){
        return basicSalary;
    }

    public double getAllowance(){
        return allowance;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public void setAllowance(double allowance){
        this.allowance = allowance;
    }

    public String toString(){
        return String.format("%s\t\t%s\t\t%s\t\t%.2f\t\t%.2f\n", id, name, gender, basicSalary, allowance);
    }

}