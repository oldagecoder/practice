package main

import (
	"fmt"
	"strings"
)

func maa1in() {
	module := "function basics"
	author := "jwatts"

	fmt.Println(converter(module, author))
}
func converter(module, author string) (s1, s2 string) {
	module = strings.Title(module)
	author = strings.ToUpper(author)

	return module, author
}
