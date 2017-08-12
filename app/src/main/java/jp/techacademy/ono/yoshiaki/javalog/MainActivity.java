package jp.techacademy.ono.yoshiaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("小野", 35, "プログラム");     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        human.say();
        human.think();
    }

}
