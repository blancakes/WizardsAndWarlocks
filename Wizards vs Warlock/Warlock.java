public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }

    public void SoulStare(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with SoulStare (Damage - 40 , Mana Cost - 20)");
        int damagePoints = 40;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 20;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Crash(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Crash (Damage - 50 , Mana Cost - 30)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void Wrath(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Wrath (Damage - 50 , Mana Cost - 15)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 15;
        manaTarget(enemyCharacter, manaPoints);
    }
}