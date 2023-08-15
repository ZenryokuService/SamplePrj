
/**
 * クラス Main の注釈をここに書きます.
 * じゃんけんゲームを動かすクラス。
 * じゃんけんゲームを動かすのに必要な定数をフィールド変数に持っている。
 * 
 * @author Takunoji
 * @version 1.0
 */
public class Main
{
    
    public static void main(String[] args) {
        ConsoleUtil console = new ConsoleUtil();
        Logic logic = new Logic();

        // 1.じゃんけんゲームのルールを表示する
        console.printRule();
        // 2. ユーザーのじゃんけんの手を決める
        int in = console.getUserTe();
        // 3. CPUのじゃんけんの手を取得する
        int cpuTe = console.getCpuTe();
        // 4. じゃんけんの勝敗判定を行う
        int result = logic.judge(in, cpuTe);
        // 5. 勝敗結果を表示する
        console.printResult(result);
    }
}
