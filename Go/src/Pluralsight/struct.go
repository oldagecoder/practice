package main

import "fmt"

func maizn() {
	type coursemeta struct {
		Author string
		Level  string
		Rating int
	}

	//var dockerdeepdive coursemeta
	//dockerdeepdive := new(coursemeta) //pointer
	dockerdeepdive := coursemeta{
		Author: "jwatts",
		Level:  "five",
		Rating: 5,
	}

	fmt.Println(dockerdeepdive)
	fmt.Println(dockerdeepdive.Author)
}
