package felines;

import java.util.Arrays;

public class CatApp {
    public static void main(String[] args) {

        System.out.println("------------answer  2 ------------------------------------- ");

        Felis[] myF = new Felis[150];
        myF[0]=new PersianCat();
        myF[1]=new SiameseCat();
        myF[2]=new TurkishVanCat();
        myF[3]=new AndeanMountain();
        myF[4]=new NorwegianForestCat();
        myF[5]=new PersianCat();
        myF[6]=new PersianCat();

        System.out.println((Arrays.toString(myF)));




        System.out.println("------------answer  3 ------------------------------------- ");






        PersianCat pc = new PersianCat("pers",10,333, 543);
        SiameseCat sc = new SiameseCat("siam",15,333,543);

        System.out.println(pc.hashCode());
        System.out.println(sc.hashCode());
        System.out.println(pc.equals(sc));

        System.out.println("------------answer  4 ------------------------------------- ");

        //AndeanMountain is not counting


        AndeanMountain am = new AndeanMountain();
        AndeanMountain am2 = new AndeanMountain();
        AndeanMountain am3 = new AndeanMountain();
        AndeanMountain am4 = new AndeanMountain();
        AndeanMountain am5 = new AndeanMountain();
        AndeanMountain am6 = new AndeanMountain();


        System.out.println(Felis.getVaccitationCOunt());



        System.out.println("------------answer  BONUS ------------------------------------- ");


        PersianCat pc2 = new PersianCat("qdhgjk",25,-50, -80);
        System.out.println(pc2.getShelterNo());
        System.out.println(pc2.getBadgeNo());
        PersianCat pc3 = new PersianCat("hgqhhq",11,10000, 10000);
        System.out.println(pc3.getShelterNo());
        System.out.println(pc3.getBadgeNo());


    }

    }

