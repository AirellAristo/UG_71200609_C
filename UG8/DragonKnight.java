public class DragonKnight extends PhysicalCharacter implements NoTargetSkill{
    public DragonKnight(){
        super("DragonKnight",1800,95,50);
    }

    private int dragonFormAttack;

    public void skill(){
        this.dragonFormAttack = 2;
    }

    public void attack(Character a){
        if(this.dragonFormAttack > 0){
            a.attacked(this.damage+90);
            this.dragonFormAttack -= 1;
        }
    }

}

