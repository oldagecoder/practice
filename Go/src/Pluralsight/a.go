package main

import (
	"fmt"
)

var s []int

func main() {

	l1 := []int{1, 2, 4, 5, 6}
	l2 := []int{2, 6, 4, 8, 9}
	if len(l1) > len(l2) {
		find_inter(l1, l2)
	} else {
		find_inter(l2, l1)
	}

}
func find_inter(x []int, y []int) {
	for _, i := range x {
		for _, j := range y {
			if i == j {
				s = append(s, i)
			}
		}
	}
	fmt.Println(s)
}
