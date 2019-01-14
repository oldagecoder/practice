package main

import "fmt"

func fibo(a int, c chan int) {
	x := 0
	y := 1
	z := 1
	c <- x
	c <- y
	for i := 1; i <= a-2; i++ {
		x = y
		y = z
		z = x + y
		c <- z
	}
	close(c)
}
func maaaain() {
	fmt.Println("enter a number")
	var num int
	ch := make(chan int, 10)
	fmt.Scanf("%d", &num)
	go fibo(num, ch)
	for i := range ch {
		fmt.Println(i)
	}

}
