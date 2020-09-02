public class Membership {
	private String memberID;
	private String name;
	private String gender;
	private String memberIC;
	private String password;
	private String memberType; //Premium, Basic

	

    public Membership() {
    	
    }

    public Membership(String memberID, String name, String memberIC, String memberType){
    	this.memberID = memberID;
    	this.name = name;
    	this.memberIC = memberIC;
    	this.memberType = memberType;
    }
    
    public Membership(String memberID, String name, String gender, String memberIC, String memberType){
    	this.memberID = memberID;
    	this.name = name;
    	this.gender = gender;
    	this.memberIC = memberIC;
    	this.memberType = memberType;
    }
    
    public String getMemberID(){
    	return memberID;
    }
    
    public String getName(){
    	return name;
    }
    
    public String getGender(){
    	return gender;
    }
    
    public String getMemberIC(){
    	return memberIC;
    }
    
    public String getMemberType(){
    	return memberType;
    }
    
    public void setMemberID(String memberID){
    	this.memberID = memberID;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
    public void setGender(String gender){
    	this.gender = gender;
    }
    
    public void setMemberIC(String memberIC){
    	this.memberIC = memberIC;
    }
    
    public void setMemberType(String memberType){
    	this.memberType = memberType;
    }
    
    public String toString(){
    	return String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", memberID, name, gender, memberIC, memberType);
    }
    
    static String member[] = new String[100];
    
    public static void displayMember(){
    	
    }
    
    public static void addMember(){
    	
    }
    
    public static void modifyMember(){
    	
    }
    
    public static void searchMember(){
    	
    }
    
    
    
    
    
    
    
}