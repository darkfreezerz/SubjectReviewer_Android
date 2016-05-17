package com.example.dismemberz.subjectreviewer.model;

/**
 * Created by DisMeMBeRz on 5/17/16 AD.
 */
public class Subject {
    private String sub_id;
    private String sub_name;
    private String sub_eng_name;
    private String sub_ins;
    private String category_cate_id;
    private String faculty_fac_id;
    private String sub_des;

    public String getSub_id() {
        return sub_id;
    }

    public void setSub_id(String sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_name() {
        return sub_name;
    }

    public void setSub_name(String sub_name) {
        this.sub_name = sub_name;
    }

    public String getSub_eng_name() {
        return sub_eng_name;
    }

    public void setSub_eng_name(String sub_eng_name) {
        this.sub_eng_name = sub_eng_name;
    }

    public String getSub_ins() {
        return sub_ins;
    }

    public void setSub_ins(String sub_ins) {
        this.sub_ins = sub_ins;
    }

    public String getCategory_cate_id() {
        return category_cate_id;
    }

    public void setCategory_cate_id(String category_cate_id) {
        this.category_cate_id = category_cate_id;
    }

    public String getFaculty_fac_id() {
        return faculty_fac_id;
    }

    public void setFaculty_fac_id(String faculty_fac_id) {
        this.faculty_fac_id = faculty_fac_id;
    }

    public String getSub_des() {
        return sub_des;
    }

    public void setSub_des(String sub_des) {
        this.sub_des = sub_des;
    }
}
