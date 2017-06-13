package walden.com.javadesignmode.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import walden.com.javadesignmode.R;
import walden.com.javadesignmode.mode.singleton.SingletonMode1;

public class SingletonModeActivity extends AppCompatActivity {

    @InjectView(R.id.singleton_tv1)
    TextView singleton_tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton_mode);
        ButterKnife.inject(this);
    }

    @OnClick(R.id.singleton_bt1)
    void getHashCode() {
        SingletonMode1 mode1 = SingletonMode1.getInstance();
        singleton_tv1.setText(mode1.hashCode());
    }
}
