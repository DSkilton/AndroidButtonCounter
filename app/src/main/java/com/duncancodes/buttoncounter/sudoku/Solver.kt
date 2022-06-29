package com.duncancodes.buttoncounter.sudoku

internal object Solver {
    lateinit var grid: Array<IntArray>

    fun solvable(grid: Array<IntArray>) : Boolean{
        this.grid = grid.copy()

        return solve()
    }

    private fun Array<IntArray>.copy() = Array(size) { get(it).clone() }

    private fun solve() : Boolean{
        for(i in 0 until GRID_SIZE){
            for(j in 0 until GRID_SIZE){
                if(grid[i][j] == 0){
                    val availableDigits = getAvaiableDigits(i, j)
                    for(K in availableDigits){
                        grid[i][j] = k
                        if(solve()){
                            return true
                        }

                        grid[i][j] = 0
                    }
                    return false

                }
            }
        }

        return true
    }

    private fun getAvaiableDigits(row: Int, column: Int) : Iterable {
        val digitsRange = MIN_DIGIT_VALE..MAX_DIGIT_VALUE
        val availableDigits = muteableSetOf()
        availableDigits.addAll(digitsRange)

        truncateByDigitsAlreadyUsedInRow(availableDigits, row)

    }

    private fun truncateByDigitsAlreadyUsedInRow(availableDigits: MutableSet, row: Int){

    }
}