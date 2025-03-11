package esprit.candidat;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//pas besoing de mettre l'url car il est declaré dans l"eureka
@FeignClient(name="Job")
public interface JobClient {
    @RequestMapping("/mic2/jobs/hello")
    public String sayHello();
}
