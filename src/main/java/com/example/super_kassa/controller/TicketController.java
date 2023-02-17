package com.example.super_kassa.controller;

import com.example.super_kassa.config.MyJson;
import com.example.super_kassa.dto.Add;
import com.example.super_kassa.service.TicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TicketController {
    private final TicketService service ;
    @PostMapping("/modify")
    public ResponseEntity<MyJson> updateObj (@RequestBody Add add) {

            MyJson myJson = service.saveAddToCurrent(add);

            return new ResponseEntity<>(myJson, HttpStatus.ACCEPTED);

    }
}
