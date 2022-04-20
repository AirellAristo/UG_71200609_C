import java.sql.SQLOutput;

public class LegionCommander extends PhysicalCharacter implements TargetSkill {
    public LegionCommander(){
        super("Legion Commander",1200,120,30);
    }
    private int kill;

    public void attack(Character a){
        a.attacked(this.damage);
        if (super.isDie()){
            this.health = 0;
        }
        else if(a.isDie()){
            kill += 1;
            this.damage += 10;
        }
    }

    public boolean skill(Character a){
        while (this.health != 0 || a.health != 0){
            super.attacked(a.damage);//musuh nyerang
            a.attacked(this.damage);//LC nyerang
            if (super.isDie()){
                this.health = 0;
                break;
            }
            else if(a.isDie()){
                break;
            }
        }
        return true;
    }
}
