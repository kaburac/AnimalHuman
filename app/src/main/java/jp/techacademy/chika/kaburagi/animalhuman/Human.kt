package jp.techacademy.chika.kaburagi.animalhuman

import android.util.Log

class Human// プロパティ
    (name: String, age: Int, var hobby: String) : Animal(name, age), Thinkable {

    override fun say() {
        Log.d("kotlintest",  "私の名前は" + name + "です。年は" + age + "歳です。")
    }

    // Thinkableインタフェースのメソッドをオーバーライド
    override fun think() {

        Log.d("kotlintest", "私は" + hobby + "について考える。")
    }
}