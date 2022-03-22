package com.example.home35test.ui

import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.home35test.R
import com.example.home35test.model.Property
import androidx.appcompat.app.AppCompatActivity



interface OnShowDialog{
    fun showDialog(propertyName:String,status:String)
}
class PropertyAdapter( private val propertyList: List<Property>?,val onShowDialog: OnShowDialog) : RecyclerView.Adapter<PropertyAdapter.ViewHolder>() {

    var propertyListAdapter= propertyList
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val createDate: TextView = itemView.findViewById(R.id.createDate)
        val property: TextView = itemView.findViewById(R.id.property)
        val propertyStatus: TextView = itemView.findViewById(R.id.propertyStatus)
        val plan: TextView = itemView.findViewById(R.id.plan)
        val owner: TextView = itemView.findViewById(R.id.owner)
        val ownerStatus: TextView = itemView.findViewById(R.id.ownerStatus)
        val tenant: TextView = itemView.findViewById(R.id.tenant)
        val tenantStatus: TextView = itemView.findViewById(R.id.tenantStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val property = propertyListAdapter!![position]

        //set properties
        holder.createDate.text=property.created
        holder.property.text=property.propertyAddress
        holder.propertyStatus.text= property.propertyStatus.name
        holder.plan.text=property.plan
        holder.owner.text=property.owner
        holder.ownerStatus.text= property.ownerStatus.name
        holder.tenant.text=property.tenant
        holder.tenantStatus.text=property.tenantStatus.name

        //change colors
        holder.propertyStatus.setTextColor(ContextCompat.getColor(holder.itemView.context,property.returnPropertyStatusColor(property.propertyStatus)))
        holder.ownerStatus.setTextColor(ContextCompat.getColor(holder.itemView.context,property.returnStatusColor(property.tenantStatus)))
        holder.tenantStatus.setTextColor(ContextCompat.getColor(holder.itemView.context,property.returnStatusColor(property.tenantStatus)))

        //underline
        holder.property.paintFlags = holder.property.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        holder.owner.paintFlags = holder.property.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        holder.tenant.paintFlags = holder.property.paintFlags or Paint.UNDERLINE_TEXT_FLAG


        holder.property.setOnClickListener {
            onShowDialog.showDialog(property.propertyAddress,property.propertyStatus.name)
        }
        holder.owner.setOnClickListener {
            onShowDialog.showDialog(property.owner,property.ownerStatus.name)
        }
        holder.tenant.setOnClickListener {
            onShowDialog.showDialog(property.tenant,property.tenantStatus.name)
        }
    }

    override fun getItemCount(): Int {
        if(propertyListAdapter == null){
            return 0
        }
        return propertyListAdapter!!.size
    }
}