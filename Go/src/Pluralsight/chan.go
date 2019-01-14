package main

import "fmt"

func main() {
	msg := make(chan string)
	go func() { msg <- "ping" }()

	mesg := <-msg
	fmt.Println(mesg)
}
