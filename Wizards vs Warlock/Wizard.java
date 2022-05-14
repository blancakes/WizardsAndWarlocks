public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void CollosusPunch(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with CollosusPunch (Damage - 45 , Mana Cost - 12");
        int damagePoints = 45;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 12;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void SteelKnee(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with SteelKnee (Damage - 55 , Mana Cost - 13)");
        int damagePoints = 55;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 13;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void TorchOfJustice(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with TorchOfJustice (Damage - 50 , Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTarget(enemyCharacter, manaPoints);

    }


    public void DragonBreath(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with Dragon Breath (Damage - 50 , Mana Cost - 25)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 25;
        manaTargett(enemyCharacter, manaPoints);

    }

    public void SneakyRaid(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with SneakyRaid (Damage - 50 , Mana Cost - 30)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 30;
        manaTarget(enemyCharacter, manaPoints);
        levelTarget(enemyCharacter, level);
    }

}