package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger((getClass()));

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "spring";

        System.out.println("name = "+ name);

//        log.info("trace log="+ name); 로그 레벨을 바꿔 출력이 안되더라도 연산이 먼저 일어나기 때문에 이렇게 사용하지 않도록 한다

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={}", name);
        log.warn(" warn log={}", name);
        log.error("error log={}", name);

        return "ok";

    }

}
