public class Membership {
	private String memberID;
	private String name;
	private char gender;
	private String memberIC;
	private String password;
	private String memberType; //Premium, Basic

	

    public Membership() {
    	
    }
    
    public Membership(String memberID, String name, char gender, String memberIC, String password){
    	this.memberID = memberID;
    	this.name = name;
    	this.gender = gender;
    	this.memberIC = memberIC;
    	this.password = password;
    }
    
    public String getMemberID(){
    	return memberID;
    }
    
    public String getName(){
    	return name;
    }
    
    public char getGender(){
    	return gender;
    }
    
    public String getMemberIC(){
    	return memberIC;
    }
    
    public String getPassword(){
    	return password;
    }
}
