$(document).ready(function () {
	$("#s_button").click(function () {
	
	//Get page contents and create an empty array
	var page_contents=$("#myForm").serializeArray(),
		page_contents_data={};
	
	//Store the page_contents inside our page_contents_data 
	//Array, where the index(position) of the array is the actual JSP field name
	$(page_contents).each(function (position,field){
		page_contents_data[field.name]=field.value;
		
		});
	//alert(page_contents_data['day'] + page_contents_data['month']+page_contents_data['year']+page_contents_data['current_year']+page_contents_data['current_month']+page_contents_data['current_day'])
	
	
	$("#myForm").on('submit',function(e){
		$.post('http://localhost:8080/Assignment1/Servlet',
				//Sending function/Data package
				{
					//variable for the server:variable from the JS/JSP
					server_variable_day:page_contents_data['day'],
					server_variable_month:page_contents_data['month'],
					server_variable_year:page_contents_data['year'],
		
					server_variable_c_year: page_contents_data['current_year'],
					server_variable_c_month: page_contents_data['current_month'],
					server_variable_c_day: page_contents_data['current_day'],

				},
				//Return function
		function (data,status){	
			//alert('Server data: '+return_data);
			var responses=data.split("/");
			$('#response').text(responses[0]);
			$('#response2').text(responses[1]);
			
		}).error(function(){
				
			});
			e.preventDefault();
		});
	});
});
