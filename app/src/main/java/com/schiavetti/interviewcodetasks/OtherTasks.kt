package com.schiavetti.interviewcodetasks

class OtherTasks {

    /**
     *  https://www.codewars.com/kata/54a91a4883a7de5d7800009c
     */
    private fun stringIncrementerStudy(element: String): String {
        val digitsPattern = Regex("\\d+")

        return if (element.contains(digitsPattern)) {
            val text = Regex("\\D+").find(element)?.groupValues?.first()
            val digits = digitsPattern.find(element)?.groupValues?.first()?.toInt()

            "$text${digits?.plus(1)}"
        } else {
            "${element}1"
        }
    }

    /**
     *  https://www.codewars.com/kata/56baeae7022c16dd7400086e
     *
     *  Obs: It's possible to capture the string surrounded by <>
     *      by using the following regex: \<(.*?)\>
     */
    private fun phoneDirectoryStudy(phoneNumber: String): String {
        val phoneBook = listOf(
            "<Leila> +1-555-123-1234  52 Amelia St, Colorado",
            "<Annete> +21-255-999-2334  993 Wrong Street",
            " +55-111-111-1111  <Manta> 12 Jerry Street",
            " +55-111-111-1111  <Nani> 24 George Street",
            " +99-999-999-9999 <Evair> 57 Palmeiras STreet, chicago",
            "1602 Saioa Street, Ipiranga +5-983-608-1840 <Levy>",
            "<Ariane> +55-333-237-9426 1602 Saioa STreet",
        )

        val phoneBookMatchingItems = phoneBook.filter { it.contains(phoneNumber) }

        return when {
            phoneBookMatchingItems.isEmpty() -> "Phone number not found"
            phoneBookMatchingItems.size > 1 -> "Too many entries for this number"
            else -> {
                val phoneBookItem = phoneBookMatchingItems.first()
                val name = phoneBookItem.substring(
                    startIndex = phoneBookItem.indexOfFirst { "$it" == "<" } + 1,
                    endIndex = phoneBookItem.indexOfFirst { "$it" == ">" },
                )
                val phone: String? = Regex("[+]\\d+-\\d+-\\d+-\\d+").run {
                    find(phoneBookItem)?.groups?.first()?.value
                }
                "Phone is $phone  Name is $name"
            }
        }
    }

    /**
     *   https://www.codewars.com/kata/5f05e334a0a6950011e72a3a
     */
    private fun wordSearchStudy(wordToBeFound: String): Int {
        val words = listOf("Freud", "Jung", "Lacan", "Sartre", "Dunker", "Mileto", "Anna", "Dork")

        return words.indexOf(wordToBeFound)
    }

    private fun invertStudy() {
        val numbers = listOf(-8, -7, -6, -5, 0, 1, 2, 3, 4)
        val invertedNumbers = numbers.map { it * (-1) }

        println("Kfk: $invertedNumbers")
    }

    private fun convertStringToANumberStudy() {
        val stringNumbers = listOf("1", "500", "1000", "9999")
        val numbers = stringNumbers.map { it.toInt() }

        println("Kfk: $numbers")
    }

    private fun doubleNumbersStudy() {
        val numbers = listOf(5, 15, 55)
        val doubledNumbers = numbers.map { it * 2 }

        println("Kfk: $doubledNumbers")
    }

    private fun multiplyStudy() {
        val numbersArray = arrayOf(1, 2, 3, 4)
        val result = numbersArray.reduce { acc, i ->
            println("Kfk: Reduce $acc   $i")
            acc * i
        }

        println("Kfk: $result")
    }

    private fun countAndSumStudy() {
        // https://www.codewars.com/kata/576bb71bbbcf0951d5000044

        val numbers = arrayOf(-10, -20, -30, -40, 0, 200, 300, 400)
        val resultArray = arrayOf(
            numbers.count { it > 0 }, numbers.sumOf { if (it < 0) it else 0 }
        )

        // It could also be done using fold:
        val alternative = arrayOf(
            numbers.count { it > 0 }, numbers.fold(0) { acc, i ->
                if (i < 0) acc + i else acc
            }
        )

        alternative.forEach {
            println("Kfk: $it")
        }
    }

