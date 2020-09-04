import java.util.Scanner;
import java.util.InputMismatchException;

public class Membership {
	private String memberID;
	private String name;
	private String gender;
	private String memberIC;
	private String memberType; //Premium, Basic
	private String memberNo;
	int num;

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
	
	//Getters
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

	public int getNum(){
		return num;
	}

	//Setters
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

	public void setNum(int num){
		this.num = num;
	}

	//toString method
    public String toString(){
    	return String.format("%s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", memberID, name, gender, memberIC, memberType, memberNo);
    }
    
     Membership[] memberBase = new Membership[20];
	
	 //Display Membership method
	 //==========================================================================================================

    public void displayMember(){
		System.out.print("\t\t\t\t\t+=============================+\n");
        System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
        System.out.print("\t\t\t\t\t+=============================+\n");
        System.out.println("");
		System.out.println("No.\tMember ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
		for (int i = 0; i < MemberList.getListOfMember().size(); i++) {
            System.out.println((i + 1) + "\t" + MemberList.getListOfMember().get(i));
		}
		System.out.println("End of the display\n");
    }
	
	//Add new member record
	//===================================================================================================
	
    public void addMember(){ //Add new member ot the record
		Scanner input = new Scanner(System.in);
		Membership member = new Membership();
		char cfm;
		int count =0;
		char cont;

		System.out.print("+==========================+\n");
        System.out.print("|       Add new Member     |\n");
        System.out.print("+==========================+\n");

		for (int i = 0; i < MemberList.getListOfMember().size(); i++) {
            memberBase[i] = MemberList.listOfMember.get(i);
            count++;
        }

		do{
			System.out.println("");
			System.out.print("Please enter the member ID (Mxxxx): ");
			member.setMemberID(input.nextLine());
			for (int i = 0; i < member.getMemberID().length(); i++) {
                while(member.getMemberID().length() != 5 || member.getMemberID().charAt(0) != 'M' ||
                 !Character.isDigit(member.getMemberID().charAt(1)) || !Character.isDigit(member.getMemberID().charAt(2))
                || !Character.isDigit(member.getMemberID().charAt(3)) || !Character.isDigit(member.getMemberID().charAt(4))){
					System.out.print("Invalid Input! Please try again!!\n");
					System.out.println("");
                    System.out.print("Please enter the member ID (Mxxxx): ");
					member.setMemberID(input.nextLine());
                }
            }
			
			System.out.println("");
			System.out.print("Please enter the customer name: "); //add the name of the customer
			member.setName(input.nextLine());
			for(int i=0; i < member.getName().length(); i++){
				while(!Character.isLetter(member.getName().charAt(i))&&!Character.isWhitespace(member.getName().charAt(i))){
					System.out.println("Invalid Name! Please try again!\n");
					System.out.println("");
					System.out.print("Please enter the customer name: ");
					member.setName(input.nextLine());
				}
			}

			System.out.println("");
			System.out.print("Please enter the gender of the customer (MALE/FEMALE): "); //insert the gender of the customer
			member.setGender(input.nextLine());
			while(!member.getGender().toUpperCase().equals("MALE")&&!member.getGender().toUpperCase().equals("FEMALE")){
				System.out.println("Invalid Gender! Please try again!\n");
				System.out.println("");
				System.out.print("Please enter the customer gender (MALE/FEMALE): ");
				member.setGender(input.nextLine());
			}

			System.out.println("");
			System.out.print("Please enter the customer's IC No. (Without '-'): "); //the IC No. of the customer
			member.setMemberIC(input.nextLine());
			for(int i=0; i<member.getMemberIC().length(); i++){
				while(member.getMemberIC().length()!= 12 || Character.isLetter(member.getMemberIC().charAt(i))){
					System.out.println("Invalid Input! Please try again!\n");
					System.out.println("");
					System.out.print("Please enter the customer's IC No. (Without '-'): ");
					member.setMemberIC(input.nextLine());
				}
			}

			System.out.println("");
			System.out.print("Please enter the membership type of the customer (Premium, Basic): "); //the membership type of the customer
			member.setMemberType(input.nextLine());
			while(!member.getMemberType().equals("Premium") && !member.getMemberType().equals("Basic")){
				System.out.println("Invalid Input! Please enter again!\n");
				System.out.println("");
				System.out.print("Please enter the membership type (Premium, Basic): ");
				member.setMemberType(input.nextLine());
			}

			System.out.println("");
			System.out.print("Please enter the customer contact no. (Without '-'): "); //the contact no. of the customer
			member.setMemberNo(input.nextLine());
			for(int i=0; i<member.getMemberNo().length(); i++){
				while(Character.isLetter(member.getMemberNo().charAt(i)) || (member.getMemberNo().length()!=10 && member.getMemberNo().length()!=11)){
					System.out.println("Invalid Phone Number! Please try again!\n");
					System.out.println("");
					System.out.print("Please enter the customer contact no. (Without '-'): ");
					member.setMemberNo(input.nextLine());
				}
			}

			System.out.println("");
			System.out.print("Member ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
			System.out.println("" +member.getMemberID()+"\t\t   "+ member.getName() + "\t\t"+ member.getGender() +"\t\t" + member.getMemberIC() + "\t    " +member.getMemberType()+"\t\t"+member.getMemberNo());
			System.out.println("");
			System.out.print("Confirm to add new Member? (Y/N): ");
			cfm = input.nextLine().charAt(0);
			while(Character.toUpperCase(cfm)!= 'Y' && Character.toUpperCase(cfm)!= 'N'){
				System.out.println("Invalid Input! Please enter again!\n");
				System.out.println("");
				System.out.print("Confirm to add new Member? (Y/N): ");
				cfm = input.nextLine().charAt(0);
			}

			if(Character.toUpperCase(cfm) == 'Y'){
				memberBase[count] = new Membership(member.getMemberID(), member.getName(), member.getGender(), member.getMemberIC(), member.getMemberType(), member.getMemberNo());
				MemberList.listOfMember.add(memberBase[count]);
			}

			else{
				break;
			}

			System.out.print("Continue to add more member? (Y/N): ");
			cont = input.nextLine().charAt(0);
			while(Character.toUpperCase(cont)!= 'Y'&& Character.toUpperCase(cont)!='N'){
				System.out.println("Invalid Input! Please try again!\n");
				System.out.println("");
				System.out.print("Continue to add more member? (Y/N): ");
				cont = input.nextLine().charAt(0);
			}
		}while(Character.toUpperCase(cont)=='Y');

		System.out.println("");
		System.out.print("\t\t\t\t\t+=============================+\n");
        System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
        System.out.print("\t\t\t\t\t+=============================+\n");
        System.out.println("");
        System.out.println("No.\tMember ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
        for (int i = 0; i < MemberList.getListOfMember().size(); i++) {
            System.out.println((i + 1) + "\t" + MemberList.getListOfMember().get(i));
		}
		
		

    }
	
	//Modify Member record method
	//================================================================================================

    public void modifyMember(){ //Modify the present member record
		Scanner input = new Scanner(System.in);
		Membership member = new Membership();
		char cfm;
		char cont;
		int choice;

		System.out.print("+=========================+\n");
        System.out.print("|       Modify Member     |\n");
		System.out.print("+=========================+\n");	
		
		do{
			System.out.println("");
			System.out.println("Member List ");
            System.out.println("No.\tMember ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
            for (int i = 0; i < MemberList.getListOfMember().size(); i++) {
				System.out.println((i + 1) + "\t" + MemberList.getListOfMember().get(i));
			}

			System.out.println("");
			System.out.print("Please select the record number you want to modify: ");
			choice = input.nextInt();
			System.out.println();
			System.out.print("Member ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
            System.out.print(MemberList.getListOfMember().get(choice-1));
			input.nextLine();
			
			System.out.println("");
			System.out.print("Please enter the member ID (Mxxxx): "); //get new member ID
			member.setMemberID(input.nextLine());
			for (int i = 0; i < member.getMemberID().length(); i++) {
                while(member.getMemberID().length() != 5 || member.getMemberID().charAt(0) != 'M' ||
                 !Character.isDigit(member.getMemberID().charAt(1)) || !Character.isDigit(member.getMemberID().charAt(2))
                || !Character.isDigit(member.getMemberID().charAt(3)) || !Character.isDigit(member.getMemberID().charAt(4))){
					System.out.print("Invalid Input! Please try again!!\n");
					System.out.println("");
                    System.out.print("Please enter the member ID (Mxxxx): ");
					member.setMemberID(input.nextLine());
                }
            }

			System.out.println("");
			System.out.print("Please enter the new member name: "); //get new changed name
			member.setName(input.nextLine());
			for(int i=0; i<member.getName().length(); i++){
				while(!Character.isLetter(member.getName().charAt(i))&&!Character.isWhitespace(member.getName().charAt(i))){
					System.out.println("Invalid Name! Please enter again!\n");
					System.out.println("");
					System.out.print("Please enter the new member name: ");
					member.setName(input.nextLine());
				}
			}

			System.out.println("");
			System.out.print("Please enter the new gender (MALE/FEMALE): "); //get new changed gender
			member.setGender(input.nextLine());
			while(!member.getGender().toUpperCase().equals("MALE") && !member.getGender().toUpperCase().equals("FEMALE")){
				System.out.println("Invalid Input! Please enter again!\n");
				System.out.println("");
				System.out.print("Please enter the new gender (MALE/FEMALE): ");
				member.setGender(input.nextLine());
			}

			System.out.println("");
			System.out.print("Please enter the new member IC No. (Without '-'): "); //get new changed ic
			member.setMemberIC(input.nextLine());
			for(int i=0; i<member.getMemberIC().length(); i++){
				while(Character.isLetter(member.getMemberIC().charAt(i)) || member.getMemberIC().length() != 12){
					System.out.println("Invalid Input! Please enter again!\n");
					System.out.println("");
					System.out.print("Please enter the new member IC No. (Without '-'): ");
					member.setMemberIC(input.nextLine());
				}
			}

			System.out.println("");
			System.out.print("Please enter the new membership type (Premium, Basic): "); //get new changed membership type
			member.setMemberType(input.nextLine());
			while(!member.getMemberType().equals("Premium") && !member.getMemberType().equals("Basic")){
				System.out.println("Invalid Input! Please enter again!\n");
				System.out.println("");
				System.out.print("Please enter the new membership type (Premium, Basic): ");
				member.setMemberType(input.nextLine());
			}

			System.out.println("");
			System.out.print("Please enter the new contact no. (without '-'): ");
			member.setMemberNo(input.nextLine());
			for(int i=0; i<member.getMemberNo().length(); i++){
				while(Character.isLetter(member.getMemberNo().charAt(i)) && (member.getMemberNo().length()!=10 && member.getMemberNo().length()!=11)){
					System.out.println("Invalid Phone Number! Please try again!\n");
					System.out.println("");
					System.out.print("Please enter the new contact no. (Without '-'): ");
					member.setMemberNo(input.nextLine());
				}
			}

			System.out.println("");
			System.out.print("Confirm to make changes to this record? (Y/N): ");
			cfm = input.nextLine().charAt(0);
			while(Character.toUpperCase(cfm)!='Y' && Character.toUpperCase(cfm)!='N'){
				System.out.println("Invalid Input! Please try again!\n");
				System.out.println("");
				System.out.print("Confirm to make changes to this record? (Y/N): ");
				cfm = input.nextLine().charAt(0);
			}

			if(Character.toUpperCase(cfm)=='Y'){
				 memberBase[choice] = new Membership(member.getMemberID(), member.getName().toUpperCase(), member.getGender().toUpperCase(),
                 member.getMemberIC().toUpperCase(), member.getMemberType(), member.getMemberNo());
				 MemberList.listOfMember.set(choice-1, memberBase[choice]);

				 System.out.println("");
				 System.out.print("\t\t\t\t\t+=============================+\n");
        		System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
        		System.out.print("\t\t\t\t\t+=============================+\n");
        		System.out.println("");
				 System.out.println("No.\tMember ID\t\tName\t\tGender\t\tIdentity No.\t\tMembership Type\tContact No.\n");
				for (int i = 0; i < MemberList.getListOfMember().size(); i++) {
                    System.out.println((i + 1) + "\t" + MemberList.getListOfMember().get(i));
                }
			}

			System.out.print("Continue to modify more record? (Y/N): ");
            cont = input.nextLine().charAt(0);
            while (Character.toUpperCase(cont) != 'Y' && Character.toUpperCase(cont) != 'N') {
				System.out.print("Invalid input! Please try again!\n");
				System.out.println("");
                System.out.print("Continue to modify more record? (Y/N): ");
                cont = input.nextLine().charAt(0);
			}
		}while(Character.toUpperCase(cont)=='Y');

		
    }
	
	//Search member method
	//===================================================================================

    public void searchMember(){ //Search for the existing member record
		Scanner input = new Scanner(System.in);
		Membership member = new Membership();
		int choice = 0;
		char cont;

		System.out.print("+=======================+\n");
        System.out.print("|     Search Member     |\n");
        System.out.print("+=======================+\n\n");

        for (int i = 0; i < MemberList.getListOfMember().size(); i++) {
            memberBase[i] = MemberList.listOfMember.get(i);
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
			System.out.print("| 5. Membership Type     |\n");
			System.out.print("| 6. Member Contact No.  |\n");
			System.out.print("+========================+\n");
			System.out.println("");
			System.out.print("Please select the details that you want to search: ");
			choice = input.nextInt();
				while(choice<1||choice>6){
					System.out.println("Invalid Input! Please enter again!");
					System.out.println("");
					System.out.print("Please select the details that you want to search: ");
					choice = input.nextInt();	
				}
				input.nextLine();

			switch(choice){ //Switch case for the user search choice
				case 1: //Searching from member ID
					System.out.println("");
					System.out.print("Please enter the member ID that you would like to search (Mxxxx): ");
					member.setMemberID(input.nextLine());
					for (int i = 0; i < member.getMemberID().length(); i++) {
						while(member.getMemberID().length() != 5 || member.getMemberID().charAt(0) != 'M' ||
						 !Character.isDigit(member.getMemberID().charAt(1)) || !Character.isDigit(member.getMemberID().charAt(2))
						|| !Character.isDigit(member.getMemberID().charAt(3)) || !Character.isDigit(member.getMemberID().charAt(4))){
							System.out.print("Invalid Input! Please try again!!\n");
							System.out.println("");
							System.out.print("Please enter the member ID that you would like to search (Mxxxx): ");
							member.setMemberID(input.nextLine());
						}
					}
					System.out.println();
					System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
        			System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.println("");
					System.out.print("Member ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
                    for(int i = 0; i < MemberList.getListOfMember().size(); i++){
                        if(memberBase[i].getMemberID().toUpperCase().contains(member.getMemberID().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
					System.out.printf("\n<** Total %d record founded **>\n", count);
					System.out.println("");
					break;
					

				case 2: //Searching from member name
					System.out.println("");
					System.out.print("Please enter the name that you would like to search: ");
					member.setName(input.nextLine());
					for(int i =0; i<member.getName().length(); i++){
						while(!Character.isLetter(member.getName().charAt(i))&&!Character.isWhitespace(member.getName().charAt(i))){
							System.out.println("Looks like we didn't have the name record, please try again!\n");
							System.out.println("");
							System.out.print("Please enter the name that you would like to search: ");
							member.setName(input.nextLine());
						}
					}
					System.out.println();
					System.out.print("\t\t\t\t\t+=============================+\n");
       				 System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
       				 System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.println("");
					System.out.print("Member ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
                    for(int i = 0; i < MemberList.getListOfMember().size(); i++){
                        if(memberBase[i].getName().toUpperCase().contains(member.getName().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
					System.out.printf("\n<** Total %d record founded **>\n", count);
					System.out.println("");
					break;

				case 3: // Searching from the gender of the member
					System.out.println("");
					System.out.print("Please enter the gender of member that you would like to search (MALE/FEMALE): ");
					member.setGender(input.nextLine());
					while(!member.getGender().toUpperCase().equals("MALE") && !member.getGender().toUpperCase().equals("FEMALE")){
						System.out.println("Invalid Input! Please try again!");
						System.out.println("");
						System.out.print("Please enter the gender of member that you would like to search (MALE/FEMALE): ");
						member.setGender(input.nextLine());
					}
					System.out.println();
					System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
        			System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.println("");
					System.out.print("Member ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
                    for(int i = 0; i < MemberList.getListOfMember().size(); i++){
                        if(memberBase[i].getGender().toUpperCase().contains(member.getGender().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
                    }
					System.out.printf("\n<** Total %d record founded **>\n", count);
					System.out.println("");
					break;

				case 4: //Searching from the Identity Card No. of the member
					System.out.println("");
					System.out.print("Please enter the IC No.: ");
					member.setMemberIC(input.nextLine());
					for(int i=0; i<member.getMemberIC().length(); i++){
						while(Character.isLetter(member.getMemberIC().charAt(i)) && member.getMemberIC().length() != 12){
							System.out.println("Invalid Input! Please enter again!");
							System.out.println("");
							System.out.print("Please enter the new member IC No. (Without '-'): ");
							member.setMemberIC(input.nextLine());
						}
					}
					System.out.println();
					System.out.print("\t\t\t\t\t+=============================+\n");
       				 System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
       				 System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.println("");
					System.out.print("Member ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
                    for(int i = 0; i < MemberList.getListOfMember().size(); i++){
                        if(memberBase[i].getMemberIC().toUpperCase().contains(member.getMemberIC().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
					}
					System.out.printf("\n<** Total %d record founded **>\n", count);
					System.out.println("");
					break;

				case 5: //Searching from the membership type of the member
					System.out.println("");
					System.out.print("Please enter the membership type (Premium, Basic): ");
					member.setMemberType(input.nextLine());
					while(!member.getMemberType().equals("Premium") && !member.getMemberType().equals("Basic")){
						System.out.println("Invalid Input! Please enter again!");
						System.out.println("");
						System.out.print("Please enter the new membership type (Premium, Basic): ");
						member.setMemberType(input.nextLine());
					}
					System.out.println("");
					System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
        			System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.println("");
					System.out.print("Member ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
                    for(int i = 0; i < MemberList.getListOfMember().size(); i++){
                        if(memberBase[i].getMemberType().toUpperCase().contains(member.getMemberType().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
					}
					System.out.printf("\n<** Total %d record founded **>\n", count);
					System.out.println("");
					break;

				case 6: //Searching from the contact.no of the member
					System.out.println("");
					System.out.print("Please enter the contact no. (without '-'): ");
					member.setMemberNo(input.nextLine());
					for(int i=0; i<member.getMemberNo().length(); i++){
						while(Character.isLetter(member.getMemberNo().charAt(i)) && (member.getMemberNo().length()!=10 || member.getMemberNo().length()!=11)){
							System.out.println("Invalid Phone Number! Please try again!");
							System.out.println("");
							System.out.print("Please enter the contact no. (Without '-'): ");
							member.setMemberNo(input.nextLine());
						}
					}
					System.out.println("");
					System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.print("\t\t\t\t\t|      MEMBERSHIP DISPLAY     |\n");
        			System.out.print("\t\t\t\t\t+=============================+\n");
        			System.out.println("");
					System.out.print("Member ID\t   Name\t\t\tGender\t\tIdentity No.\t    Membership Type\tContact No.\n");
                    for(int i = 0; i < MemberList.getListOfMember().size(); i++){
                        if(memberBase[i].getMemberNo().toUpperCase().contains(member.getMemberNo().toUpperCase())) {
                            System.out.print(memberBase[i]);
                            count++;
                        }
					}
					System.out.printf("\n<** Total %d record founded **>\n", count);
					System.out.println("");
					break;

				default:

				}

				System.out.print("Would you like to search for the next member record? (Y/N): ");
				cont = input.nextLine().charAt(0);
				while(Character.toUpperCase(cont)!='Y'&& Character.toUpperCase(cont)!='N'){
					System.out.println("Invalid Input! Please try again!");
					System.out.println("");
					System.out.print("Would you like to search for the next member record? (Y/N): ");
					cont =input.nextLine().charAt(0);
				}
				System.out.println("");
		}while(Character.toUpperCase(cont)=='Y');

		
	}
	
	//Main method
	//==============================================================================================
	public void member()
	{
		Scanner input = new Scanner(System.in);
		int choice =0;
		char cont;
		
			do{
				System.out.print("+============================+\n");
        		System.out.print("|          MEMBERSHIP        |\n");
        		System.out.print("+============================+\n");
        		System.out.print("| 1. Display Member List     |\n");
        		System.out.print("| 2. Add New Member          |\n");
    			System.out.print("| 3. Modify Existing Member  |\n");
				System.out.print("| 4. Search Member Record    |\n");
				System.out.print("| 5. Exit                    |\n");
				System.out.print("+============================+\n");
				System.out.println("");
				System.out.print("Please select what would you like to do: ");
				
				do{
					try {
						choice = input.nextInt();
					} catch (InputMismatchException e) {
						input.nextLine();
						System.out.println("Something went wrong\n");
						System.out.println("Please enter an integer\n");
					}
				}while(choice<1&&choice>5);

				System.out.println("");

				Membership member = new Membership();

				switch(choice){
					case 1: member.displayMember();
					break;
					
					case 2:member.addMember();
					break;

					case 3:member.modifyMember();
					break;

					case 4:member.searchMember();
					break;

<<<<<<< HEAD
					case 5:System.out.print("System Exiting....");
							System.out.print("Try us again next time!");
					System.exit(0);
=======
					case 5:
					return;
>>>>>>> 3a921a5e96de9bea176b796c5b9904c152c69b62

					default:
					System.out.println("Something went wrong\n");
				}
				
				input.nextLine();
				System.out.print("Would you like to continue? (Y/N): ");
				cont = input.nextLine().charAt(0);
				while(Character.toUpperCase(cont)!='Y'&& Character.toUpperCase(cont)!='N'){
					System.out.println("Invalid Input! Please try again!");
					System.out.println("");
					System.out.print("Would you like to continue? (Y/N): ");
					System.out.println("");
					cont =input.nextLine().charAt(0);
				}
			}while(Character.toUpperCase(cont)=='Y');
			
			
	}
}
