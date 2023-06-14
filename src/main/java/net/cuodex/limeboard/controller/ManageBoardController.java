package net.cuodex.limeboard.controller;

import net.cuodex.limeboard.dto.CreateBoardDto;
import net.cuodex.limeboard.dto.LoginDto;
import net.cuodex.limeboard.entity.LimeUser;
import net.cuodex.limeboard.service.AuthenticationService;
import net.cuodex.limeboard.service.ManageBoardService;
import net.cuodex.limeboard.utils.DefaultReturnable;
import net.cuodex.limeboard.utils.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/board")
public class ManageBoardController {

    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private ManageBoardService boardManageService;

    @PostMapping()
    public ResponseEntity<DefaultReturnable> createBoard(@Valid @RequestBody CreateBoardDto createBoardDto, HttpServletRequest request) {

        boardManageService.createBoard(createBoardDto.getTitle(), createBoardDto.getDescription(),
                createBoardDto.getTimeFrom(), createBoardDto.getTimeTo(),
                createBoardDto.getTheme(), createBoardDto.isPublic());

        DefaultReturnable returnable = new DefaultReturnable(HttpStatus.OK, "Board successfully created.");

        return returnable.getResponseEntity();
    }

}
