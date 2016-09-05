package dev.app

import dev.config.Hello
import dev.model.HelloWorld
import org.springframework.context.annotation.AnnotationConfigApplicationContext

object HelloJavaConfigApp {
  def main(args: Array[String]) = new AnnotationConfigApplicationContext(classOf[Hello]).getBean("helloworld").asInstanceOf[HelloWorld].print
}