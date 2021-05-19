package com.example.week11.data.domain

data class Match(
        val year:Int,
        val stadium:String,
        val city:String,
        val homeTeamName:String,
        val awayTeamName:String,
        val homeTeamGoals:Int,
        val awayTeamGoals:Int
)