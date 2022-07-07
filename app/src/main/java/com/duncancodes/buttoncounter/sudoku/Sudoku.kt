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

    }

    private fun fillRemaining(){

    }

    private fun removeDigits(){
        
    }

}