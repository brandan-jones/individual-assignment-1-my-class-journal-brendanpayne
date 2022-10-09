package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;

import java.util.List;

public interface IJournalEntryDAO {
    JournalEntry save(JournalEntry journalEntry) throws Exception;

    List<JournalEntry> fetchAll();

    JournalEntry fetchById(int id);

    void deleteById(int id);

    List<JournalEntry> fetchByDate(String date);
}
