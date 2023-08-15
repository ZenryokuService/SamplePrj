import java.util.Scanner;
import java.util.Random;

/**
 * クラス ConsoleUtil の注釈をここに書きます.
 * 標準出力＝「コンソール」に表示する、入力を受け取るなどの処理を担当するクラス。
 * 
 * @author Takunoji
 * @version 1.0
 */
public class ConsoleUtil
{
    private Scanner scan;
    private Logic logic;
    /**
     * ConsoleOut クラスのインスタンスのためのコンストラクタ。
     * このクラスが「new」されたときに、この処理が動く。
     */
    public ConsoleUtil()
    {
        // フィールド変数のscanにScannerクラスをインスタンス化してセット
        scan = new Scanner(System.in);
        // ロジッククラス
        logic = new Logic();
    }

    /** じゃんけんの入力ルールを表示する */
    public void printRule() {
        System.out.println("*******************");
        System.out.println(" グー　： 0");
        System.out.println(" チョキ： 1");
        System.out.println(" パー　： 2");
        System.out.println("*******************");
    }

    /** 結果を表示する */
    public void printResult(int result) {
        if (result == Logic.WIN) {
            System.out.println("YOU WIN!");
        } else if (result == Logic.LOOSE) {
            System.out.println("YOU LOOSE!");
        } else if (result == Logic.AIKO) {
            System.out.println("DRAW!");
        } else {
            System.out.println("想定外の値です： " + result);
        }
    }
    /** ユーザーの手を取得する */
    public int getUserTe() {
        System.out.println();
        System.out.print("ユーザーの手を入力します：");
        String input = scan.nextLine();
        
        if (logic.misMutchInput(input)) {
            return Logic.ERROR;
        }
        int userTe = Integer.parseInt(input);
        // 手を表示する
        printTe("ユーザーの手", userTe);
        return userTe;
    }
    
    /** CPUの手を取得する */
    public int getCpuTe() {
        Random rdn = new Random();
        // 0-2の値を取得する
        int cpuTe = rdn.nextInt(3);        
        // 手を表示する
        printTe("CPUの手", cpuTe);
        return cpuTe;
    }
    
    private void printTe(String whichIs, int te) {
        String print = null;
        if (te == Logic.GU) {
            print = "グー";
        } else if (te == Logic.CHOKI) {
            print = "チョキ";
        } else if (te == Logic.PA) {
            print = "パー";
        }
        System.out.println(whichIs + " : " + print);
    }
}
