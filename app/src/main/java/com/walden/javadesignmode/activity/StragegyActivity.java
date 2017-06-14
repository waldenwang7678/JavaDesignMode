package walden.com.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import walden.com.javadesignmode.R;
import walden.com.javadesignmode.mode.stragegy.BlackDoor;
import walden.com.javadesignmode.mode.stragegy.BlockEnemy;
import walden.com.javadesignmode.mode.stragegy.GreenLight;
import walden.com.javadesignmode.mode.stragegy.StragegyManager;

public class StragegyActivity extends AppCompatActivity {
    @InjectView(R.id.showtips)
    TextView showtips;
    @InjectView(R.id.description)
    TextView description;
    StragegyManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stragegy);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        description.setText(getResources().getString(R.string.stragegy_description));
    }

    @OnClick(R.id.bt1)
    void bt1() {
        if (manager == null) {
            manager = StragegyManager.getInstance();
        }
        manager.setmStrategy(new BlackDoor());
        showtips.setText(manager.operate());
    }

    @OnClick(R.id.bt2)
    void bt2() {
        if (manager == null) {
            manager = StragegyManager.getInstance();
        }
        manager.setmStrategy(new GreenLight());
        showtips.setText(manager.operate());
    }

    @OnClick(R.id.bt3)
    void bt3() {
        if (manager == null) {
            manager = StragegyManager.getInstance();
        }
        manager.setmStrategy(new BlockEnemy());
        showtips.setText(manager.operate());
    }

}
