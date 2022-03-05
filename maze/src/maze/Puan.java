
package maze;

public class Puan extends Oyuncu {
    private Oyuncu oyuncu;
		

	public Puan(Oyuncu oyuncu,int skor) {
		this.oyuncu = oyuncu;
		this.oyuncu.setSkor(skor);
	}

    @Override
    public void PuaniGoster() {
        super.PuaniGoster(); 
    }

    

}
