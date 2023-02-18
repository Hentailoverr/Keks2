public class Keks {
    static char dlr = '$';
    static char gr = 'g';

    public static void main(String[] args) {

        KksSize keks1 = new KksSize();
        KksSize keks2 = new KksSize();
        keks1.setName("cheliki");
        keks2.setName("penissy");
        keks1.setCst(22);
        keks2.setCst(15);
        keks1.setWgt(10);
        keks2.setWgt(12);
        System.out.println("Keks number one:" + " " + keks1.getName());
        System.out.println("Weight:" + " " + keks1.getWgt() + gr);
        System.out.println("Price:" + " " + keks1.getCst() + dlr);
        System.out.println("Keks number two:" + " " + keks2.getName());
        System.out.println("Weight:" + " " + keks2.getWgt() + gr);
        System.out.println("Price:" + " " + keks2.getCst() + dlr);
        int sum = Math.addExact(keks1.getCst(), keks2.getCst());
        System.out.println("Your total:" + " " + sum + dlr);
    }

}
