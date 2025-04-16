Gerenciador de Produtos

Descrição do Exercício:

O objetivo deste exercício foi desenvolver um sistema de gerenciamento de produtos simples em Java. O sistema possui um menu interativo com opções para cadastro, listagem, alteração, e exclusão de produtos. O exercício tem o intuito de praticar conceitos de programação em Java, como o uso de listas, laços de repetição, condições, e interação com o usuário.

Funcionalidades Implementadas
Menu de Opções:

O sistema oferece um menu interativo com cinco opções principais: cadastrar, listar, alterar, excluir produtos e sair do programa.

Cadastro de Produtos:

O usuário pode cadastrar um produto informando seu nome e preço.

Cada produto cadastrado recebe um ID único, que é atribuído automaticamente.

Produtos são armazenados em uma lista de objetos.

Listagem de Produtos:

O sistema exibe a lista de produtos cadastrados com seus respectivos ID, nome e preço.

Caso não haja produtos cadastrados, o sistema avisa ao usuário.

Alteração de Produtos:

O usuário pode alterar o nome e o preço de um produto, fornecendo o ID correspondente.

O sistema verifica se o ID fornecido existe e permite ao usuário realizar as alterações desejadas.

Exclusão de Produtos:

O usuário pode excluir um produto fornecendo o ID correspondente.

O sistema verifica se o produto existe e, em caso positivo, o remove da lista.

Tratamento de Erros:

O sistema verifica entradas inválidas e exibe mensagens de erro adequadas para garantir uma melhor experiência ao usuário.

A interação com o usuário é feita de forma simples, com opções de escolha e confirmação de ações.

Explicação do Processo

Planejamento e Estruturação:

O exercício foi estruturado inicialmente com um menu interativo que permite ao usuário navegar pelas opções do sistema.

Cada funcionalidade (cadastro, listagem, alteração e exclusão) foi desenvolvida com foco na simplicidade, de modo a não utilizar conceitos avançados, como getters e setters, que não foram abordados ainda no curso.

Desenvolvimento Passo a Passo:

O primeiro passo foi implementar o menu e a estrutura básica do programa.

Em seguida, desenvolvi a funcionalidade de cadastro de produtos, garantindo que os produtos fossem armazenados corretamente em uma lista e que cada um recebesse um ID único.

Depois, implementei a funcionalidade de listagem, permitindo que o usuário visualizasse todos os produtos cadastrados.

Para finalizar, implementei as funcionalidades de alteração e exclusão, com a validação de IDs informados.

Testes e Ajustes:

Realizei testes com diversos cenários, como cadastrar vários produtos, listar, alterar e excluir. Em todos os casos, o sistema respondeu corretamente conforme o esperado.

Também adicionei tratamentos para erros de entrada, garantindo que o usuário não inserisse dados inválidos.