package com.deusley.gamelistapi.controller;

import com.deusley.gamelistapi.dto.GameListDTO;
import com.deusley.gamelistapi.dto.GameResultDTO;
import com.deusley.gamelistapi.service.GameListService;
import com.deusley.gamelistapi.service.GameService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/games/lists")
public class GameListController {

    @Autowired
    private GameListService ListService;

    @Autowired
    private GameService gameService;

    @Autowired
    private ModelMapper mapper;


   @GetMapping
   public ResponseEntity<List<GameListDTO>> findAll() {
       List<GameListDTO> result = ListService.findLists();
        return ResponseEntity.ok().body(result);

    }
    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<List<GameResultDTO>> searchByList(@PathVariable Long listId) {
        List<GameResultDTO> results = gameService.searchByList(listId);
        return ResponseEntity.ok().body(results);

    }}