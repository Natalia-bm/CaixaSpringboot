import com.ibm.model.ClienteEntity;
import com.ibm.model.ClientePFEntity;
import com.ibm.model.ClientePJEntity;
import com.ibm.model.ContaEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.ibm.repository")
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.ibm")
@EntityScan(basePackageClasses = {ClientePJEntity.class, ClientePFEntity.class, ClienteEntity.class, ContaEntity.class})
@SpringBootApplication

public class applicationController {
    public static void main(String[] args) {
        SpringApplication.run(applicationController.class, args);

    }
}
