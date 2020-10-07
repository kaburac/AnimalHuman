package jp.techacademy.chika.kaburagi.animalhuman

import android.util.Log
abstract class Animal constructor(var name: String,var age: Int){
    // メソッド
    open fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}