package com.rhcloud.arshadali.testcustomrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * Created by Arshay on 9/12/2016.
 */
public class PostDetailAdapter extends RecyclerView.Adapter<ViewHolder>  {

    private static final String TAG = PostDetailAdapter.class.getName();

    private Context mContext;
    public static final int POST_QUESTION = 0;

    public PostDetailAdapter(Context mContext){
        this.mContext = mContext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v;
        try {
            if (viewType == POST_QUESTION) {
                v = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.row_detail_question, viewGroup, false);
                return new PostDetailViewHolder(v);
            } else {
                v = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.row_detail_answer, viewGroup, false);
                return new AnswerDetailViewHolder(v);
            }
        }catch (Exception e){
            Toast.makeText(mContext, "Error caused by " + e.getCause(), Toast.LENGTH_SHORT).show();
            Log.e(TAG, "Error caused by " + e.getCause());
            return null;
        }
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        if (viewHolder.getItemViewType() == POST_QUESTION) {
            PostDetailViewHolder postDetailViewHolder = (PostDetailViewHolder) viewHolder;
            postDetailViewHolder.setTitleText("Question title");
            postDetailViewHolder.setDescText("Three ViewHolders are needed, " +
                    "one for each type of the card and they all inherit from a " +
                    "generic ViewHolder class. In onCreateViewHolder check for view " +
                    "type and inflate the corresponding card xml. In onBindViewHolder " +
                    "again check the view type and set data to the views.");
        }
        else {
            AnswerDetailViewHolder answerDetailViewHolder = (AnswerDetailViewHolder) viewHolder;
            answerDetailViewHolder.setDescText("There are three types of cards namely " +
                    "weather, news & score card. The key for implementation lies with " +
                    "the getItemViewType method in RecyclerView.Adapter. The default " +
                    "implementation of this method returns 0, making the assumption of a " +
                    "single view type for the adapter. We need to override it and provide " +
                    "item type for each item.");
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }


}
