import java.util.ArrayList;
import java.util.List;

public class MemberList{
	public List<Membership> listOfMember = createListOfMember();

    public List<Membership> createListOfMember(){
        listOfmembers = new ArrayList<>();

        Member[] memberBase = new Member[100];

        memberBase[0] = new Member("S0001", "TOM PARKER", "MALE", "010203020394", "Premium");
        memberBase[1] = new Member("S0002", "CHRIS DOWNEY", "MALE", "020182029382", "Basic");
        memberBase[2] = new Member("S0003", "LEE SANG HYEOK", "MALE", "010362754932", "Premium");
        memberBase[3] = new Member("S0004", "SABRINA CHNG", "FEMALE", "982719278372", "Premium");
        memberBase[4] = new Member("S0005", "EMMA WATSON", "FEMALE", "985467398432", "Premium");
        memberBase[5] = new Member("S0006", "BILL NEWTON", "MALE", "6217392837284", "Premium");
        memberBase[6] = new Member("S0007", "SERAPHINE", "FEMALE", "7456349438934", "Basic");
        memberBase[7] = new Member("S0008", "ALBERT HAWKING", "MALE", "65473628374", "Basic");
        memberBase[8] = new Member("S0009", "CYNTHIA ENG", "FEMALE", "876543675436", "Premium");
        memberBase[9] = new Member("S0010", "MOK YEN MEI", "FEMALE", "726362716362", "Basic");

        listOfmember.add(memberBase[0]);
        listOfmember.add(memberBase[1]);
        listOfmember.add(memberBase[2]);
        listOfmember.add(memberBase[3]);
        listOfmember.add(memberBase[4]);
        listOfmember.add(memberBase[5]);
        listOfmember.add(memberBase[6]);
        listOfmember.add(memberBase[7]);
        listOfmember.add(memberBase[8]);
        listOfmember.add(memberBase[9]);

        return listOfmember;
    }

    public List<member> getListOfStaff() {
        return new ArrayList<member>(listOfmembers);
    }
}