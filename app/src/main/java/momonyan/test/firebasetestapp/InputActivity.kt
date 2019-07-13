package momonyan.test.firebasetestapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.input_layout.*

class InputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_layout)

        addButton.setOnClickListener {
            val name = nameInputEditText.text
            val yen = yenInputEditTest.text.toString().toInt()
        }
    }

}