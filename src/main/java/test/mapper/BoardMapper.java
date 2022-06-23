package test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import test.vo.BoardVo;

import java.util.List;
import java.util.Optional;

@Mapper
public interface BoardMapper {

     List<BoardVo> getBoard();
    Optional<BoardVo> saveBoard(BoardVo boardVo);
}
