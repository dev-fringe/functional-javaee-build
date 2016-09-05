package dev.service

import javax.inject.Inject
import dev.model.HelloWorld
import org.springframework.stereotype.Service

@Service
class HelloService @Inject()(hello : HelloWorld) {
  def print = hello.print
}
