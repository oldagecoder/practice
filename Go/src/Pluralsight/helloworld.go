package main //standalone executable file
import (
	"fmt"
	"runtime"
)

//executable entry point
//Only for executables, cant rename main, takes no args, no return val,
func maain1() {
	fmt.Println("hello from ", runtime.GOOS)
}
