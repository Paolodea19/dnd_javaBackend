package com.example.dnd.repository;


import com.example.dnd.model.Monsters;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MonstersRepository extends JpaRepository <Monsters, Long> {
}
