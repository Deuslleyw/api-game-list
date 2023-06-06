package com.deusley.gamelistapi.controller;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.dto.GameResultDTO;
import com.deusley.gamelistapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "api/v1/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public ResponseEntity<List<GameResultDTO>> findAll() {
        var game = service.findAll();
   return null;

    }
}
