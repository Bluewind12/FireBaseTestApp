package momonyan.test.firebasetestapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val context: Context, private val itemList: List<DataBaseItemHolder>) :
    RecyclerView.Adapter<OutputViewHolder>() {

    override fun onBindViewHolder(holder: OutputViewHolder, position: Int) {
        holder.let {
            it.nameTextView.text = itemList[position].name
            it.yenTextView.text = itemList[position].yen.toString()
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OutputViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val mView = layoutInflater.inflate(R.layout.output_row_layout, parent, false)
        return OutputViewHolder(mView)
    }

}