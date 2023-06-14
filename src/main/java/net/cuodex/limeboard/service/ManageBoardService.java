package net.cuodex.limeboard.service;

import net.cuodex.limeboard.entity.LimeBoard;
import net.cuodex.limeboard.repository.LimeboardRepository;
import net.cuodex.limeboard.utils.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class ManageBoardService {


    @Autowired
    private LimeboardRepository limeboardRepository;

    public void createBoard(String title, String description, long timeFrom, long timeTo, int theme, boolean isPublic) {


        LimeBoard board = new LimeBoard();
        board.setTitle(title);
        board.setDescription(description);
        board.setTimeFrom(timeFrom);
        board.setTimeTo(timeTo);
        board.setTheme(theme);
        board.setPublic(isPublic);

        limeboardRepository.save(board);

        System.out.println("Board created! : " + title);


    }
}
