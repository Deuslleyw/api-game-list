package com.deusley.gamelistapi.controller;

import com.deusley.gamelistapi.dto.GameDTO;
import com.deusley.gamelistapi.dto.GameResultDTO;
import com.deusley.gamelistapi.service.GameService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "api/v1/games")
public class GameController {

    @Autowired
    private GameService service;

    @Autowired
    private ModelMapper mapper;

   @GetMapping
   public ResponseEntity<List<GameResultDTO>> findAll() {
       List<GameResultDTO> result = service.findAll();
        return ResponseEntity.ok().body(result);

    }
    @GetMapping(value = "{id}")
    public ResponseEntity<GameDTO> findById(@PathVariable Long id){
       var game = service.findById(id);
       var mapperResponse = mapper.map(game, GameDTO.class);
       return ResponseEntity.ok().body(mapperResponse);

    }
}