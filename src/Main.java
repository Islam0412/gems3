public class Main {
    public static void main(String[] args) {
        BossCharacteristics boss = new BossCharacteristics();
        boss.setBossDamage(45);
        boss.setHealth(500);
        boss.setFireProtection("bloc");
        System.out.println("Health Boss = " + boss.getHealth());
        System.out.println("Damage Boss = " + boss.getBossDamage());
        System.out.println("Defence boss from " + boss.getFireProtection());
    }
}