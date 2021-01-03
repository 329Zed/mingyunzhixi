package com.example.mingyunzhixi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment3.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment3 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank3, container, false)





    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment3.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                BlankFragment3().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val jixu = view.findViewById<ImageButton>(R.id.imageButton_jixu)
        val tuichu = view.findViewById<ImageButton>(R.id.imageButton_tuichu)
        val xinyouxi = view.findViewById<ImageButton>(R.id.imageButton_xinyouxi)
        val zhizuorenyuan = view.findViewById<ImageButton>(R.id.imageButton_zhizuorenyuan)

        jixu.setOnClickListener{
            val intent = Intent(activity,MainActivity2::class.java)
            startActivity(intent)
        }

        tuichu.setOnClickListener{
            System.exit(0)
        }
        xinyouxi.setOnClickListener{
            val intent2 = Intent(activity,MainActivity2::class.java)
            startActivity(intent2)
        }


        zhizuorenyuan.setOnClickListener {
            val intent3 = Intent(activity,ZhizuoActivity::class.java)
            startActivity(intent3)
        }





    }


}