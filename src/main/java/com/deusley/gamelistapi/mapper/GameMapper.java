package com.deusley.gamelistapi.mapper;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.dto.GameDTO;
import com.deusley.gamelistapi.dto.GameResultDTO;

import java.util.UUID;

public class GameMapper {

    public static Game toGame(GameDTO gameDTO) {
        var uid = String.valueOf(UUID.randomUUID());
        return Game.builder()
                .id(uid)
                .title(gameDTO.getTitle())
                .GameYear(gameDTO.getGameYear())
                .genre(gameDTO.getGenre())
                .platform(gameDTO.getPlatform())
                .Score(gameDTO.getScore())
                .imgUrl(gameDTO.getImgUrl())
                .shortDescription(gameDTO.getShortDescription())
                .longDescription(gameDTO.getLongDescription())
                .build();
    }
}