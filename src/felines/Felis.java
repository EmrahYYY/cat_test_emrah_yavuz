package felines;

import java.util.Objects;

public class  Felis extends Animal {
    private static int vaccitationCOunt;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;

    { if (isAlive()==true)
        vaccitationCOunt++;
    }



    public void miauw() {

    }

    public void miauw(int times) {
    }

    public static int getVaccitationCOunt() {
        return vaccitationCOunt ;

    }


    public void setShelterNo(int shelterNo) {
        this.shelterNo = shelterNo;
        if (shelterNo<0 || shelterNo>999) {
            System.out.println("invalid value");
            this.shelterNo=0;
        } else {this.shelterNo=shelterNo; }
    }

    public void setBadgeNo(int badgeNo) {
        this.badgeNo = badgeNo;
        if (badgeNo<0 ||badgeNo >999) {
            System.out.println("invalid value");
            this.badgeNo=0;
        } else {this.badgeNo=badgeNo; }

    }

    public int getShelterNo() {
        return shelterNo;
    }

    public int getBadgeNo() {
        return badgeNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return getShelterNo() == felis.getShelterNo() && getBadgeNo() == felis.getBadgeNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getShelterNo(), getBadgeNo());
    }
}
