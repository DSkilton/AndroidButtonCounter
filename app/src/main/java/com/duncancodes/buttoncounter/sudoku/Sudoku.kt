package com.duncancodes.buttoncounter.sudoku

import kotlin.random.Random

class Sudoku private constructor(val level: Level){

    val grid = Array(ConstantsGRID_SIZE){ intArray(GRID_SIZE) {0} }

}