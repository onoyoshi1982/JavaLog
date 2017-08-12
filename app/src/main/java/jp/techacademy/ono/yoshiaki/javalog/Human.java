package jp.techacademy.ono.yoshiaki.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{

    // 変数
    String name;      // 名前
    int age;    // 年齢
    String hobby;      // 趣味

    // 引数付きコンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }


}
