package comkch.sns.post.controller;

import comkch.sns.post.domain.Post;
import comkch.sns.post.domain.PostWriteRequest;
import comkch.sns.post.repository.JdbcPostRepository;
import comkch.sns.post.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
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
        postService.update(new Post(postWriteRequest.getTitle(),postWriteRequest.getContent()));
        return "success";
    }

    @GetMapping("delete/{postId}")
    public String deletePost(@PathVariable Long postId){
        postService.delete(postId);
        return "success";
    }

    @GetMapping("list")
    public String listPost(){
        postService.findAll();
        return "success";
    }


}
