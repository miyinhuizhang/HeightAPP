package com.dingcheng365.height;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

// 关于
public class AboutActivity extends AppCompatActivity
{
    // 变量 *********************************************************************
    private TextView mtvVerInfo = null;

    // 函数重载 *******************************************************************
    // 创建
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_layout);

        mtvVerInfo = (TextView)findViewById(R.id.tvAboutVerInfo);
        mtvVerInfo.setText("版本信息:Ver1.0.1");
    }

    // 函数自定义 ******************************************************************
    public static void actionStart(Context context)
    {
        Intent intent = new Intent(context,AboutActivity.class);
        context.startActivity(intent);
    }

    // 返回按钮单击
    public void btnAboutClose_Click(View view)
    {
        finish();
    }

}
