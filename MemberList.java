import java.util.ArrayList;
import java.util.List;

public class MemberList{
	public List<Membership> listOfMember = createListOfMember();

    public List<Membership> createListOfMember(){
        listOfMember = new ArrayList<>();

        Membership[] memberBase = new Membership[20];

        memberBase[0] = new Membership( "M0001","OOI ZHIA XION", "MALE", "011109025478", "Premium", "0127458412");
        memberBase[1] = new Membership( "M0002","KANG JIA JUN", "MALE", "020108029382", "Basic", "0134563658");
        memberBase[2] = new Membership( "M0003","DESMUND CHUNG", "MALE", "010801025485", "Premium", "0187516952");
        memberBase[3] = new Membership( "M0004","REYNA OOI", "FEMALE", "980309018372", "Premium", "0154782541");
        memberBase[4] = new Membership( "M0005","JASMINE OOI", "FEMALE", "985467398432", "Premium", "01152452512");
        memberBase[5] = new Membership( "M0006","GOH YU SHEN", "MALE", "010102020369", "Premium", "0125849652");
        memberBase[6] = new Membership( "M0007","RACHEL NG", "FEMALE", "010510020354", "Premium", "0195632548");
        memberBase[7] = new Membership( "M0008","SIAU ZI KANG", "MALE", "010806040278", "Basic", "01112548547");
        memberBase[8] = new Membership( "M0009","LEW WAN YEE", "FEMALE", "010626020660", "Premium", "0129654789");
        memberBase[9] = new Membership( "M0010","LOW YI HUI", "FEMALE", "010904020482", "Basic", "0123655847");

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