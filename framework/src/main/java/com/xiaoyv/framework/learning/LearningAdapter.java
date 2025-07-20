package com.xiaoyv.framework.learning;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.xiaoyv.framework.R;

import java.util.List;

/**
 * 学习列表适配器
 */
public class LearningAdapter extends RecyclerView.Adapter<LearningAdapter.ViewHolder> {

    private Context context;
    private List<CultureLearningActivity.LearningItem> items;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public LearningAdapter(Context context, List<CultureLearningActivity.LearningItem> items) {
        this.context = context;
        this.items = items;
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_learning, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CultureLearningActivity.LearningItem item = items.get(position);
        
        holder.titleText.setText(item.getTitle());
        holder.descriptionText.setText(item.getDescription());
        holder.imageView.setImageResource(item.getImageRes());
        holder.ratingBar.setRating(item.getRating());
        holder.ratingText.setText(String.format("%.1f", item.getRating()));
        
        holder.cardView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        ImageView imageView;
        TextView titleText;
        TextView descriptionText;
        RatingBar ratingBar;
        TextView ratingText;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            imageView = itemView.findViewById(R.id.image_view);
            titleText = itemView.findViewById(R.id.title_text);
            descriptionText = itemView.findViewById(R.id.description_text);
            ratingBar = itemView.findViewById(R.id.rating_bar);
            ratingText = itemView.findViewById(R.id.rating_text);
        }
    }
} 