document.addEventListener("DOMContentLoaded", function () {
    const sections = document.querySelectorAll(".section");

    // Inicialmente, apenas a primeira seção é exibida
    sections.forEach((section, index) => {
        if (index !== 0) {
            section.style.display = "none";
        }
    });

    function toggleOutro(radioId, inputId) {
        const radio = document.getElementById(radioId);
        const input = document.getElementById(inputId);

        if (!radio || !input) return;

        radio.addEventListener("change", function () {
            if (radio.checked) {
                input.style.display = "block";
                input.required = true;
            }
        });

        // Esconde o campo se outra opção for selecionada
        const radios = document.querySelectorAll(`input[name="${radio.name}"]`);
        radios.forEach(r => {
            if (r !== radio) {
                r.addEventListener("change", function () {
                    input.style.display = "none";
                    input.required = false;
                });
            }
        });
    }

    // Ativando campos "outro"
    toggleOutro("p3_outro_radio", "p3_outro_texto");
    toggleOutro("p4_outro_radio", "p4_outro_texto");
    toggleOutro("p5_outro_radio", "p5_outro_texto");
    toggleOutro("p6_outro_radio", "p6_outro_texto");
    toggleOutro("p7_outro_radio", "p7_outro_texto");
    toggleOutro("p8_outro_radio", "p8_outro_texto");
    toggleOutro("p10_outro_radio", "p10_outro_texto");

    // Validação do botão Próximo
    const btnsProximo = document.querySelectorAll(".btn-proximo");
    btnsProximo.forEach(button => {
        button.addEventListener("click", function () {
            const currentSection = button.closest(".section");
            const currentIndex = Array.from(sections).indexOf(currentSection);

            const inputs = currentSection.querySelectorAll("input, select, textarea");
            let isValid = true;
            const gruposRadio = new Set();

            inputs.forEach(input => {
                if (input.type === "radio") {
                    gruposRadio.add(input.name);
                } else {
                    if (!input.checkValidity()) {
                        isValid = false;
                        input.reportValidity();
                    }
                }
            });

            gruposRadio.forEach(name => {
                const radios = currentSection.querySelectorAll(`input[name="${name}"]`);
                const algumSelecionado = Array.from(radios).some(r => r.checked);

                if (!algumSelecionado) {
                    isValid = false;
                    radios[0].reportValidity(); 
                }
            });

            if (!isValid) return;

            if (currentIndex < sections.length - 1) {
                currentSection.style.display = "none";
                sections[currentIndex + 1].style.display = "block";
            }
        });
    });

    // Botão Voltar
    const btnsVoltar = document.querySelectorAll(".btn-voltar");
    btnsVoltar.forEach(button => {
        button.addEventListener("click", function () {
            const currentSection = button.closest(".section");
            const currentIndex = Array.from(sections).indexOf(currentSection);

            if (currentIndex > 0) {
                currentSection.style.display = "none";
                sections[currentIndex - 1].style.display = "block";
            }
        });
    });
});
