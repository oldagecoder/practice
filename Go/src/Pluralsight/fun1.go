package main

import (
	"fmt"
)

func maai2n() {
	bestFinish := bestLeagueFinish(13, 10, 13, 17, 14, 16, 1)
	fmt.Println(bestFinish)
}

func bestLeagueFinish(finishes ...int) int {
	best := finishes[0]
	for _, i := range finishes {
		if i < best {
			best = i
		}
	}
	return best
}
