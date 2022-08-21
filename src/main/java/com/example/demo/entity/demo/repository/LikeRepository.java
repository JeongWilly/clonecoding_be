package com.example.demo.entity.demo.repository;

import com.example.demo.entity.demo.entity.Articles;
import com.example.demo.entity.demo.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Collection;

public interface LikeRepository extends JpaRepository<Like,Long> {

//    Optional<Like> findLikeByUserAndArticles(String user, Long id);
//    void deleteLikeByUserAndArticles(User user, Articles articles);



    Long countByArticles(Articles target);

//    Collection<Object> findByArticlesAndUser(Articles articles, String username);

    Collection<Object> findByArticlesAndUsername(Articles target, String userName);

    Like findByUsernameAndArticles(String username, Articles target);


//    Collection<Object> findByArticlesAndUserName(String username, Long articlesId);
}

