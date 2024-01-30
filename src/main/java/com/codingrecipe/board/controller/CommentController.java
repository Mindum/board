package com.codingrecipe.board.controller;


import com.codingrecipe.board.dto.CommetDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    @PostMapping("/save")
    public String save(@ModelAttribute CommetDTO commentDTO){
        System.out.println("commentDTO = " + commentDTO);
        return "요청 성공";
    }

}
