Reflection API Example
======================

Este projeto demonstra o uso da API de _reflection_ em Java para duas finalidades principais:

*   **Transformação de objetos**: converte um objeto de domínio em seu _DTO_ correspondente.
    
*   **Serialização em JSON**: converte qualquer objeto em uma string JSON formatada.
    

⚙️ Funcionalidades
------------------

1.  **Transformator**
    
    *   Recebe um objeto de entrada I e tenta instanciar uma classe de saída O cujo nome é DTO.
        
    *   Copia valores de todos os campos públicos e privados que possuem o mesmo nome e tipo.
        
    *   Provê flexibilidade para converter objetos de domínio em _Data Transfer Objects_ sem escrever código de mapeamento manual.
        
2.  **ObjectToJson**
    
    *   Itera sobre todos os campos de qualquer objeto, acessa valores privados e cria um Map com nome e valor de cada campo.
        
    *   Usa a biblioteca **Jackson** para gerar uma string JSON com indentação.
    

🛠️ Tecnologias
---------------

*   Java 21
    
*   Jackson Databind 2.x
    
*   API de Reflection do Java
    
