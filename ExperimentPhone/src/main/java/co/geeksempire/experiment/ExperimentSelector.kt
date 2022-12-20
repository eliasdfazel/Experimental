/*
 * Copyright © 2022 By Geeks Empire.
 *
 * Created by Elias Fazel
 * Last modified 12/20/22, 4:27 AM
 *
 * Licensed Under MIT License.
 * https://opensource.org/licenses/MIT
 */

package co.geeksempire.experiment

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import co.geeksempire.experiment.Games.GradientGame
import co.geeksempire.experiment.databinding.ExperimentSelectorLayoutBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

class ExperimentSelector : AppCompatActivity() {

    lateinit var experimentSelectorLayoutBinding: ExperimentSelectorLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        experimentSelectorLayoutBinding = ExperimentSelectorLayoutBinding.inflate(layoutInflater)
        setContentView(experimentSelectorLayoutBinding.root)

        window.decorView.setBackgroundColor(Color.CYAN)
        experimentSelectorLayoutBinding.root.background = getDrawable(R.drawable.splash_screen_initial)

        startActivity(Intent(this@ExperimentSelector, GradientGame::class.java))

        experimentSelectorLayoutBinding.progressBar.setOnClickListener {

            setUpdateProgress()

        }
    }

    fun setUpdateProgress() = CoroutineScope(Dispatchers.Main).async {


        repeat(100) {

            delay(111)

            experimentSelectorLayoutBinding.progressBar.setProgress(it, true)

        }

    }

}