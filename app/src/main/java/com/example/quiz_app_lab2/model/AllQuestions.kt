package com.example.quiz_app_lab2.model

import com.example.quiz_app_lab2.R

class AllQuestions {
    public val listOfQuestions = arrayOf(
        Question(R.string.q1, false),
        Question(R.string.q2,  true),
        Question(R.string.q3, false),
        Question(R.string.q4, true)
    );
}
