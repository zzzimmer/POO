# Sitema de Controle de Versão

## Configuração inicial para uso do Git

### Configuração para nome de usuário e e-mail do git

O git conta com a caracteristica de identificação para o controle de versões. Todo commit conta
com autoria, sendo essa, relativa ao Author

O versionamento de codigo com git tem base nos commits. Estes, tem algumas caracteristicas, como a autoria de quem escreveu o codigo. Os metadados que dão as caracterisicas de autor são:
- name -> `git config user.name "zzzimmer"`
- email associado ao autor -> `git config user.email "lucas.zimmr@gmail.com"`
- data -> registro da hora do cmmit
- assinatura digital (opcional) -> uso de chaves configuraveis para assinatura (ssh, GPS ou s/mime)

### Criando Personal Access Token (PAT) no GitHub

Um PAT, segundo a documentação do GitHub, é uma "...alternativa ao uso de senhas para autenticação no GitHub ao usar a GitHub API ou a linha de comando."

Existem diferentes tipos de token e todos contam com configurações de limite de acesso.

### Salvar em cache as credenciais do PAT

O script para configurar um tempo para a atividade da credencial no path é: 

`git config --global credential.helper 'cache --timeout=3600'`

O fluxo é: 

`git config --global credential.helper 'cache --timeout=3600'`
`git config user.name "zzzimmer"`
`git config user.email "lucas.zimmr@gmail.com"`
inserir senha (no caso, o git hoje em dia usa PAT como senha) e então commit e push

## Diferença entre git merge git rebase: 
