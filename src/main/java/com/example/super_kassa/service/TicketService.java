package com.example.super_kassa.service;

import com.example.super_kassa.config.MyJson;
import com.example.super_kassa.dto.Add;
import com.example.super_kassa.entities.TicketEntity;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.example.super_kassa.repository.TicketRepository;

import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TicketService {
    private final TicketRepository ticketRepository;

    @Transactional
    public MyJson saveAddToCurrent(Add add) {
        Optional<TicketEntity> byId = ticketRepository.findById(add.getId());
        if(byId.isPresent()) {
            byId.get().getObj().add(add.getAdd());
            return byId.get().getObj();
        } else {
            TicketEntity ticketEntity = new TicketEntity();
            MyJson test = new MyJson().setCurrent(add.getAdd().longValue());
            ticketEntity.setObj(test);
            return ticketEntity.getObj();
        }

    }
}

