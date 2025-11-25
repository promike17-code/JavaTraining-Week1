import java.util.Scanner;
import java.util.Random;

public class Janken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("じゃんけんをしましょう");
        System.out.println("0:グー 1:チョキ 2:パー");

        int player = scanner.nextInt();
        int cpu = random.nextInt(3);

        String[] hands = {"グー","チョキ","パー"};
        System.out.println("あなた: " + hands[player] + " コンピューター: " + hands[cpu]);

        if(player == cpu){
            System.out.println("あいこです");
        } else if (
            (player == 0 && cpu == 1) ||
            (player == 1 && cpu == 2) ||
            (player == 2 && cpu == 0)
        ){
            System.out.println("あなたの勝ち");
        } else {
            System.out.println("あなたの負け");
        }
    }
}
