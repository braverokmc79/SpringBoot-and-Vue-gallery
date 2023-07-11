package org.africalib.gallery.backend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.africalib.gallery.backend.entity.Item;
import org.africalib.gallery.backend.entity.Member;
import org.africalib.gallery.backend.repository.ItemRepository;
import org.africalib.gallery.backend.repository.MemberRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Log4j2
public class AccountController {

    private final MemberRepository memberRepository;


    @PostMapping("/api/account/login")
    public ResponseEntity<?> login(@RequestBody  Map<String, Object> params) throws  Exception{
        String email = (String) params.get("email");
        String password = (String) params.get("password");

        Member member  = memberRepository.findByEmailAndPassword(email, password);

        if(member!=null){
            log.info(" 파라미터값 {} , - {}" ,member.toString());
            return ResponseEntity.status(HttpStatus.OK).body(member.toString());
        }
        return ResponseEntity.status(HttpStatus.OK).body(0);
    }


}
