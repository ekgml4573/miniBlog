package com.example.miniblog.domain.board;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponse {

    private Long id; //게시글 id
    private String userId; //작성자
    private String title; //제목
    private String contents; //내용
    private String fileName; //파일명
    private String filePath; //파일 경로
    private LocalDateTime uploadedAt; //업로드 일시
    private LocalDateTime modifiedAt; //수정 일시
    private Boolean deleteYn; //삭제여부 (0: 게시/1: 삭제)

}
