package com.deusley.gamelistapi.service;

import com.deusley.gamelistapi.dto.GameResultDTO;
import java.util.List;

public interface GameService {

    public List<GameResultDTO> findAll();
}
