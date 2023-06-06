package com.deusley.gamelistapi.domain.dto;

import lombok.*;

@ToString
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer GameYear;
    private String imgUrl;
    private String shortDescription;

}
