document.addEventListener("DOMContentLoaded", function () {
    const sections = document.querySelectorAll(".section");
    let currentSectionIndex = 0;

    // Mostrar apenas a primeira seção inicialmente
    function showCurrentSection() {
        sections.forEach((section, index) => {
            section.style.display = index === currentSectionIndex ? "block" : "none";
        });
    }

    // Inicializar
    showCurrentSection();

    // Função para campos "Outro"
    function toggleOutro(radioId, inputId) {
        const radio = document.getElementById(radioId);
        const input = document.getElementById(inputId);

        if (!radio || !input) return;

        radio.addEventListener("change", function() {
            input.style.display = radio.checked ? "block" : "none";
            input.required = radio.checked;
            if (!radio.checked) input.value = ""; // Limpa o campo quando não selecionado
        });

        document.querySelectorAll(`input[name="${radio.name}"]`).forEach(r => {
            if (r.id !== radioId) {
                r.addEventListener("change", function() {
                    input.style.display = "none";
                    input.required = false;
                    input.value = ""; // Limpa o campo
                });
            }
        });
    }

    // Configurar todos os campos "Outro"
    const outrosConfig = [
        ["p3_outro_radio", "p3_outro_texto"],
        ["p7_outro_radio", "p7_outro_texto"],
        ["p8_outro_radio", "p8_outro_texto"],
        ["p10_outro_radio", "p10_outro_texto"]
    ];

    outrosConfig.forEach(config => toggleOutro(...config));

    // Navegação entre seções
    function navigate(direction) {
        const currentSection = sections[currentSectionIndex];
        
        // Validação apenas ao avançar
        if (direction === 1) {
            let isValid = true;
            
            // Verificar campos de texto obrigatórios
            const textInputs = currentSection.querySelectorAll("input[required]:not([type='radio']), textarea[required], select[required]");
            textInputs.forEach(input => {
                if (!input.value.trim()) {
                    isValid = false;
                    input.reportValidity();
                }
            });
            
            // Verificar grupos de radio
            const radioGroups = new Set();
            currentSection.querySelectorAll("input[type='radio'][required]").forEach(radio => {
                radioGroups.add(radio.name);
            });
            
            radioGroups.forEach(name => {
                const checked = currentSection.querySelector(`input[name="${name}"]:checked`);
                if (!checked) {
                    isValid = false;
                    const firstRadio = currentSection.querySelector(`input[name="${name}"]`);
                    firstRadio.reportValidity();
                }
            });
            
            if (!isValid) return false;
        }

        // Atualizar índice
        currentSectionIndex += direction;
        
        // Garantir que o índice fique dentro dos limites
        currentSectionIndex = Math.max(0, Math.min(currentSectionIndex, sections.length - 1));
        
        // Mostrar seção atual
        showCurrentSection();
        
        // Rolagem para o topo da seção
        window.scrollTo({ top: 0, behavior: 'smooth' });
        
        return true;
    }

    // Configurar botões
    document.querySelectorAll(".btn-proximo").forEach(btn => {
        btn.addEventListener("click", (e) => {
            e.preventDefault();
            navigate(1);
        });
    });

    document.querySelectorAll(".btn-voltar").forEach(btn => {
        btn.addEventListener("click", (e) => {
            e.preventDefault();
            navigate(-1);
        });
    });
});