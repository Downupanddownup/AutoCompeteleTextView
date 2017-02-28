package com.example.hopjs.widgetstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
/*目的：用于了解AutoCompeteleTextView和multiAutoCompleteTextView的使用方法
* 结果：
* 1，创建item
* 2，创建数据列表
* 3，创建适配器
* 4，为控件设置适配器
* 5，后者需要设置分词器*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)
                findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,R.layout.autocompeletetextview_item,getResources().getStringArray(R.array.string_list)
        );
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

        MultiAutoCompleteTextView multiAutoCompleteTextView = (MultiAutoCompleteTextView)
                findViewById(R.id.multiAutoCompleteTextView);

        multiAutoCompleteTextView.setThreshold(1);
        multiAutoCompleteTextView.setAdapter(adapter);
        multiAutoCompleteTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

    }
}
