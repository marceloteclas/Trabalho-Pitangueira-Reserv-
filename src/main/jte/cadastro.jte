    <!DOCTYPE html>
    <html lang="pt-BR">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Projetos IFBA Cadastro</title>
        <link rel="stylesheet" href="/css/cadastro.css">
    </head>

    <body>
        <header>
            <nav>
                <ul>
                    <li class="btnlogin"><a href="/login">Login</a></li>
                </ul>
            </nav>
        </header>

        <form action="" id="usuariocadastro" method="post">
            <h1>Cadastro de Usuário!</h1>

            <p id="msgerrousuario">AS SENHAS NÃO SÃO IGUAIS!</p>
            <label for="emailusuario">E-mail</label>
            <input type="email" name="emailusuario" id="emailusuario" placeholder="Digite o seu e-mail">

            <label for="nomeusuario">Nome</label>
            <input type="text" name="nomeusuario" id="nomeusuario" placeholder="Digite o seu nome">

            <label for="cpfusuario">CPF</label>
            <input type="text" name="cpfusuario" id="cpfusuario" placeholder="Digite o seu CPF">

            <label for="senhausuario">Senha</label>
            <input type="password" name="senhausuario" id="senhausuario" placeholder="Digite sua senha">

            <label for="repetirsenhausuario">Repita a sua senha</label>
            <input type="password" name="repetirsenhausuario" id="repetirsenhausuario" placeholder="Digite sua senha novamente">

            <input type="submit" value="Enviar">
        </form>

        <!-- Corrigido o caminho para o arquivo JavaScript -->
        <script src="/cadastro.js"></script>

        <footer>
            <p> &copy; 2025 Projetos IFBA</p>
        </footer>
    </body>

    </html>
