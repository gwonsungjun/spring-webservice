package com.sungjunpizz.webservice.web;

import com.sungjunpizz.webservice.domain.posts.PostsRepository;
import com.sungjunpizz.webservice.dto.posts.PostSaveRequestDto;
import com.sungjunpizz.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController{

    private PostsRepository postsRepository;
    private PostsService postsService;

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostSaveRequestDto dto ){
        return postsService.save(dto);
    }
}