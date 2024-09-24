## sbt project compiled with Scala 3

### Usage

This is a normal sbt project. You can compile code with `sbt compile`, run it with `sbt run`, and `sbt console` will start a Scala 3 REPL.

For more information on the sbt-dotty plugin, see the
[scala3-example-project](https://github.com/scala/scala3-example-project/blob/main/README.md).



# Why? 
To just train my understanding of the Languages I like the most. 


# How does it work?
The Syntax of Go is defined as an object that extends a trait in Scala. These are things like variable declaration and other operators. The program will then be able to read the Go code and tokenize it by using these objects of the trait. These objects will then be translated to their corresponding Scala traits by using and Algorithm (which I will implement later), to then have the Scala version of the Go code.

Obviously I won't Code a full fletched Interpreter. This is just something I like to do as a side thing to get into interpreters.

This is the Code im trying to interpret now: 
```go
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

```
