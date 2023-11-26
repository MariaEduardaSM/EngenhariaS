# Engenharia-De-Software-ifood1

<h1 align="center">  Documentação de Software-Sistema Ifood</h1>
<p align="center">
 
  <img src="https://github.com/MariaEduardaSM/Engenharia-De-Software-ifood1/assets/112040400/2a34ec2b-81a8-4e89-bb1e-e49824909ee1" alt="Logo do Projeto" style="width:260px; border-radius:100%;">
</p>


</div>



<p align="center">Réplica do Sistema Ifood para fins de aprendizagem de Engenharia de Software 
do curso de T.I da instituição CEFET<p/>
              <p align="center">Campo Belo-MG 2022/2023</p>
<br/>
<br/>
<h4 align="center"> 
    :construction:  Projeto em construção  :construction:
</h4>

## 🔨 Primeiras observações:
- ` 1`: O projeto está sendo feito na linguagem Java.
- ` 2`:  versão JDk:11.0.20.1 2023-08-24.
- `3`:  A arquitetura foi organizada de maneira intuitiva em que classes semelhantes se encontra no mesmo pacote para que assim fique mais organizado e mais fácil de realizar possíveis mudanças durante o andamento do projeto.
- `4`: O sistema ainda não está completo e se encontra sem conexão com o banco de dados e sem interface gráfica isso será adcionado mais tarde.
- `5`: Foi usado os pacotes padrão do Java

<br>


## 🔨 Funcionalidades do projeto
O projeto que imita um sistema de delivery muito famoso que é o Ifood, tem como base classes como no `pacote Login`<br> se encontra as classes:
`CadastroUsuario,Cliente`,`Estabelecimento`,`Usuario`;<br>
<br>
`pacote Compras`se encontra a classe carrinho;
<br>
`pacote ParceirosIfood`se encontra a classe Item;
<br>
`pacote AppIfood.View`se encontra a imagem de tela incial que será usada quando acrescentarmos a interface gráfica;
<br>
`pacote appIfood`se encontra a classe Main;
<br>
`pacote Testes`se encontra os testes Junit que testam todos os métodos citados nas classes;
<br>

 `Usuario`: Possue seis variáveis de instância privadas: **nome**, **email**, **senha**, **endereco**, **telefone** e **estabelecimento**<br>
 Possue seis métodos públicos:<br>

O método `getNome()` retorna o valor da variável de instância privada nome.<br>
O método `setNome()` atribui um novo valor à variável de instância privada nome.<br>
O método `getEmail()` retorna o valor da variável de instância privada email.<br>
O método `setEmail()` atribui um novo valor à variável de instância privada email.<br>
O método `getSenha()` retorna o valor da variável de instância privada senha.<br>
O método `setSenha()`atribui um novo valor à variável de instância privada senha.<br>
Além dos métodos adcionais que são eles;<br>

-`alterarSenha()` recebe dois parâmetros: uma senha antiga e uma nova senha. Se a senha antiga for igual à senha armazenada na variável de instância privada, a nova senha será armazenada na variável de instância privada e o método retornará verdadeiro. Caso contrário, o método retornará falso.<br>
- `login()`recebe dois parâmetros: um email e uma senha. Se o email e a senha fornecidos forem iguais aos armazenados nas variáveis de instância privadas, o método retornará verdadeiro. Caso contrário, o método retornará falso.<br>
- `Estabelecimento() `retorna o valor da variável de instância privada booleana estabelecimento.<br>

  A classe `Estabelecimento` é uma subclasse da classe Usuario e tem duas variáveis de instância privadas: cnpj e cardapio.
O construtor da classe recebe seis parâmetros: nome, email, cnpj, senha, endereco e telefone. Se o comprimento do parâmetro cnpj não for igual a 14, uma mensagem de erro será exibida. Caso contrário, o valor do parâmetro cnpj será armazenado na variável de instância privada correspondente. A variável de instância privada cardapio é inicializada como uma nova instância de um objeto ArrayList.


A classe tem três métodos públicos:

