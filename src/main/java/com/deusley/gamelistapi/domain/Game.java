package com.deusley.gamelistapi.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Builder
@AllArgsConstructor
@ToString
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "tb_games")
public class Game {

    @Id
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

}
