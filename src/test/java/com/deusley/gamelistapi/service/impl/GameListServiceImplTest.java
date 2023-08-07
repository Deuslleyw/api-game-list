package com.deusley.gamelistapi.service.impl;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.domain.GameList;
import com.deusley.gamelistapi.dto.GameListDTO;
import com.deusley.gamelistapi.repository.GameListRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class GameListServiceImplTest {

    @InjectMocks
    private GameListServiceImpl service;

    @Mock
    private GameListRepository testRep;

    @Mock
    private ModelMapper mapper;

    private GameList gameList;
    private GameListDTO gameListDTO;
    private Optional<GameList> optionalGame;



    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startLists();
    }

    @Test
    void findLists() {

        Mockito.when(testRep.findAll()).thenReturn(List.of(gameList));

        List<GameListDTO> gameLists = service.findLists();

        assertNotNull(gameLists);
        assertEquals(1L, gameLists.get(0).getId());
        assertEquals("Testando a lista", gameLists.get(0).getName());

    }

    private void startLists() {

        gameListDTO  = new GameListDTO(1L , "ListasTeste");

        optionalGame =  Optional.of(new GameList(1L, "lista Test"));

        gameList = new GameList(1L, "Testando a lista");
    }
}