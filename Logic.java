
/**
 * クラス Logic の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
public class Logic
{
    /** じゃんけんの手：グー */
    public static int GU = 0;
    /** じゃんけんの手：チョキ */
    public static int CHOKI = 1;
    /** じゃんけんの手：パー */
    public static int PA = 2;
    /** ユーザーの勝利 */
    public static int WIN = 2;
    /** ユーザーの敗北 */
    public static int LOOSE = 1;
    /** あいこ */
    public static int AIKO = 0;
    /** 想定外の値 */
    public static int ERROR = -1;

    /** 数字かどうか判定する */
    public boolean isNumber(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("[0-2]{1}");
    }

    /** 桁数判定 */
    public boolean okLength(String str) {
        return str.length() == 1;
    }

    /** 
     * じゃんけんの入力チェックを行う。
     * TRUE: 不適切な入力
     * FALSE: 適切な入力
     */
    public boolean misMutchInput(String input) {
        if (okLength(input) && isNumber(input)) {
            return false;
        }
        return true;
    }
    
    /** 勝敗判定 */
    public int judge(int playerTe, int cpuTe) {
        if (playerTe == Logic.ERROR) {
            return Logic.ERROR;
        }
        int result = (playerTe - cpuTe + 3) % 3;
        if (result == WIN) {
            return WIN;
        } else if (result == LOOSE){
            return LOOSE;
        } else if (result == AIKO) {
            return AIKO;
        } else {
            return ERROR;
        }
    }

}
