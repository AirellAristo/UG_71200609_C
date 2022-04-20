public class Main {

    public static void main(String[] args){
        Lina Lina = new Lina();
        DragonKnight DragonKnight = new DragonKnight();
        LegionCommander LegionCommander = new LegionCommander();

        Lina.skill(DragonKnight);
        DragonKnight.skill();
        DragonKnight.skill();
        LegionCommander.skill(Lina);
        Lina.skill(LegionCommander);

        Lina.showCharacterInfo();
        DragonKnight.showCharacterInfo();
        LegionCommander.showCharacterInfo();
    }

}
