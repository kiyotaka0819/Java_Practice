public class Main {
    public static void main(String[] args) {
        int water;
        int boxies;
        /*
        intは整数の型　大体使う　long使わないと数字が限界値になる　short byteもある（容量が少ないものにつかう）
        longも整数の型　あまり使わない
        float体重とか56.8とか
        double　大体これ使う  小数点
        char 単一　一文字　あまり使わない
        String 大体これを使う   　S頭は大文字
        int String boolean をメインに使う!
        boolean if torfを使うための箱として使う　if drinked water >600  
        */ 
        final double rice;
        rice = 1.5;
        water = 500;
        boxies = 3;
        String user = "Nanachi";
        System.out.println(water);
        System.out.println(boxies);
        System.out.println(water + "は" + boxies + "あります");
        System.out.println(user+ "は水を" + water + "ml飲みます");
        System.out.println(user+ "は水を" + water*boxies + "ml飲みます");
        
        user = "kiyo";
        System.out.println(user+ "は米を" + rice + "合炊きます");
        rice = 3.5;
        System.out.println("Hello, Java!");
    }
}
