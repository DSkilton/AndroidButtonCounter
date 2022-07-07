package com.duncancodes.buttoncounter.sudoku

import kotlin.random.Random

class Sudoku private constructor(val level: Level?){

    val grid = Array(GRID_SIZE){ IntArray(GRID_SIZE) {0} }

    init {
        fillGrid()
    }

    private fun fillGrid(){
        fillDiagonalBoxes()
        fillRemaining()
        removeDigits()
    }

    private fun fillDiagonalBoxes(){
        for(i in 0 until GRID_SIZE step GRID_SIZE_SQUARE_ROOT){
            fillBox(i, i)
        }
    }

    private fun fillBox(row: Int, column: Int){
        var generatedDigit: Int

        for(i in 0 until GRID_SIZE_SQUARE_ROOT){
            for(j in 0 until GRID_SIZE_SQUARE_ROOT){
                do {
                    generatedDigit = generateRandomInt(MIN_DIGIT_VALUE, MAX_DIGIT_VALUE)
                } while(!isUnusedInBox(row, column, generatedDigit))

                grid[row + i][column + j] = generatedDigit
                }
            }
        }
    }

    private fun generateRandomInt(min: Int, max: Int) = Random.nextInt(min, max + 1)

    private fun isUnusedInBox() {
        
    }

    private fun fillRemaining(){

    }

    private fun removeDigits(){

    }

}