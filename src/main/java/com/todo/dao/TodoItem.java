package com.todo.dao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodoItem {
    private int ID;
    private String title;
    private String desc;
    private String current_date;
    private String category;
    private String due_date;
    private boolean isCompleted;
    private int priority;
    private boolean isPinned;

    public TodoItem(String title, String desc, String category, String due_date, boolean isCompleted, int priority, boolean isPinned){
        this.title=title;
        this.desc=desc;
        this.category = category;
        SimpleDateFormat curDate = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss");
        this.current_date= curDate.format(new Date());
        this.due_date = due_date.substring(0, 4) + "/" + due_date.substring(4, 6) + "/" + due_date.substring(6, 8);
        this.isCompleted = isCompleted;
        this.priority = priority;
        this.isPinned = isPinned;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public String toSaveString() {
        return category + "##" + title + "##" + desc + "##" + due_date + "##" + current_date + "\n";
    }

    public void setCurrent_date(String current_date) { this.current_date = current_date; }

    public void setDue_date(String due_date) { this.due_date = due_date; }

    @Override
    public String toString() { return isPinned2String(isPinned) + ((ID<10)?"0"+ID:ID) + " [" + isCompleted2String(isCompleted) + "]" +  " [" + category + "] "
                                    + priority + "순위 " + title + " - " + desc + " - " + due_date + " - " + current_date; }

    public String getCategory() {
        return category;
    }

    public String getDue_date() {
        return due_date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIsCompleted() {
        return (isCompleted)?1:0;
    }

    public String isCompleted2String(boolean isCompleted) {
        return (isCompleted)?"V":" ";
    }

    public int getPriority() {
        return priority;
    }

    public int isPinned2Int() {
        return (isPinned)?1:0;
    }

    public String isPinned2String(boolean isPinned) { return (isPinned)?"[고정됨] ":""; }

    public boolean isPinned() {
        return isPinned;
    }
}