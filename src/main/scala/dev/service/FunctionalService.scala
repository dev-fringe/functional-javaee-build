package dev.service

import org.springframework.stereotype.Service

@Service
class FunctionalService {
  val add = (x: Int, y:Int) => { x + y }
  val subtract = (x: Int, y:Int) => { x - y }
  val multiply = (x: Int, y:Int) => { x*y }
  def operation(function:(Int, Int) => Int) = println(function(4,4))
}
