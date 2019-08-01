import java.util.Scanner

fun main(args: Array<String>) {
	println("GAME XO!!")
	val arr: Array<Array<Char>> = arrayOf(

		arrayOf('-', '-', '-'),
		arrayOf('-', '-', '-'),
		arrayOf('-', '-', '-')
	)


	for (row: Array<Char> in arr) {
		for (col: Char in row) {
			print("$col ")
		}
		println()
	}
	val reader = Scanner(System.`in`)



	for (i in 0..9) {
		if (i % 2 == 0) {
			println("########################")
			if (i > 8) {
				println("Draw")
				break
			}
			println("turn X ")
			print("row : ")
			var row: Int = reader.nextInt()
			print("col : ")
			var col: Int = reader.nextInt()

			if (row > 2 || row < 0 || col > 2 || col < 0) {
				println("Invalid input")
				break
			}
			if (arr[row][col] == 'O' || arr[row][col] == 'X') {
				println("Repeat")
				break
			}
			arr[row][col] = 'X'
			for (row: Array<Char> in arr) {
				for (col: Char in row) {
					print("$col ")
				}
				println()
			}

			//bingo

			if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X') {
				println("bingo  X winner")
				break

			}
			if (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') {
				println("bingo  X winner")
				break

			}
			if (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X') {
				println("bingo  X winner")
				break

			}

			if (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') {
				println("bingo  X winner")
				break

			}
			if (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') {
				println("bingo  X winner")
				break

			}
			if (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') {
				println("bingo  X winner")
				break

			}

			if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
				println("bingo  X winner")
				break

			}
			if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
				println("bingo  X winner")
				break

			}


		} else {
			println("########################")
			if (i > 8) {
				println("Draw")
				break
			}
			println("turn O ")
			print("row : ")
			var row: Int = reader.nextInt()
			print("col : ")
			var col: Int = reader.nextInt()


			if (row > 2 || row < 0 || col > 2 || col < 0) {
				println("Invalid input")
				break
			}
			if (arr[row][col] == 'O' || arr[row][col] == 'X') {
				println("Repeat")
				break
			}
			
			arr[row][col] = 'O'

			for (row: Array<Char> in arr) {
				for (col: Char in row) {
					print("$col ")
				}
				println()
			}
			//bingo

			if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O') {
				println("bingo O winner")
				break

			}
			if (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O') {
				println("bingo O winner")
				break

			}
			if (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O') {
				println("bingo O winner")
				break

			}

			if (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O') {
				println("bingo O winner")
				break

			}
			if (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O') {
				println("bingo O winner")
				break

			}
			if (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O') {
				println("bingo O winner")
				break

			}

			if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {
				println("bingo O winner")
				break

			}
			if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
				println("bingo O winner")
				break

			}
		}
	}
}