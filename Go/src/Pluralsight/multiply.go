package main

import (
	"fmt"
	"strconv"
	"strings"
)

var s1 = "1126"
var s2 = "1215"
var arr1 = strings.Split(s1, "")
var product, fp2, temp, carry int
var fp string
var arr2 = strings.Split(s2, "")

func main() {

	for i := len(arr2) - 1; i >= 0; i-- {
		for j := len(arr1) - 1; j >= 0; j-- {
			num, _ := strconv.Atoi(arr1[j])
			divider, _ := strconv.Atoi(arr2[i])
			temp = num * divider
			temp += carry
			carry = temp / 10
			product = temp % 10
			fp = strconv.Itoa(product) + fp
			//fmt.Println(fp)
			fmt.Println("product @", fp, j)

		}
		//add(fp, i)
		if i != len(arr1)-1 {
			x := strings.Repeat("0", i+1)
			fp = fp + x
		}

		temp, _ := strconv.Atoi(fp)
		fp2 = fp2 + temp
		fp = ""

	}
	fmt.Println("product ", fp2)
}
