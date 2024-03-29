package br.com.engineering.theme.spring;

public class SpringFrameworkAnnotations {

    /*
    * @Component: Ela é usada para identificar uma classe como um componente do Spring,
    * permitindo que o Spring faça a varredura (scanning) do classpath e encontre
    * esses componentes para gerenciamento de beans.
    *
    * @Controller: Usada para marcar classes como controladores no padrão
    * MVC (Model-View-Controller) do Spring. Os controladores são responsáveis
    * por lidar com solicitações HTTP e retornar respostas apropriadas.
    *
    * @Service: Esta anotação é usada para marcar classes que fornecem serviços
    * dentro de um aplicativo. É geralmente usado no contexto de camada de serviço
    * em arquiteturas de aplicativos baseadas em Spring.
    *
    * @Repository: Esta anotação é usada para marcar classes que acessam o banco
    * de dados ou qualquer outro tipo de armazenamento de dados.
    * Geralmente é usado em conjunto com a camada de
    * acesso a dados (DAO - Data Access Object) para indicar que a classe
    * realiza operações de acesso a dados.
    *
    * @Autowired: Esta anotação é usada para injetar dependências automaticamente
    * em uma classe. O Spring irá procurar por beans no contexto de aplicação que
    * correspondam ao tipo da dependência e injetá-los automaticamente.
    *
    * @Configuration: Esta anotação é usada para indicar que uma classe contém
    * métodos de configuração que serão usados para criar e configurar beans do Spring.
    *
    * @Bean: Esta anotação é usada para indicar que um método de uma classe anotada com
    * @Configuration irá retornar um objeto que será gerenciado pelo contêiner
    * Spring como um bean.
    *
    * @Value: Esta anotação é usada para injetar valores de propriedades de
    * configuração diretamente em campos de classe ou parâmetros de método.
    *
    * @RequestMapping: Esta anotação é usada para mapear solicitações HTTP
    * a métodos específicos em controladores. Pode ser usada para mapear
    * URLs específicas, métodos HTTP e parâmetros de solicitação.
    *
    * */
}
