package org.koreait.models.board;

import lombok.Data;

import java.time.LocalDateTime;

//게시판
@Data
public class Board {
    private Long id; //게시글 번호
    private String subject; // 제목
    private String content; //내용
    private LocalDateTime regDt; //등록 일시
    private LocalDateTime modDt; //수정 일시
}
