package scala.meta

object Mirror {
  def apply(artifacts: Artifact*)(implicit resolver: Resolver): Mirror = {
    new Mirror {
      lazy val domain = Domain(artifacts: _*)(resolver)
      override def toString = s"""Context(${artifacts.mkString(", ")})($resolver)"""
    }
  }
}

object Hello {


  def main(args: Array[String]) {
    implicit val m = Mirror(Artifact("/Users/ollie/dev/hello-semantic"))
    println(m.domain.sources)
  }
}
