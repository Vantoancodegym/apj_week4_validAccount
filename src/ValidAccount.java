public class ValidAccount {
    public static void main(String[] args) {
        String regex="^[A-Z][_a-z0-9]{5,}[n]$";
        String acount1="toan";
        String acount2="";
        String acount3="Vantoan";
        String acount4="vantoanEFR";
        System.out.println(acount1.matches(regex));
        System.out.println(acount2.matches(regex));
        System.out.println(acount3.matches(regex));
        System.out.println(acount4.matches(regex));
    }
}
