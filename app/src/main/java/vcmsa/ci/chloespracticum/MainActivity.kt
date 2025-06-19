package vcmsa.ci.chloespracticum

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
/// Work by student ST10478678-ChloeAylwin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
///this is my array section
    companion object

    val songlist = ArrayList<String>()
    val artistlist = ArrayList<String>()
    val ratinglist = ArrayList<Int>()
    val commentlist = Arraylist<String>()
}
///where my buttons come in play
val songInput:
val addButton = finfViewById<Button>(R.id.btnAdd)
val goPlaylists =findViewById<Button>(R.id.btnList)
val exit= findViewById<Button>(R.id.btnExit)

val builder=AlertDialog.Builder(this)
val view=layoutInflater.inflate(R.layout.activity_main,null)
///where my inputs are shown
val itemInput=view.findViewById<EditText>(R.id.songInput)
val artistInput =view.findViewById<EditText>(R.id.artistInput)
val ratingsInput=view.findViewById<EditText>(R.id.ratingInput)
val commentInput=view.findViewById<EditText>(R.id.commentInput)

}

builder.setView (view)
    .setTitle("Add to Playlist")
    .setPositiveButton("Add")
val song =songInput.text.toString()
val artists=artistInput.text.toString()
val ratings= ratingsInput.text.toString()
val comment= commentInput.text.toString()






