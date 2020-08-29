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

}