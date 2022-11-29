package com.thg.microservices.limitsservices.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    /**
     * @Component é a anotação usada que permite que o Spring detecte/verifique automaticamente
     * beans definidos de maneira personalizada. E é definido no nível da classe.
     * Podemos usar @Component em todo o aplicativo para marcar os beans como componentes gerenciados do Spring.
     * Portanto, de acordo com o contexto do conteúdo do curso, se não especificarmos @Compenent no nível da turma,
     * a verificação do componente não acontecerá para essa turma de configuração.
     */

    private int minimum;
    private int maximum;


    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
