public class Monster {
    public static void main(String[] args) {

        // プレイヤー
        String user = "Nanachi";

        // ステータス
        int hp = 100;
        int mp = 50;
        int attack = 20;

        int water = 500;
        int boxies = 3;
        double rice = 1.5;

        // ダメージ
        int damage = (int)(Math.random() * attack + 30);

        // 状態異常
        double poisonRate = 0.3;

        System.out.println("===== ステータス =====");
        System.out.println(user + "のHP: " + hp);
        System.out.println(user + "のMP: " + mp);
        System.out.println(user + "の攻撃力: " + attack);

        System.out.println(user + "は水を" + water + "ml持っている");
        System.out.println(user + "は箱を" + boxies + "個持っている");
        System.out.println(user + "は米を" + rice + "合持っている");

        System.out.println("===== バトル =====");
        System.out.println("モンスターに、" + damage + "のダメージを与えた");

        // HPに反映
        hp = hp - damage;

        // 状態異常判定
        if (Math.random() < poisonRate) {
            System.out.println("毒状態になった！");
            hp = hp - 10;
        }

        System.out.println("残りHP: " + hp);

        System.out.println("水の総量: " + water * boxies + "ml");
    }
}