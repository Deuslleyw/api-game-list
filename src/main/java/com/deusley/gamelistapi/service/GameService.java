package com.deusley.gamelistapi.service;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.dto.GameResultDTO;
import java.util.List;

public interface GameService {

    public List<GameResultDTO> findAll();

    public List<GameResultDTO> searchByList( Long listId);

    Game findById (Long id);


}
