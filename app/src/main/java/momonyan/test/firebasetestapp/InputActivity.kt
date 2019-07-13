package momonyan.test.firebasetestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.input_layout.*

class InputActivity : AppCompatActivity() {
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_layout)

        addButton.setOnClickListener {
            database = FirebaseDatabase.getInstance().reference
            val name = nameInputEditText.text.toString()
            val yen = yenInputEditTest.text.toString().toLong()
            val data = DataBaseItemHolder()
            data.name = name
            data.yen = yen
            database.child("商品").setValue(data)
            database.push()
        }
    }

}