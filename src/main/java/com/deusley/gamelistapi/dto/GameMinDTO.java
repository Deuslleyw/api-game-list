package com.deusley.gamelistapi.dto;

import lombok.*;

@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GameMinDTO {

    private String id;
    private String title;
    private Integer GameYear;
    private String imgUrl;
    private String shortDescription;

}
