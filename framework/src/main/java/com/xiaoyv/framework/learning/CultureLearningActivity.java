package com.xiaoyv.framework.learning;

import android.os.Bundle;
import android.view.View;
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
 * 文化学习页面
 * 提供互动学习功能
 */
public class CultureLearningActivity extends BaseActivity {

    private Toolbar toolbar;
    private RecyclerView recyclerView;
    private LearningAdapter adapter;
    private List<LearningItem> learningItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_learning);
        
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
            getSupportActionBar().setTitle("文化学习");
        }
    }

    private void initData() {
        learningItems = new ArrayList<>();
        
        // 添加学习项目
        learningItems.add(new LearningItem("传统节日", "了解中国传统节日的由来和习俗", R.drawable.pic_main_item, "FESTIVAL", 4.8f));
        learningItems.add(new LearningItem("古代诗词", "学习经典古诗词的意境和内涵", R.drawable.pic_main_item, "POETRY", 4.9f));
        learningItems.add(new LearningItem("传统礼仪", "掌握中华传统礼仪文化", R.drawable.pic_main_item, "ETIQUETTE", 4.7f));
        learningItems.add(new LearningItem("历史故事", "聆听历史人物的传奇故事", R.drawable.pic_main_item, "HISTORY", 4.6f));
        learningItems.add(new LearningItem("传统工艺", "学习传统工艺的制作技巧", R.drawable.pic_main_item, "CRAFT", 4.8f));
        learningItems.add(new LearningItem("戏曲艺术", "欣赏传统戏曲的艺术魅力", R.drawable.pic_main_item, "OPERA", 4.5f));
    }

    private void setupRecyclerView() {
        adapter = new LearningAdapter(this, learningItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        
        adapter.setOnItemClickListener(position -> {
            LearningItem item = learningItems.get(position);
            // 启动学习详情页面
            startLearningDetailActivity(item);
        });
    }

    private void startLearningDetailActivity(LearningItem item) {
        // TODO: 启动学习详情页面
        showToast("开始学习: " + item.getTitle());
    }

    public static class LearningItem {
        private String title;
        private String description;
        private int imageRes;
        private String category;
        private float rating;

        public LearningItem(String title, String description, int imageRes, String category, float rating) {
            this.title = title;
            this.description = description;
            this.imageRes = imageRes;
            this.category = category;
            this.rating = rating;
        }

        public String getTitle() { return title; }
        public String getDescription() { return description; }
        public int getImageRes() { return imageRes; }
        public String getCategory() { return category; }
        public float getRating() { return rating; }
    }
} 