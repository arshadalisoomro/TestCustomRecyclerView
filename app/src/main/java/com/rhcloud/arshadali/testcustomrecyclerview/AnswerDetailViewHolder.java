package com.rhcloud.arshadali.testcustomrecyclerview;

import android.view.View;
import android.widget.TextView;


/**
 * Created by Arshay on 9/12/2016.
 */
public class AnswerDetailViewHolder extends ViewHolder {
    private final View mView;
    private TextView mAnswerDescView;

    public AnswerDetailViewHolder(View itemView) {
        super(itemView);
        mView = itemView;

        mAnswerDescView = (TextView) itemView.findViewById(R.id.row_detail_answer_description);

    }

    public void setDescText(final String text) {
        if (text == null || text.isEmpty()) {
            mAnswerDescView.setVisibility(View.GONE);
            return;
        } else {
            mAnswerDescView.setVisibility(View.VISIBLE);
            mAnswerDescView.setText(text);
        }
    }


}
