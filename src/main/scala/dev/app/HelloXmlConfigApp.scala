package dev.app

import dev.model.HelloWorld
import org.springframework.context.support.ClassPathXmlApplicationContext

object HelloXmlConfigApp {
  def main(args: Array[String]) = new ClassPathXmlApplicationContext("dev/config/hello.xml").getBean("hello").asInstanceOf[HelloWorld].print
}