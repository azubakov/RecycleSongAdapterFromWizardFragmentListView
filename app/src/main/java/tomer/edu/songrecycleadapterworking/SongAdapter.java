package tomer.edu.songrecycleadapterworking;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

//import tomer.edu.songrecycleadapterworking.SongRecycleFragment_old.OnListFragmentInteractionListener;
import tomer.edu.songrecycleadapterworking.Songs.Song;
//import tomer.edu.songrecycleadapterworking.Songs.Song_old.DummyItem;

import java.util.ArrayList;


public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {

    //private final List<DummyItem> mValues;
    private LayoutInflater inflater;
    private final ArrayList<Song> data;
    private Context context;
    //private final OnListFragmentInteractionListener mListener;

    public SongAdapter(Context context, ArrayList<Song> data) {
        this.inflater = LayoutInflater.from(context);
        this.context = context;
        //mValues = items;
        this.data = data;
        //mListener = listener;
        //this.listener = listener;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.song_item, parent, false);
        /*View itemView = LayoutInflater.from(parent.getContext())
                //.inflate(R.layout.fragment_item_old, parent, false);
                .inflate(R.layout.song_item, parent, false);
        ImageView mImage;*/
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        Song item = data.get(position);
        //holder.mItem = mValues.get(position);
        //holder.mIdView.setText(mValues.get(position).id);
        //holder.mIdView.setText(mValues.get(position).tvTitle);
        //holder.mContentView.setText(mValues.get(position).tvDescription);


        holder.tvTitle.setText(item.getTitle());
        holder.tvDescription.setText(item.getDescription());
        holder.ivCheese.setImageResource(item.getImageResId());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvTitle;
        TextView tvDescription;
        ImageView ivCheese;


        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDescription = (TextView) itemView.findViewById(R.id.tvDescription);
            ivCheese = (ImageView) itemView.findViewById(R.id.cheeseImage);
        }



        @Override
        public String toString() {
            return super.toString() + " '" + tvDescription.getText() + "'";
        }

        @Override
        public void onClick(View view) {

        }
    }
}
