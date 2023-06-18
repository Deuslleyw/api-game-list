package com.deusley.gamelistapi.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

    private Long id;
    private String title;
    private Integer GameYear;
    private String genre;
    private String platform;
    private Double Score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

}
