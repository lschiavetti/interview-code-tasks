package com.schiavetti.interviewcodetasks.kotlin

object KotlinPractice {

    /**
     *  The partition extension method is a interesting one for
     *  some specific situations. It takes a list and, after iterating
     *  through all the elements, returns two lists: the first
     *  containing elements to which the predicate block is true and
     *  second one with elements to which the predicated returned
     *  false.
     *  For instance, the example below gets a list containing
     *  numbers from 0 to 19. By using partition, it's possible
     *  to get one list for even numbers, and another one with
     *  odd numbers.
     */
    fun partitionStudy(): String {

        val (oddNumbers, evenNumbers) = listOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
            11,
            12,
            13,
            14,
            15,
            16,
            17,
            18,
            19
        ).partition {
            it % 2 != 0
        }

        return "Odd numbers in the list are: ${oddNumbers.joinToString()} and even numbers in the list are ${evenNumbers.joinToString()}"
    }


    /**
     *  Notes on Reduce and Fold
     *
     *  Reduce and Fold are two Kotlin similar extension functions that
     *  can be very useful in some situations. They iterate through a
     *  certain type of list or object with an operator that receives
     *  an accumulator value. Take this example of reduce:
     *
     *  listOf(1,2,3,4,5).reduce { acc, i ->
     *      acc + i
     *  }
     *
     *  It iterates through all elements from the list, starting from
     *  the left and "accumulating" values using the return of the
     *  operator block. The operator return value will become the next
     *  accumulator and so on.
     *  Note that, for reduce, the first iteration receives the first
     *  element as the acc parameter and the second element as the i
     *  parameter. Also, reduce requires the type to be the same
     *  for the accumulator as well as for the i parameter (and also for
     *  the return value).
     *
     *  Fold works slightly different. It takes a initial value as the
     *  first accumulator and starts iterating through the list. This
     *  variation may be important at times.
     *  Another important difference with fold is that it can work
     *  with more than one type during the iteration. While reduce
     *  only works with a single type, fold may work with a different
     *  type between the accumulator and the i parameter.
     *
     *  There are variations of these two methods.
     */
}
