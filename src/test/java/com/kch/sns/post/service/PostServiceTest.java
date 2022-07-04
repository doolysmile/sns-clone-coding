package com.kch.sns.post.service;

import com.kch.sns.post.domain.Post;
import com.kch.sns.post.repository.JdbcPostRepository;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

class PostServiceTest {

    private final JdbcPostRepository jdbcPostRepository;

    PostServiceTest(JdbcPostRepository jdbcPostRepository) {
        this.jdbcPostRepository = jdbcPostRepository;
    }

    @Test
    public void 포스트추가() throws Exception {
        //Given
        Post post = jdbcPostRepository.insert(new Post("test2", "test2222222"));
        //When
        assertThat(post, Matchers.is(notNullValue()));

        //Then

        }
}