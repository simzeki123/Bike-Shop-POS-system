import java.util.ArrayList;
import java.util.List;

public class MemberList{
	public List<Membership> listOfMember = createListOfMember();

    public List<Membership> createListOfMember(){
        listOfMember = new ArrayList<>();

        Membership[] memberBase = new Membership[100];

        memberBase[0] = new Membership( "TOM PARKER", "MALE", "010203020394", "Premium", "0127458412");
        memberBase[1] = new Membership( "CHRIS DOWNEY", "MALE", "020182029382", "Basic", "");
        memberBase[2] = new Membership( "LEE SANG HYEOK", "MALE", "010362754932", "Premium", "");
        memberBase[3] = new Membership( "SABRINA CHNG", "FEMALE", "982719278372", "Premium", "");
        memberBase[4] = new Membership( "EMMA WATSON", "FEMALE", "985467398432", "Premium", "");
        memberBase[5] = new Membership( "BILL NEWTON", "MALE", "6217392837284", "Premium", "");
        memberBase[6] = new Membership( "SERAPHINE", "FEMALE", "7456349438934", "Basic", "");
        memberBase[7] = new Membership( "ALBERT HAWKING", "MALE", "65473628374", "Basic", "");
        memberBase[8] = new Membership( "CYNTHIA ENG", "FEMALE", "876543675436", "Premium", "");
        memberBase[9] = new Membership( "MOK YEN MEI", "FEMALE", "726362716362", "Basic", "");

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

    public List<Membership> getListOfMember() {
        return new ArrayList<Membership>(listOfMember);
    }
}