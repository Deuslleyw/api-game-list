package com.deusley.gamelistapi.repository;

import com.deusley.gamelistapi.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository <Game, String> {
}