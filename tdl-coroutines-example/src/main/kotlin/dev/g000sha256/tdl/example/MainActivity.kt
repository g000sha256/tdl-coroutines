package dev.g000sha256.tdl.example

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

internal class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.gravity = Gravity.CENTER_HORIZONTAL

        val editText = EditText(this)

        val button = Button(this)
        button.text = "Send"
        button.setOnClickListener {
            val text = editText.text?.trim()
            val isNullOrEmpty = text.isNullOrEmpty()
            if (!isNullOrEmpty) {
                viewModel.sendText(text = "$text")
            }
        }

        val linearLayout = LinearLayout(this)
        linearLayout.gravity = Gravity.CENTER_VERTICAL
        linearLayout.orientation = LinearLayout.VERTICAL
        linearLayout.addView(textView)
        linearLayout.addView(editText)
        linearLayout.addView(button)

        setContentView(linearLayout)

        viewModel
            .titles
            .onEach {
                editText.text = null
                textView.text = it
            }
            .launchIn(lifecycleScope)
    }

}
