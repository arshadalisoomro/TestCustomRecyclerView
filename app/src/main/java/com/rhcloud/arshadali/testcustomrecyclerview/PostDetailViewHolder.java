package com.rhcloud.arshadali.testcustomrecyclerview;

import android.view.View;
import android.widget.TextView;

/**
 * Created by Arshay on 9/12/2016.
 */
public class PostDetailViewHolder extends ViewHolder {
    private final View mView;
    private TextView mPostTitleView,mPostDescView;

    public PostDetailViewHolder(View itemView) {
        super(itemView);
        mView = itemView;

        mPostTitleView = (TextView) itemView.findViewById(R.id.row_detail_question_title);
        mPostDescView = (TextView) itemView.findViewById(R.id.row_detail_question_description);

    }

    public void setTitleText(final String text) {
        if (text == null || text.isEmpty()) {
            mPostTitleView.setVisibility(View.GONE);
            return;
        } else {
            mPostTitleView.setVisibility(View.VISIBLE);
            mPostTitleView.setText(text);
        }
    }

    public void setDescText(final String text) {
        if (text == null || text.isEmpty()) {
            mPostDescView.setVisibility(View.GONE);
            return;
        } else {
            mPostDescView.setVisibility(View.VISIBLE);
            mPostDescView.setText(text);
        }
    }


}
