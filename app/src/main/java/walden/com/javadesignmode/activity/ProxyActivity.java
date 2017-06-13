package walden.com.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import walden.com.javadesignmode.R;
import walden.com.javadesignmode.mode.proxy.AIPlayGame;
import walden.com.javadesignmode.mode.proxy.DogPlayGame;

public class ProxyActivity extends AppCompatActivity {
    @InjectView(R.id.proxy_tv1)
    TextView proxy_tv1;
 @InjectView(R.id.proxy_description)
    TextView proxy_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        ButterKnife.inject(this);
        initView();
    }

    private void initView() {
        proxy_description.setText(getResources().getString(R.string.proxy_description));
    }

    @OnClick(R.id.proxy_bt1)
    void proxy_bt1() {
        AIPlayGame ai = new AIPlayGame();
        DogPlayGame dog = new DogPlayGame(ai);
        proxy_tv1.setText(dog.play());
    }
}
