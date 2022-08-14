public class Main {
    public static void main(String[] args) {
        BossCharacteristics boss = new BossCharacteristics();
        boss.setBossDamage(45);
        boss.setHealth(500);
        boss.setFireProtection("bloc");
        System.out.println("Health Boss = " + boss.getHealth());
        System.out.println("Damage Boss = " + boss.getBossDamage());
        System.out.println("Defence boss from " + boss.getFireProtection());


        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + createHeroes()[i].getDamage() + createHeroes()[i].getSuperAbility());
        }
    }


    public static HeroCharacteristicsInShort[] createHeroes() {
        HeroCharacteristicsInShort magic = new HeroCharacteristicsInShort(250, 50);
        HeroCharacteristicsInShort warrior = new HeroCharacteristicsInShort(220, 35);
        HeroCharacteristicsInShort defence = new HeroCharacteristicsInShort(210, 15, "arrow");
        HeroCharacteristicsInShort[] allHeroes = new HeroCharacteristicsInShort[]{magic, warrior, defence};
        return allHeroes;
    }

}


