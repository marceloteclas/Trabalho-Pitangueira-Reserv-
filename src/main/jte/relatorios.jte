<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Relatórios - Insegurança Alimentar</title>
    <link rel="stylesheet" href="/css/relatorio.css">
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.0/font/bootstrap-icons.css">
</head>
<body>
   <header>
    <nav class="navbar navbar-expand-lg navbar-dark" style="background-color: #4caf50">
       <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav me-auto"> 
        <li class="nav-item mx-2">
            <a class="nav-link" href="/home">
                <i class="bi bi-house-door me-1"></i>Página Inicial
            </a>
        </li>
        <li class="nav-item mx-2">
            <a class="nav-link" href="/questionario">
                <i class="bi bi-clipboard2-data me-1"></i>Questionário
            </a>
        </li>
        <li class="nav-item mx-2">
            <a class="nav-link active" href="/relatorios">
                <i class="bi bi-graph-up me-1"></i>Relatórios
            </a>
        </li>
    </ul>
</div>
    </nav>
</header>

    <main class="container mt-4">
        <h1 class="mb-4">Relatórios de Insegurança Alimentar</h1>
        
        <div class="card mb-4">
            <div class="card-header">
                <h2>Filtros</h2>
            </div>
            <div class="card-body">
                <form id="filtrosRelatorio">
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label for="dataInicio" class="form-label">Data Início</label>
                            <input type="date" class="form-control" id="dataInicio" name="dataInicio">
                        </div>
                        <div class="col-md-6">
                            <label for="dataFim" class="form-label">Data Fim</label>
                            <input type="date" class="form-control" id="dataFim" name="dataFim">
                        </div>
                    </div>
                    
                    <div class="row mb-3">
                        <div class="col-md-4">
                            <label for="faixaEtaria" class="form-label">Faixa Etária</label>
                            <select class="form-select" id="faixaEtaria" name="faixaEtaria">
                                <option value="">Todas</option>
                                <option value="18-29">Jovens (18-29 anos)</option>
                                <option value="30-59">Adultos (30-59 anos)</option>
                                <option value="60+">Idosos (60+ anos)</option>
                            </select>
                        </div>
                        
                        <div class="col-md-4">
                            <label for="escolaridade" class="form-label">Escolaridade</label>
                            <select class="form-select" id="escolaridade" name="escolaridade">
                                <option value="">Todas</option>
                                <option value="Ensino médio incompleto">Ensino médio incompleto</option>
                                <option value="Ensino médio completo">Ensino médio completo</option>
                                <option value="Graduação incompleta">Graduação incompleta</option>
                                <option value="Graduação completa">Graduação completa</option>
                                <option value="Ensino fundamental incompleto">Ensino fundamental incompleto</option>
                                <option value="Ensino fundamental completo">Ensino fundamental completo</option>
                            </select>
                        </div>
                        
                        <div class="col-md-4">
                            <label for="tamanhoFamilia" class="form-label">Tamanho da Família</label>
                            <select class="form-select" id="tamanhoFamilia" name="tamanhoFamilia">
                                <option value="">Todos</option>
                                <option value="1">1 pessoa</option>
                                <option value="2">2 pessoas</option>
                                <option value="3">3 pessoas</option>
                                <option value="4">4 pessoas</option>
                                <option value="5+">5 ou mais pessoas</option>
                            </select>
                        </div>
                    </div>
                    
                    <div class="row mb-3">
                        <div class="col-md-6">
                            <label for="nivelInseguranca" class="form-label">Nível de Insegurança Alimentar</label>
                            <select class="form-select" id="nivelInseguranca" name="nivelInseguranca">
                                <option value="">Todos</option>
                                <option value="seguranca">Segurança alimentar</option>
                                <option value="leve">Insegurança leve</option>
                                <option value="moderada">Insegurança moderada</option>
                                <option value="grave">Insegurança grave</option>
                            </select>
                        </div>
                        
                        <div class="col-md-6">
                            <label for="grupoSocioeconomico" class="form-label">Grupo Socioeconômico</label>
                            <select class="form-select" id="grupoSocioeconomico" name="grupoSocioeconomico">
                                <option value="">Todos</option>
                                <option value="baixa_renda">Baixa renda</option>
                                <option value="media_baixa">Média-baixa</option>
                                <option value="media">Média</option>
                                <option value="media_alta">Média-alta</option>
                                <option value="alta">Alta</option>
                            </select>
                        </div>
                    </div>
                    
                    <button type="submit" class="btn btn-primary">Aplicar Filtros</button>
                    <button type="button" id="limparFiltros" class="btn btn-secondary">Limpar Filtros</button>
                </form>
            </div>
        </div>
        
        <div class="card">
            <div class="card-header d-flex justify-content-between align-items-center">
                <h2>Resultados</h2>
                <div>
                    <button id="exportarCSV" class="btn btn-success me-2">Exportar CSV</button>
                    <button id="exportarPDF" class="btn btn-danger">Exportar PDF</button>
                </div>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-striped table-hover" id="tabelaRelatorios">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Data</th>
                                <th>Nome</th>
                                <th>Idade</th>
                                <th>Escolaridade</th>
                                <th>Tamanho Família</th>
                                <th>Insegurança Alimentar</th>
                                <th>Grupo Socioeconômico</th>
                                <th>Ações</th>
                            </tr>
                        </thead>
                        <tbody>
                        </tbody>
                    </table>
                </div>
                
                <nav aria-label="Page navigation">
                    <ul class="pagination justify-content-center mt-3" id="paginacao">
                    </ul>
                </nav>
            </div>
        </div>
        
        <div class="modal fade" id="detalhesModal" tabindex="-1" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title">Detalhes do Questionário</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body" id="detalhesQuestionario">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Fechar</button>
                    </div>
                </div>
            </div>
        </div>
    </main>
    
    <footer>
        <p>&copy; 2025 Projetos IFBA</p>
    </footer>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
    <script src="/relatorios.js"></script>
</body>
</html>