package com.walden.javadesignmode.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.walden.javadesignmode.R;
import com.walden.javadesignmode.mode.commandmode.Invoker;
import com.walden.javadesignmode.mode.commandmode.command.AddRequirementCommand;
import com.walden.javadesignmode.mode.commandmode.command.ChangeCodeCommand;
import com.walden.javadesignmode.mode.commandmode.command.DeletePageCommand;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class CommandActivity extends AppCompatActivity {

    @InjectView(R.id.description)
    TextView description;
    @InjectView(R.id.command_result)
    TextView command_result;
    private Invoker invoker;
    private AddRequirementCommand requirementCommand;
    private ChangeCodeCommand codeCommand;
    private DeletePageCommand pageCommand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
        ButterKnife.inject(this);
        init();
        initView();
    }

    private void init() {
        invoker = new Invoker();
    }

    private void initView() {
        description.setText(getString(R.string.command_mode));
    }

    @OnClick(R.id.command_bt1)
    void bt1() {
        if (requirementCommand == null) {
            requirementCommand = new AddRequirementCommand();
        }
        invoker.setCommand(requirementCommand);
        String result = invoker.action();
        command_result.setText(result);
    }

    @OnClick(R.id.command_bt2)
    void bt2() {
        if (codeCommand == null) {
            codeCommand = new ChangeCodeCommand();
        }
        invoker.setCommand(codeCommand);
        String result = invoker.action();
        command_result.setText(result);
    }

    @OnClick(R.id.command_bt3)
    void bt3() {
        if (pageCommand == null) {
            pageCommand = new DeletePageCommand();
        }
        invoker.setCommand(pageCommand);
        String result = invoker.action();
        command_result.setText(result);
    }
}
