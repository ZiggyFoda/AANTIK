package com.aantik.demo.control;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.aantik.demo.GaboPrivado.*;
import com.aantik.demo.Payload.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
//@RequestMapping("/comments")
public class CommentController {
    
    @Autowired
    CommentsRepository repo;

    @PostMapping("/make")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody Comments comment) {

        System.out.println(comment.getCreatedby());
        System.out.println(comment.getCommentBody());
        System.out.println(comment.getIdPost());
        comment.setCreateDate(LocalDate.now());
        repo.save(comment);

        return ResponseEntity.ok(repo.findAll());
	}
    @GetMapping("/foro")
    public ResponseEntity<Set<Comments>> getComments(){ //assigment id

        
    return ResponseEntity.ok(repo.findByIdPost("ss"));
    }


}
