package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
public @Data
class JournalEntry {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String notes;
    private String date;

    @OneToMany(mappedBy = "journalEntry")
    private List<JournalEntry> journalEntries;

}
