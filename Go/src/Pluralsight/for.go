package main

import (
	"fmt"
	"time"
)

func ma1ain() {
	for timer := 10; timer >= 0; timer-- {
		if timer == 0 {
			fmt.Println("Boom")
			break
		}
		fmt.Println(timer)
		time.Sleep(1 * time.Second)
	}
}
