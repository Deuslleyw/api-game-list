package com.deusley.gamelistapi.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

    private String id;
    private String title;
    private Integer GameYear;
    private String genre;
    private String platform;
    private Double Score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

}
