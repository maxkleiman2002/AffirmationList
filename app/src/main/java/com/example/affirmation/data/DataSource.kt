package com.example.affirmation.data

import com.example.affirmation.R
import com.example.affirmation.model.Affirmatio

class DataSource {
    fun loadAffirmation(): List<Affirmatio>{
        return listOf<Affirmatio>(
            Affirmatio(R.string.affirmation_1),
            Affirmatio(R.string.affirmation_2),
            Affirmatio(R.string.affirmation_3),
            Affirmatio(R.string.affirmation_4),
            Affirmatio(R.string.affirmation_5),
            Affirmatio(R.string.affirmation_6),
            Affirmatio(R.string.affirmation_7),
            Affirmatio(R.string.affirmation_8),
            Affirmatio(R.string.affirmation_9),
            Affirmatio(R.string.affirmation_10)
        )
    }

}