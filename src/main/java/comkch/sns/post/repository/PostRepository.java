package comkch.sns.post.repository;

import comkch.sns.post.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {

    Post insert(Post post);

    void update(Post post);

    void delete(long postId);

    List<Post> findAll();

}
