function load_login_page() {
  window.open("../MyWeb/login.html" , "_self");
}


function load_signup_page() {
  window.open("../MyWeb/signup.html" , "_self");
}

function load_c_page() {
  document.getElementById("courses").style.visibility = "hidden";
  load_course("C");

}

function load_courses() {
  document.getElementById("courses").style.visibility = "visible";
  document.getElementById("courses").style.display = "flex";
  document.getElementById("course-panel").style.display = "none";

}

function load_course(course) {

  document.getElementById("courses").style.display = "none";
  document.getElementById("course-panel").style.display = "flex";

  if(course = "C"){

  topics = ["C Language Overview","C Environment Setup","C Program Structure","C Basic Syntax","C Data Types","C Variables","C Constants and Literals",
                "C Storage Classes","C Operators","Decision Making in C","C Loops","C Functions","C Scope Rules","C Arrays","C Pointers","C Strings",
                "C Structures","C Unions","Bit Fields","Typedef","Input & Output","File I/O","Preprocessors","Header Files","Type Casting",
                "Error Handling","Recursion","Variable Arguments","Memory Management","Command Line Arguments"];
  renderHTML(topics);

/*  var ourRequest = new XMLHttpRequest();
  ourRequest.open('GET', 'https://learnwebcode.github.io/json-example/animals-1.json');
  ourRequest.onload = function() {
    if (ourRequest.status >= 200 && ourRequest.status < 400) {
      var ourData = JSON.parse(ourRequest.responseText);
      console.log(ourData);
      //document.getElementById("course-panel").style.display = "block";
      renderHTML(ourData);
    } else {
      console.log("We connected to the server, but it returned an error.");
    }
    
  };*/
}
  //ourRequest.send();
	// body...
}


function renderHTML(data) {
  var htmlString = "";
  var courseContainer = document.getElementById("course-content");

  load_topics(data);
}

function load_topics(data){

	var topicContainer = document.getElementById("topics");
	var topicHtmlString = "";
	var topicHtmltemplate = "";

	topicHtmltemplate  += '<div class="flex relative pb-12">' +
					   '<div class="h-full w-10 absolute inset-0 flex items-center justify-center">'+
					   '<div class="h-full w-1 bg-gray-200 pointer-events-none">' + '</div>' + '</div>' +
           			   '<div class="flex-shrink-0 w-10 h-10 rounded-full bg-indigo-500 inline-flex items-center justify-center text-white relative z-10">'+
           			   '<svg fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="w-5 h-5" viewBox="0 0 24 24">'+
              		   '<path d="M12 22s8-4 8-10V5l-8-3-8 3v7c0 6 8 10 8 10z">' + '</path>'+ '</svg>' + '</div>' +
          			   '<div class="flex-grow pl-4">' + 
            		   '<h2 class="font-medium title-font text-sm text-gray-900 mb-1 tracking-wider">' ;

    for (i = 0; i < data.length; i++) {
    	topicHtmlString = topicHtmltemplate + data[data.length-i-1];
    	topicHtmlString += '</h2>' + '</div>' + '</div>';
    	topicContainer.insertAdjacentHTML('afterbegin', topicHtmlString); 
    }

    

}