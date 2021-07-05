package game2;


class Word {
    //問題
	private String[] word
    = {"Java","Eclipse","Oracle","Android","kotlin","Docker","C++","PostgresSQL","MySQL","Python"};

    //問題文出力用変数
    private String wordprint;

    //引数に乱数を取得し配列をランダムで表示
    public void setWord() {
        int num = new java.util.Random().nextInt(getWordLong());
        this.wordprint = word[num];
    }

    //配列値リターン
    public String getWord() {
        return wordprint;
    }

    //配列の長さ取得
    public int getWordLong() {
        return word.length;
    }
}