package felines;

public class SiameseCat extends Felis{

    public SiameseCat() {
    }

    public SiameseCat(String name, int age, int shelterNo, int badgeNo) {
        super.setAge(age);
        setName(name);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    };
    @Override
    public String toString() {


        return "SiameseCat{}";
    }
}
