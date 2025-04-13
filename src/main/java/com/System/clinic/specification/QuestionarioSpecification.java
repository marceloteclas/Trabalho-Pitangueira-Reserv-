package com.System.clinic.specification;

import com.System.clinic.entity.Questionario;
import com.System.clinic.Dto.FiltroRelatorioDTO;
import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

public class QuestionarioSpecification {
    
    public static Specification<Questionario> comFiltros(FiltroRelatorioDTO filtros) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            
            if (filtros.getDataInicio() != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("data"), filtros.getDataInicio()));
            }
            
            if (filtros.getDataFim() != null) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("data"), filtros.getDataFim()));
            }
            
            if (filtros.getFaixaEtaria() != null && !filtros.getFaixaEtaria().isEmpty()) {
                if (filtros.getFaixaEtaria().equals("18-29")) {
                    predicates.add(criteriaBuilder.between(root.get("idade"), 18, 29));
                }
                // outras faixas etárias...
            }
            
            if (filtros.getEscolaridade() != null && !filtros.getEscolaridade().isEmpty()) {
                predicates.add(criteriaBuilder.equal(root.get("escolaridade"), filtros.getEscolaridade()));
            }
            
            // Adicione outros filtros conforme necessário
            
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}