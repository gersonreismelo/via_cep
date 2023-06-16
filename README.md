# Via CEP

O programa Via CEP é uma aplicação Java que permite buscar informações de endereços a partir de um CEP fornecido pelo usuário. Ele utiliza a API pública do ViaCEP (https://viacep.com.br/) para realizar as consultas.

## Funcionalidades

- Buscar endereço por CEP
- Armazenar os endereços encontrados em um arquivo de texto

## Pré-requisitos

- Java Development Kit (JDK) instalado
- Conexão com a internet

## Como executar

1. Faça o download ou clone o repositório do programa.
2. Abra o terminal e navegue até o diretório do projeto.
3. Compile o código-fonte executando o comando: `javac br/com/via_cep/main/Main.java`.
4. Execute o programa com o comando: `java br.com.via_cep.main.Main`.

## Utilização

1. Ao ser executado, o programa solicitará que você digite os CEPs que deseja buscar. Digite um CEP por vez e pressione Enter. Digite "sair" para encerrar o programa.
2. O programa realizará a busca do endereço correspondente ao CEP informado através da API do ViaCEP.
3. Os endereços encontrados serão armazenados em um arquivo chamado "Endereços.txt".
4. Ao finalizar a execução, o programa exibirá os endereços encontrados e uma mensagem indicando que finalizou corretamente.

## Estrutura do projeto

- `br.com.via_cep.main`: Contém a classe `Main`, responsável pela execução principal do programa.
- `br.com.via_cep.models`: Contém a classe `Endereco`, que representa um endereço e utiliza o recurso de *record* do Java.
- `br.com.via_cep.service`: Contém a classe `BuscarEndereco`, que realiza a busca do endereço utilizando a API do ViaCEP.
- `br.com.via_cep.util`: Contém a classe `EscritorArquivo`, responsável por escrever os endereços encontrados em um arquivo.

## Contribuições

Contribuições para melhorias ou novas funcionalidades são bem-vindas! Sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
