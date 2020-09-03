import java.util.Scanner;

public class Membership {
	private String memberID;
	private String name;
	private String gender;
	private String memberIC;
	private String memberType; //Premium, Basic
	private String memberNo;

	

    public Membership() {
    	
    }
    
    public Membership(String memberID, String name, String gender, String memberIC, String memberType, String memberNo){
		this.memberID = memberID;
		this.name = name;
    	this.gender = gender;
    	this.memberIC = memberIC;
		this.memberType = memberType;
		this.memberNo = memberNo;
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
	
	public String getMemberNo(){
		return memberNo;
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
	
	public void setMemberNo(String memberNo){
		this.memberNo = memberNo;
	}

    public String toString(){
    	return String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", memberID, name, gender, memberIC, memberType, memberNo);
    }
    
    static Membership[] memberBase = new Membership[100];
    
    public static void displayMember(){
		MemberList memberBase = new MemberList();
		System.out.print("+=============================+\n");
        System.out.print("|      MEMBERSHIP DISPLAY      |\n");
        System.out.print("+=============================+\n");
        System.out.println("List of the Member: ");
		System.out.println("No.\tMember ID\t\tName\t\t\tGender\t\tIdentity No.\tMembership Type\tContact No.\n");
		for (int i = 0; i < memberBase.getListOfMember().size(); i++) {
            System.out.println((i + 1) + "\t" + memberBase.getListOfMember().get(i));
        }
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
			System.out.println("Please enter the member ID (Mxxxx): ");
			member.setMemberID(input.nextLine());
			for (int i = 0; i < member.getMemberID().length(); i++) {
                while(member.getMemberID().length() != 5 || member.getMemberID().charAt(0) != 'M' ||
                 !Character.isDigit(member.getMemberID().charAt(1)) || !Character.isDigit(member.getMemberID().charAt(2))
                || !Character.isDigit(member.getMemberID().charAt(3)) || !Character.isDigit(member.getMemberID().charAt(4))
                || member.getMemberID().contains(memberBase[i].getMemberID())){
                    System.out.print("Invalid Input! Please try again!!\n");
                    System.out.print("Please enter the member ID (Mxxxx): ");
                    member.setMemberID(input.nextLine());
                }
            }
			
			System.out.println("Please enter the customer name: "); //add the name of the customer
			member.setName(input.nextLine());
			for(int i=0; i < member.getName().length(); i++){
				while(!Character.isLetter(member.getName().charAt(i))){
					System.out.println("Invalid Name! Please try again!\n");
					System.out.println("Please enter the customer name: ");
					member.setName(input.nextLine());
				}
			}

			System.out.println("Please enter the gender of the customer (MALE/FEMALE): "); //insert the gender of the customer
			member.setGender(input.nextLine());
			while(!member.getGender().toUpperCase().equals("MALE")&&!member.getGender().toUpperCase().equals("FEMALE")){
				System.out.println("Invalid Gender! Please try again!\n");
				System.out.println("Please enter the customer gender (MALE/FEMALE): ");
				member.setGender(input.nextLine());
			}

			System.out.println("Please enter the customer's IC No. (Without '-'): "); //the IC No. of the customer
			member.setMemberIC(input.nextLine());
			for(int i=0; i<member.getMemberIC().length(); i++){
				while(member.getMemberIC().length()!= 12 || Character.isLetter(member.getMemberIC().charAt(i))){
					System.out.println("Invalid Input! Please try again!\n");
					System.out.println("Please enter the customer's IC No. (Without '-'): ");
					member.setMemberIC(input.nextLine());
				}
			}

			System.out.println("Please enter the membership type of the customer (Premium, Deluxe, Basic): "); //the membership type of the customer
			member.setMemberType(input.nextLine());
			while(member.getMemberType().equals("Premium")&&!member.getMemberType().equals("Deluxe")&&!member.getMemberType().equals("Basic")){
				System.out.println("Invalid Input! Please enter again!\n");
				System.out.println("Please enter the membership type (Premium, Deluxe, Basic): ");
				member.setMemberType(input.nextLine());
			}

			System.out.println("Please enter the customer contact no. (Without '-'): ");
			member.setMemberNo(input.nextLine());
			for(int i=0; i<member.getMemberNo().length(); i++){
				while(Character.isLetter(member.getMemberNo().charAt(i)) && (member.getMemberNo().length()!=10 || member.getMemberNo().length()!=11)){
					System.out.println("Invalid Phone Number! Please try again!\n");
					System.out.println("Please enter the customer contact no. (Without '-'): ");
					member.setMemberNo(input.nextLine());
				}
			}

			input.nextLine();
			System.out.println("Confirm to add new Member? (Y/N): ");
			cfm  = input.nextLine().charAt(0);
			while(Character.toUpperCase(cfm)!= 'Y' && Character.toUpperCase(cfm)!= 'N'){
				System.out.println("Invalid Input! Please enter again!\n");
				System.out.println("Confirm to add new Member? (Y/N): ");
				cfm = input.nextLine().charAt(0);
			}

			if(Character.toUpperCase(cfm) == 'Y'){
				memberBase[count] = new Membership(member.getMemberID(), member.getName(), member.getGender(), member.getMemberIC(), member.getMemberType(), member.getMemberNo());
				addMember.listOfMember.add(memberBase[count]);
			}

			//else

			System.out.println("Continue to add more member? (Y/N): ");
			cont = input.nextLine().charAt(0);
			while(Character.toUpperCase(cont)!= 'Y'&& Character.toUpperCase(cont)!='N'){
				System.out.println("Invalid Input! Please try again!\n");
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
		char cfm;
		char cont;
		int count =0;
		int choice;

		System.out.print("+=========================+\n");
        System.out.print("|       Modify Member     |\n");
        System.out.print("+=========================+\n");

		
		
		do{
			System.out.println("Member List ");
            System.out.println("No.\tMember ID\tName\t\tGender\t\tIdentity No.\tMembership Type\t\tContact No.\n");
            for (int i = 0; i < modifyMember.getListOfMember().size(); i++) {
                System.out.println((i + 1) + "\t" + modifyMember.getListOfMember().get(i));
			}

			System.out.print("Please select ther record number you want to modify: ");
            choice = input.nextInt();
            System.out.println("Member ID\tName\t\tGender\t\tIdentity No.\tMembership Type\t\tContact No.\n");
            System.out.print(modifyMember.getListOfMember().get(choice-1));
			input.nextLine();
			
			System.out.println("Please enter the new member name: "); //get new changed name
			member.setName(input.nextLine());
			for(int i=0; i<member.getName().length(); i++){
				while(!Character.isLetter(member.getName().charAt(i))){
					System.out.println("Invalid Name! Please enter again!\n");
					System.out.println("Please enter the new member name: ");
					member.setName(input.nextLine());
				}
			}

			System.out.println("Please enter the new gender (MALE/FEMALE): "); //get new changed gender
			member.setGender(input.nextLine());
			while(!member.getGender().toUpperCase().equals("MALE") && !member.getGender().toUpperCase().equals("FEMALE")){
				System.out.println("Invalid Input! Please enter again!\n");
				System.out.println("Please enter the new gender (MALE/FEMALE): ");
				member.setGender(input.nextLine());
			}

			System.out.println("Please enter the new member IC No. (Without '-'): "); //get new changed ic
			member.setMemberIC(input.nextLine());
			for(int i=0; i<member.getMemberIC().length(); i++){
				while(Character.isLetter(member.getMemberIC().charAt(i)) && member.getMemberIC().length() != 12){
					System.out.println("Invalid Input! Please enter again!\n");
					System.out.println("Please enter the new member IC No. (Without '-'): ");
					member.setMemberIC(input.nextLine());
				}
			}

			System.out.println("Please enter the new membership type (Premium, Deluxe, Basic): "); //get new changed membership type
			member.setMemberType(input.nextLine());
			while(member.getMemberType().equals("Premium")&&!member.getMemberType().equals("Deluxe")&&!member.getMemberType().equals("Basic")){
				System.out.println("Invalid Input! Please enter again!\n");
				System.out.println("Please enter the new membership type (Premium, Deluxe, Basic): ");
				member.setMemberType(input.nextLine());
			}

			System.out.println("Please enter the new contact no. (without '-'): ");
			member.setMemberNo(input.nextLine());
			for(int i=0; i<member.getMemberNo().length(); i++){
				while(Character.isLetter(member.getMemberNo().charAt(i)) && (member.getMemberNo().length()!=10 || member.getMemberNo().length()!=11)){
					System.out.println("Invalid Phone Number! Please try again!\n");
					System.out.println("Please enter the new contact no. (Without '-'): ");
					member.setMemberNo(input.nextLine());
				}
			}

			input.nextLine();
			System.out.println("Confirm to make changes to this record? (Y/N): ");
			cfm = input.nextLine().charAt(0);
			while(Character.toUpperCase(cfm)!='Y' && Character.toUpperCase(cfm)!='N');{
				System.out.println("Invalid Input! Please try again!\n");
				System.out.println("Confirm to make changes to this record? (Y/N): ");
				cfm = input.nextLine().charAt(0);
			}

			if(Character.toUpperCase(cfm)=='Y'){
				memberBase[count] = new Membership(member.getMemberID(), member.getName().toUpperCase(), member.getGender().toUpperCase(),
                 member.getMemberIC().toUpperCase(), member.getMemberType(), member.getMemberNo());
                modifyMember.listOfMember.set(count-1, memberBase[count]);
                System.out.println("No.\tMember ID\t\tName\t\tGender\t\tIdentity No.\t\tMembership Type\tContact No.\n");
                for (int i = 0; i < modifyMember.getListOfMember().size(); i++) {
                    System.out.println((i + 1) + "\t" + modifyMember.getListOfMember().get(i));
                }
			}

			System.out.print("Continue to modify more record? (Y/N): ");
            cont = input.nextLine().charAt(0);
            while (Character.toUpperCase(cont) != 'Y' && Character.toUpperCase(cont) != 'N') {
                System.out.print("Invalid input! Please try again!\n");
                System.out.print("Continue to modify more record? (Y/N): ");
                cont = input.nextLine().charAt(0);
            }

		}while(Character.toUpperCase(cont)=='Y');
    }
    
    public static void searchMember(){
		Scanner input = new Scanner(System.in);
		MemberList searchMember = new MemberList();
		Membership member = new Membership();
		int choice = 0;
		char cont;

		System.out.print("+=======================+\n");
        System.out.print("|     Search Member     |\n");
        System.out.print("+=======================+\n\n");

        for (int i = 0; i < searchMember.getListOfMember().size(); i++) {
            memberBase[i] = searchMember.listOfMember.get(i);
		}
		
		do{
			int count=0;
			System.out.print("+========================+\n");
            System.out.print("|   Search Detail        |\n");
            System.out.print("+========================+\n");
            System.out.print("| 1. Member ID           |\n");
            System.out.print("| 2. Member Name         |\n");
            System.out.print("| 3. Member Gender       |\n");
            System.out.print("| 4. Member IC No.       |\n");
            System.out.print("| 5. Member Contact No.  |\n");
            System.out.print("+========================+\n");
			System.out.println("Please enter the details that you want to search: ");
			choice = input.nextInt();
				while(choice<1||choice>5){
					System.out.println("Invalid Input! Please enter again!");
					System.out.println("Please enter the details that you want to search: ");
					choice = input.nextInt();
				}

			switch(choice){
				case 1:
					System.out.println("Please enter the member ID that you would like to search (Mxxxx): ");
					member.setMemberID(input.nextLine());
					for (int i = 0; i < member.getMemberID().length(); i++) {
						while(member.getMemberID().length() != 5 || member.getMemberID().charAt(0) != 'M' ||
						 !Character.isDigit(member.getMemberID().charAt(1)) || !Character.isDigit(member.getMemberID().charAt(2))
						|| !Character.isDigit(member.getMemberID().charAt(3)) || !Character.isDigit(member.getMemberID().charAt(4))
						|| member.getMemberID().contains(memberBase[i].getMemberID())){
							System.out.print("Invalid Input! Please try again!!\n");
							System.out.print("Please enter the member ID that you would like to search (Mxxxx): ");
							member.setMemberID(input.nextLine());
						}
					}
					System.out.println("Member ID\t\tName\t\tGender\t\tIdentity No.\t\tMembership Type\t\tContact No.");
                    for(int i = 0; i < searchMember.getListOfMember().size(); i++){
                        if(memberBase[i].getMemberID().toUpperCase().contains(member.getMemberID().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
					break;
					//get member ID

				case 2:
					System.out.println("Please enter the name that you would like to search: ");
					member.setName(input.nextLine());
					for(int i =0; i<member.getName().length(); i++){
						while(!Character.isLetter(member.getName().charAt(i))){
							System.out.println("Invalid Name! Please try again!\n");
							System.out.println("Please enter the name that you would like to search: ");
							member.setName(input.nextLine());
						}
					}
					System.out.println("Member ID\t\tName\t\tGender\t\tIdentity No.\t\tMembership Type\t\tContact No.");
                    for(int i = 0; i < searchMember.getListOfMember().size(); i++){
                        if(memberBase[i].getName().toUpperCase().contains(member.getName().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
					break;

				case 3:
					System.out.println("Please enter the gender of member that you would like to search (MALE/FEMALE): ");
					member.setGender(input.nextLine());
					while(!member.getGender().toUpperCase().equals("MALE") && member.getGender().toUpperCase().equals("FEMALE")){
						System.out.println("Invalid Input! Please try again!");
						System.out.println("Please enter the gender of member that you would like to search (MALE/FEMALE): ");
						member.setGender(input.nextLine());
					}
					System.out.println("Member ID\t\tName\t\tGender\t\tIdentity No.\t\tMembership Type\t\tContact No.");
                    for(int i = 0; i < searchMember.getListOfMember().size(); i++){
                        if(memberBase[i].getGender().toUpperCase().contains(member.getGender().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
                    System.out.printf("\n<** Total %d record founded **>\n", count);
					break;

				case 4:
					System.out.println("Please enter the IC No.: ");
					member.setMemberIC(input.nextLine());
					for(int i=0; i<member.getMemberIC().length(); i++){
						while(Character.isLetter(member.getMemberIC().charAt(i)) && member.getMemberIC().length() != 12){
							System.out.println("Invalid Input! Please enter again!");
							System.out.println("Please enter the new member IC No. (Without '-'): ");
							member.setMemberIC(input.nextLine());
						}
					}
					System.out.println("Member ID\t\tName\t\tGender\t\tIdentity No.\t\tMembership Type\t\tContact No.");
                    for(int i = 0; i < searchMember.getListOfMember().size(); i++){
                        if(memberBase[i].getMemberIC().toUpperCase().contains(member.getMemberIC().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
					break;

				case 5:
					System.out.println("Please enter the membership type (Premium, Deluxe, Basic): ");
					member.setMemberType(input.nextLine());
					while(member.getMemberType().equals("Premium")&&!member.getMemberType().equals("Deluxe")&&!member.getMemberType().equals("Basic")){
						System.out.println("Invalid Input! Please enter again!");
						System.out.println("Please enter the new membership type (Premium, Deluxe, Basic): ");
						member.setMemberType(input.nextLine());
					}
					System.out.println("Member ID\t\tName\t\tGender\t\tIdentity No.\t\tMembership Type\t\tContact No.");
                    for(int i = 0; i < searchMember.getListOfMember().size(); i++){
                        if(memberBase[i].getMemberType().toUpperCase().contains(member.getMemberType().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
					break;

				case 6:
					System.out.println("Please enter the contact no. (without '-'): ");
					member.setMemberNo(input.nextLine());
					for(int i=0; i<member.getMemberNo().length(); i++){
						while(Character.isLetter(member.getMemberNo().charAt(i)) && (member.getMemberNo().length()!=10 || member.getMemberNo().length()!=11)){
							System.out.println("Invalid Phone Number! Please try again!");
							System.out.println("Please enter the new contact no. (Without '-'): ");
							member.setMemberNo(input.nextLine());
						}
					}
					System.out.println("Member ID\t\tName\t\tGender\t\tIdentity No.\t\tMembership Type\t\tContact No.");
                    for(int i = 0; i < searchMember.getListOfMember().size(); i++){
                        if(memberBase[i].getMemberNo().toUpperCase().contains(member.getMemberNo().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
					break;

				default:

				}

				System.out.println("Would you like to search for the next member record? (Y/N): ");
				cont = input.nextLine().charAt(0);
				while(Character.toUpperCase(cont)!='Y'&& Character.toUpperCase(cont)!='N'){
					System.out.println("Invalid Input! Please try again!");
					System.out.println("Would you like to search for the next member record? (Y/N): ");
					cont =input.nextLine().charAt(0);
				}
		}while(Character.toUpperCase(cont)=='Y');
    }
}