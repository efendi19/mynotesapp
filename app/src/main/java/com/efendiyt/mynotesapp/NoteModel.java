package com.efendiyt.mynotesapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NoteModel {
    @Expose
    @SerializedName("id") private int id;
    @Expose
    @SerializedName("title") private String title;
    @Expose
    @SerializedName("note") private String note;
    @Expose
    @SerializedName("color") private int color;
    @Expose
    @SerializedName("message") private String message;
    @Expose
    @SerializedName("success") private Boolean success;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
