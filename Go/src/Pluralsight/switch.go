package main

import (
	"fmt"
)

func maicn() {
	switch "docker" {
	case "linux":
		fmt.Println("inside Linux")
	case "docker":
		fmt.Println("inside docker")
		fallthrough //executes below cases aswell
	case "windows":
		fmt.Println("inside windows")
	case "test":
		fmt.Println("test")
		//fallthrough
	default:
		fmt.Println("inside Default")
	}
}
