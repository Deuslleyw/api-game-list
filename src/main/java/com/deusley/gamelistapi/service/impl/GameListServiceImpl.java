package com.deusley.gamelistapi.service.impl;

import com.deusley.gamelistapi.domain.GameList;
import com.deusley.gamelistapi.dto.GameListDTO;
import com.deusley.gamelistapi.repository.GameListRepository;
import com.deusley.gamelistapi.service.GameListService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GameListServiceImpl implements GameListService {

    @Autowired
    private GameListRepository repList;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<GameListDTO> findLists() {
        List<GameList> resultList = repList.findAll();
        return resultList.stream().map(GameListDTO::new).toList();
    }
}
