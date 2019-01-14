package main

import (
	"fmt"
	"math"
)

type geometry interface {
	area() float64
	perim() float64
}

type rect struct {
	width, height float64
}

type circle struct {
	radius float64
}

func (c circle) perim() float64 {
	return 2 * math.Pi * c.radius
}
func (r rect) perim() float64 {
	return 2 * r.height * r.width
}
func (c circle) area() float64 {
	return math.Pi * c.radius * c.radius
}
func (r rect) area() float64 {
	return r.height * r.width
}
func measure(g geometry) {
	fmt.Println(g)
	fmt.Println(g.area())
	fmt.Println(g.perim())
}

func maai1n() {
	r := rect{width: 3, height: 3}
	c := circle{radius: 4}
	measure(r)
	measure(c)
}
