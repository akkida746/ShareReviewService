package com.example.demo.service;

import com.example.demo.dto.PostDto;
import com.example.demo.entity.Post;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    List<Post> posts = new ArrayList<>();
    {
        posts.add(new Post(1, "First post"));
    }

    @Override
    public List<PostDto> getPosts(){
        List<PostDto> postList = new ArrayList<>();
        for(Post post: posts){
            PostDto postDto = new PostDto();
            BeanUtils.copyProperties(post, postDto);
            postList.add(postDto);
        }
        return postList;
    }
}
