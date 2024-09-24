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


// Variablen und Werte mit ihren Datentypen.
case object Variable extends GoTraits {
  override def toString: String = "var"
}

case object Walrus extends GoTraits {
  override def toString: String = ":="
}

