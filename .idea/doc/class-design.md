
```
maze(){
    サイズx
    サイズy
    壁:”#”
    空白:” ”
    スタート地点:”s”
    ゴール地点:”G”
    テキストファイルを読み込み
    変数に格納する
    アクセサ:なし
    ゴール判定
    移動判定
}

class maze{
	public int initialPositionX;
	public int initialPositionY;
	public int sizeX;
	public int sizeY;
	public String wall=”#”
	public String space=” ”
	public String startPosition = “s”;
	public String goal=”G”;
	public String readTxt(void);
	ArrayList x 
	public int x;
	public int y;
}
```

---

## PlayerClassの設計

```
Player{
    歩数を記録する
    上下左右に移動
    プレイヤーの現在地
    初期位置
}

class Player{
    WalkCounter
    CurrentLocation    
    InitialLocation
    StepUp()
    StepDown()
    StepRight()
    StepLeft()
}
```





