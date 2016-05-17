package com.example.dismemberz.subjectreviewer.model;

/**
 * Created by DisMeMBeRz on 5/17/16 AD.
 */
public class Review {
    private String user_id;
    private String sub_id;
    private String comment;
    private String star;

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
}
