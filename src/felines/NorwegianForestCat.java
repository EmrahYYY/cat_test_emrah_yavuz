package felines;

public class NorwegianForestCat extends Felis {

    public NorwegianForestCat() {
    }

    public NorwegianForestCat(String name, int age, int shelterNo, int badgeNo) {
        super.setAge(age);
        setName(name);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    };


    public void moaulnNorvegian() {
    }

    @Override
    public String toString() {
        return "NorwegianForestCat{}";
    }
}
