package com.tangzy.gradleplugin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.tangzy.bindannotation.BindView;
import com.tangzy.bindlibrary.BindViewTools;
import com.tangzy.gradleplugin.R;
import com.tangzy.tencenttrtc.RoomActivity;

//@RouteNode(path = "/main", desc = "首页")
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    TextView button1;

    @BindView(R.id.loginBut)
    Button loginBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Router router = Router.getInstance();
//                UIRouter.getInstance().openUri(MainActivity.this, "DDComp://share/login", null);
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
        loginBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Router router = Router.getInstance();
//                UIRouter.getInstance().openUri(MainActivity.this, "DDComp://share/login", null);
                startActivity(new Intent(MainActivity.this, RoomActivity.class));
            }
        });
    }
}