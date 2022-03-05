
package maze;


public class Oyuncu extends Karakter {
private int Skor;

    public Oyuncu(int ID, String Ad, String Tur, int x, int y,int skor) {
        super(ID, Ad, Tur, x, y);
        this.Skor=skor;
    }

    public Oyuncu() {
    }
    public void PuaniGoster(){
        System.out.println("Oyuncunun skoru : "+getSkor());
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor = Skor;
    }
    
    
}
