package depoproje;

public class Urun {
    /*
	 * basit bir depo projesi
	 *
	 * Calisan bir fabrikada uygulanan bir sistem olan depo uygulamasidir.
	 *
	 * 1-) burada oncelikle urunun tanimlamasi  yapilir.
	 id
	 urunIsmi
	 uretici
	 miktar
	 birim ve
	 raf (6 adet fields mevcut)*/

    private int id=0;
    private String urunIsmi;
    private String uretici;
    private int miktar=0;
    private String birim;
    private String raf=null;


    public Urun(){

    }

    public Urun(int id, String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.id = id;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public String getBirim() {
        return birim;
    }

    public String getRaf() {
        return raf;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }
}





