package main

import "fmt"

func sum(s []int, ch chan int) {
	sum := 0
	for _, v := range s {
		sum += v
	}
	ch <- sum
}
func maaain() {
	s := []int{7, 2, 3, 4, 6, 8}
	c := make(chan int)
	go sum(s[:3], c)
	go sum(s[3:], c)
	x := <-c
	y := <-c
	fmt.Println(x, y, x+y)

}
