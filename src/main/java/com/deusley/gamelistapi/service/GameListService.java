package com.deusley.gamelistapi.service;

import com.deusley.gamelistapi.dto.GameListDTO;

import java.util.List;

public interface GameListService {

    public List<GameListDTO> findLists();
}
