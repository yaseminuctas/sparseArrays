package com.yaseminuctas.sparsearrays

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

class Solution {

    private fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
        var resultArrayList = ArrayList<Int>()
        var count = 0
        for (i in queries) {
            for (k in strings) {
                if (i == k) {
                    count++
                }
            }
            resultArrayList.add(count)
            count = 0
        }
        return resultArrayList.toTypedArray()
    }

    fun main(args: Array<String>) {
        val stringsCount = readLine()!!.trim().toInt()

        val strings = Array<String>(stringsCount, { "" })
        for (i in 0 until stringsCount) {
            val stringsItem = readLine()!!
            strings[i] = stringsItem
        }

        val queriesCount = readLine()!!.trim().toInt()

        val queries = Array<String>(queriesCount, { "" })
        for (i in 0 until queriesCount) {
            val queriesItem = readLine()!!
            queries[i] = queriesItem
        }

        val res = matchingStrings(strings, queries)

        println(res.joinToString("\n"))
    }

}