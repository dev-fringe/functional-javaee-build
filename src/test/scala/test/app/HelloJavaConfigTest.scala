package test.app

import javax.inject.Inject

import dev.config.Hello
import dev.service.{FunctionalService, HelloService}
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(classes = Array(classOf[Hello]))
class HelloJavaConfigTest {
  @Inject var service : HelloService = _
  @Inject var functional : FunctionalService = _
  @Test def print : Unit = service.print
  @Test def functional_add : Unit = functional.operation(functional.add)
  @Test def functional_subtract : Unit = functional.operation(functional.subtract)
  @Test def functional_multiply : Unit = functional.operation(functional.multiply)
}
