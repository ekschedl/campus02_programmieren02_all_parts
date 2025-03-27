package ue3_Jandl;

public class FossilienKiste {
    Fossilien[] fossiliensKistecontents;

    public FossilienKiste() {
        this.fossiliensKistecontents = new Fossilien[10];
    }

    public  void legenFossilien(Fossilien fossil) {
        for (int i = 0; i < this.fossiliensKistecontents.length; i++) {
            if (fossiliensKistecontents[i] == null) {
                this.fossiliensKistecontents[i] = fossil;
                break;
            } else {
                System.out.println("Kiste ist voll");
            }
        }
    }

    public void ausgebenKisteFossilen() {
        for (Fossilien fossil : this.fossiliensKistecontents) {
            System.out.println(fossil);

        }
    }

}
