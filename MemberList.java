import java.util.ArrayList;
import java.util.List;

public class MemberList{
	public List<Membership> listOfMember = createListOfMember();

    public List<Membership> createListOfMember(){
        listOfMember = new ArrayList<>();

        Membership[] memberBase = new Membership[100];

        memberBase[0] = new Membership("S0001", "TOM PARKER", "MALE", "010203020394", "Premium");
        memberBase[1] = new Membership("S0002", "CHRIS DOWNEY", "MALE", "020182029382", "Basic");
        memberBase[2] = new Membership("S0003", "LEE SANG HYEOK", "MALE", "010362754932", "Premium");
        memberBase[3] = new Membership("S0004", "SABRINA CHNG", "FEMALE", "982719278372", "Premium");
        memberBase[4] = new Membership("S0005", "EMMA WATSON", "FEMALE", "985467398432", "Premium");
        memberBase[5] = new Membership("S0006", "BILL NEWTON", "MALE", "6217392837284", "Premium");
        memberBase[6] = new Membership("S0007", "SERAPHINE", "FEMALE", "7456349438934", "Basic");
        memberBase[7] = new Membership("S0008", "ALBERT HAWKING", "MALE", "65473628374", "Basic");
        memberBase[8] = new Membership("S0009", "CYNTHIA ENG", "FEMALE", "876543675436", "Premium");
        memberBase[9] = new Membership("S0010", "MOK YEN MEI", "FEMALE", "726362716362", "Basic");

        listOfMember.add(memberBase[0]);
        listOfMember.add(memberBase[1]);
        listOfMember.add(memberBase[2]);
        listOfMember.add(memberBase[3]);
        listOfMember.add(memberBase[4]);
        listOfMember.add(memberBase[5]);
        listOfMember.add(memberBase[6]);
        listOfMember.add(memberBase[7]);
        listOfMember.add(memberBase[8]);
        listOfMember.add(memberBase[9]);

        return listOfMember;
    }

    public List<Membership> getListOfStaff() {
        return new ArrayList<Membership>(listOfMember);
    }
}