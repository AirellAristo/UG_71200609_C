public abstract class MagicCharacter extends Character{
    public MagicCharacter(String nama, int health, int damage, int mana){
        super(nama,health,damage);
        this.mana = mana;
    }
    protected int mana;

    public void attacked(int a){
        super.health = super.health - a;
    }

    public void showCharacterInfo(){
        System.out.println("Hero : "+this.name);
        System.out.println("Health : "+this.health);
        System.out.println("Damage : "+this.damage);
        System.out.println("Mana : "+this.mana);
        System.out.println(" ");
    }
}
