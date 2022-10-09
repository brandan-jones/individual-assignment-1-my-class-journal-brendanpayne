package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import edu.uc.cech.soit.myclassjournal.service.IJournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController {

    @Autowired
    IJournalService journalService;
    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")
    public String index(Model model) {
        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setDate("2020-01-01");
        journalEntry.setNotes("This is a note");
        model.addAttribute("journalEntry", journalEntry);
        return "start";
    }


}
