package com.deusley.gamelistapi.domain;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer GameYear;
    private String genre;
    private String platform;
    private Double Score;
    private String imgUrl;
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

}
