package felines;

public class TurkishVanCat extends Felis{

    public TurkishVanCat() {
    }

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo) {
        super.setAge(age);
        setName(name);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    };
    public String  nickname(){ //String

        return " istanbul"; }


    @Override
    public String toString() {
        return "TurkishVanCat{}";
    }
}
