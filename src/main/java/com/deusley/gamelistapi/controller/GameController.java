package com.deusley.gamelistapi.controller;


import com.deusley.gamelistapi.dto.GameResultDTO;
import com.deusley.gamelistapi.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/games")
public class GameController {

    @Autowired
    private GameService service;

   @GetMapping
   public ResponseEntity<List<GameResultDTO>> findAll() {
       List<GameResultDTO> result = service.findAll();
        return ResponseEntity.ok().body(result);

    }
}
