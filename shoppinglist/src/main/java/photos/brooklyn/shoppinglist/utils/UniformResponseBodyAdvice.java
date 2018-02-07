package photos.brooklyn.shoppinglist.utils;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class UniformResponseBodyAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(final MethodParameter returnType, final Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(final Object body, final MethodParameter returnType, final MediaType selectedContentType, final Class<? extends HttpMessageConverter<?>> selectedConverterType, final ServerHttpRequest request, final ServerHttpResponse response) {
        final Map<String, ? super Object> uniformResponse = new HashMap<>();
        final boolean hasError = returnType.getMethod().getName().equals("error");
        if(hasError) {
            uniformResponse.put("error", body);
            uniformResponse.put("success", false);
        }else{
            uniformResponse.put("data", body);
            uniformResponse.put("success", true);
        }
        return uniformResponse;
    }

}
