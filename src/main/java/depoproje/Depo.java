package depoproje;

import java.util.ArrayList;
import java.util.List;

public class Depo {
     /*
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
	 *							urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.
	 * 		===> yaptigimiz tum degisiklikler listede de gorunsun.
            *
            *
            * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
             * 		or: 1000	 un 	hekimoglu	0 			cuval 		null
            *
            * 		urunGirisi		==> id:1000  urun girisi :5
            * 		urunListele 	==>
            *
            * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
             * 		or: 1000	 un 	hekimoglu	5 			cuval 		null
            *
            * 		urunuRafaKoy 	==> id:1000 raf : raf1
	 * 		urunListele 	==>
            * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
             * 		or: 1000	 un 	hekimoglu	5 			cuval 		raf1
	 *
             * 		urunCikisi 		==> id 1000: urun cikis : 3 (kalan 2 cuval un)
            * 		urunListele 	==>
            * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
             * 		or: 1000	 un 	hekimoglu	2 			cuval 		raf1
	 *
             *
             */

    private List<Urun> urunList=new ArrayList<>();

    public Depo(){
        this.urunList=new ArrayList<>();
    }

    public void urunEkle(Urun urun){
        urunList.add(urun);
    }






}
