package ws.wolfsoft.feedme_profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.roughike.bottombar.BottomBar;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {


    BottomBar bottomBar;

    String[] tv1 = {"Payment Method","Reward Credits","Settings","Invite Friends"};

    Integer[] imagehistory = {R.drawable.payment_method,
            R.drawable.reward_credits,R.drawable.settings,R.drawable.invite_friends};
    Integer[] image1 ={R.drawable.ic_chevron_right_black_24dp,R.drawable.ic_chevron_right_black_24dp,R.drawable.ic_chevron_right_black_24dp,
            R.drawable.ic_chevron_right_black_24dp};

    private RecyclerView recyclerView;
    private Nevigation_Adapter nevigation_adapter;
    private ArrayList<Nevigation_Model> nevigation_models;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        recyclerView = findViewById(R.id.recycle11);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ProfileActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        nevigation_models = new ArrayList<>();

        for(int i=0;i < imagehistory.length;i++) {
            Nevigation_Model ab = new Nevigation_Model(tv1[i],imagehistory[i],image1[i]);
            nevigation_models.add(ab);
        }
        nevigation_adapter = new Nevigation_Adapter(ProfileActivity.this,nevigation_models);
        recyclerView.setAdapter(nevigation_adapter);
    }
}
