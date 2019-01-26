$.GET = function(name){
	var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
	if(results == null)
		return null;
	return results[1] || 0;
}


$(document).ready(function(){

	if($.GET("success") == "true") {
		var element = $("<div></div>");
		element.attr("id", "alert");
		element.attr("class", "success");
		element.text("Success!");
		$("#alert-container").append(element);

	} else if ($.GET("success") == "false") {
		element = $("<div></div>");
		element.attr("class", "error");
		element.attr("id", "alert");
		var error = $.GET("message");
		for(var i = 0; i < 15; i++){
			error = error.replace("%20", " ");
		}

		element.text("Failure!\n" + error);
		$("#alert-container").append(element);
		$("#alert").css("animation-duration", "10s");
	}


	$(".nav-item").click(function(){
		if(this.id != "users" &&  this.id != "projects")
			$("#main-container").load("/main/" + this.id + ".html");
		else {
			$(location).attr("href", "http://localhost:8080/" + this.id);
			
		}
			

	});

});
