@RestController
@RequestMapping("/api")
@CrossOrigin // 允许跨域，否则前端连不上后端
public class TestController {
    @GetMapping("/hello")
    public String sayHello() {
        return "来自 SpringBoot 后端的非遗平台数据连接成功！";
    }
}