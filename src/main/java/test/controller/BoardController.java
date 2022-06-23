package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.service.IndexService;
import test.vo.BoardVo;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private  IndexService indexService;

    @PostMapping("/write")
    public boolean boardWrite(BoardVo boardVo){
        return indexService.boardWrite(boardVo);
    }



}
