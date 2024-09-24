package scala


import scala.annotation.tailrec




class InterpreterParser {
  
  def GoParser(goCode: String) = {
    
    @tailrec
    def goParserHelper(code: String): String = {    
      if (code.length == 0) return "" 
      

      code match {
        case s if s.startsWith("i") => {
          println("i detected")
          goParserHelper(code.substring(1))
        }
        case _ => goParserHelper(code.substring(1))
      }
    }
    goParserHelper(goCode)
  }
    
}
