package scala


sealed trait RelationalTraits

case object Greater extends RelationalTraits {
  override def toString: String = ">"
}

case object GreaterEqual extends RelationalTraits {
  override def toString: String = ">="
}

case object Smaller extends RelationalTraits {
  override def toString: String = "<"
}

case object SmallerEqual extends RelationalTraits {
  override def toString: String = "<="
}

case object Equal extends RelationalTraits {
  override def toString: String = "=="
}

case object NotEqual extends RelationalTraits {
  override def toString: String = "!="
}
