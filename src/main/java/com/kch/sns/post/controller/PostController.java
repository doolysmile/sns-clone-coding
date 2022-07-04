package com.kch.sns.post.controller;

import com.kch.sns.post.service.PostService;
import com.kch.sns.post.domain.Post;
import com.kch.sns.post.domain.PostWriteRequest;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("post")
public class PostController {

    private final PostService postService;

    @PostMapping("write")
    public String writePost(@RequestBody PostWriteRequest postWriteRequest){
        postService.insert(new Post(postWriteRequest.getTitle(),postWriteRequest.getContent()));
        return "success";
    }

    @PostMapping("update")
    public String updatePost(@RequestBody PostWriteRequest postWriteRequest){
        postService.update(new Post(postWriteRequest.getSeq(), postWriteRequest.getTitle(), postWriteRequest.getContent()));
        return "success";
    }

    @GetMapping("delete/{postId}")
    public String deletePost(@PathVariable Long postId){
        postService.delete(postId);
        return "success";
    }

    @GetMapping("list")
    public String listPost(){
        List<Post> all = postService.findAll();
        for(int i = 0; i < all.size(); i++){
            System.out.println(all.get(i).getSeq());
            System.out.println(all.get(i).getTitle());
            System.out.println(all.get(i).getContent());
        }
        return "successlist";
    }


}
