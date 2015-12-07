$(document).ready(function() {
	"use strict"
	
	// Define
	function removeByClassName() {
		$(".name-column").remove();
	}
	function removeById() {
		$("#studentsTable").remove();
	}
	function removeByType() {
		$("ol").remove();
	}
	function removeByDescendant() {
		// Remove list items children of ul
		$("ul li").remove();
	}
	function removeByFind(parent) {
		// Remove list items children of the parameter
		parent.find("li").remove();
	}

	// Call
	// removeByClassName();
	// removeById();
	// removeByType();
	// removeByDescendant();
	removeByFind($("ol"));
	// selectors - https://api.jquery.com/category/selectors/
	
	// New row
	$("table").append("<tr><td>3</td><td>Georgi</td></tr>");
	
	// Hover
	$("#removeMountain").on("mousemove", function() {
		console.log("mouse moved", arguments);
	});
	
	// Click
	$("#removeMountain").click(function() {
		$("ul li:first-child").remove();
	});
	
	var nextFreeMountainId = 1;
	$("#addMountain").click(function() {
		var newMountainElement = $("<li />");
		var newMountainName = $("#mountainNameInput").val();
		// func() - getter, func(val) - setter
		$("#mountainNameInput").val("");
		newMountainElement.text(newMountainName);
		newMountainElement.attr("id",
			"mountain"+(nextFreeMountainId++));
		$("ul").append(newMountainElement);
	});
	
	// Works for already created elements only
	$("ul li").click(function() {
		alert("clicked");
	});
	
	// Works for all elements
	$(document).on("click", "ul li", function() {
		alert($(this).attr("id"));
	});

	$("#hiking").click(function() {
		var allMountains = $("ul li");
		_.forEach(allMountains, function(value) {
			var next = $(value);
			alert(next.text());
		});
	});

});