O método público `getCardapio()` retorna o valor da variável de instância privada cardapio.
O método público `setCardapio() `atribui um novo valor à variável de instância privada cardapio.
O método público `adicionarItem()` recebe um parâmetro do tipo Item e adiciona esse item à lista armazenada na variável de instância privada cardapio.<br>


A classe`Cliente` é uma subclasse da classe Usuario e tem um construtor que recebe cinco parâmetros: nome, email, senha, endereco e telefone. O construtor chama o construtor da superclasse Usuario com esses parâmetros.

A classe tem um método público booleano chamado buscaEstabelecimento(). O método recebe dois parâmetros: uma lista de objetos do tipo Usuario e uma string de busca. O método percorre a lista de usuários e verifica se o nome do usuário é igual à string de busca. Se encontrar um usuário com o nome correspondente, o método retorna verdadeiro. Caso contrário, o método retorna falso.<br>

A classe `CadastroUsuario` tem duas variáveis de instância privadas: usuarios e sc. A variável usuarios é uma lista de objetos do tipo Usuario, enquanto a variável sc é um objeto da classe Scanner.

O construtor da classe inicializa a lista de usuários e o objeto Scanner.

A classe tem dois métodos públicos:

O método público `cadastrarUsuario()`solicita ao usuário que digite os dados do usuário que deseja cadastrar, incluindo nome, email, senha, endereço e telefone. Em seguida, cria um novo objeto do tipo Usuario com esses dados e adiciona o objeto à lista de usuários.
O método público `getUsuarios()`retorna a lista de usuários.


A classe `Carrinho` tem uma variável de instância privada chamada item, que é uma lista de objetos do tipo Item. O construtor da classe inicializa a lista de itens.

A classe tem três métodos públicos:

O método público `adicionarItem()` recebe um parâmetro do tipo Item e adiciona esse item à lista armazenada na variável de instância privada item.
O método público `removerItem()` recebe um parâmetro do tipo Item e remove esse item da lista armazenada na variável de instância privada item.
O método público `getItens()`retorna a lista de itens armazenados na variável de instância privada item.


A Classe `Main ` usa a classe Scanner para receber entrada do usuário e a classe Cliente para armazenar informações do cliente. O programa tem três opções: login, cadastro e sair. Se o usuário escolher a opção de login, ele será solicitado a inserir seu email e senha. Se as credenciais estiverem corretas, o usuário será levado a um menu com mais opções, como buscar estabelecimentos, ver o carrinho e ver o pedido. Caso contrário, o usuário receberá uma mensagem de erro. Se o usuário escolher a opção de cadastro, ele será levado a um formulário para inserir suas informações pessoais. Se o usuário escolher a opção de sair, o programa será encerrado.Assim criando um Menu


**OBS: O sistema se encontra incompleto**


O que mudou agora na nova versão?
foi adcionado o Método para que o Cliente escolha Item;
e um método chamado fecharPedido a fim de mostrar tudo que possui no carrinho final
Estabelecimento agora recebe um ArrayList de item,retornando uma lista de itens para que o usuário consiga esscolher
também em estabelecimendo foi implementado o Método CadastrarItem




















## 🔧 Como testar o projeto?
Para testar o meu projeto, você irá precisar do [Git](https://git-scm.com/book/pt-br/v2/Come%C3%A7ando-Instalando-o-Git)  e de uma IDE que suport3e desenvolvimento em java
no meu caso utilizei o "Eclipse" caso você não tenha instalado nenhuma IDE 
<br>
aqui tá algumas opções de IDE! [Eclipse](https://www.eclipse.org/downloads/) <br>
[Netebeeans](https://netbeans.apache.org/front/main/) 



Ambos instalados 👍
<br/>
```bash
você irá copiar o link do nosso repositório ,abrir o terminal e digitar:
$ git clone o link do meu repósitorio
após clonado é só abrir com a IDE e executar 
e prontinho!🎉
```
</br>

## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE)



<br/>


## 💜 Autora
   
| [<img src="https://avatars.githubusercontent.com/u/112040400?v=4" width=115><br><sub>Maria Eduarda</sub>](https://github.com/MariaEduardaSM)  
