package com.deusley.gamelistapi.domain;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
