package edu.uc.cech.soit.myclassjournal.dto;

import org.springframework.stereotype.Service;

@Service
public class JournalEntry {

    private String notes;
    private String date;

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}