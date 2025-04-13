package com.System.clinic.repository;

import com.System.clinic.entity.Questionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionarioRepository extends JpaRepository<Questionario, Long>, 
    JpaSpecificationExecutor<Questionario> {
}
