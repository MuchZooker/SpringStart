package atex.dev.spring.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 * Created by atex on 2020/6/16.
 */
public abstract class AbstractPreZuulFilter extends ZuulFilter {

    RequestContext context;

    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        context = RequestContext.getCurrentContext();

        return cRun();
    }

    protected abstract Object cRun();

    Object fail(int code, String msg) {
        context.set("next", false);
        context.setSendZuulResponse(false);
        context.getResponse().setContentType("text/html;charset=UTF-8");
        context.setResponseStatusCode(code);
        context.setResponseBody(msg);
        return null;
    }

    Object success() {
        context.set("next", true);
        return null;
    }
}
