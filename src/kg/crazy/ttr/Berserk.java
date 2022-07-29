package kg.crazy.ttr;


    public class Berserk extends Hero {
        public Berserk(int health, int damage) {
            super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        }

        @Override
        public void applySuperAbility(Boss boss, Hero[] heroes) {
            int bossBeatSelf = boss.getDamage();
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0 && this == heroes[i]) {
                    this.setDamage(this.getDamage() + bossBeatSelf);
                }
            }
        }
    }

