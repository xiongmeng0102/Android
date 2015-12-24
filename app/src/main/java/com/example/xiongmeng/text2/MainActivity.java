package com.example.xiongmeng.text2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    EditText input;
    TextView inputHint;
    Button btnCalc;
    ImageView imgView;
    Button btnNull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.calc_input);
        inputHint = (TextView) findViewById(R.id.input_hint);
        btnCalc = (Button) findViewById(R.id.btn_calc);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputStatement = input.getText().toString();
                //Todo: 这里执行计算功能
                String input = inputStatement.replaceAll(" ", "");
                char[] chs = input.toCharArray();
                List<String> list = new ArrayList<String>();

                String value = "";
                for (int i = 0; i < chs.length; i++) {
                    if (chs[i] >= '0' && chs[i] <= '9' || chs[i] == '.') {
                        value = value + String.valueOf(chs[i]);
                        if (i == chs.length - 1) {
                            list.add(value);
                        }
                    } else {
                        if (chs[i] == '(') {
                            list.add("(");
                        } else {
                            list.add(value);
                            list.add(String.valueOf(chs[i]));
                        }
                        value = "";
                    }
                }
                while (list.indexOf("") > 0) {
                    list.remove(list.indexOf(""));
                }
            }
                @Override
                public boolean onCreateOptionsMenu (Menu menu){
                    // Inflate the menu; this adds items to the action bar if it is present.
                    getMenuInflater().inflate(R.menu.menu_main, menu);
                    return true;
                }

                @Override
                public boolean onOptionsItemSelected (MenuItem item){
                    // Handle action bar item clicks here. The action bar will
                    // automatically handle clicks on the Home/Up button, so long
                    // as you specify a parent activity in AndroidManifest.xml.
                    int id = item.getItemId();

                    //noinspection SimplifiableIfStatement
                    if (id == R.id.action_settings) {
                        return true;
                    }

                    return super.onOptionsItemSelected(item);
                }
            }
    }