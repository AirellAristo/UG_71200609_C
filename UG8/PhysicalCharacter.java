public abstract class PhysicalCharacter extends Character{

    public PhysicalCharacter(String name,int health, int damage, int armor){
        super(name, health, damage);
        this.armor = armor;
    }

    private int armor;

    public void showCharacterInfo(){
        System.out.println("Hero : "+this.name);
        System.out.println("Health : "+this.health);
        System.out.println("Damage : "+this.damage);
        System.out.println("Armor : "+this.armor);
        System.out.println(" ");
    }

    public void attacked(int a){
        int damage = a - this.armor;
        super.health =  super.health - damage;
    }
}
