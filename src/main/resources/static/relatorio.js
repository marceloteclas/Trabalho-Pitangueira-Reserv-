document.addEventListener('DOMContentLoaded', function() {
    // Inicializa o datepicker
    flatpickr("#dataInicio", {
        dateFormat: "Y-m-d",
        allowInput: true
    });
    
    flatpickr("#dataFim", {
        dateFormat: "Y-m-d",
        allowInput: true
    });
    
    // Carrega os dados iniciais
    carregarDados();
    
    // Evento de submit do formulário de filtros
    document.getElementById('filtrosRelatorio').addEventListener('submit', function(e) {
        e.preventDefault();
        carregarDados();
    });
    
    // Evento para limpar filtros
    document.getElementById('limparFiltros').addEventListener('click', function() {
        document.getElementById('filtrosRelatorio').reset();
        carregarDados();
    });
    
    // Evento para exportar CSV
    document.getElementById('exportarCSV').addEventListener('click', exportarCSV);
    
    // Evento para exportar PDF
    document.getElementById('exportarPDF').addEventListener('click', exportarPDF);
});

function carregarDados(pagina = 1) {
    const formData = new FormData(document.getElementById('filtrosRelatorio'));
    const params = new URLSearchParams();
    
    // Adiciona os parâmetros do formulário
    for (const [key, value] of formData.entries()) {
        if (value) params.append(key, value);
    }
    
    // Adiciona a página
    params.append('pagina', pagina);
    
    // Simulação de chamada AJAX - na implementação real, substitua por fetch/axios
    console.log('Parâmetros da requisição:', params.toString());
    
    // Aqui você faria uma chamada AJAX para o backend
    // fetch(`/api/relatorios?${params.toString()}`)
    //     .then(response => response.json())
    //     .then(data => preencherTabela(data))
    //     .catch(error => console.error('Erro:', error));
    
    // Simulação de dados para demonstração
    const dadosSimulados = {
        dados: [
            {
                id: 1,
                data: '2023-10-15',
                nome: 'João Silva',
                idade: 22,
                escolaridade: 'Ensino médio completo',
                tamanhoFamilia: 3,
                insegurancaAlimentar: 'Insegurança leve',
                grupoSocioeconomico: 'Baixa renda'
            },
            {
                id: 2,
                data: '2023-10-16',
                nome: 'Maria Souza',
                idade: 25,
                escolaridade: 'Ensino médio incompleto',
                tamanhoFamilia: 4,
                insegurancaAlimentar: 'Insegurança moderada',
                grupoSocioeconomico: 'Baixa renda'
            },
            // ... mais dados simulados
        ],
        total: 2,
        paginas: 1
    };
    
    preencherTabela(dadosSimulados);
}

function preencherTabela(data) {
    const tbody = document.querySelector('#tabelaRelatorios tbody');
    tbody.innerHTML = '';
    
    data.dados.forEach(item => {
        const tr = document.createElement('tr');
        tr.innerHTML = `
            <td>${item.id}</td>
            <td>${item.data}</td>
            <td>${item.nome}</td>
            <td>${item.idade}</td>
            <td>${item.escolaridade}</td>
            <td>${item.tamanhoFamilia}</td>
            <td>${item.insegurancaAlimentar}</td>
            <td>${item.grupoSocioeconomico}</td>
            <td>
                <button class="btn btn-sm btn-info btn-detalhes" data-id="${item.id}">Detalhes</button>
            </td>
        `;
        tbody.appendChild(tr);
    });
    
    // Configura os eventos dos botões de detalhes
    document.querySelectorAll('.btn-detalhes').forEach(btn => {
        btn.addEventListener('click', function() {
            const id = this.getAttribute('data-id');
            mostrarDetalhes(id);
        });
    });
    
    // Configura a paginação
    configurarPaginacao(data.paginas);
}

