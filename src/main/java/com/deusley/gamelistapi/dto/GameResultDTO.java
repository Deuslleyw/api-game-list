package com.deusley.gamelistapi.dto;

import com.deusley.gamelistapi.domain.Game;
import lombok.Getter;

@Getter
public class GameResultDTO {

    private String id;
    private String title;
    private Integer GameYear;
    private String imgUrl;
    private String shortDescription;

    public GameResultDTO(){}

    public GameResultDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        GameYear = entity.getGameYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
}
