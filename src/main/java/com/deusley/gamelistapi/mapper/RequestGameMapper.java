package com.deusley.gamelistapi.mapper;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.domain.dto.GameMinDTO;

import java.util.UUID;

public class RequestGameMapper {

    public static Game toGame(GameMinDTO bodyDto){

        var uid = String.valueOf(UUID.randomUUID());
        return Game.builder()

                .id(uid)
                .GameYear(bodyDto.getGameYear())
                .title(bodyDto.getTitle())
                .imgUrl(bodyDto.getImgUrl())
                .shortDescription(bodyDto.getShortDescription())
                .build();
    }
}
