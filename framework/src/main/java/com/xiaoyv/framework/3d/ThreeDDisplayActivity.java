package com.xiaoyv.framework.threeD;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.xiaoyv.framework.BaseActivity;
import com.xiaoyv.framework.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 3D交互展示页面
 * 用于展示非物质文化遗产的3D交互内容
 */
public class ThreeDDisplayActivity extends BaseActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private ThreeDAdapter adapter;
    private List<ThreeDItem> threeDItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_d_display);
        
        initViews();
        initData();
        setupRecyclerView();
    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recycler_view);
        
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("3D文化展示");
        }
    }

    private void initData() {
        threeDItems = new ArrayList<>();
        
        // 添加3D展示项目
        threeDItems.add(new ThreeDItem("传统建筑", "探索古代建筑的精美结构", R.drawable.pic_main_item, "ARCHITECTURE"));
        threeDItems.add(new ThreeDItem("传统服饰", "体验传统服饰的华丽设计", R.drawable.pic_main_item, "COSTUME"));
        threeDItems.add(new ThreeDItem("传统乐器", "聆听传统乐器的美妙音色", R.drawable.pic_main_item, "MUSIC"));
        threeDItems.add(new ThreeDItem("传统工艺", "了解传统工艺的制作过程", R.drawable.pic_main_item, "CRAFT"));
        threeDItems.add(new ThreeDItem("传统舞蹈", "感受传统舞蹈的优美动作", R.drawable.pic_main_item, "DANCE"));
        threeDItems.add(new ThreeDItem("传统绘画", "欣赏传统绘画的艺术魅力", R.drawable.pic_main_item, "PAINTING"));
    }

    private void setupRecyclerView() {
        adapter = new ThreeDAdapter(this, threeDItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        
        adapter.setOnItemClickListener(position -> {
            ThreeDItem item = threeDItems.get(position);
            // 启动3D展示详情页面
            startThreeDDetailActivity(item);
        });
    }

    private void startThreeDDetailActivity(ThreeDItem item) {
        // TODO: 启动3D详情页面
        showToast("启动3D展示: " + item.getTitle());
    }

    public static class ThreeDItem {
        private String title;
        private String description;
        private int imageRes;
        private String category;

        public ThreeDItem(String title, String description, int imageRes, String category) {
            this.title = title;
            this.description = description;
            this.imageRes = imageRes;
            this.category = category;
        }

        public String getTitle() { return title; }
        public String getDescription() { return description; }
        public int getImageRes() { return imageRes; }
        public String getCategory() { return category; }
    }
} 