package com.example.recyclerviewwithmultipleviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewwithmultipleviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var dataAdapter: DataAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dataAdapter = DataAdapter()
        binding.recycl.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = dataAdapter
        }
        dataAdapter?.setItems(mockData())
    }
    private fun mockData(): List<DataModel> = listOf(
        DataModel.Header(title = "Header1"),
        DataModel.Items(title = "Title1", description = "Description1"),
        DataModel.Items(title = "Title2", description = "Description2"),
        DataModel.Items(title = "Title3", description = "Description3"),
        DataModel.Items(title = "Title4", description = "Description4"),
        DataModel.Items(title = "Title5", description = "Description5"),
        DataModel.Items(title = "Title6", description = "Description6"),
        DataModel.Items(title = "Title7", description = "Description7"),
        DataModel.Items(title = "Title8", description = "Description8"),
        DataModel.Items(title = "Title9", description = "Description9"),
        DataModel.Header(title = "Header2"),
        DataModel.Items(title = "Title10", description = "Description10"),
        DataModel.Items(title = "Title11", description = "Description11"),
        DataModel.Header(title = "Header3"),
        DataModel.Items(title = "Title12", description = "Description12"),
        DataModel.Items(title = "Title13", description = "Description13"),
    )
}