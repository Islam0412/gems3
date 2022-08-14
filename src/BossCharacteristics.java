public class BossCharacteristics {
    private int Health;
    private int BossDamage;
    private String fireProtection;

    public void setFireProtection(String fireProtection) {
        this.fireProtection = fireProtection;
    }

    public void setBossDamage(int bossDamage) {
        BossDamage = bossDamage;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public String getFireProtection() {
        return fireProtection;
    }

    public int getHealth() {
        return Health;
    }

    public int getBossDamage() {
        return BossDamage;
    }
}


