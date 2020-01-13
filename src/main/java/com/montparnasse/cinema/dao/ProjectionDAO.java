package com.montparnasse.cinema.dao;

import org.hibernate.criterion.Projection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Component
@Repository
@Transactional
public interface ProjectionDAO  extends JpaRepository<Projection, Long>{
	
}
