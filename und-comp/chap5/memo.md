### チューリングマシン (Turing Machine)

- 無限の長さのマス目を持つテープとその上を動くテープヘッドから成る有限状態機械
- 有限状態機械の内部の状態とテープヘッド下のシンボルによって次の動作を決定する
- 次の動作を決定する規則は以下の要素からなる
  - 機械の現在の状態
  - テープヘッドの現在の位置の文字
  - 機械の次の状態
  - テープヘッドの現在の位置に書き込む文字
  - テープに書いたあと、ヘッドを動かす方向 (右 or 左)
- チューリングマシンに以下の拡張を加えても計算能力が向上することはない
  (計算できなかった問題を計算できるようになることはない)
  - 非決定性 
  - RAM のようなストレージ
    - 読み込んだ文字に応じた状態の複製のようなものを用意することで同じことができる
      (本の解説 p149 がわかりやすい)
    - チューリングマシンではシンボルを有限としているため、このように考えることができる
  - サブルーチン
  - 複数のテープ
  - 多次元のテープ

### 万能チューリングマシン (Universal Turing Machine, UTM)

- チューリングマシンの規則と処理対象の文字列を1つの入力として受け取り、規則で記述された計算を実行する機械
- この機械一つでチューリングマシンで行える計算全てが行える
  - 換言すれば、チューリングマシン規則のインタプリタというべき計算を行えるチューリングマシン