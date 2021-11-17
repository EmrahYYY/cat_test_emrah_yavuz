package felines;

public class AndeanMountain extends Felis{

    public AndeanMountain() {
    }

    public AndeanMountain(String name, int age, int shelterNo, int badgeNo) {
        super.setAge(age);
        setName(name);
        setShelterNo(shelterNo);
        setBadgeNo(badgeNo);
    };

    public void miauw (String CustomSound){
        System.out.println(CustomSound);
    }

    public boolean isAlive(){return false;}


    @Override
    public String toString() {
        return "AndeanMountain{}";
    }
}
