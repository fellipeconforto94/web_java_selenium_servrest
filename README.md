# web_java_selenium

# Resumo
Poc de estudo para automação Web utilizando:
- Site utilizado para pratica: Serverest(https://front.serverest.dev/login)
- Selenium WebDriver versão 4.1.1
- Junit
- Page objects como organização do projeto
- Json para manipulação de massas

# Pre-requisitos

- Instalar IDE(Intellij, eclipse, etc)

- Instalar Java JDK 8+

# Instalação

- Clonar esse repositório utilizando http ou ssh, como:
  git clone https://github.com/fellipeconforto94/web_java_selenium_servrest.git

- Instalar todas as dependencias no pom.xml(Selenium e Junit)

- mvn install

# Como Rodar

> Navegador
- No arquivo de configuração "config.properties" tem a opção de escolher em qual navegador deseja executar, como padrão está Chrome.

> Execução dos CTs
- Clicar com o botão direito no projeto/class EstudosWeb > Run 'AllTests' ou no caminho Core/Suits/SuiteTestes.java definir qual classe de testes deseja executar.

> Descrição dos Cts
- Foram criados CTs básicos de Login, cadastro, validação e exclusão de Users apenas como demonstração de testes.

> Screenshots
- Após cada execução, os screenshots são gerados dentro da pasta \target\evidencias
- Com o método takeScreenshot("Nome da Tela") é possível definir em qual momento deseja gerar o print dentro de cada ação/tela.

> Observações
- Como o sistema não aceita que o próprio usuário se exclua, foram criados dois Users Admins para esse teste.
