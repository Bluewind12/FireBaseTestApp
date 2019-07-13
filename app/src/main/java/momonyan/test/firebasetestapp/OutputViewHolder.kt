package momonyan.test.firebasetestapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.output_row_layout.view.*

class OutputViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nameTextView = view.objectNameTextView
    val yenTextView = view.objectYenTextView
}