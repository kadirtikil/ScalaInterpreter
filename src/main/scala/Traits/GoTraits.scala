package scala


sealed trait GoTraits
case object Println extends GoTraits {
  override def toString: String = "fmt.Println"
}

case object Package extends GoTraits {
  override def toString: String = "package"
}

case object Function extends GoTraits {
  override def toString: String = "func"
}

case object Import extends GoTraits {
  override def toString: String = "import"
}

// Variablen und Werte mit ihren Datentypen.
case object Variable extends GoTraits {
  override def toString: String = "var"
}

case object Walrus extends GoTraits {
  override def toString: String = ":="
}

case object Type extends GoTraits {
  override def toString: String = "type"
}

case object Struct extends GoTraits {
  override def toString: String = "struct"    
}


//Loops
case object ForLoop extends GoTraits {
  override def toString: String = "for"
}

case object Range extends GoTraits {
  override def toString: String = "range"
}
