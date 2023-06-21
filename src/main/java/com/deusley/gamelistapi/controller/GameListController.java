package com.deusley.gamelistapi.controller;

import com.deusley.gamelistapi.dto.GameListDTO;
import com.deusley.gamelistapi.service.GameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/games/lists")
public class GameListController {

    @Autowired
    private GameListService ListService;


   @GetMapping
   public ResponseEntity<List<GameListDTO>> findAll() {
       List<GameListDTO> result = ListService.findLists();
        return ResponseEntity.ok().body(result);

    }

    }