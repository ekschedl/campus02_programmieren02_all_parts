package ue3_Jandl;


public class BuecherBox {
    Buch[] buchBoxContents;


    public BuecherBox() {
        this.buchBoxContents = new Buch[10];
    }

    public void legenBuch(Buch buch) {
        for (int i = 0; i < this.buchBoxContents.length; i++) {
            if (this.buchBoxContents[i] == null) {
                this.buchBoxContents[i] = buch;
                break;
            } else {
                System.out.println("Box ist voll, bitte machen Sie eine neue");
            }
        }
    }

    public void printContents() {
        for(Buch buch :this.buchBoxContents) {
            System.out.println(buch);
        }
    }
}
