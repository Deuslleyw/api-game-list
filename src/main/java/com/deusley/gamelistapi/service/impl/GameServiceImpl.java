package com.deusley.gamelistapi.service.impl;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.dto.GameResultDTO;
import com.deusley.gamelistapi.exceptions.ObjectNotFoundException;
import com.deusley.gamelistapi.projections.GameProjection;
import com.deusley.gamelistapi.repository.GameRepository;
import com.deusley.gamelistapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository rep;


    @Override
    public List<GameResultDTO> findAll() {
        List<Game> result = rep.findAll();
        return result.stream().map(GameResultDTO::new).toList();
    }

    @Override
    public List<GameResultDTO> searchByList( Long listId) {
        List<GameProjection> result = rep.searchByList(listId);
        return result.stream().map(GameResultDTO::new).toList();
    }

    @Override
    public Game findById(Long id) {
        Optional<Game> obj = rep.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Não Encontrado por esse Id"));
    }
}
