$(document).on('ready', getData);

// Sends a GET request to the web server and populates the table
function getData() {
	$.ajax({
		url: "http://localhost:8080/rest/api/laptops",
		type: "GET",
		dataType: "json",
		success: function(data) {
			console.log(data);
			
			$.each(data, function(index){
				appendTable(data, index);
			});
		}
	});
}

$('#add').on('click', function () {
	var data = $('#form').serializeArray().reduce(function (data, prop) {
		data[prop.name] = prop.value;
		return data;
	}, {});

	$.post({
		contentType: 'application/json',
		url: 'http://localhost:8080/rest/api/laptops',
		dataType: "json",
		data: JSON.stringify(data),
		success: function(response) {	
			var l = response.length - 1;	
			appendTable(response, l);
		}
	})
});

function appendTable(items, l) {
	var tr = $('<tr>');
	tr.append('<td>' + items[l].name + '</td>');
	tr.append('<td>' + items[l].cpuModel + '</td>');
	tr.append('<td>' + items[l].cpuFrequency + '</td>');
	tr.append('<td>' + items[l].display + '</td>');
	tr.append('<td>' + items[l].res + '</td>');
	tr.append('<td>' + items[l].ram + '</td>');
	tr.append('<td>' + items[l].gpuModel + '</td>');
	tr.append('<td>' + items[l].gpuMemory + '</td>');
	tr.append('</tr>');
	$('#Laptops').append(tr);
}
