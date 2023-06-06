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
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.GameYear = entity.getGameYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
}
