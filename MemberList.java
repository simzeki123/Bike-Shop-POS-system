import java.util.ArrayList;
import java.util.List;

public class MemberList{
	public List<Membership> listOfMember = createListOfMember();

    public List<Membership> createListOfMember(){
        listOfMember = new ArrayList<>();

        Membership[] memberBase = new Membership[20];
        

        memberBase[0] = new Membership("M0001", "JORDANNA PETERS", "MALE", "010203020395", "Premium");
        memberBase[1] = new Membership("M0002", "AZAAN FRENCH", "MALE", "020125029381", "Basic");
        memberBase[2] = new Membership("M0003", "ANEURIN HEWITT", "FEMALE", "010320114932", "Premium");
        memberBase[3] = new Membership("M0004", "DIANE BULLOCK", "FEMALE", "920806148372", "Premium");
        memberBase[4] = new Membership("M0005", "HERBERT BLACK", "MALE", "980531094435", "Premium");
        memberBase[5] = new Membership("M0006", "ZAINAB HODGE", "MALE", "011231067287", "Premium");
        memberBase[6] = new Membership("M0007", "AYUSH MOONEY", "FEMALE", "740404048934", "Basic");
        memberBase[7] = new Membership("M0008", "THIAGO BROCK", "MALE", "750819028373", "Basic");
        memberBase[8] = new Membership("M0009", "GEORGA JIMENEZ", "FEMALE", "871220015436", "Premium");
        memberBase[9] = new Membership("M0010", "CELIA NICHOLSON", "FEMALE", "991108074564", "Basic");

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