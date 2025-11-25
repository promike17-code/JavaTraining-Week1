public class Janken{
  public static void main(String[] args){
    System.out.println("じゃんけんをしましょう");//入力画面でじゃんけんをしましょうの表示
  System.out.println("0:グー 1:チョキ 2:パー");//入力画面で0:グー 1:チョキ 2:パーの表示
  int player=new java.util.Scanner(System.in).nextInt();//playerが数字を入力するためのコード
  int cpu=new java.util.Random().nextInt(3);//CPUが0~2の数字をランダムに表示できるようにする
  String[] hands={"グー","チョキ","パー"};/*playerの入力数字とCPUがランダムに出した数字にグー チョキ　パーをつける 0=グー 1=チョキ 2=パー*/
  System.out.println("あなた : "+hands[player]+" コンピューター: "+hands[cpu]);//playerが入力したじゃんけんの手とCPUが出したじゃんけんの手を画面に表示する。
  if(player==cpu){//あいこパターン
    System.out.prontln("あいこです");
  }else if(
    (player==0&&cpu==1)||
    (player==1&&cpu==2)||
    (player--2&&cpu==0)
    ){//勝ちパターン
    System.out.println("あなたの勝ち");
  }else{
    System.out.println("あなたの負け");//負けパターン
  }
  }
}
