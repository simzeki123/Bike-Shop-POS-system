import java.util.ArrayList;
import java.util.List;

public class MemberList{
	public List<Membership> listOfMember = createListOfMember();

    public List<Membership> createListOfMember(){
        listOfMember = new ArrayList<>();

<<<<<<< HEAD
        Membership[] memberBase = new Membership[20];
=======
        Membership[] memberBase = new Membership[50];
>>>>>>> 66ded6f0c33ed9c9c671732a4f00c32189b728a7

        memberBase[0] = new Membership( "M0001","OOI ZHIA XION", "MALE", "011109025478", "Premium", "0127458412");
        memberBase[1] = new Membership( "M0002","KANG JIA JUN", "MALE", "020108029382", "Basic", "0134563658");
        memberBase[2] = new Membership( "M0003","LIEW PHING SHUIN", "MALE", "010801025485", "Premium", "0187516952");
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
<<<<<<< HEAD
=======
        listOfMember.add(memberBase[10]);
        listOfMember.add(memberBase[11]);
        listOfMember.add(memberBase[12]);
        listOfMember.add(memberBase[13]);
        listOfMember.add(memberBase[14]);
        listOfMember.add(memberBase[15]);
        listOfMember.add(memberBase[16]);
        listOfMember.add(memberBase[17]);
        listOfMember.add(memberBase[18]);
        listOfMember.add(memberBase[19]);
        listOfMember.add(memberBase[20]);
        listOfMember.add(memberBase[21]);
        listOfMember.add(memberBase[22]);
        listOfMember.add(memberBase[23]);
        listOfMember.add(memberBase[24]);
        listOfMember.add(memberBase[25]);
        listOfMember.add(memberBase[26]);
        listOfMember.add(memberBase[27]);
        listOfMember.add(memberBase[28]);
        listOfMember.add(memberBase[29]);
        listOfMember.add(memberBase[30]);
        listOfMember.add(memberBase[31]);
        listOfMember.add(memberBase[32]);
        listOfMember.add(memberBase[33]);
        listOfMember.add(memberBase[34]);
        listOfMember.add(memberBase[35]);
        listOfMember.add(memberBase[36]);
        listOfMember.add(memberBase[37]);
        listOfMember.add(memberBase[38]);
        listOfMember.add(memberBase[39]);
>>>>>>> 66ded6f0c33ed9c9c671732a4f00c32189b728a7


        return listOfMember;
    }

    public List<Membership> getListOfMember() {
        return new ArrayList<Membership>(listOfMember);
    }
}