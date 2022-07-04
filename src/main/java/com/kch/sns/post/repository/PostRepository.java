package com.kch.sns.post.repository;

import com.kch.sns.post.domain.Post;

import java.util.List;

public interface PostRepository {

    Post insert(Post post);

    void update(Post post);

    void delete(long postId);

    List<Post> findAll();

}
