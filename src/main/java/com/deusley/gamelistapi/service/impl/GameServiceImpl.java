package com.deusley.gamelistapi.service.impl;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.repository.GameRepository;
import com.deusley.gamelistapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository rep;


    @Override
    public List<Game> findAll() {

        return null;
    }
}
