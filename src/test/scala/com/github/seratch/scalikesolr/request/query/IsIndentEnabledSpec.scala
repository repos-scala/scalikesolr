package com.github.seratch.scalikesolr.request.query

import org.scalatest._
import org.scalatest.matchers._
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class IsIndentEnabledSpec extends FlatSpec with ShouldMatchers {

  behavior of "IsDebugQueryEnabled"

  it should "be available" in {
    val indent: Boolean = false
    val instance = new IsIndentEnabled(indent)
    instance should not be null
    instance.getKey() should equal("indent")
  }

}
