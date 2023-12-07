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
      raf (6 adet fields mevcut)

      *
      * 2-) methodlar olusturacagiz.
      * 		urunTanimlama 	==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.  (miktar 0) (raf null )
      *
      * 		urunListele 	==> tanimlanan urunler listelenecek. urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
             Printf

      *
      * 		urunGirisi 		==> giris yapmak istedigimiz urnunun id numarasi ile girecegiz.
      *
      * 		urunuRafaKoy 	==> listeden urunu sececegiz ve id numarasina gore urunu rafa koyacagiz.
      *
      *		urunCikisi 		==> listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda degisiklik yapilacak.
      *							urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.*/


     private int id = 0;
     private String urunIsmi;
     private String uretici;
     private int miktar = 0;
     private String birim;
     private String raf=null;

     public Urun(int id, String urunIsmi, String uretici, int miktar, String birim, String raf) {
         this.id = id;
         this.urunIsmi = urunIsmi;
         this.uretici = uretici;
         this.miktar = miktar;
         this.birim = birim;
         this.raf = raf;
     }
     public Urun(){
     }



     /*Getter kısmı*/
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


    /*Setter kısmı*/
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
}