function configurarPaginacao(totalPaginas) {
    const paginacao = document.getElementById('paginacao');
    paginacao.innerHTML = '';
    
    for (let i = 1; i <= totalPaginas; i++) {
        const li = document.createElement('li');
        li.className = 'page-item';
        li.innerHTML = `<a class="page-link" href="#">${i}</a>`;
        
        li.addEventListener('click', function(e) {
            e.preventDefault();
            carregarDados(i);
        });
        
        paginacao.appendChild(li);
    }
}

function mostrarDetalhes(id) {
    // Simulação de chamada AJAX para obter detalhes
    console.log(`Buscando detalhes para o ID: ${id}`);
    
    // Aqui você faria uma chamada AJAX para o backend
    // fetch(`/api/questionarios/${id}`)
    //     .then(response => response.json())
    //     .then(data => preencherModal(data))
    //     .catch(error => console.error('Erro:', error));
    
    // Simulação de dados para demonstração
    const detalhesSimulados = {
        id: id,
        data: '2023-10-15',
        nome: 'João Silva',
        idade: 22,
        genero: 'Masculino',
        escolaridade: 'Ensino médio completo',
        tamanhoFamilia: 3,
        emprego: 'Meio período',
        auxilios: 'Bolsa família',
        respostasEBIA: [
            { pergunta: 'Preocupação com alimentos acabarem', resposta: 'Sim' },
            { pergunta: 'Alimentos acabaram antes de comprar mais', resposta: 'Não' },
            // ... outras respostas
        ],
        consumoAlimentos: [
            { alimento: 'Frutas', frequencia: 'Diariamente' },
            { alimento: 'Legumes', frequencia: '3-4 vezes por semana' },
            // ... outros alimentos
        ]
    };
    
    preencherModal(detalhesSimulados);
}

function preencherModal(dados) {
    const modalBody = document.getElementById('detalhesQuestionario');
    
    // Cria o conteúdo do modal com os detalhes
    let html = `
        <div class="row mb-3">
            <div class="col-md-4">
                <p><strong>ID:</strong> ${dados.id}</p>
            </div>
            <div class="col-md-4">
                <p><strong>Data:</strong> ${dados.data}</p>
            </div>
            <div class="col-md-4">
                <p><strong>Nome:</strong> ${dados.nome}</p>
            </div>
        </div>
        
        <div class="row mb-3">
            <div class="col-md-3">
                <p><strong>Idade:</strong> ${dados.idade}</p>
            </div>
            <div class="col-md-3">
                <p><strong>Gênero:</strong> ${dados.genero}</p>
            </div>
            <div class="col-md-3">
                <p><strong>Escolaridade:</strong> ${dados.escolaridade}</p>
            </div>
            <div class="col-md-3">
                <p><strong>Tamanho da Família:</strong> ${dados.tamanhoFamilia}</p>
            </div>
        </div>
        
        <h4 class="mt-4">Respostas EBIA</h4>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Pergunta</th>
                    <th>Resposta</th>
                </tr>
            </thead>
            <tbody>
    `;
    
    dados.respostasEBIA.forEach(item => {
        html += `
            <tr>
                <td>${item.pergunta}</td>
                <td>${item.resposta}</td>
            </tr>
        `;
    });
    
    html += `
            </tbody>
        </table>
        
        <h4 class="mt-4">Consumo de Alimentos</h4>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Alimento</th>
                    <th>Frequência</th>
                </tr>
            </thead>
            <tbody>
    `;
    
    dados.consumoAlimentos.forEach(item => {
        html += `
            <tr>
                <td>${item.alimento}</td>
                <td>${item.frequencia}</td>
            </tr>
        `;
    });
    
    html += `
            </tbody>
        </table>
    `;
    
    modalBody.innerHTML = html;
    
    // Mostra o modal
    const modal = new bootstrap.Modal(document.getElementById('detalhesModal'));
    modal.show();
}

function exportarCSV() {
    // Implementação da exportação para CSV
    console.log('Exportando para CSV...');
    alert('Exportação para CSV será implementada aqui');
}

function exportarPDF() {
    // Implementação da exportação para PDF
    console.log('Exportando para PDF...');
    alert('Exportação para PDF será implementada aqui');
}