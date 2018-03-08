package com.sungjunpizz.webservice.service;

import com.sungjunpizz.webservice.domain.posts.PostsRepository;
import com.sungjunpizz.webservice.dto.posts.PostSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostSaveRequestDto dto){
        return postsRepository.save(dto.toEntity()).getId();
    }
}
