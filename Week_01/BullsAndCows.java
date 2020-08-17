import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 *
 你在和朋友一起玩 猜数字（Bulls and Cows）游戏，该游戏规则如下：

 你写出一个秘密数字，并请朋友猜这个数字是多少。
 朋友每猜测一次，你就会给他一个提示，告诉他的猜测数字中有多少位属于数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位属于数字猜对了但是位置不对（称为“Cows”, 奶牛）。
 朋友根据提示继续猜，直到猜出秘密数字。
 请写出一个根据秘密数字和朋友的猜测数返回提示的函数，返回字符串的格式为 xAyB ，x 和 y 都是数字，A 表示公牛，用 B 表示奶牛。

 xA 表示有 x 位数字出现在秘密数字中，且位置都与秘密数字一致。
 yB 表示有 y 位数字出现在秘密数字中，但位置与秘密数字不一致。
 请注意秘密数字和朋友的猜测数都可能含有重复数字，每位数字只能统计一次。



 示例 1:

 输入: secret = "1807", guess = "7810"
 输出: "1A3B"
 解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。
 示例 2:

 输入: secret = "1123", guess = "0111"
 输出: "1A1B"
 解释: 朋友猜测数中的第一个 1 是公牛，第二个或第三个 1 可被视为奶牛。


 说明: 你可以假设秘密数字和朋友的猜测数都只包含数字，并且它们的长度永远相等。
 *
 */
public class BullsAndCows {

    // 草稿，写不下去了
    public static String getHint(String secret, String guess) {
        int len = secret.length();
        int bullNum = 0;
        int cowNum = 0;
        Set<String> cowSet = new HashSet<>();
        Set<Integer> bullSet = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                bullNum++;
                bullSet.add(i);
            }
            for (int j = 0; j < len; j++) {
                if(!bullSet.contains(i) && !bullSet.contains(j) && i != j && secret.charAt(i) == guess.charAt(j)){
                    cowSet.add(secret.charAt(i) + "" + guess.charAt(j));
                }
            }
        }
        cowNum = cowSet.size();
        return bullNum + "A" + cowNum + "B";
    }

    public static String getHint2(String secret, String guess) {
        int[] bucket = new int[10];
        int bull = 0;
        int cow = 0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)== guess.charAt(i)){
                bull++;
                continue;
            }
            bucket[secret.charAt(i) - '0'] += 1;
            bucket[guess.charAt(i) - '0'] -= 1;

        }
        //计算bucket中正值的个数
        for(int i=0;i<10;i++){
            if(bucket[i] > 0)
                cow+= bucket[i];
        }
        cow = secret.length() - cow - bull;
        String res = bull + "A" + cow + "B";
        return res;
    }

    public static String getHint3(String secret, String guess) {
        int sCount = 0;
        int gCount = 0;
        // 记录 secret 中 某个数字  出现的次数
        int[] sArr = new int[10];
        // 记录 guess 中 某个数字  出现的次数
        int[] gArr = new int[10];
        // 第一次遍历，统计公牛的个数，并且统计 某一个数出现的次数（匹配的字符不算）
        for (int i = 0; i < secret.length(); i++) {
            // 数字字符 转 数字
            int sValue = secret.charAt(i) - '0';
            int gValue = guess.charAt(i) - '0';
            if (sValue == gValue) {
                sCount++;
                continue;
            }
            sArr[sValue]++;
            gArr[gValue]++;
        }
        // 第二次遍历，统计数字 出现的最小次数 （不能重复，所以取最小的） 比如  123   011   母牛次数就是 1
        for (int i = 0; i < 10; i++) {
            gCount += Math.min(sArr[i], gArr[i]);
        }
        return sCount + "A" + gCount + "B";
    }

    public static void main(String[] args) {
        String newStr = getHint3("1123", "7810");
        System.out.println(newStr);

        String secret = "1654";
        System.out.println(secret.charAt(3) - '0');
    }

}
