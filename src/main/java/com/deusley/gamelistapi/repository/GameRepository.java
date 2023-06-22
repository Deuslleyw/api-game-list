package com.deusley.gamelistapi.repository;

import com.deusley.gamelistapi.domain.Game;
import com.deusley.gamelistapi.projections.GameProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository <Game, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_games.id, tb_games.title, tb_games.game_year, tb_games.img_URL,
            tb_games.short_description, tb_belonging.position
            FROM tb_games
            INNER JOIN tb_belonging ON tb_games.id = tb_belonging.game_id
            WHERE tb_belonging.list_id = :listId
            ORDER BY tb_belonging.position
            """)
    List<GameProjection> searchByList (Long listId);

}
