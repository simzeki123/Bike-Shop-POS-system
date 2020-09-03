import java.util.Scanner;

public class Membership {
	private String memberID;
	private String name;
	private String gender;
	private String memberIC;
	private String password;
	private String memberType; //Premium, Basic
	private String memberNo;

	

    public Membership() {
    	
    }
    
    public Membership(String name, String gender, String memberIC, String memberType, String memberNo){
    	this.name = name;
    	this.gender = gender;
    	this.memberIC = memberIC;
		this.memberType = memberType;
		this.memberNo = memberNo;
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
	
	public String getMemberNo(){
		return memberNo;
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
	
	public void setMemberNo(String memberNo){
		this.memberNo = memberNo;
	}

    public String toString(){
    	return String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\n", name, gender, memberIC, memberType, memberNo);
    }
    
    static Membership[] memberBase = new Membership[100];
    
    public static void displayMember(){
		MemberList memberBase = new MemberList();
		System.out.print("+=============================+\n");
        System.out.print("|      MEMBERSHIP DISPLAY      |\n");
        System.out.print("+=============================+\n");
        System.out.println("List of the Member: ");
        System.out.println("No.\tName\t\t\tGender\t\tIdentity No.\tMembership Type\tContact No.\n");
    }
    
    public static void addMember(){ //Add new member ot the record
		Scanner input = new Scanner(System.in);
		MemberList addMember = new MemberList();
		Membership member = new Membership();
		char cfm;
		int count =0;
		char cont;

		System.out.print("+==========================+\n");
        System.out.print("|       Add new Member     |\n");
        System.out.print("+==========================+\n");

		for (int i = 0; i < addMember.getListOfMember().size(); i++) {
            memberBase[i] = addMember.listOfMember.get(i);
            count++;
        }

		do{
			System.out.println("Please enter the customer name: "); //add the name of the customer
			member.setName(input.nextLine());
			for(int i=0; i < member.getName().length(); i++){
				while(!Character.isLetter(member.getName().charAt(i))){
					System.out.println("Invalid Name! Please try again!");
					System.out.println("Please enter the customer name: ");
					member.setName(input.nextLine());
				}
			}

			System.out.println("Please enter the gender of the customer (MALE/FEMALE): "); //insert the gender of the customer
			member.setGender(input.nextLine());
			while(!member.getGender().toUpperCase().equals("MALE")&&!member.getGender().toUpperCase().equals("FEMALE")){
				System.out.println("Invalid Gender! Please try again!");
				System.out.println("Please enter the customer gender (MALE/FEMALE): ");
				member.setGender(input.nextLine());
			}

			System.out.println("Please enter the customer's IC No. (Without '-'): "); //the IC No. of the customer
			member.setMemberIC(input.nextLine());

			System.out.println("Please enter the membership type of the customer (Premium, Deluxe, Basic): "); //the membership type of the customer
			member.setMemberType(input.nextLine());
			while(member.getMemberType().equals("Premium")&&!member.getMemberType().equals("Deluxe")&&!member.getMemberType().equals("Basic")){
				System.out.println("Invalid Input! Please enter again!");
				System.out.println("Please enter the membership type (Premium, Deluxe, Basic): ");
				member.setMemberType(input.nextLine());
			}

			System.out.println("Please enter the customer contact no. (Without '-'): ");
			member.setMemberNo(input.nextLine());

			input.nextLine();
			System.out.println("Confirm to add new Member? (Y/N): ");
			cfm  = input.nextLine().charAt(0);
			while(Character.toUpperCase(cfm)!= 'Y' && Character.toUpperCase(cfm)!= 'N'){
				System.out.println("Invalid Input! Please enter again!");
				System.out.println("Confirm to add new Member? (Y/N): ");
				cfm = input.nextLine().charAt(0);
			}

			if(Character.toUpperCase(cfm) == 'Y'){
				memberBase[count] = new Membership(member.getName(), member.getGender(), member.getMemberIC(), member.getMemberType(), member.getMemberNo());
				addMember.listOfMember.add(memberBase[count]);
			}

			//else

			System.out.println("Continue to add more member? (Y/N): ");
			cont = input.nextLine().charAt(0);
			while(Character.toUpperCase(cont)!= 'Y'&& Character.toUpperCase(cont)!='N'){
				System.out.println("Invalid Input! Please try again!");
				System.out.println("Continue to add more member? (Y/N): ");
				cont = input.nextLine().charAt(0);
			}
		}while(Character.toUpperCase(cont)=='Y');

		System.out.println("Member List");
        System.out.println("No.\tMember ID\tName\t\t\tGender\t\tIdentity No.\tMembership Type\t\tContact No.\n");
        for (int i = 0; i < addMember.getListOfMember().size(); i++) {
            System.out.println((i + 1) + "\t" + addMember.getListOfMember().get(i));
        }

    }
    
    public static void modifyMember(){ //Modify the present member record
		Scanner input = new Scanner(System.in);
		MemberList modifyMember = new MemberList();
		Membership member = new Membership();

		System.out.println("");
		System.out.println("");
		System.out.println("");

		//System.out.println("Please enter the member ID that you want to modify: "); //Using member ID to select
		

		System.out.println("Please enter the new member name: "); //get new changed name
		member.setName(input.nextLine());

		System.out.println("Please enter the new gender (MALE/FEMALE): "); //get new changed gender
		member.setGender(input.nextLine());

		System.out.println("Please enter the new member IC No.: "); //get new changed ic
		member.setMemberIC(input.nextLine());

		System.out.println("Please enter the new membership type (Premium, Deluxe, Basic): "); //get new changed membership type
		member.setMemberType(input.nextLine());

		System.out.println("Please enter the new contact no. (without '-'): ");
		member.setMemberNo(input.nextLine());
    }
    
    public static void searchMember(){
		Scanner input = new Scanner(System.in);
		MemberList searchMember = new MemberList();
		Membership member = new Membership();
		int choice = 0;

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Please enter the details that you want to search: ");
		choice = input.nextInt();

		switch(choice){
			case 1:
				System.out.println("Please enter the member ID: ");
				break;
				//get member ID
			case 2:
				System.out.println("Please enter the name: ");
				member.setName(input.nextLine());
				break;
			case 3:
				System.out.println("Please enter the gender (MALE/FEMALE): ");
				member.setGender(input.nextLine());
				break;
			case 4:
				System.out.println("Please enter the IC No.: ");
				member.setMemberIC(input.nextLine());
				break;
			case 5:
				System.out.println("Please enter the membership type (Premium, Deluxe, Basic): ");
				member.setMemberType(input.nextLine());
				break;
			case 6:
				System.out.println("Please enter the contact no. (without '-'): ");
				member.setMemberNo(input.nextLine());
				break;
		}
    }
    
    
    
    
    
    
    
}