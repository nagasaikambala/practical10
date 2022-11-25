package com.example.practical10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

             override fun onCreate(savedInstanceState: Bundle?) {
                WindowCompat.setDecorFitsSystemWindows(window, false)
                super.onCreate(savedInstanceState) binding =
                 setContentView(R.layout.activity_main)
                ActivityMainBinding.inflate(layoutInflater) setContentView(binding.root)
                binding.fab.setOnClickListener
                 {
                     CoroutineScope(Dispatchers.IO).launch { try
                     { val data =
                         HttpRequest().makeServiceCall(
                             "https://api.json-generator.com/templates/qjeKFdjkXCdK/data",
                             "dchj8v1b6qqdjzbqood1jgpachyfzlw58r540gru")
                         withContext(Dispatchers.Main) { try { if(data
                             != null) runOnUiThread{getPersonDetailsFromJson(data)}
                         } catch (e: Exception) { e.printStackTrace()
                         }
                         }
                     } catch (e: Exception) { e.printStackTrace()
                     }
                     }
                 }
             }
    private fun getPersonDetailsFromJson(sJson: String?) { val
            personList = ArrayList<Person>() try {
        val jsonArray = JSONArray(sJson) for (i in 0
                until jsonArray.length()) { val jsonObject =
            jsonArray[i] as JSONObject val person =
            Person(jsonObject) personList.add(person)
        }
        binding.listView1.adapter = PersonAdapter(this, personList)
    } catch (ee: JSONException) {
        ee.printStackTrace()
    }
    }
}
   {
      {
        CoroutineScope(Dispatchers.IO).launch { try
        { val data =
            HttpRequest().makeServiceCall(
                "https://api.json-generator.com/templates/qjeKFdjkXCdK/data",
                "dchj8v1b6qqdjzbqood1jgpachyfzlw58r540gru")
            withContext(Dispatchers.Main) { try { if(data
                != null) runOnUiThread{getPersonDetailsFromJson(data)}
            } catch (e: Exception) { e.printStackTrace()
            }
            }
        } catch (e: Exception) { e.printStackTrace()
        }
        }
    }

    private fun getPersonDetailsFromJson(sJson: String?) { val
        personList = ArrayList<Person>() try {
    val jsonArray = JSONArray(sJson) for (i in 0
            until jsonArray.length()) { val jsonObject =
        jsonArray[i] as JSONObject val person =
        Person(jsonObject) personList.add(person)
    }
    binding.listView1.adapter = PersonAdapter(this, personList)
} catch (ee: JSONException) {
    ee.printStackTrace()
}
}






