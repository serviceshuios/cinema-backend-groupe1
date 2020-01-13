package com.montparnasse.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.Salle;
import com.montparnasse.cinema.domaine.SalleFilm;
import com.montparnasse.cinema.domaine.SalleFilmId;

@Component
@Repository
@Transactional
public interface SalleFilmDAO  extends JpaRepository<SalleFilm, SalleFilmId>{
}