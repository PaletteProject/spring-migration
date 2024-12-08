
public class ReactController {

    // route any request that's not /api to the frontend
    @RequestMapping(value = {"/", "/{x:^(?!api$).*}"})
    public String serveReactApp() {
        return "index.html";
    }
}