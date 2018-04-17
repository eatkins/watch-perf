import mill._
import mill.scalalib._

object millTest extends Cross[millTestModule]("2.10.7", "2.11.12", "2.12.4", "2.12.3")
class millTestModule(val crossScalaVersion: String) extends CrossScalaModule {
  /*
   *val cache = new sbt.internal.inc.FreshCompilerCache
   *def scalaCompilerCache() = T.task {
   *  System.err.println("using fresh")
   *  cache
   *}
   */
  object test extends Tests {
    /*
     *def scalaCompilerCache() = T.task {
     *  System.err.println("using fresh test")
     *  cache
     *}
     */
    def ivyDeps = Agg(ivy"com.lihaoyi::utest:0.6.4")
    def testFrameworks = Seq("utest.runner.Framework")
  }
}
