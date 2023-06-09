package shop.mtcoding.filter.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import shop.mtcoding.filter.config.filter.MyBlackListFilter;

@Configuration
public class FilterRegisterConfig {

    // 명시적으로 컨테이너에 등록
    @Bean
    public FilterRegistrationBean<?> blackListFilter() {
        FilterRegistrationBean<MyBlackListFilter> registraion = new FilterRegistrationBean<>();
        registraion.setFilter(new MyBlackListFilter());
        registraion.addUrlPatterns("/filter");
        registraion.setOrder(1);

        return registraion;
    }
}
