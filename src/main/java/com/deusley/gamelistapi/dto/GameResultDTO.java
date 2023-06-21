package com.deusley.gamelistapi.dto;

import com.deusley.gamelistapi.domain.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class GameResultDTO {

    private Long id;
    private String title;
    private Integer GameYear;
    private String imgUrl;
    private String shortDescription;


    public GameResultDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        GameYear = entity.getGameYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
}
