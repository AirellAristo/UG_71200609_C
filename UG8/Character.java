public abstract class Character implements ObjectAttack {
    public Character(String a,int b,int c){
        this.name = a;
        this.health = b;
        this.damage = c;
    }


    protected int damage;
    protected String name;
    protected  int health;



    public void showCharacterInfo(){}

    public boolean isDie(){
        if (this.health <= 0){
            this.health = 0;
            return true;
        }
        else{
            return false;
        }
    }

    public void attacked(int a){}
}
