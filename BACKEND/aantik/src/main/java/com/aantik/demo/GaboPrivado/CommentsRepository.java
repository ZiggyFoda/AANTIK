package com.aantik.demo.GaboPrivado;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aantik.demo.GaboPrivado.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Long>{
    

    Set<Comments> findByIdPost(String idPost);
    
}
