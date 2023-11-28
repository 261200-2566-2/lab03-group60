import java.util.Scanner;
public class Character {
    private String Name;
    private int Level;
    private int HP;
    private int Mana;
    private double Damage;
    private double Defense;
    private double Speed;
    private double downSpeed;

    public Character() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter yourname: ");
        String name = s.nextLine();
        this.Name = name;
        this.Level = 0;
        this.HP = 100;
        this.Mana = 50;
        this.Damage = 0;
        this.Defense = 0;
        this.Speed = 1;
        this.downSpeed = 0;
    }

    public void getItem() {


        Scanner s = new Scanner(System.in);
        System.out.print("Choose a sword(sw) or shield(sh) or all(all)  ? : ");
        String sw = s.nextLine();

        if (sw.equals("sw") || sw.equals("sh") || sw.equals("all")){
            if (sw.equals("sw")) {
                System.out.println("\uD83D\uDDE1\uFE0F You choose the sword \uD83D\uDDE1\uFE0F");

                System.out.printf("------------------------------------------%n");
                System.out.printf("|%s | %-15s | %4s | %5s|%n", "NO", "NAME", "LEVEL", "DAMAGE");
                System.out.printf("------------------------------------------%n");

                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 1, "Enma", 6, 60);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 2, "Shusui", 8, 85);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 3, "Yubashiri", 7, 78);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 4, "Wado Ichimonji", 9, 99);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 5, "Sandai Kitetsu", 9, 95);

                Scanner w = new Scanner(System.in);
                System.out.print("You choose sword number: ");
                int swn = w.nextInt();
                if (swn == 1) {
                    this.Level += 6;
                    this.Damage += 60;

                } else if (swn == 2) {
                    this.Level += 8;
                    this.Damage += 85;

                } else if (swn == 3) {
                    this.Level += 7;
                    this.Damage += 78;

                } else if (swn == 4) {
                    this.Level += 9;
                    this.Damage += 99;

                } else if (swn == 5) {
                    this.Level += 9;
                    this.Damage += 95;

                } else {
                    System.out.print("ERROR !!!");
                }

                updateState();
                downSpeed =  Speed - Speed * (0.1 + 0.12 * Level);
                System.out.printf("------------------------------------------%n");
                showStatus2();

            }


            if (sw.equals("sh")) {
                System.out.println("\uD83D\uDEE1\uFE0F You choose the shield \uD83D\uDEE1\uFE0F");

                System.out.printf("------------------------------------------%n");
                System.out.printf("|%s | %-15s | %4s | %5s|%n", "NO", "NAME", "LEVEL", "DEFENSE");
                System.out.printf("------------------------------------------%n");

                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 1, "Zeus", 9, 98);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 2, "Ares", 6, 60);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 3, "Poseidon", 8, 80);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 4, "Hera", 7, 66);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |%n", 5, "Athena", 8, 79);

                Scanner w = new Scanner(System.in);
                System.out.print("You choose shield number: ");
                int swn = w.nextInt();
                if (swn == 1) {
                    this.Level += 9;
                    this.Defense += 98;

                } else if (swn == 2) {
                    this.Level += 6;
                    this.Defense += 60;

                } else if (swn == 3) {
                    this.Level += 8;
                    this.Defense += 80;

                } else if (swn == 4) {
                    this.Level += 7;
                    this.Defense += 66;

                } else if (swn == 5) {
                    this.Level += 8;
                    this.Defense += 79;

                } else {
                    System.out.print("ERROR !!!");
                }

                updateState();
                downSpeed =  Speed - Speed * (0.1 + 0.12 * Level);
                System.out.printf("------------------------------------------%n");
                showStatus2();

            }
            if (sw.equals("all")) {
                System.out.println("\uD83D\uDD31 You choose all item \uD83D\uDD31");

                System.out.printf("---------------------------------------|  ⚔\uFE0F  |----------------------------------------%n");
                System.out.printf("|%s | %-15s | %4s | %5s |  %-3s |%s | %-15s | %4s | %5s|%n", "NO", "NAME", "LEVEL", "DAMAGE", "⚔\uFE0F","NO", "NAME", "LEVEL", "DEFENSE");
                System.out.printf("---------------------------------------|  ⚔\uFE0F  |----------------------------------------%n");

                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 1, "Enma", 6, 60,"⚔\uFE0F", 1, "Zeus", 9, 98);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 2, "Shusui", 8, 85,"⚔\uFE0F",2, "Ares", 6, 60);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 3, "Yubashiri", 7, 78, "⚔\uFE0F",3, "Poseidon", 8, 80);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 4, "Wado Ichimonji", 9, 99, "⚔\uFE0F",4, "Hera", 7, 66);
                System.out.printf("| %1d | %-15s | %1d     | %1d     |  %-3s | %1d | %-15s | %1d     | %1d     |%n", 5, "Sandai Kitetsu", 9, 95, "⚔\uFE0F",5, "Athena", 8, 79);


                Scanner w = new Scanner(System.in);
                System.out.print("You choose sword number: ");
                int sw1 = w.nextInt();
                System.out.print("You choose shield number: ");
                int sh2 = w.nextInt();

                if (sw1 == 1 && sh2 == 1) {
                    this.Level += 15;
                    this.Damage += 60;
                    this.Defense += 98;

                } else if (sw1 == 1 && sh2 == 2) {
                    this.Level += 12;
                    this.Damage += 60;
                    this.Defense += 60;

                } else if (sw1 == 1 && sh2 == 3) {
                    this.Level += 14;
                    this.Damage += 60;
                    this.Defense += 80;

                } else if (sw1 == 1 && sh2 == 4) {
                    this.Level += 13;
                    this.Damage += 60;
                    this.Defense += 66;

                } else if (sw1 == 1 && sh2 == 5) {
                    this.Level += 14;
                    this.Damage += 60;
                    this.Defense += 79;

                }else if (sw1 == 2 && sh2 == 1) {
                    this.Level += 17;
                    this.Damage += 85;
                    this.Defense += 98;

                } else if (sw1 == 2 && sh2 == 2) {
                    this.Level += 14;
                    this.Damage += 85;
                    this.Defense += 60;

                } else if (sw1 == 2 && sh2 == 3) {
                    this.Level += 16;
                    this.Damage += 85;
                    this.Defense += 80;

                } else if (sw1 == 2 && sh2 == 4) {
                    this.Level += 15;
                    this.Damage += 85;
                    this.Defense += 66;

                } else if (sw1 == 2 && sh2 == 5) {
                    this.Level += 16;
                    this.Damage += 85;
                    this.Defense += 79;

                }else if (sw1 == 3 && sh2 == 1) {
                    this.Level += 16;
                    this.Damage += 78;
                    this.Defense += 98;

                } else if (sw1 == 3 && sh2 == 2) {
                    this.Level += 13;
                    this.Damage += 78;
                    this.Defense += 60;

                } else if (sw1 == 3 && sh2 == 3) {
                    this.Level += 15;
                    this.Damage += 78;
                    this.Defense += 80;

                } else if (sw1 == 3 && sh2 == 4) {
                    this.Level += 14;
                    this.Damage += 78;
                    this.Defense += 66;

                } else if (sw1 == 3 && sh2 == 5) {
                    this.Level += 15;
                    this.Damage += 78;
                    this.Defense += 79;

                }else if (sw1 == 4 && sh2 == 1) {
                    this.Level += 18;
                    this.Damage += 99;
                    this.Defense += 98;

                } else if (sw1 == 4 && sh2 == 2) {
                    this.Level += 15;
                    this.Damage += 99;
                    this.Defense += 60;

                } else if (sw1 == 4 && sh2 == 3) {
                    this.Level += 17;
                    this.Damage += 99;
                    this.Defense += 80;

                } else if (sw1 == 4 && sh2 == 4) {
                    this.Level += 16;
                    this.Damage += 99;
                    this.Defense += 66;

                } else if (sw1 == 4 && sh2 == 5) {
                    this.Level += 17;
                    this.Damage += 99;
                    this.Defense += 79;

                }else if (sw1 == 5&& sh2 == 1) {
                    this.Level += 18;
                    this.Damage += 95;
                    this.Defense += 98;

                } else if (sw1 == 5 && sh2 == 2) {
                    this.Level += 15;
                    this.Damage += 99;
                    this.Defense += 60;

                } else if (sw1 == 5 && sh2 == 3) {
                    this.Level += 17;
                    this.Damage += 95;
                    this.Defense += 80;

                } else if (sw1 == 5 && sh2 == 4) {
                    this.Level += 16;
                    this.Damage += 95;
                    this.Defense += 66;

                } else if (sw1 == 5 && sh2 == 5) {
                    this.Level += 17;
                    this.Damage += 95;
                    this.Defense += 79;

                }
                else {
                    showError();
                }

                updateState();
                downSpeed =  Speed - Speed * (0.1 + 0.12 * Level);
                System.out.printf("--------------------------------------------------------------------------------------%n");
                showStatus2();

            }
        }else {
            showError();
        }

    }

    private void updateState () {
        HP = 100 + 10 * Level;
        Mana = 50 + 2 * Level;

        Damage = Damage * (1 + 0.1 * Level);
        Defense = Defense * (1 + 0.05 * Level);

        Speed = Speed*(0.1+0.3*Level);

    }
    public void showStatus() {
        System.out.printf("╔═══════════════════════════════════════════════╗%n");
        System.out.printf(" %15s %s %s%n", "Hi", this.Name, "㋡!");
        System.out.printf("    ◤%2s %2s %2s◢%n","This is",this.Name,"status before choose");
        System.out.printf("-------------------------------------------------%n");

        System.out.printf("|%-3s%1d | %-3s%1d |%-3s%1d      |%n", "LEVEL \uD83D\uDD30: ",Level, "HP \uD83D\uDC9A: ",HP,"MANA \uD83D\uDC99: ",Mana);
        System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK \uD83D\uDDE1\uFE0F:", String.format("%.2f", Damage), "DEF \uD83D\uDEE1\uFE0F:", String.format("%.2f", Defense), "SPD \uD83C\uDFCD\uFE0F:", String.format("%.2f",Speed), String.format("%.2f", Speed));

        System.out.printf("-------------------------------------------------%n");
        System.out.printf("╚═══════════════════════════════════════════════╝%n");
    }
    public void showStatus2 () {
        System.out.printf("╔═══════════════════════════════════════════════╗%n");
        System.out.printf("    ◤%2s %2s %2s◢%n","This is",this.Name,"status after choose");
        System.out.printf("-------------------------------------------------%n");

        System.out.printf("|%-3s%1d |%-3s%1d   |%-3s%1d      |%n", "LEVEL \uD83D\uDD30: ",Level, "HP \uD83D\uDC9A: ",HP,"MANA \uD83D\uDC99: ",Mana);
        System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK\uD83D\uDDE1\uFE0F:", String.format("%.2f", Damage), "DEF\uD83D\uDEE1\uFE0F:", String.format("%.2f", Defense), "SPD\uD83C\uDFCD\uFE0F:", String.format("%.2f", downSpeed),String.format("%.2f",Speed));

        System.out.printf("-------------------------------------------------%n");
        System.out.printf("╚═══════════════════════════════════════════════╝%n");
    }
    public void showStatus3 () {
        System.out.printf("╔════════════════════════════════════════╗%n");
        System.out.printf("◤%2s %2s %2s◢%n","This is",this.Name,"status after reset");
        System.out.printf("------------------------------------------%n");

        System.out.printf("|%-3s%1d | %-3s%1d |%-3s%1d |%n", "LEVEL \uD83D\uDD30: ",Level, "HP \uD83D\uDC9A: ",HP,"MANA \uD83D\uDC99: ",Mana);
        System.out.printf("|%-1s%s |%-1s%s |%-1s%s/%s |%n", "ATK \uD83D\uDDE1\uFE0F:", String.format("%.2f", Damage), "DEF \uD83D\uDEE1\uFE0F:", String.format("%.2f", Defense), "SPD \uD83C\uDFCD\uFE0F:", String.format("%.2f", Speed),String.format("%.2f", Speed));

        System.out.printf("------------------------------------------%n");
        System.out.printf("╚════════════════════════════════════════╝%n");
    }
    public void showError () {
        System.out.printf("╔════════════════════════════════════════╗%n");
        System.out.printf("------------------------------------------%n");

        System.out.printf("%30s%n","\uD83D\uDCA3\uD83D\uDCA3\uD83D\uDCA3\uD835\uDD3Cℝℝ\uD835\uDD46ℝ\uD83D\uDCA3\uD83D\uDCA3\uD83D\uDCA3");

        System.out.printf("------------------------------------------%n");
        System.out.printf("╚════════════════════════════════════════╝%n");
    }
    public void reset () {
        this.Level = 0;
        this.HP = 100;
        this.Mana = 50;
        this.Damage = 0;
        this.Defense = 0;
        this.Speed = 1;
        this.downSpeed = 0;
        showStatus3();
    }
}

