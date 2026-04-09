package com.shubham.securityapp.securityapplication.utils;

import com.shubham.securityapp.securityapplication.dto.PostDTO;
import com.shubham.securityapp.securityapplication.entities.User;
import com.shubham.securityapp.securityapplication.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostSecurity {

    private final PostService postService;

    boolean isOwnerOfPost(Long postId) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        PostDTO post = postService.getPostById(postId);
        return post.getAuthor().getId().equals(user.getId());
    }

}
