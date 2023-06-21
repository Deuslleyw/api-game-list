package com.deusley.gamelistapi.repository;

import com.deusley.gamelistapi.domain.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
