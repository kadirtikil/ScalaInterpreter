@main def hello(): Unit =
  val golangstring ="""
  package main

  import "fmt"

  type Point struct {
    X int
    Y int
  }

    func addPoints(p1, p2 Point) Point {
    return Point{p1.X + p2.X, p1.Y + p2.Y}
  }

  func main() {
    var num int = 10
    message := "Hello, Go!"

    if num > 5 {
      fmt.Println("num is greater than 5")
    }

    numbers := []int{1, 2, 3}
    sum := 0
    for _, n := range numbers {
      sum += n
    }
    fmt.Println("Sum:", sum)

    p1 := Point{X: 1, Y: 2}
    p2 := Point{X: 3, Y: 4}
    result := addPoints(p1, p2)
    fmt.Println("Result:", result)
  }
 
  """
  

  println(PlusSign.toString())

