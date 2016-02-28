package com.sbv_tech.remindme.dto;

/**
 * Created by sergey.bondarenok on 2/28/16.
 */
public class RemindDTO {
    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
