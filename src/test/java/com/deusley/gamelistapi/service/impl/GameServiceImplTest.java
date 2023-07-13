package com.deusley.gamelistapi.service.impl;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.dto.GameDTO;
import com.deusley.gamelistapi.dto.GameListDTO;
import com.deusley.gamelistapi.dto.GameResultDTO;
import com.deusley.gamelistapi.projections.GameProjection;
import com.deusley.gamelistapi.repository.GameRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class GameServiceImplTest {

    public static final long ID = 1L;
    public static final String TITULO = "testeTitulo";
    public static final int GAME_YEAR = 2023;
    public static final String GENERO = "TestGenero";
    public static final String PLATFORM = "pc";
    public static final double SCORE = 5.0;
    public static final String IMG_URL = "urlTeste";
    public static final String SHORT_DESCRIPTION = "DescriçãoCurta";
    public static final String LONG_DESCRIPTION = "DescriçãoLonga";
    public static final int INDEX = 0;

    private GameDTO gameDTO;
    private Game game;
    private GameResultDTO resultDTO;
    private  List<GameProjection> projectionList;
    private Optional<Game> optionalGame;

    @InjectMocks
    private GameServiceImpl gameService;

    @Mock
    private ModelMapper mapper;
    @Mock
    private GameRepository repository;



    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startGames();
    }

    @Test
    void findAllThenReturnGameResult() {
        when(repository.findAll()).thenReturn(List.of(game));

        List<GameResultDTO> response = gameService.findAll();

        assertNotNull(response);
        assertEquals(ID, response.get(INDEX).getId());
        assertEquals(TITULO, response.get(INDEX).getTitle());
        assertEquals(GAME_YEAR, response.get(INDEX).getGameYear());
        assertEquals(IMG_URL, response.get(INDEX).getImgUrl());
        assertEquals(SHORT_DESCRIPTION, response.get(INDEX).getShortDescription());

    }

    @Test
    void searchByList() {
        when(repository.searchByList(anyLong())).thenReturn(projectionList);

        List<GameResultDTO> response = gameService.searchByList(anyLong());

        assertNotNull(response);
        assertEquals(ID, response.get(INDEX).getId());
        assertEquals(TITULO, response.get(INDEX).getTitle());
        assertEquals(GAME_YEAR, response.get(INDEX).getGameYear());
        assertEquals(IMG_URL, response.get(INDEX).getImgUrl());
        assertEquals(SHORT_DESCRIPTION, response.get(INDEX).getShortDescription());


    }

    @Test
    void findById() {
        when(repository.findById(anyLong())).thenReturn(optionalGame);
        var response = gameService.findById(ID);

        assertEquals(Game.class, response.getClass());
        assertEquals(ID, response.getId());
        assertEquals(TITULO, response.getTitle());

    }

    private void startGames(){
         game = new Game(ID, TITULO, GAME_YEAR, GENERO, PLATFORM, SCORE, IMG_URL,
                            SHORT_DESCRIPTION, LONG_DESCRIPTION);

         gameDTO = new GameDTO(ID, TITULO, GAME_YEAR, GENERO, PLATFORM, SCORE,
                            IMG_URL, SHORT_DESCRIPTION, LONG_DESCRIPTION);

         resultDTO = new GameResultDTO(1L, TITULO, GAME_YEAR, IMG_URL, SHORT_DESCRIPTION);

        optionalGame = Optional.of(new Game(ID, TITULO, GAME_YEAR, GENERO, PLATFORM, SCORE, IMG_URL,
                SHORT_DESCRIPTION, LONG_DESCRIPTION));

        projectionList = Collections.singletonList(new GameProjection() {
            @Override
            public Long getId() {
                return ID;
            }

            @Override
            public String getTitle() {
                return TITULO;
            }

            @Override
            public Integer getGameYear() {
                return GAME_YEAR;
            }

            @Override
            public String getImgUrl() {
                return IMG_URL;
            }

            @Override
            public String getShortDescription() {
                return SHORT_DESCRIPTION;
            }

            @Override
            public Integer getPosition() {
                return null;
            }
        });

    }

}