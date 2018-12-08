package chia.androidassignment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_movie_rater.*


class MovieRater : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_rater)




    }
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            var theSuit = findViewById<LinearLayout>(R.id.suit)
            when (view.id) {
                R.id.notSuit -> {
                    if (checked) {
                        theSuit.setVisibility(View.VISIBLE)
                    } else {
                        theSuit.setVisibility(View.INVISIBLE)
                    }
                }
            }
        }
    }





    fun btnClick(v: View) {
        //        ar editTextNumber: Int= etNumBiggerThan25.text.toString()
        //        if(editTextNumber<=25){
        //            etNumBiggerThan25.setError("Number is lesser or equal 25")
        //        }
        val movti: String = movTitle.text.toString()
        val movd: String = movDesc.text.toString()
        val datee: String = date.text.toString()
        //check if the EditText have values or not
        if(movti.isEmpty() || movd.isEmpty() || datee.isEmpty()){
            if(movti.isEmpty()){
                movTitle.setError("Field empty")
            }
            if(movd.isEmpty()){
                movDesc.setError("Field empty")
            }
            if(datee.isEmpty()){
                date.setError("Field empty")
            }

        } else {
            var movTitle = movTitle.text
            var movDesc = movDesc.text
            var id: Int = radioGroup.checkedRadioButtonId
            val radio: RadioButton = findViewById(id)
            var lang = radio.text
            var date = date.text
            val checked: Boolean = notSuit.isChecked
            val checkedV: Boolean = viol.isChecked
            val checkedL: Boolean = langc.isChecked
            var newChecked = checked.toString()
            var reason: String = ""
            if (checked) {
                if (checkedV && checkedL) {
                    reason = "\nReasons:\nLanguage\nViolence"
                } else if (checkedV) {
                    reason = "\nReasons:\nViolence"
                } else if (checkedL) {
                    reason = "\nReasons:\nLanguage"
                }

            }
            var theText =
                "Title = " + movTitle + "\nOverview = " + movDesc + "\nReleased date = " + date + "\nLanguage = " + lang + "\nNot Suitable for all ages = " + newChecked + reason

            val duration = Toast.LENGTH_LONG
            val toast = Toast.makeText(applicationContext, theText, duration)
            toast.show()
        }
    }


}


