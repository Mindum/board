package com.codingrecipe.board.service;

import com.codingrecipe.board.dto.BoardDTO;
import com.codingrecipe.board.entity.BoardEntity;
import com.codingrecipe.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


// DTO -> Entity (엔티티 클래스에서 작업)
// Entity -> DTO 변환하는 작업을 함 (DTO 클래스에서 작업 )

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository; //repository는 기본적으로 엔티티 클래스에서만 사용된다
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }

}
