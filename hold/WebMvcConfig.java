package com.dea42.watchlist;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.resource.EncodedResourceResolver;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import nz.net.ultraq.thymeleaf.decorators.strategies.GroupingStrategy;

//@Configuration
//@EnableWebMvc
class WebMvcConfig extends WebMvcConfigurationSupport {

	private static final String VIEWS = "/WEB-INF/classes/templates/";

	private static final String RESOURCES_LOCATION = "/resources/";

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}

	public static String[] array(String... args) {
		return args;
	}

//	@Bean
//	public ViewResolver htmlViewResolver() {
//		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//		resolver.setTemplateEngine(templateEngine(htmlTemplateResolver()));
//		resolver.setContentType("text/html");
//		resolver.setCharacterEncoding("UTF-8");
//		resolver.setViewNames(array("*.html"));
//		return resolver;
//	}
//
//	private ITemplateResolver htmlTemplateResolver() {
//		SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//		resolver.setApplicationContext(applicationContext);
//		resolver.setPrefix(VIEWS);
//		resolver.setCacheable(false);
//		resolver.setTemplateMode(TemplateMode.HTML);
//		return resolver;
//	}
//
//	@Bean
//	public ViewResolver javascriptViewResolver() {
//		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//		resolver.setTemplateEngine(templateEngine(javascriptTemplateResolver()));
//		resolver.setContentType("application/javascript");
//		resolver.setCharacterEncoding("UTF-8");
//		resolver.setViewNames(array("*.js"));
//		return resolver;
//	}
//
//	private ITemplateResolver javascriptTemplateResolver() {
//		SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//		resolver.setApplicationContext(applicationContext);
//		resolver.setPrefix("/js/");
//		resolver.setCacheable(false);
//		resolver.setTemplateMode(TemplateMode.JAVASCRIPT);
//		return resolver;
//	}
//
//	@Bean
//	public ViewResolver cssViewResolver() {
//		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
//		resolver.setTemplateEngine(templateEngine(cssTemplateResolver()));
//		resolver.setContentType("application/javascript");
//		resolver.setCharacterEncoding("UTF-8");
//		resolver.setViewNames(array("*.css"));
//		return resolver;
//	}
//
//	private ITemplateResolver cssTemplateResolver() {
//		SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//		resolver.setApplicationContext(applicationContext);
//		resolver.setPrefix("/css/");
//		resolver.setCacheable(false);
//		resolver.setTemplateMode(TemplateMode.CSS);
//		return resolver;
//	}
//
//	/**
//	 * Adds a resolver to a template engine
//	 * 
//	 * @param templateResolver
//	 * @return
//	 */
//	private ISpringTemplateEngine templateEngine(ITemplateResolver templateResolver) {
//		SpringTemplateEngine engine = new SpringTemplateEngine();
//		engine.addDialect(new LayoutDialect(new GroupingStrategy()));
//		engine.addDialect(new Java8TimeDialect());
//		engine.setTemplateResolver(templateResolver);
//		engine.setTemplateEngineMessageSource(messageSource());
//		return engine;
//	}

//	@Bean
//	@Description("Spring Message Resolver")
//	public ResourceBundleMessageSource messageSource() {
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasename("messages");
//		return messageSource;
//	}
//
//	@Bean
//	public LocaleResolver localeResolver() {
//		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
//		localeResolver.setDefaultLocale(Locale.ENGLISH);
//		return localeResolver;
//	}
//
//	@Bean
//	public LocaleChangeInterceptor localeChangeInterceptor() {
//		LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
//		localeChangeInterceptor.setParamName("lang");
//		return localeChangeInterceptor;
//	}
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(localeChangeInterceptor());
//	}
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(3600).resourceChain(true)
//				.addResolver(new EncodedResourceResolver()).addResolver(new PathResourceResolver());
//		registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(3600).resourceChain(true)
//				.addResolver(new EncodedResourceResolver()).addResolver(new PathResourceResolver());
//		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/", "classpath:/resources/")
//				.setCachePeriod(3600).resourceChain(true).addResolver(new PathResourceResolver());
//	}

}
