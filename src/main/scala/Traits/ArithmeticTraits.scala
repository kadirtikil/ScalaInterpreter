package scala


sealed trait GeneralTraits

case object PlusSign extends GeneralTraits{
  override def toString: String = "+"
}

case object MinusSign extends GeneralTraits{
  override def toString: String = "-"
}

case object DivisionSign extends GeneralTraits {
  override def toString: String = "/"
} 

case object MultiplySign extends GeneralTraits {
  override def toString: String = "*"
}




