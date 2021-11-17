package felines;

public class PersianCat extends Felis{
    public PersianCat() {
    }

    public PersianCat(String name, int age, int shelterNo, int badgeNo) {
        super.setAge(age);
        setName(name);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    };

    public void miauw( ){
        System.out.println("miauw");
    }


    @Override
    public String toString() {
        return "PersianCat{}";

    }






}
