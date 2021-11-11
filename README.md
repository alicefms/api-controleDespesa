api java, criada usando Spring
foi adicionada dependencia lombok para fazer gets, sets e construtores
foi usado JPA na implementação do CRUD -> Classe Categoria repository extends JpaRepository
Limitamos quais atributos serão devolvidos, criando classes DTO.

Usamos agora o CORS para habilitar o acesso do frontend

adicionamos uma dependência EnableWebSecurity