package com.example.androidcalculator.calculator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.androidcalculator.R
import com.example.androidcalculator.databinding.CalculatorFragmentBinding
class CalculatorFragment : Fragment() {
    private lateinit var viewModel: CalculatorViewModel
    private lateinit var binding: CalculatorFragmentBinding
    var string:String=""
    var print = StringBuilder()
    var historyValues = mutableListOf<String>()
companion object {
    var symbols: String = " "
    var left = ""
    var right = ""
    var result = " "

}

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<CalculatorFragmentBinding>(
            inflater, R.layout.calculator_fragment, container, false)
        binding.calculatorFragment=this


        binding.btn20.setOnClickListener {
            viewModel.gotoKeypad()
        }
        binding.btn1.setOnClickListener {

            appendingVal1()
        }
        binding.btn2.setOnClickListener {
            appendingVal2()
        }
        binding.btn21.setOnClickListener {
            clearHistory()
        }
        binding.btn3.setOnClickListener {
            appendingVal3()
        }
        binding.btn4.setOnClickListener {
            appendingVal4()
        }
        binding.btn5.setOnClickListener {
            appendingVal5()
        }
        binding.btn6.setOnClickListener {
            appendingVal6()
        }
        binding.btn7.setOnClickListener {
            appendingVal7()
        }
        binding.btn8.setOnClickListener {
            appendingVal8()
        }
        binding.btn9.setOnClickListener {
            appendingVal9()
        }
        binding.btn10.setOnClickListener {
            appendingVal10()
        }
        binding.btn11.setOnClickListener {
            appendingVal11()
        }
        binding.btn12.setOnClickListener {
            appendingVal12()
        }
        binding.btn13.setOnClickListener {
            appendingVal13()
        }
        binding.btn14.setOnClickListener {
            appendingVal14()
        }
        binding.btn15.setOnClickListener {
            appendingVal15()
        }
        binding.btn16.setOnClickListener {
            appendingVal16()
        }
        binding.btn17.setOnClickListener {
            appendingVal17()
        }
        binding.btn18.setOnClickListener {
            appendingVal18()
        }
        binding.btn19.setOnClickListener {
            appendingVal19()
        }
        viewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)
        viewModel.navigate.observe(viewLifecycleOwner, Observer<Boolean> { hasFinished ->
            if (hasFinished) {
                clearHistory()
                string=""
                    for(i in 0 until historyValues.size )
                    {
                        string=historyValues[i]+"\n\n"+string
                    }

                binding.hisTory.text=string
                binding.hisTory.visibility = View.VISIBLE
                binding.btn20.visibility = View.VISIBLE
                binding.btn21.visibility = View.VISIBLE
                binding.margin1.visibility=View.GONE
                binding.margin2.visibility=View.GONE
                binding.margin3.visibility=View.GONE
                binding.margin4.visibility=View.GONE
                binding.margin5.visibility=View.GONE
            }
        })
        viewModel.navigate1.observe(viewLifecycleOwner, Observer<Boolean> { hasFinished ->
            if (hasFinished) {
                binding.hisTory.visibility = View.GONE
                binding.btn20.visibility = View.GONE
                binding.btn21.visibility = View.GONE
                binding.margin1.visibility=View.VISIBLE
                binding.margin2.visibility=View.VISIBLE
                binding.margin3.visibility=View.VISIBLE
                binding.margin4.visibility=View.VISIBLE
                binding.margin5.visibility=View.VISIBLE
            }
        })
        return binding.root
    }
     fun appendingVal1(){
        print.append(binding.btn1.text)
        binding.textView.text=print.toString()
        if(symbols==" "){
            left=left+binding.btn1.text
        }
        else{
            right=right+binding.btn1.text
        }
    }
    private fun appendingVal2(){
        print.append(binding.btn2.text)
        binding.textView.text=print.toString()
        if(symbols==" "){
            left=left+binding.btn2.text
        }
        else{
            right=right+binding.btn2.text
        }
    }

    private fun appendingVal3(){
        print.append(binding.btn3.text)
        binding.textView.text=print.toString()
        if(symbols ==" "){
           left = left +binding.btn3.text
        }
        else{
            right = right +binding.btn3.text
        }
    }

    private fun appendingVal4(){

            print.append(binding.btn4.text)
            binding.textView.text = print.toString()

            if (symbols != " ") {
                left = when (symbols) {
                    "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                    "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                    "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                    "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                    else -> " "
                }
                right = ""
                print.clear()
                print.append(left)
                print.append(binding.btn4.text.toString())
                binding.textView.text = print.toString()
                symbols = binding.btn4.text.toString()
            }


            symbols = binding.btn4.text.toString()
        }


    private fun appendingVal5(){
        print.append(binding.btn5.text)
        binding.textView.text=print.toString()
        if(symbols ==" "){
           left =left +binding.btn5.text
        }
        else{
            right = right +binding.btn5.text
        }
    }

    private fun appendingVal6(){
        print.append(binding.btn6.text)
        binding.textView.text=print.toString()
        if(symbols ==" "){
            left = left +binding.btn6.text
        }
        else{
            right = right +binding.btn6.text
        }
    }

    private fun appendingVal7(){
        print.append(binding.btn7.text)
        binding.textView.text=print.toString()
        if(symbols ==" "){
            left = left +binding.btn7.text
        }
        else{
           right = right +binding.btn7.text
        }
    }
    private fun appendingVal8(){

            print.append(binding.btn8.text)
            binding.textView.text = print.toString()
            if (symbols != " ") {
                left = when (symbols) {
                    "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                    "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                    "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                    "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                    else -> " "
                }
                right = ""
                print.clear()
                print.append(left)
                print.append(binding.btn8.text.toString())
                binding.textView.text = print.toString()
                symbols = binding.btn8.text.toString()
            }

            symbols = binding.btn8.text.toString()
        }


    private fun appendingVal9(){
        print.append(binding.btn9.text)
        binding.textView.text=print.toString()
        if(symbols ==" "){
            left = left +binding.btn9.text
        }
        else{
            right = right +binding.btn9.text
        }
    }
    private fun appendingVal10(){
        print.append(binding.btn10.text)
        binding.textView.text=print.toString()
        if(symbols ==" "){
            left = left +binding.btn10.text
        }
        else{
            right = right +binding.btn10.text
        }
    }
    private fun appendingVal11(){
        print.append(binding.btn11.text)
        binding.textView.text=print.toString()
        if(symbols ==" "){
            left = left +binding.btn11.text
        }
        else{
            right = right +binding.btn11.text
        }
    }
    private fun appendingVal12(){

            print.append(binding.btn12.text)
            binding.textView.text = print.toString()
            if (symbols != " ") {
                left = when (symbols) {
                    "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                    "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                    "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                    "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                    else -> " "
                }
                right = ""
                print.clear()
                print.append(left)
                print.append(binding.btn12.text.toString())
                binding.textView.text = print.toString()
                symbols = binding.btn12.text.toString()
            }

            symbols = binding.btn12.text.toString()
        }

    private fun appendingVal17(){
        binding.textView.text=binding.textView.text.dropLast(1)
        print.clear()
        print.append(binding.textView.text)
        if(print.contains("+")||print.contains("-")||print.contains("*")||print.contains("/")){
            right=right.dropLast(1)
        }
        else{
            right=""
            left=left.dropLast(1)
        }
    }
    private fun appendingVal14(){
        print.append(binding.btn14.text)
        binding.textView.text=print.toString()
        if(symbols ==" "){
            left = left +binding.btn14.text
        }
        else{
            right =right +binding.btn14.text
        }
    }
    private fun appendingVal15(){
        if(left=="" && symbols!=" ") {
            binding.textView.text = "0"
            print.clear()
            left = ""
            right = ""
            symbols = " "
        }else {
            historyValues.add(left + symbols + right)
            if(historyValues.size>10){
                historyValues.removeAt(0)
            }
            if (right == "" && left != "") {
                binding.textView.text = left
            } else {
                binding.textView.text = ""
                binding.textView.text = when (symbols) {
                    "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                    "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                    "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                    "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                    else -> " "

                }
                left = (binding.textView.text).toString()
            }
            print.clear()
            print.append(binding.textView.text)

            symbols = " "

            right = ""
        }
    }
    private fun appendingVal16(){

            print.append(binding.btn16.text)
            binding.textView.text = print.toString()
            if (symbols != " ") {
                left = when (symbols) {
                    "+" -> ((left.toFloat()) + (right.toFloat())).toString()
                    "-" -> ((left.toFloat()) - (right.toFloat())).toString()
                    "*" -> ((left.toFloat()) * (right.toFloat())).toString()
                    "/" -> ((left.toFloat()) / (right.toFloat())).toString()
                    else -> " "
                }
                right = ""
                print.clear()
                print.append(left)
                print.append(binding.btn16.text.toString())
                binding.textView.text = print.toString()

            }

            symbols = binding.btn16.text.toString()
        }

    private fun appendingVal18() {
        binding.textView.text = ""
        print.clear()
        left=""
        right=""
        symbols=" "
    }

    private fun appendingVal13() {

        print.append(binding.btn13.text)
        binding.textView.text = print.toString()
        if (symbols == " ") {
            left = left + binding.btn13.text
        } else {
           right = right + binding.btn13.text
        }
    }
    private fun appendingVal19(){
        viewModel.gotoHistory()
    }
private fun clearHistory()
{
    binding.hisTory.setText("")
}

}



