package com.example.battle.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "enemy")
@Table(name = "enemy")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Enemy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "enemy_name")
    private String enemyName;
    @Column(name = "health_point")
    private int healthPoint;
    @Column(name = "ability")
    private String ability;
    @Column(name = "achievement")
    private String achievement;
}