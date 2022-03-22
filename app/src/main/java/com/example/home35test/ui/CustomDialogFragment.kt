package com.example.home35test.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.DialogFragment
import com.example.home35test.R
import com.example.home35test.model.Property
import kotlinx.android.synthetic.main.custom_dialog_fragment.view.*
import com.example.home35test.returnColorForStatus


class CustomDialogFragment:DialogFragment(){

    lateinit var propertyTextView:TextView
    lateinit var statusTextView:TextView
    var propertyText:String =""
    var statusText:String=""
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView:View = inflater.inflate(R.layout.custom_dialog_fragment,container,false)
        propertyTextView=rootView.findViewById(R.id.propertyTV)
        statusTextView= rootView.findViewById(R.id.statusTV)
        propertyTextView.text=propertyText
        statusTextView.text = statusText
        //change colors
        statusTextView.setTextColor(ContextCompat.getColor(requireContext(), returnColorForStatus(statusText)))

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        propertyTextView=view.findViewById(R.id.propertyTV)
        statusTextView= view.findViewById(R.id.statusTV)
    }
    fun changeValues(property:String,status:String){
        propertyText=property
        statusText = status
    }
}