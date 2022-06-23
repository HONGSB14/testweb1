package test.service;

import test.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.vo.BoardVo;

@Service
public class IndexService {
    @Autowired
    BoardMapper boardMapper;

    public boolean boardWrite(BoardVo boardVo){
        System.out.println(boardVo.toString());
        boardMapper.saveBoard(boardVo);
        System.out.println("3");
        return true;
    }
}
