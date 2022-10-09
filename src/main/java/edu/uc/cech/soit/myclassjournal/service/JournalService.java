package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dao.IJournalEntryDAO;
import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService implements IJournalService {

    @Autowired
    IJournalEntryDAO journalEntryDAO;

    @Override
    public JournalEntry save(JournalEntry journalEntry) {
        try {
            return journalEntryDAO.save(journalEntry);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return journalEntryDAO.fetchAll();
    }
}
