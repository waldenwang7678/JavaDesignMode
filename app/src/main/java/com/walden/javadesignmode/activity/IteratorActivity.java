package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.iteratormode.IProject;
import com.walden.javadesignmode.mode.iteratormode.IProjectIterator;
import com.walden.javadesignmode.mode.iteratormode.Project;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class IteratorActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;

    @InjectView(R.id.iterator_result)
    TextView iterator_result;
    private IProjectIterator iterator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);
        ButterKnife.inject(this);
        init();
        initView();
    }

    private void init() {
        IProject project = new Project();
        project.add("dota", 10, 100);
        project.add("lol", 10, 70);
        project.add("王者农药", 10, 40);
        iterator = project.iterator();
    }

    private void initView() {
        description.setText(getString(R.string.iterator_mode));
    }

    @OnClick(R.id.iterator_bt1)
    void bt1() {
        StringBuilder builder = new StringBuilder();

        if (iterator != null) {
            while (iterator.hasNext()) {
                IProject next = (IProject) iterator.next();
                builder.append(next.getProjectInfo());
            }
        }
        iterator_result.setText(builder.toString());
    }
}
