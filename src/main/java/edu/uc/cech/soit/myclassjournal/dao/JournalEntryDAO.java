package edu.uc.cech.soit.myclassjournal.dao;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class JournalEntryDAO implements IJournalEntryDAO {

    Map<Integer, JournalEntry> journalEntryMap = new HashMap<>();
    @Override
    public JournalEntry save(JournalEntry journalEntry) throws Exception {
        journalEntryMap.put(journalEntryMap.size() + 1, journalEntry);
        return journalEntry;
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return new ArrayList<>(journalEntryMap.values());
    }

    @Override
    public JournalEntry fetchById(int id) {
        return journalEntryMap.get(id);
    }

    @Override
    public void deleteById(int id) {
        journalEntryMap.remove(id);
    }

    @Override
    public List<JournalEntry> fetchByDate(String date) {
       return new ArrayList<JournalEntry>();
    }
}
