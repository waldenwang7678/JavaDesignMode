package walden.com.javadesignmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;
import walden.com.javadesignmode.activity.ProxyActivity;
import walden.com.javadesignmode.activity.StragegyActivity;
import walden.com.javadesignmode.bean.StragegyBean;

public class MainActivity extends AppCompatActivity {
    public ArrayList<StragegyBean> mData = new ArrayList<>();

    @InjectView(R.id.list)
    public ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        initData();
        initView();
    }

    private void initData() {
        mData.add(new StragegyBean("策略模式", StragegyActivity.class));
        mData.add(new StragegyBean("代理模式", ProxyActivity.class));
    }

    private void initView() {
        list.setAdapter(new MyAdapter());
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, mData.get(position).clazz);
                startActivity(intent);
            }
        });
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public Object getItem(int position) {
            return mData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = View.inflate(MainActivity.this, R.layout.stragegy_mode_item, null);
            TextView tv = (TextView) view.findViewById(R.id.item);
            tv.setText(mData.get(position).name);
            return view;
        }
    }
}
