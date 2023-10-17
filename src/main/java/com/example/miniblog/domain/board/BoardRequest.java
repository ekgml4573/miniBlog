package com.example.miniblog.domain.board;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardRequest {

    private Long id; //게시글 id
    private String user_id; //작성자
    private String title; //제목
    private String contents; //내용
    private String file_name; //파일명
    private String file_path; //파일 경로
    private LocalDateTime uploaded_at; //업로드 일시
    private LocalDateTime modified_at; //수정 일시
    private Boolean delete_yn; //삭제여부 (0: 게시/1: 삭제)

}
