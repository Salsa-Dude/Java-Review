package com.Joseph;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String tile) {
        this.title = tile;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);
    }


}
