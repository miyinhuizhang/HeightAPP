package com.dingcheng365.height;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // 变量 *********************************************************************
    private EditText metHeightFather = null;
    private EditText metHeightMother = null;
    private TextView mtvResult = null;

    // 函数重载 *******************************************************************
    // 创建
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);   // 加载布局

        metHeightFather = (EditText)findViewById(R.id.etMainHeightFather);
        metHeightMother = (EditText)findViewById(R.id.etMainHeightMother);
        mtvResult = (TextView) findViewById(R.id.tvMainResult);

        metHeightFather.setText("180");
        metHeightMother.setText("165");
    }

    // 创建菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main_menu,menu);   // 加载菜单

        return true;
    }

    // 菜单项事件

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.mnuMainAbout:
                AboutActivity.actionStart(MainActivity.this);
                break;
            case  R.id.mnuMainExit:
                finish();
                break;
        }

        return true;
    }


    // 函数自定义 ******************************************************************
    public void btnMainCompute_Click(View view)
    {
        int intHeightFather = 0;
        int intHeightMother = 0;
        int intHeightGirl = 0;
        int intHeightBoy = 0;

        intHeightFather = Integer.parseInt(metHeightFather.getText().toString());
        intHeightMother = Integer.parseInt(metHeightMother.getText().toString());

        // 儿子身高?厘米 ＝(父亲身高＋母亲身高 ×1.08)÷2
        intHeightBoy = (int) ((intHeightFather+intHeightMother*1.08)/2);

        // 女儿身高?厘米 ＝(父亲身高×0.923＋母亲身高) ÷2
        intHeightGirl = (int) ((intHeightFather*0.923+intHeightMother)/2);

        String strResult = "";
        strResult = "结果(cm): 男孩(" + String.valueOf(intHeightBoy) + ") 女孩(" + String.valueOf(intHeightGirl) + ")";

        mtvResult.setText(strResult);

    }


}
