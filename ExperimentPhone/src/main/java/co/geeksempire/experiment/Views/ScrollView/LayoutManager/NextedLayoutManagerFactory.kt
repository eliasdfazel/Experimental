/*
 * Copyright © 2022 By Geeks Empire.
 *
 * Created by Elias Fazel
 * Last modified 12/17/22, 2:37 AM
 *
 * Licensed Under MIT License.
 * https://opensource.org/licenses/MIT
 */

package co.geeksempire.experiment.Views.ScrollView.LayoutManager

import androidx.recyclerview.widget.RecyclerView

class NextedLayoutManagerFactory(
    val layoutOrientation: Int = RecyclerView.VERTICAL,
    var shrinkAmount: Float = 0.39f,
    var shrinkDistance: Float = 1f
) {

    init {

    }

}