package com.System.clinic.Controller;

import com.System.clinic.Dto.FiltroRelatorioDTO;
import com.System.clinic.entity.Questionario;
import com.System.clinic.repository.QuestionarioRepository;
import com.System.clinic.specification.QuestionarioSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Optional;

@Controller
public class RelatorioController {

    @Autowired
    private QuestionarioRepository questionarioRepository;

    @GetMapping("/relatorios")
    public String mostrarRelatorios(
            @RequestParam(required = false) String dataInicio,
            @RequestParam(required = false) String dataFim,
            @RequestParam(required = false) String faixaEtaria,
            @RequestParam(required = false) String escolaridade,
            @RequestParam(required = false) String tamanhoFamilia,
            @RequestParam(required = false) String nivelInseguranca,
            @RequestParam(required = false) String grupoSocioeconomico,
            @RequestParam(defaultValue = "1") int pagina,
            Model model) {
        
        FiltroRelatorioDTO filtros = new FiltroRelatorioDTO();
        if (dataInicio != null && !dataInicio.isEmpty()) {
            filtros.setDataInicio(LocalDate.parse(dataInicio));
        }
        if (dataFim != null && !dataFim.isEmpty()) {
            filtros.setDataFim(LocalDate.parse(dataFim));
        }
        filtros.setFaixaEtaria(faixaEtaria);
        filtros.setEscolaridade(escolaridade);
        filtros.setTamanhoFamilia(tamanhoFamilia);
        filtros.setNivelInseguranca(nivelInseguranca);
        filtros.setGrupoSocioeconomico(grupoSocioeconomico);
        
        Specification<Questionario> spec = QuestionarioSpecification.comFiltros(filtros);
        
        Page<Questionario> page = questionarioRepository.findAll(spec, PageRequest.of(pagina - 1, 10));
        
        // Adicionar ao modelo
        model.addAttribute("questionarios", page.getContent());
        model.addAttribute("paginaAtual", pagina);
        model.addAttribute("totalPaginas", page.getTotalPages());
        model.addAttribute("filtros", filtros);
        
        return "relatorios";
    }
}