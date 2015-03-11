var express= require('express');
var request =require('request');


var app = express();




app.get("/",function(req,res){
	request("http://localhost:8080/MonApp/studentlist.json", function(error, response, body) {
		  console.log(body)
		});
	res.end();
})


app.listen(3000,function(){
	console.log("serveur ecoute");
});



