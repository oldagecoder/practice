package main

import (
	"fmt"
	"math/rand"
	"time"
)

func ma1in() {
	switch tmpNum := random(); tmpNum {
	case 0, 2, 4, 6, 8:
		fmt.Println("even Block")
	case 1, 3, 5, 7, 9:
		fmt.Println("Odd Block")
	default:
		fmt.Println("inside Default")
	}
}

func random() int {
	rand.Seed(time.Now().Unix())
	return rand.Intn(10)
}
