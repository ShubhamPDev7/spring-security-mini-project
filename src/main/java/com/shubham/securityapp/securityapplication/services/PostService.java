package com.shubham.securityapp.securityapplication.services;

import com.shubham.securityapp.securityapplication.dto.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long id);
}
