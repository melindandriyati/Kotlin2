package com.example.asus.hellokotlin

import android.content.Intent
import android.graphics.ColorSpace
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

    var title = arrayOf("Nasi Goreng", "Mie ayam", "Bakso", "Rendang")
    var content = arrayOf("Nasi goreng adalah sebuah hidangan nasi yang telah digoreng dalam sebuah wajan atau penggorengan dan biasanya dicampur dengan bahan-bahan lainnya seperti telur, sayur-sayuran, makanan laut, atau daging. Makanan tersebut seringkali disantap sendiri atau disertai dengan hidangan lainnya. Nasi goreng adalah komponen populer dari masakan Asia Timur, Tenggara dan Selatan pada wilayah tertentu. Sebagai hidangan buatan rumah, nasi goreng biasanya dibuat dengan bahan-bahan yang tersisa dari hidangan lainnya, yang berujung pada ragam yang tak terbatas.",
            "Mi ayam atau bakmi ayam adalah masakan Indonesia yang terbuat dari mi kuning direbus mendidih kemudian ditaburi saos kecap khusus beserta daging ayam dan sayuran. Mi Ayam terkadang ditambahi dengan bakso, pangsit dan jamur. Mi berasal dari Tiongkok tetapi mi ayam yang serupa di Indonesia tidak ditemukan di Tiongkok.",
            "Bakso atau baso adalah jenis bola daging yang lazim ditemukan pada masakan Indonesia.[2] Bakso umumnya dibuat dari campuran daging sapi giling dan tepung tapioka, akan tetapi ada juga bakso yang terbuat dari daging ayam, ikan, atau udang bahkan daging kerbau. Dalam penyajiannya, bakso umumnya disajikan panas-panas dengan kuah kaldu sapi bening, dicampur mi, bihun, taoge, tahu, terkadang telur dan ditaburi bawang goreng dan seledri. Bakso sangat populer dan dapat ditemukan di seluruh Indonesia; dari gerobak pedagang kaki lima hingga restoran besar.",
            "Rendang atau randang adalah masakan daging bercita rasa pedas yang menggunakan campuran dari berbagai bumbu dan rempah-rempah. Masakan ini dihasilkan dari proses memasak yang dipanaskan berulang-ulang dengan santan kelapa. Proses memasaknya memakan waktu berjam-jam (biasanya sekitar empat jam) hingga kering dan berwarna hitam pekat. Dalam suhu ruangan, rendang dapat bertahan hingga berminggu-minggu. Rendang yang dimasak dalam waktu yang lebih singkat dan santannya belum mengering disebut kalio, berwarna coklat terang keemasan.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content)

        fun launchSecondActivity(view: View) {
            Log.d(LOG_TAG, "Button clicked!")

            val intent = Intent(this, activity_main::class.java)
            val message = editText_main!!.text.toString()

            intent.putExtra(EXTRA_MESSAGE, message)
            startActivityForResult(intent, TEXT_REQUEST)
        }

        recyclerView_main?.setHasFixedSize(true)
        recyclerView_main?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val listData = ArrayList<Model>()

        for (i in 0 until title.size) {
            listData.add(Model(title[i]))
        }

        var adapter = Adapter(this, listData)
        recyclerView_main?.adapter = adapter

        val text = "Selamat Datang!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()

    }
}