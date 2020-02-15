package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
fun <T> Permutation(vararg ts: T):Int {
    var count:Int = 1;
    var notRepeat= ts.distinct().size
    for(i in 1..notRepeat){
        count *=i
    }
    return count;
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val result: TextView = findViewById(R.id.result) as TextView
        var  res:Int =
            Permutation (1,11,14,5,5,1)
        result.text = res.toString()
    }


}

