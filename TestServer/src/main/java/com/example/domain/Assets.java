package com.example.domain;

public class Assets {
    // ASSETS table
    String asset_no;
    String asset_type_code;
    String user_name;
    String asset_model_name;
    String asset_serial_no;
    String use_start_date;
    String asset_stat;
    String asset_pjt_loc;
    String etc;
    String reg_date;

    public Assets() {
    }

    // 단축키 Alt + Insert
    public String getAsset_no() {
        return asset_no;
    }

    public void setAsset_no(String asset_no) {
        this.asset_no = asset_no;
    }

    public String getAsset_type_code() {
        return asset_type_code;
    }

    public void setAsset_type_code(String asset_type_code) {
        this.asset_type_code = asset_type_code;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getAsset_model_name() {
        return asset_model_name;
    }

    public void setAsset_model_name(String asset_model_name) {
        this.asset_model_name = asset_model_name;
    }

    public String getAsset_serial_no() {
        return asset_serial_no;
    }

    public void setAsset_serial_no(String asset_serial_no) {
        this.asset_serial_no = asset_serial_no;
    }

    public String getUse_start_date() {
        return use_start_date;
    }

    public void setUse_start_date(String use_start_date) {
        this.use_start_date = use_start_date;
    }

    public String getAsset_stat() {
        return asset_stat;
    }

    public void setAsset_stat(String asset_stat) {
        this.asset_stat = asset_stat;
    }

    public String getAsset_pjt_loc() {
        return asset_pjt_loc;
    }

    public void setAsset_pjt_loc(String asset_pjt_loc) {
        this.asset_pjt_loc = asset_pjt_loc;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }
}
