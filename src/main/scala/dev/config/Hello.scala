package dev.config

import dev.model.HelloWorld
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.{Bean, ComponentScan, Configuration, PropertySource}

@Configuration
@ComponentScan(Array("dev.service"))
@PropertySource(Array("classpath:application.properties"))
class Hello  @Value("${app.name}")(app : String) {
  @Bean def helloworld = new HelloWorld(name = app)
}

