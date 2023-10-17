package com.example.miniblog.domain.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/main")
    public String getList(Model model) {
        List<BoardResponse> list = boardService.getList();
        model.addAttribute("list", list);

        return "board/main";
    }
}
