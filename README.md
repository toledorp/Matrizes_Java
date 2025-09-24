# Matrizes_Java

Esta pasta contem um exercicio de uso de matriz em Java.

Sinopse do exercicio:
Crie uma classe AgendaContatos que armazena nomes e telefones em uma matriz 5x2 (5 contatos, cada um com nome e telefone). Implemente métodos para:
Adicionar um contato em uma linha específica
Exibir todos os contatos cadastrados
Buscar e exibir o telefone de um contato pelo nome

Teste de Mesa:
AgendaContatos agenda = new AgendaContatos();
agenda.adicionarContato(0, "Ana", "9999-1111");
agenda.adicionarContato(1, "Bruno", "8888-2222");
agenda.adicionarContato(2, "Carla", "7777-3333");
agenda.exibirContatos();
// Saída esperada:
// Ana - 9999-1111
// Bruno - 8888-2222
// Carla - 7777-3333

agenda.buscarTelefone("Bruno");
// Saída esperada:
// Telefone de Bruno: 8888-2222
