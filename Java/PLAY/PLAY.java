/**
 *
 * BASICのPLAY関数のようなものを作ってみたい
 *
 * @version 1.0 181017-234252
 * @author Manatsu99
 */
public class PLAY {
    private int A = 440;
    private int BPM = 120;

    /**
     * 基準となる周波数を設定するメソッド 再設定することで別のピッチの音色が出せる
     *
     * @param A int 基準の"ラ"
     */
    public void setStandardFrequency(int A) {
        // ex A = 440;
        // RefPitch
        this.A = A;
    }

    /**
     * 基準となる周波数のゲッター
     *
     * @return int 周波数
     */
    public int getFrequency() {
        return A;
    }

    /**
     * 基準となるBPMを設定するメソッド オブジェクトのBPMを演奏中に変えることができる
     *
     * @param BPM int
     */
    public void setBPM(int BPM) {
        // ex BPM = 120;
        this.BPM = BPM;
    }

    /**
     * 基準となるBPMのゲッター
     *
     * @return int
     */
    public int getBPM() {
        return BPM;
    }

    /**
     * 音符を作るメソッド このメソッドから音が再生される
     *
     * @param sound 音階の設定
     * @param note  音符の設定
     */
    public void play(int sound, int note) {

    }

    /**
     * dの値から周波数を返すメソッド
     *
     * @param d int 音色によって固定
     * @return f double 周波数の意
     */
    public double setSounds(int d) {
        double f1 = d / 12;
        double f = A * Math.pow(2, f1); // Frequency
        return f;
    }

    /**
     * ここで生成されるオブジェクトは楽器
     * 
     * @param A   基準となる周波数
     * @param BPM 基準となるBPM
     */
    public PLAY(int A, int BPM) {
        this.A = A;
        this.BPM = BPM;
    }

}