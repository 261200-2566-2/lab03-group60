public class Main {
    public static void main(String[] args) {
        Character p1 = new Character();

        p1.getItem();

        Character p2 = new Character();
        p2.getItem();

//        p1.Attack(p2);
//        p2.showStatusAfterAttack();

        p1.Defend(p2);
        p1.showStatusAfterAttack();
        p2.showStatusAfterAttack();

    }
}
