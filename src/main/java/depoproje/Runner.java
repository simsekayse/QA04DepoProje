package depoproje;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int secim;
        Depo depoKayit=new Depo();

        Urun ur1=new Urun(1,"Un","Hekimoglu",0,"Cuval","Raf1");
        Urun ur2=new Urun(2,"İrmik","Ankara",1,"Cuval","Raf2");
        Urun ur3=new Urun(3,"Mercimek","Yayla",1,"Cuval","Raf3");
        Urun ur4=new Urun(4,"Bulgur","Yayla",2,"Cuval","Raf3");
        Urun ur5=new Urun(5,"Kuru Fasulye","Yayla",3,"Cuval","Raf3");
        Urun ur6=new Urun(6,"Nohut","Yayla",5,"Cuval","Raf3");
        Urun ur7=new Urun(7,"Pirinç","Yayla",8,"Cuval","Raf3");
        Urun ur8=new Urun(8,"Makarna","Ankara",13,"Cuval","Raf3");
        Urun ur9=new Urun(9,"Şehriye","Filiz",21,"Cuval","Raf3");
        Urun ur10=new Urun(10,"Şeker","Balküpü",34,"Cuval","Raf4");

        depoKayit.urunEkle(ur1);
        depoKayit.urunEkle(ur2);
        depoKayit.urunEkle(ur3);
        depoKayit.urunEkle(ur4);
        depoKayit.urunEkle(ur5);
        depoKayit.urunEkle(ur6);
        depoKayit.urunEkle(ur7);
        depoKayit.urunEkle(ur8);
        depoKayit.urunEkle(ur9);
        depoKayit.urunEkle(ur10);

do {
    System.out.println("Depo yonetimimize hoşgeldiniz");
    System.out.println("Lutfen yapmak istediginiz islemi seciniz\n" +
                       "1.Urun Tanımlama\n" +
                       "2.Urun Listele\n"+
                       "3.Urun Girisi \n"+
                       "4.Urunu Rafa Koy\n"+
                        "5.Urun Cıkısı\n"+
            "6.Cıkıs");
    secim=scan.nextInt();
    switch (secim){
        case 1:
            //kod
            break;
        case 2:
            //kod
            break;
        case 3:
            //kod
            break;
        case 4:
            //kod
            break;
        case 5:
            //kod
            break;
        case 6:
            //kod
            break;
        default:
            System.out.println("yanlıs secım");
            break;
    }

}while (secim!=6);










    }
}
