package com.codingrecipe.board.repository;

import com.codingrecipe.board.entity.BoardEntity;
import com.codingrecipe.board.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
    // select * from commet_table where board_id=? order by id desc; 쿼리문
    List<CommentEntity> findAllByBoardEntityOrderByIdDesc(BoardEntity boardEntity);

}
