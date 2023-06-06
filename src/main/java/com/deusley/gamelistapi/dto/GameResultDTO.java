package com.deusley.gamelistapi.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameResultDTO {

    private String id;
    private String title;
    private Integer GameYear;
    private String imgUrl;
    private String shortDescription;

}
