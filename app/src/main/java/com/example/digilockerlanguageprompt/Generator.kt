package com.example.digilockerlanguageprompt

class Generator {
    companion object{
        fun get(): List<Item>{
            return mutableListOf(
                Item(R.drawable.gujrati),
                Item(R.drawable.kannada),
                Item(R.drawable.marathi),
                Item(R.drawable.punjabi),
                Item(R.drawable.tamil),
                Item(R.drawable.telgu),
                Item(R.drawable.urdu),
                Item(R.drawable.eeenglish)
            )
        }
    }
}