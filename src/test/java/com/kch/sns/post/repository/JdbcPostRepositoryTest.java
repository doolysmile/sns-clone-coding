package com.kch.sns.post.repository;

import com.kch.sns.post.domain.Post;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class JdbcPostRepositoryTest {

    private JdbcPostRepository jdbcPostRepository;

    @Test
    public void test() throws Exception {
        //Given
        List<Post> res = jdbcPostRepository.findAll();
        //When
        System.out.println(res.get(0).getSeq());
        System.out.println(res.get(0).getTitle());
        System.out.println(res.get(0).getContent());

        //Then

        }

}