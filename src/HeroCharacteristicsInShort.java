public class HeroCharacteristicsInShort {
    private int Health;
    private int Damage;
    private String SuperAbility;


    public int getHealth() {
        return Health;
    }

    public HeroCharacteristicsInShort(int Health, int Damage, String SuperAbility) {
        System.out.println("Horocteristics");
        this.Health = Health;
        this.Damage = Damage;
        this.SuperAbility = SuperAbility;
    }

    public String getSuperAbility() {
        return SuperAbility;
    }

    public int getDamage() {
        return Damage;
    }

    public HeroCharacteristicsInShort(int Damage, int Health) {
        System.out.println("Horocteristics");
        this.Damage = Damage;
        this.Health = Health;
    }

}
