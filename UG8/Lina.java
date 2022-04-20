public class Lina extends MagicCharacter implements TargetSkill {
    public Lina(){
        super("Luna",800,70,120 );
    }

    public boolean skill(Character a){
        if (this.mana >= 0){
            a.attacked(600);
            this.mana -= 60;
            return true;
        }
        else{
            return false;
        }
    }

    public void attack(Character a){
        a.attacked(this.damage);
        if (a.isDie()){
            this.mana += 45;
        }
    }
}
