package com.deusley.gamelistapi.controller;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.dto.GameDTO;
import com.deusley.gamelistapi.dto.GameResultDTO;
import com.deusley.gamelistapi.projections.GameProjection;
import com.deusley.gamelistapi.service.impl.GameServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;


@SpringBootTest
class GameControllerTest {

    public static final long ID = 1L;
    public static final String TITULO = "testeTitulo";
    public static final int GAME_YEAR = 2023;
    public static final String GENERO = "TestGenero";
    public static final String PLATFORM = "pc";
    public static final double SCORE = 5.0;
    public static final String IMG_URL = "urlTeste";
    public static final String SHORT_DESCRIPTION = "DescriçãoCurta";
    public static final String LONG_DESCRIPTION = "DescriçãoLonga";

    @InjectMocks
    private GameController controller;

    @Mock
    private GameServiceImpl service;

    @Mock
    private ModelMapper mapper;

    private Game game;
    private GameDTO gameDTO;
    private GameResultDTO resultDTO;
    private List<GameProjection> projectionList;




    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startGames();
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
        when(service.findById(anyLong())).thenReturn(game);
        when(mapper.map(any(), any())).thenReturn(gameDTO);





    }

    private void startGames(){
        game = new Game(ID, TITULO, GAME_YEAR, GENERO, PLATFORM, SCORE, IMG_URL,
                SHORT_DESCRIPTION, LONG_DESCRIPTION);

        gameDTO = new GameDTO(ID, TITULO, GAME_YEAR, GENERO, PLATFORM, SCORE,
                IMG_URL, SHORT_DESCRIPTION, LONG_DESCRIPTION);

        resultDTO = new GameResultDTO(1L, TITULO, GAME_YEAR, IMG_URL, SHORT_DESCRIPTION);

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
}}