package interfejsy;

public class DworzecMcDonaldImpl implements McDonald {

    @Override
    public void poproszeFrytki(double kwota) {
        System.out.println("Frytki");
    }

    @Override
    public void poproszeMcFlury(double kwota) {
        System.out.println("McFlury");
    }

    private void poproszeWrzatek(){
        System.out.println("Wrzątek");
    }
}
