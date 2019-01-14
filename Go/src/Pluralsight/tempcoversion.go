package main

import (
	"fmt"
)

func madin() {
	fmt.Println("Enter a numner")
	var input float64
	fmt.Scanf("%f", &input)
	output := (input - 32) * 5 / 9
	fmt.Println("OUTPuT", output)
}
