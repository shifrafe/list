


package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;


public class BookAdapter extends RecyclerView.Adapter<BookAdapter.CustomRecyclerViewHolder> {

   private List<BookModel> mItems;
    private Context mContext;
    private LayoutInflater layoutInflater;

    BookAdapter(Context context, List<BookModel> items){
        mContext = context;
        mItems = items;
        this.layoutInflater = LayoutInflater.from(context); }

    @Override
    public CustomRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.page_card, parent, false);
        return new CustomRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerViewHolder holder, int position) {
        // holder.image.setImageBitmap();
        BookModel bookModel = mItems.get(position);
        holder.image.setImageBitmap(bookModel.getBit());
        holder.name.setText(bookModel.getName());
        holder.author.setText(bookModel.getAuthor());
        //holder.cardView.setBackgroundColor(ContextCompat.getColor(mContext, R.color.colorAccent));
        //   holder.mDeleteRow.setVisibility(View.INVISIBLE);

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    public class CustomRecyclerViewHolder extends RecyclerView.ViewHolder{
        private ImageView image;
        private CardView cardView;
        private TextView name,author;
        public CustomRecyclerViewHolder(View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.photoImage);
            cardView =itemView.findViewById(R.id.card_holder);
            name = itemView.findViewById(R.id.page_card_name);
            author = itemView.findViewById(R.id.page_card_author);
        }

    }
}