package com.example.m1k3y.projecti.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.m1k3y.projecti.R;
import com.example.m1k3y.projecti.adapters.MessageAdapter;
import com.example.m1k3y.projecti.models.MessageModel;
import com.example.m1k3y.projecti.models.PassingDataModel;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RoomActivity extends AppCompatActivity {

    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.tv_time)
    TextView tvTime;
    @BindView(R.id.iv_collapse)
    ImageView ivCollapse;
    @BindView(R.id.iv_send)
    ImageView ivSend;
    @BindView(R.id.et_typing_message)
    EditText etTypingMessage;
    @BindView(R.id.iv_more)
    ImageView ivMore;
    @BindView(R.id.rv_messages)
    RecyclerView rvMessages;

    private List<MessageModel> messageModelList = new ArrayList<>();
    private PassingDataModel passingDataModel;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_room);
        ButterKnife.bind(this);
        getSupportActionBar().hide();

        setupDatabase();
        Initialization();
        setupUI();
    }

    private void setupUI() {

    }

    private void Initialization() {

        passingDataModel = (PassingDataModel) getIntent().getSerializableExtra("passing_data_model");

        messageModelList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            messageModelList.add(new MessageModel(
                    i + "time ",
                    passingDataModel.getUsername(),
                    passingDataModel.getAccountId(),
                    passingDataModel.getProfileDrawable()
            ));

        }

        MessageAdapter messageAdapter = new MessageAdapter(messageModelList, this);
        rvMessages.setLayoutManager(new GridLayoutManager(this, 1));
        rvMessages.setAdapter(messageAdapter);
    }

    private void setupDatabase() {
        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseDatabase.setPersistenceEnabled(true);
        databaseReference = FirebaseDatabase.getInstance().getReference();

        databaseReference.


    }

    @OnClick({R.id.iv_back, R.id.iv_collapse, R.id.iv_send, R.id.iv_more})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                onBackPressed();
                break;
            case R.id.iv_collapse:
                break;
            case R.id.iv_send:


                break;
            case R.id.iv_more:
                break;
        }
    }
}
