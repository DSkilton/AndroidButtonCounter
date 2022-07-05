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
                    val availableDigits = getAvailableDigits(i, j)
                    for(K in availableDigits){
                        grid[i][j] = k
                        if(solve()){
                            return true
                        }
                        grid[i][j] = 0
                    }//end of for
                    return false
                }//end of if
            }//end of j for
        }//end of i for
        return true
    }

    private fun getAvailableDigits(row: Int, column: Int) : Iterable<Int> {
        val digitsRange = MIN_DIGIT_VALE..MAX_DIGIT_VALUE
        val availableDigits = muteableSetOf()
        availableDigits.addAll(digitsRange)

        truncateByDigitsAlreadyUsedInRow(availableDigits, row)
        if(availableDigits.size > 1){
            truncateByDigitsAlreadyUsedInColumn(availableDigits, column)
        }
        if(availableDigits.size > 1){
            truncateByDigitsAlreadyUsedInBox(availableDigits, row, column)
        }

        return availableDigits.asIterable()
    }

    private fun truncateByDigitsAlreadyUsedInRow(availableDigits: MutableSet<Int>, row: Int){

    }

    private fun truncateByDigitsAlreadyUsedInColumn(availableDigits: MutableSet<Int>, column: Int){

    }

    private fun truncateByDigitsAlreadyUsedInBow(availableDigits: MutableSet<Int>, row: Int){

    }


}