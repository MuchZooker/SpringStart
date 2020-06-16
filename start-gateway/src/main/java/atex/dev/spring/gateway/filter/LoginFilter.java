package atex.dev.spring.gateway.filter;

import org.springframework.stereotype.Component;

/**
 * Created by atex on 2020/6/16.
 */
@Component
public class LoginFilter extends AbstractPreZuulFilter {

    @Override
    protected Object cRun() {
        success();
        return null;
    }

    @Override
    public int filterOrder() {
        return 1;
    }
}