    private fun shortestWordLengthStudy() {
        /* https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

            The problem requests finding the word with the shortest length
            within a list of words.
            The simplest solution would be to sort the list by length, and get the first
            item of the list.
         */

        val words = listOf(
            "Passion Fruit",
            "Banana",
            "Watermelon",
            "Orange",
            "Melon",
            "Pineapple",
            "Cherry"
        )
        val shortestWordBySorting = words.sorted().first()

        println("Kfk: Shortest word is $shortestWordBySorting, its length is ${shortestWordBySorting.length}")
    }

    private fun shortestWordLengthStudy2() {
        /* https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

            The problem requests finding the word with the shortest length
            within a list of words.
            The solution below iterates through the list and checks for
            possible lengths starting from length 1. This is probably a
            bad solution in terms of efficiency.
         */

        val words = listOf(
            "Passion Fruit",
            "Banana",
            "Watermelon",
            "Orange",
            "Melon",
            "Pineapple",
            "Cherry"
        )
        var length = 1
        var shortestWord = ""
        var matchesLength = false

        while (matchesLength.not()) {
            words.forEach {
                if (it.length == length) {
                    shortestWord = it
                    matchesLength = true
                    return@forEach
                }
            }
            length++
        }
        println("Kfk: Shortest word is $shortestWord, its length is ${shortestWord.length}")
    }

    private fun shortestWordLengthStudy3() {
        /* https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

            The problem requests finding the word with the shortest length
            within a list of words.
            This solution is similar to the first one, but uses minBy in
            order to achieve the expected item.
         */

        val words = listOf(
            "Passion Fruit",
            "Banana",
            "Watermelon",
            "Orange",
            "Melon",
            "Pineapple",
            "Cherry"
        )

        val shortestWord = words.minBy { it.length }
        println("Kfk: Shortest word is $shortestWord, its length is ${shortestWord.length}")
    }

    /**  Exercise link:
     *   https://www.codewars.com/kata/56684677dc75e3de2500002b
     *
     */
    private fun isComfortableWord(word: String): Boolean {
        val leftHandLetters =
            listOf("q", "w", "e", "r", "t", "a", "s", "d", "f", "g", "z", "x", "c", "v", "b")
        val rightHandLetters = listOf("y", "u", "i", "o", "p", "h", "j", "k", "l", "n", "m")

        val isFirstIndexLeft = leftHandLetters.contains("${word.first()}")

        val (evenBlock, oddBlock) = if (isFirstIndexLeft) {
            { letter: Char -> leftHandLetters.contains("$letter") } to { letter: Char ->
                rightHandLetters.contains(
                    "$letter"
                )
            }
        } else {
            { letter: Char -> rightHandLetters.contains("$letter") } to { letter: Char ->
                leftHandLetters.contains(
                    "$letter"
                )
            }
        }

        word.forEachIndexed { index, char ->
            val shouldContinue = if (isEvenNumber(index)) evenBlock(char) else oddBlock(char)

            if (shouldContinue.not()) return false
        }
        return true
    }

    private fun isEvenNumber(number: Int): Boolean {
        return number % 2 == 0
    }

    private fun isComfortableWordAlternateVersion(word: String): Boolean {
        val leftHandChars =
            listOf("q", "w", "e", "r", "t", "a", "s", "d", "f", "g", "z", "x", "c", "v", "b")
        val rightHandChars = listOf("y", "u", "i", "o", "p", "h", "j", "k", "l", "n", "m")

        var previousListOwner: List<String>? = null

        word.forEach {
            val listOwner = if (leftHandChars.contains("$it")) leftHandChars else rightHandChars

            if (listOwner == previousListOwner) {
                return false
            } else {
                previousListOwner = listOwner
            }
        }
        return true
    }
}
