$(document).ready(function() {

	$('.modal').on('hidden.bs.modal', function() {
		var index = $("#cultivatorIndex").val();
		var indexOE = $("#cultivatorIndexOE").val();

		$("#searchParam" + index).val('0');
		$("#aadharNo").val('');
		$("#ocName").val('');
		$("#fatherName").val('');
		$("#occupantExtent").val('');

		$("#searchParam" + indexOE).val('0');
		$("#occupantExtentOE").val('');
	})
	alertify.set('notifier', 'position', 'top-right');

	Number.prototype.round = function(p) {
		p = p || 10;
		return parseFloat(this.toFixed(p));
	};

	// Change the selector if needed
	var $table = $('table.scroll'),
		$bodyCells = $table.find('tbody tr:first').children(),
		colWidth;

	// Adjust the width of thead cells when window resizes
	$(window).resize(function() {
		// Get the tbody columns width array
		colWidth = $bodyCells.map(function() {
			return $(this).width();
		}).get();

		// Set the width of thead columns
		$table.find('thead tr').children().each(function(i, v) {
			$(v).width(colWidth[i]);
		});
	}).resize(); // Trigger resize handler

});




var sel = document.getElementById("searchParam"), text = document.getElementById("text");

function onUserTypeChange(index, selectedValue) {
	var cr_vcode = $("#cr_vcode0").val();
	var cultivatorType = $("#cultivatorType" + index).val();
	var type = $('#type').val();
	var cultivatorTypeCcrc = $("#cultivatorType_Ccrc" + index).val();
	var data_src = $("#data_src" + index).val();

	if (selectedValue === '1') {
		document.getElementById("ccrcbtnId").style.display = "none";
		document.getElementById("ownerbtnId").style.display = "";
		if (cultivatorType == 'L') {
			$("#searchParam" + index).val('0');
			swal.fire("Already Registered as Enjoyer!", "", "warning");
			return false;
		} else if (cultivatorType == 'O') {
			$("#searchParam" + index).val('0');
			swal.fire("Already Registered as Owner!", "", "warning");
			return false;
		}
		else {


			var availableExtent = parseFloat($("#availableExtent" + index).val()).round(3);
			if (availableExtent > 0) {
				var originalExt = document.getElementById("anubhavadarExtent" + index).value;
				setModalValues(index, "O", "Owner", originalExt);
				$('#ownerOrEnjoyerModal').modal('show');
				var adn = $("#aadharNo" + index).val();
				if (adn.length == 12)
					fetchFarmerMobilenoOwner(adn, cr_vcode);
			} else {
				$("#searchParam" + index).val('0');
				swal.fire("No Available Extent", "", "warning");
			}
		}


	} else if (selectedValue === '2') {
		var availableExtent = parseFloat($("#availableExtent" + index).val()).round(3);
		if (availableExtent > 0) {
			setModalValues(index, "K", "Cultivator", availableExtent);
			$('#cultivatorModal').modal('show');
			$("#searchParam" + index).val('0');
		} else {
			$("#searchParam" + index).val('0');
			swal.fire("No Available Extent", "", "warning");
		}
	} else if (selectedValue === '3') {
		document.getElementById("ccrcbtnId").style.display = "none";
		document.getElementById("ownerbtnId").style.display = "";
		if (cultivatorType == 'L') {
			$("#searchParam" + index).val('0');
			swal.fire("Already Registered as Enjoyer!", "", "warning");
			return false;
		} else if (cultivatorType == 'O') {
			$("#searchParam" + index).val('0');
			swal.fire("Already Registered as Owner!", "", "warning");
			return false;
		}

		else {


			var availableExtent = parseFloat($("#availableExtent" + index).val()).round(3);
			if (availableExtent > 0) {
				var originalExt = document.getElementById("anubhavadarExtent" + index).value;
				setModalValues(index, "L", 'Enjoyer', originalExt);
				$('#ownerOrEnjoyerModal').modal('show');
				//	var adn = $("#aadharNo" + index).val();
				//	if( adn.length == 12)
				//	fetchFarmerMobilenoEn( adn) ;
			} else {
				$("#searchParam" + index).val('0');
				swal.fire("No Available Extent", "", "warning");
			}
		}
	}
	else if (selectedValue === '4') {


		document.getElementById("ccrcbtnId").style.display = "block";
		document.getElementById("ownerbtnId").style.display = "none";

		if (cultivatorTypeCcrc == 'C') {
			$("#searchId" + index).val('0');
			swal.fire("Already CCRC added!", "", "warning");
			return false;
		}
		var kh_no = document.getElementById("khNo_Ccrc" + index).value;
		var survey_no = document.getElementById("crSno_Ccrc" + index).value;
		var inputs = document.querySelectorAll('input[name="cr_vcode_owner"]');
		count = inputs.length;
		var abcd = 0;
		var originalExt = 0;
		var avail = 0;
		for (var i = 0; i < count; i++) {
			if (kh_no == document.getElementById("khNo" + i).value && survey_no == document.getElementById("crSno" + i).value) {

				var availableExtent = $("#anubhavadarExtent" + i).val();
				abcd = 1;
				var extent = document.getElementById("anubhavadarExtent_Ccrc" + index).value;

				originalExt = extent;

				if (eval(availableExtent) < eval(extent)) {
					originalExt = availableExtent;
				}
				//				//				avail= (document.getElementById("availableCcrc" + i).value);
				//				avail = document.getElementById("availableExtent" + i).value;
			}
		}

		//		alert(avail+'---'+originalExt)
		if (abcd == 0) {
			$("#searchId" + index).val('0');
			swal.fire("Please Select Owner record Also", "", "warning");
			return false;
		}
		//		else if (avail <= 0) {
		//			$("#searchId" + index).val('0');
		//			swal.fire("No Available Extent for CCRC", "", "warning");
		//		}
		//		else if (avail > 0) {
		//			alert('else')
		else {
			$("#searchId" + index).val('0');
			setModal(index, "C", "CCRC", originalExt, avail);
			$('#ownerOrEnjoyerModal').modal('show');

			var adn1 = $("#aadharNoCcrc" + index).val();
			fetchFarmerMobilenoCcrc(adn1, cr_vcode);

		}
	}

	else {
		var msg = 'Already Booked for ';
		var Type = data_src;
		var drop = '';
		if (selectedValue == '5') {
			drop = 'ROFR;'
		}
		if (selectedValue == '6') {
			drop = 'Non WebLand;'
		}
		if (selectedValue == '7') {
			drop = 'USUS;'
		}
		msg += drop;
		var availableExtent = parseFloat($("#availableExtent" + index).val()).round(4);
		if (availableExtent > 0) {
			var originalExt = document.getElementById("anubhavadarExtent" + index).value;
			setModalValues(index, Type, drop, originalExt);

			$('#cultivatorROFRModal').modal('show');
			$("#searchParam" + index).val('0');
			var adn1 = $("#aadharNo" + index).val();
			fetchFarmerMobilenoRofr(adn1, cr_vcode);
		} else {
			$("#searchParam" + index).val('0');
			swal.fire(msg, "", "warning");
			$('#cultivatorROFRModal').modal('hide');


		}
	}

}

function setModal(index, cultivatorType, roleType, originalExt, avail) {
	$("#typeeOfC").val($('#type').val());
	$("#typeeOfC").text($('#type').val());
	if (cultivatorType == 'C') {
		suffix = 'OE'
		var inputValue = $("#aadharNoCcrc" + index).val();
		var aadharDisplay = document.querySelector(".aadharDisplay");
		var aadharInput = document.querySelector(".aadharInput");
		aadharDisplay.style.display = "inline";
		aadharDisplay.textContent = inputValue;
		aadharInput.style.display = "none";
		$("#owner_tenant").val(cultivatorType);
		document.getElementById("aadharNo" + suffix).disabled = false;
		document.getElementById("occupantExtent" + suffix).disabled = true;
		$("#refBookingId").val($("#bookingId" + index).val());
	}
	$("#crSnoLabel" + suffix).text($("#crSno_Ccrc" + index).val());
	$("#khNoLabel" + suffix).text($("#khNo_Ccrc" + index).val());
	$("#ocNameLabel" + suffix).text($("#ocName_Ccrc" + index).val());
	$("#fatherNameLabel" + suffix).text($("#fatherName_Ccrc" + index).val());
	$("#aadharNoLabel" + suffix).text($("#aadharNo_Ccrc" + index).val());
	$("#cultivatorType" + suffix).val(cultivatorType);
	$("#orgextentLabelOE").val(originalExt);
	$("#orgextentLabelC").val(originalExt);
	$("#MobileOE").val('');
	$("#typee").val($('#type').val());
	$("#typee").text($('#type').val());
	$("#MobileOE").text('');
	$("#orgextentLabelC").val(originalExt);
	// if (cultivatorType == 'O') {
	// $("#aadharNo" + suffix).text($("#aadharNo" + index).val());
	// }
	$("#cultivatorModalHeaderId" + suffix).text(roleType);
	$("#cultivatorModalFieldId1" + suffix).text(roleType);

	$("#ccrcModalHeaderId" + suffix).text(roleType);
	$("#ccrcModalFieldId1" + suffix).text(roleType);

	$("#crSno" + suffix).val($("#crSno_Ccrc" + index).val());
	$("#khNo" + suffix).val($("#khNo_Ccrc" + index).val());
	$("#part_key" + suffix).val($("#part_key_Ccrc" + index).val());
	$("#cr_vcode" + suffix).val($("#cr_vcode_Ccrc" + index).val());
	$("#cr_year" + suffix).val($("#cr_year_Ccrc" + index).val());
	$("#cr_season" + suffix).val($("#cr_season_Ccrc" + index).val());
	$("#cultivatorType" + suffix).val(cultivatorType);
	$("#extentLabel" + suffix).val(originalExt);


	if (cultivatorType == 'C') {
		$("#ocName" + suffix).val($("#ocName_Ccrc" + index).val());
		$("#fatherName" + suffix).val($("#fatherName_Ccrc" + index).val());
		$("#aadharNo" + suffix).val($("#aadharNo_Ccrc" + index).val());
		$("#bookingId" + suffix).val($("#bookingId_Ccrc" + index).val());
		$("#aadharNo1" + suffix).val($("#aadharNoCcrc" + index).val());
		// $("#occupantExtent" + suffix).val($("#occupantExtent_Ccrc" + index).val());
		$("#cultivatorIndexOE").val(index);
		$("#orgextentLabel" + suffix).val(originalExt);


		$("#aadharNo1" + suffix).text($("#aadharNoCcrc" + index).val());
		$("#crSnoLabel" + suffix).text($("#crSno_Ccrc" + index).val());
		$("#khNoLabel" + suffix).text($("#khNo_Ccrc" + index).val());
		$("#ocNameLabel" + suffix).text($("#ocName_Ccrc" + index).val());
		$("#fatherNameLabel" + suffix).text($("#fatherName_Ccrc" + index).val());
		$("#aadharNoLabel" + suffix).text($("#aadharNo_Ccrc" + index).val());

		//		 alert($("#anubhavadarExtent_Ccrc" + index).val());
		//		 alert($("#occupantExtent_Ccrc" + index).val());
		//		alert(avail+'---------------------------'+originalExt)
		//		if (($("#anubhavadarExtent_Ccrc" + index).val()) >= avail) {
		//			//			 alert(avail);
		//			$("#occupantExtent" + suffix).val(avail);
		//		}
		//		if (avail > ($("#anubhavadarExtent_Ccrc" + index).val())) {
		//			//			 alert(originalExt);
		$("#occupantExtent" + suffix).val(originalExt);
		//		}
		// $("#orgextentLabelOE").val(originalExt);
	}

}


function setModalValues(index, cultivatorType, roleType, originalExt) {

	$("#typeeOf").val($('#type').val());
	$("#typeeOf").text($('#type').val());
	var suffix = '';
	if (cultivatorType == 'O') {
		$("#typeeOf").val($('#type').val());
		$("#typeeOf").text($('#type').val());
		suffix = 'OE'
		//		document.getElementById("aadharNo" + suffix).disabled = true;
		var inputValue = $("#aadharNo" + index).val();
		var aadharDisplay = document.querySelector(".aadharDisplay");
		var aadharInput = document.querySelector(".aadharInput");

		//		 if (aadharNo.length > 1) {
		//		        aadharDisplay.style.display = "inline";
		//		        aadharDisplay.textContent = aadharNo;
		//		        aadharInput.style.display = "none";
		//		    } else {
		//		        aadharDisplay.style.display = "none";
		//		        aadharInput.style.display = "inline";
		//		    }

		if (typeof inputValue !== 'undefined' && $("#aadharNo" + index).val() == '') {
			alert('Please Update Pattadar  Aadhaar Number in "Pattadar Empty Aadhaar Updation Screen" in Transactions')
			aadharDisplay.style.display = "inline";
			aadharDisplay.textContent = inputValue;
			aadharInput.style.display = "none";
		}
		if (inputValue == '222222222222') {
			aadharDisplay.style.display = "none";
			$("#aadharNoOE").val('');
			aadharInput.style.display = "inline";
		}
		if (typeof inputValue !== 'undefined' && inputValue != '222222222222') {
			aadharDisplay.style.display = "inline";
			aadharDisplay.textContent = inputValue;
			aadharInput.style.display = "none";
		}
		//		    else {
		//				
		//		    	 aadharDisplay.style.display = "none";
		//			        aadharInput.style.display = "inline";
		//		    	
		//		        // Display the value in a span
		//		        $("#aadharNo" + index).replaceWith("<span>" + inputValue + "</span>");
		//		    } 
		//		if ($("#aadharNo" + index).val() === '' || $("#aadharNo" + index).val() == null)
		//			document.getElementById("aadharNo" + suffix).disabled = false;
		document.getElementById("occupantExtent" + suffix).disabled = false;
		$("#cultivatorType" + suffix).text($("#cultivatorType" + index).val());

	} else if (cultivatorType == 'L') {
		$("#typeeOf").val($('#type').val());
		$("#typeeOf").text($('#type').val());
		suffix = 'OE'
		$("#aadharNo" + suffix).val('');
		var inputValue = $("#aadharNo" + index).val();
		var aadharDisplay = document.querySelector(".aadharDisplay");
		var aadharInput = document.querySelector(".aadharInput");
		aadharDisplay.style.display = "none";
		aadharInput.style.display = "inline";
		document.getElementById("aadharNo" + suffix).disabled = false;
		document.getElementById("occupantExtent" + suffix).disabled = false;
		$("#MobileOE").val('');
		$("#MobileOE").text('');
		$("#cultivatorType" + suffix).text($("#cultivatorType" + index).val());
	} else if (cultivatorType == 'K') {
		$("#typeeOfC").val($('#type').val());
		$("#typeeOfC").text($('#type').val());
		$("#MobileC").val('');
		$("#MobileC").text('');
		var inputValue = $("#anubhavadarExtent" + index).val();
		// suffix = 'OE'
		$("#orgextentLabelC").val(inputValue);
		$("#availableExtent").val(originalExt);
		$("#owner_tenant").val(cultivatorType);
		$("#refBookingId").val($("#bookingId" + index).val());

	}

	else if (cultivatorType == 'C') {
		$("#typeeOf").val($('#type').val());
		$("#typeeOf").text($('#type').val());
		$("#MobileOE").val('');
		$("#MobileOE").text('');
		suffix = 'OE'
		$("#owner_tenant").val(cultivatorType);
		document.getElementById("aadharNo" + suffix).disabled = true;
		document.getElementById("occupantExtent" + suffix).disabled = true;
		$("#refBookingId").val($("#bookingId" + index).val());
	}

	$("#crSnoLabel" + suffix).text($("#crSno" + index).val());
	$("#khNoLabel" + suffix).text($("#khNo" + index).val());
	$("#ocNameLabel" + suffix).text($("#ocName" + index).val());
	$("#fatherNameLabel" + suffix).text($("#fatherName" + index).val());
	$("#aadharNoLabel" + suffix).text($("#aadharNo" + index).val());
	$("#cultivatorType" + suffix).val(cultivatorType);
	// if (cultivatorType == 'O') {
	// $("#aadharNo" + suffix).text($("#aadharNo" + index).val());
	// }
	$("#cultivatorModalHeaderId" + suffix).text(roleType);
	$("#cultivatorModalFieldId1" + suffix).text(roleType);
	$("#typeeOf").val($('#type').val());
	$("#typeeOf").text($('#type').val());
	$("#ccrcModalHeaderId" + suffix).text(roleType);
	$("#ccrcModalFieldId1" + suffix).text(roleType);

	$("#crSno" + suffix).val($("#crSno" + index).val());
	$("#khNo" + suffix).val($("#khNo" + index).val());
	$("#part_key" + suffix).val($("#part_key" + index).val());
	$("#cr_vcode" + suffix).val($("#cr_vcode" + index).val());
	$("#cr_year" + suffix).val($("#cr_year" + index).val());
	$("#cr_season" + suffix).val($("#cr_season" + index).val());
	$("#cultivatorType" + suffix).val(cultivatorType);

	$("#orgextentLabelOE").val(originalExt);
	$("#orgextentLabelC").val($("#anubhavadarExtent" + index).val());

	if (cultivatorType == 'O') {
		$("#MobileOE").val('');
		$("#MobileOE").text('');
		$("#ocName" + suffix).val($("#ocName" + index).val());
		$("#fatherName" + suffix).val($("#fatherName" + index).val());
		$("#aadharNo" + suffix).val($("#aadharNo" + index).val());
		$("#bookingId" + suffix).val($("#bookingId" + index).val());
		$("#cultivatorIndexOE").val(index);
		//		$("#aadharNo" + suffix).val('');
	} else if (cultivatorType == 'L') {
		$("#MobileOE").val('');
		$("#MobileOE").text('');
		$("#ocName" + suffix).val($("#ocName" + index).val());
		$("#fatherName" + suffix).val($("#fatherName" + index).val());
		// $("#aadharNo" + suffix).val($("#aadharNo" + index).val());
		$("#bookingId" + suffix).val($("#bookingId" + index).val());
		$("#cultivatorIndexOE").val(index);
	}
	else if (cultivatorType == 'C') {

		$("#ocName" + suffix).val($("#ocName_Ccrc" + index).val());
		$("#fatherName" + suffix).val($("#fatherName_Ccrc" + index).val());
		$("#aadharNo" + suffix).val($("#aadharNo_Ccrc" + index).val());
		$("#bookingId" + suffix).val($("#bookingId_Ccrc" + index).val());
		$("#occupantExtent" + suffix).val($("#availableExtentC" + index).val());
		$("#cultivatorIndexOE").val(index);

		$("#crSnoLabel" + suffix).text($("#crSno_Ccrc" + index).val());
		$("#khNoLabel" + suffix).text($("#khNo_Ccrc" + index).val());
		$("#ocNameLabel" + suffix).text($("#ocName_Ccrc" + index).val());
		$("#fatherNameLabel" + suffix).text($("#fatherName_Ccrc" + index).val());
		$("#aadharNoLabel" + suffix).text($("#aadharNo_Ccrc" + index).val());
		$("#occupantExtentNoLabel" + suffix).text($("#occupantExtent_Ccrc" + index).val());
	}


	else {
		$("#typeeOfR").val($('#type').val());
		$("#typeeOfR").text($('#type').val());
		suffix = 'R'
		$("#crSnoLabel" + suffix).val($("#crSno" + index).val());
		$("#khNoLabel" + suffix).val($("#khNo" + index).val());
		//		$("#orgextentLabel" + suffix).val($("#anubhavadarExtent" + index).val());
		$("#ocNameLabel" + suffix).val($("#ocName" + index).val());
		$("#fatherNameLabel" + suffix).val($("#fatherName" + index).val());
		$("#aadharNo" + suffix).val($("#aadharNo" + index).val());
		$("#aadharNoLabel" + suffix).val($("#aadharNo" + index).val());
		$("#aadharNoRofr").val($("#aadharNo" + index).val());
		$("#Extent" + suffix).val($("#anubhavadarExtent" + index).val());
		$("#crSno" + suffix).val($("#crSno" + index).val());
		$("#khNo" + suffix).val($("#khNo" + index).val());
		$("#bookingId" + suffix).val($("#bookingId" + index).val());
		$("#part_key" + suffix).val($("#part_key" + index).val());
		$("#cr_vcode" + suffix).val($("#cr_vcode" + index).val());
		$("#cr_year" + suffix).val($("#cr_year" + index).val());
		$("#cr_season" + suffix).val($("#cr_season" + index).val());
		$("#cultivatorType" + suffix).val(cultivatorType);
		$("#roleType" + suffix).val(roleType);

		$("#MobileR").val('');
		$("#MobileR").text('');

		$("#crSnoLabel" + suffix).text($("#crSno" + index).val());
		$("#khNoLabel" + suffix).text($("#khNo" + index).val());
		$("#ocNameLabel" + suffix).text($("#ocName" + index).val());
		$("#fatherNameLabel" + suffix).text($("#fatherName" + index).val());
		$("#aadharNoLabel" + suffix).text($("#aadharNo" + index).val());
		$("#aadharNo" + suffix).text($("#aadharNo" + index).val());
		$("#Extent" + suffix).text($("#anubhavadarExtent" + index).val());
		$("#aadharNo2" + index).replaceWith("<span>" + originalExt + "</span>");
	}



	/*else {
		$("#cultivatorIndex").val(index);
	}*/


}

function rofrDetails(sufix) {
	var type = $('#typeeOfR').val();
	if (validMobilenumber($("#Mobile" + sufix).val())) {
		if ($("#Extent" + sufix).val() > 0) {
			var partkey = $("#part_key" + sufix).val();
			var bookingid = $("#bookingId" + sufix).val();
			var occupextent = $("#Extent" + sufix).val();
			var userid = $("#userid").val();
			var aadhaarNo = $("#aadharNo" + sufix).val();
			var cr_vcode = $("#cr_vcode" + sufix).val();
			var khNo = $("#khNo" + sufix).val();
			var crSno = $("#crSno" + sufix).val();
			var roleType = $("#roleType" + sufix).val();
			var mobile = ($("#Mobile" + sufix).val());
			var cultivatorType = $("#cultivatorType" + sufix).val();
			if (cultivatorType == 'N') {
				cultivatorType = 'O';
			}
			else if (cultivatorType == 'A' || cultivatorType == 'B' || cultivatorType == 'F' || cultivatorType == 'G') {
				cultivatorType = 'L';
			}
			var msg = roleType + ' Data Updated Successfully!';
			var failedMsg = "Failed to Update " + roleType + "  Data";
			var title = "Do you want to add " + roleType;
			//alert(partkey +'  '+ bookingid +'  '+ occupextent +'  '+ userid +'  '+ aadhaarNo +'  '+ cr_vcode +'  '+ khNo +'  '+ crSno)
			Swal.fire({
				title: title,
				showDenyButton: true,
				showCancelButton: false,
				confirmButtonText: "Add",
				denyButtonText: `Cancel`
			}).then((result) => {
				if (result.isConfirmed) {
					$.ajax({
						type: "put",
						url: "./cultivator/owner/update",
						data: {
							"part_key": partkey,
							"bookingId": bookingid,
							"aadharNo": aadhaarNo,
							"occupantExtent": occupextent,
							"updatedby": userid,
							"cultivatorType": cultivatorType,
							"cr_vcode": cr_vcode,
							"khNo": khNo,
							"crSno": crSno,
							"mobile": mobile,
						},
						success: function(data) {
							$('#cultivatorROFRModal').modal('hide');
							var index = $("#cultivatorIndex" + sufix).val();
							$("#searchParam" + index).val('0');
							$("#occupantExtent" + sufix).val('');
							searchData();

							data ?
								alertify.notify(msg, "success", 10) :
								alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
							$('#cultivatorROFRModal').modal('hide');

						},
						error: function(data) {
							$('#cultivatorROFRModal').modal('hide');
							searchData();

							data ?
								alertify.notify(msg, "success", 10) :
								alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
							//				console.log(err);
							//				console.log("Failed to Update Details");
						}
					});
				} else if (result.isDenied) {
					Swal.fire(failedMsg, "", "info");
				}
			});
		}
		else {
			alert('Extent Should be Greater Than Zero')
			return false;
		}
	}
}


function validMobilenumber(a) {
	var mbl_no = a;
	var sub = mbl_no.substring(0, 1);
	if (mbl_no.length === 10 || mbl_no.length === 0) {
		if (mbl_no.length === 10 && (sub === "6" || sub === "7" || sub === "8" || sub === "9")) {
			return true;
		}
		else if (mbl_no.length === 10 && !(sub === "6" || sub === "7" || sub === "8" || sub === "9")) {
			alert("Please enter a valid mobile number");
			return false;
		}
		else if (!mbl_no.length === 10) {
			alert("Please enter a valid mobile number");
			$('#mbl_no' + a).val('');
			return false;
		}
		else if (mbl_no.length === 0) {
			alert("You haven't Updating mobile number");
			return true;
		}

	} else {
		alert("Please enter a valid mobile number");
		$('#mbl_no' + a).val('');
		return false;
	}
	return true;
}

function updateOwnerOrEnjoerDetails(sufix) {
	var type = $('#typeeOf').val();
	if (validMobilenumber($("#Mobile" + sufix).val())) {
		if ($("#occupantExtent" + sufix).val() > 0) {
			var cultivatorType = $("#cultivatorTypeOE").val();
			var partkey = $("#part_key" + sufix).val();
			var bookingid = $("#bookingId" + sufix).val();
			var occupextent = $("#occupantExtent" + sufix).val();
			var userid = $("#userid").val();
			var inputVal = ($("#aadharNo2" + sufix).val());
			var mobile = ($("#Mobile" + sufix).val());
			//	var inputgh2 == ($("#aadharNo" + sufix).val());
			if (typeof inputVal !== 'undefined') {
				var aadhaarNo = $("#aadharNo" + sufix).val();
			}
			else {
				var aadhaarNo = $("#aadharNo2" + sufix).val();
			}
			var cr_vcode = $("#cr_vcode" + sufix).val();
			var khNo = $("#khNo" + sufix).val();
			var crSno = $("#crSno" + sufix).val();

			var dupCullti = "C";
			if (cultivatorType != dupCullti) {
				if (cultivatorType == 'L' || cultivatorType == 'O') {
					var aadharNo = $("#aadharNo" + sufix).val();
					if (aadharNo === '' || !/^\d{12}$/.test(aadharNo)) {
						Swal.fire({
							text: "Please enter a valid 12-digit Aadhar number.",
							icon: "error"
						});
						return;
					}
					else {
						if (!validateVerhoeff(aadharNo)) {
							alert('Wrong Aadhar')
							Swal.fire({
								text: "Please enter a valid Aadhar number.",
								icon: "error"
							});
							return;
						}
					}

				}

				if ($("#occupantExtent" + sufix).val() === '') {
					Swal.fire({
						text: "Please fill Occupant Extent.",
						icon: "error"
					});
					return;
				}

				var url = './cultivator/owner/update';


				if (type === 'LP') {
					url = './cultivator/owner/updateLP';
				}
				var index = $("#cultivatorIndexOE").val();
				var availableExtent = parseFloat($("#availableExtent" + index).val()).round(4);
				var occupantExtent = parseFloat($("#occupantExtentOE").val()).round(4);
				if (occupantExtent > availableExtent) {
					swal.fire("Entered Occupant Extent is more than available extent. Allowed Extent is  ::  " + availableExtent, "", "warning");
					return false;
				}

				Swal.fire({
					title: "Do you want to update the changes?",
					showDenyButton: true,
					showCancelButton: false,
					confirmButtonText: "Update",
					denyButtonText: `Don't Update`
				}).then((result) => {
					if (result.isConfirmed) {
						$.ajax({
							type: "put",
							url: url,
							data: {
								"part_key": partkey,
								"bookingId": bookingid,
								"aadharNo": aadhaarNo,
								"occupantExtent": occupextent,
								"updatedby": userid,
								"cultivatorType": cultivatorType,
								"cr_vcode": cr_vcode,
								"khNo": khNo,
								"crSno": crSno,
								"mobile": mobile,
							},
							success: function(data) {
								$('#ownerOrEnjoyerModal').modal('hide');
								var index = $("#cultivatorIndex" + sufix).val();
								$("#searchParam" + index).val('0');
								$("#occupantExtent" + sufix).val('');
								searchData();

								data ?
									alertify.notify("Owner Data Updated Successfully!", "success", 10) :
									alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
								$('#ownerOrEnjoyerModal').modal('hide');

							},
							error: function(data) {
								$('#ownerOrEnjoyerModal').modal('hide');
								searchData();

								data ?
									alertify.notify("Owner Data Updated Successfully!", "success", 10) :
									alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
								//						console.log(err);
								//						console.log("Failed to Update Details");
							}
						});
					} else if (result.isDenied) {
						Swal.fire("Failed to Update Owner Data", "", "info");
					}
				});
			}
		}
		else {
			alert('Extent Should Be Greater Than zero')
			return false;
		}
	}
}

function ccrcDetails(sufix) {

	//alert($("#cr_vcode" + sufix).val())
	if (validMobilenumber($("#Mobile" + sufix).val())) {
		if ($("#occupantExtent" + sufix).val() > 0) {
			var cultivatorType = $("#cultivatorTypeOE").val();
			//	alert( $("#part_key" + sufix).val())
			var dupCullti = "C";
			if (cultivatorType == dupCullti) {
				Swal.fire({
					title: "Do you want to add the CCRC?",
					showDenyButton: true,
					showCancelButton: false,
					confirmButtonText: "Add",
					denyButtonText: `Don't Update`
				}).then((result) => {
					if (result.isConfirmed) {
						$.ajax({
							type: "PUT",
							url: "./cultivator/ccrc/update",
							data: {
								"part_key": $("#part_key" + sufix).val(),
								"bookingId": $("#bookingId" + sufix).val(),
								"aadharNo": $("#aadharNo1" + sufix).val(),
								"occupantExtent": $("#occupantExtent" + sufix).val(),
								"updatedby": $("#userid").val(),
								"cultivatorType": $("#cultivatorType" + sufix).val(),
								"cr_vcode": $("#cr_vcode" + sufix).val(),
								"crSno": $("#crSno" + sufix).val(),
								"khNo": $("#khNo" + sufix).val(),
								"mobile": $("#Mobile" + sufix).val(),
							},
							success: function(resData) {
								var index = $("#cultivatorIndexOE").val();
								$("#searchParam" + index).val('0');
								$("#occupantExtent" + sufix).val('');
								searchData();

								resData ?
									alertify.notify("CCRC Data added Successfully!", "success", 10)
									: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
								$('#ownerOrEnjoyerModal').modal('hide');

							},
							error: function(xhr, err) {
								console.log(err);
								console.log("Failed to Update Details");
								$('#ownerOrEnjoyerModal').modal('hide');
							}
						});
					} else if (result.isDenied) {
						Swal.fire("Failed to Update CCRC Data", "", "info");
					}
				});
			}
		}
	}
	else {
		alert('Extent Should be Greater Than Zero')
		return false;
	}

}


var clickCounts = [];

function editCultivatorDetails(index) {
	var cultivatorType = document.getElementById('cultivatorType' + index).value;
	if (!clickCounts[index]) {
		clickCounts[index] = 0;
	}
	clickCounts[index]++;
	if (clickCounts[index] % 2 === 1 && cultivatorType === 'O') {
		document.getElementById("aadharNo" + index).disabled = true;
		document.getElementById("occupantExtent" + index).disabled = true;
		document.getElementById("ocName" + index).disabled = true;
		document.getElementById("fatherName" + index).disabled = true;
		$("#update" + index).css({ 'display': '' });
		$("#addExtent" + index).css({ 'display': '' });
	} else if (clickCounts[index] % 2 === 1 && cultivatorType === 'K') {
		document.getElementById("aadharNo" + index).disabled = false;
		document.getElementById("occupantExtent" + index).disabled = false;
		document.getElementById("ocName" + index).disabled = false;
		document.getElementById("fatherName" + index).disabled = false;
		$("#update" + index).css({ 'display': '' });
	} else if (clickCounts[index] % 2 === 1 && cultivatorType === 'L') {
		document.getElementById("aadharNo" + index).disabled = false;
		document.getElementById("occupantExtent" + index).disabled = false;
		document.getElementById("ocName" + index).disabled = true;
		document.getElementById("fatherName" + index).disabled = true;
		$("#update" + index).css({ 'display': '' });
	} else {
		document.getElementById("aadharNo" + index).disabled = true;
		document.getElementById("occupantExtent" + index).disabled = true;
		document.getElementById("ocName" + index).disabled = true;
		document.getElementById("fatherName" + index).disabled = true;
		$("#update" + index).css({ 'display': 'none' });
		$("#addExtent" + index).css({ 'display': 'none' });
	}

	$.ajax({
		type: "GET",
		url: "./cultivator/extent",
		data: {
			"part_key": $("#part_key" + index).val(),
			"khNo": $("#fromKhnoId").val(),
			"cr_vcode": $("#wbvcode").val(),
			"crSno": $("#crSno" + index).val(),
		},
		dataType: 'json',
		success: function(responseJson) {
			console.log(responseJson.anubhavadarExtent);
			var anubhavadarExtent = parseFloat(responseJson.anubhavadarExtent).round(3);
			var totalOccupantExtent = parseFloat(responseJson.occupantExtent).round(3);
			var availableExtent = anubhavadarExtent - totalOccupantExtent;


			$("#availableExtent" + index).val(availableExtent);

			$("#totalOccupantExtent" + index).val(totalOccupantExtent);

			$("#anubhavadarExtent" + index).val(anubhavadarExtent);

			// $('#occupantExtent' + index).attr('title', "Total Extent is :: "
			// + anubhavadarExtent + " and Available Extent is :: " +
			// availableExtent);
			$('#occupantExtent' + index).tooltip();
		},
		error: function(xhr, err) {
			console.log(err);
			console.log("Failed to Update Details");
		}
	});


}


var clickCountsLP = [];

function editCultivatorDetailsLP(index) {
	var cultivatorType = document.getElementById('cultivatorType' + index).value;
	if (!clickCountsLP[index]) {
		clickCountsLP[index] = 0;
	}
	clickCountsLP[index]++;
	if (clickCountsLP[index] % 2 === 1 && cultivatorType === 'O') {
		document.getElementById("aadharNo" + index).disabled = true;
		document.getElementById("occupantExtent" + index).disabled = true;
		document.getElementById("ocName" + index).disabled = true;
		document.getElementById("fatherName" + index).disabled = true;
		$("#update" + index).css({ 'display': '' });
		$("#addExtent" + index).css({ 'display': 'block' });
	} else if (clickCountsLP[index] % 2 === 1 && cultivatorType === 'K') {
		document.getElementById("aadharNo" + index).disabled = false;
		document.getElementById("occupantExtent" + index).disabled = false;
		document.getElementById("ocName" + index).disabled = false;
		document.getElementById("fatherName" + index).disabled = false;
		$("#update" + index).css({ 'display': '' });
	} else if (clickCountsLP[index] % 2 === 1 && cultivatorType === 'L') {
		document.getElementById("aadharNo" + index).disabled = false;
		document.getElementById("occupantExtent" + index).disabled = false;
		document.getElementById("ocName" + index).disabled = true;
		document.getElementById("fatherName" + index).disabled = true;
		$("#update" + index).css({ 'display': '' });
	} else {
		document.getElementById("aadharNo" + index).disabled = true;
		document.getElementById("occupantExtent" + index).disabled = true;
		document.getElementById("ocName" + index).disabled = true;
		document.getElementById("fatherName" + index).disabled = true;
		$("#update" + index).css({ 'display': 'none' });
		$("#addExtent" + index).css({ 'display': 'none' });
	}

	$.ajax({
		type: "GET",
		url: "./cultivator/extent",
		data: {
			"part_key": $("#part_key" + index).val(),
			"khNo": $("#fromKhnoId").val(),
			"cr_vcode": $("#wbvcode").val(),
			"crSno": $("#crSno" + index).val(),
		},
		dataType: 'json',
		success: function(responseJson) {
			console.log(responseJson.anubhavadarExtent);
			var anubhavadarExtent = parseFloat(responseJson.anubhavadarExtent).round(3);
			var totalOccupantExtent = parseFloat(responseJson.occupantExtent).round(3);
			var availableExtent = anubhavadarExtent - totalOccupantExtent;


			$("#availableExtent" + index).val(availableExtent);

			$("#totalOccupantExtent" + index).val(totalOccupantExtent);

			$("#anubhavadarExtent" + index).val(anubhavadarExtent);

			// $('#occupantExtent' + index).attr('title', "Total Extent is :: "
			// + anubhavadarExtent + " and Available Extent is :: " +
			// availableExtent);
			$('#occupantExtent' + index).tooltip();
		},
		error: function(xhr, err) {
			console.log(err);
			console.log("Failed to Update Details");
		}
	});


}

function updateCultivatorDetails(index) {
	var ocName = $("#ocName" + index).val();
	var fatherName = $("#fatherName" + index).val();
	var addExtent = $("#addExtent" + index).val();

	if ($("#ocName" + index).val() === '') {
		Swal.fire({
			text: "Please fill Pattadhar Name.",
			icon: "error"
		});
		return;
	}

	if ($("#fatherName" + index).val() === '') {
		Swal.fire({
			text: "Please fill Pattadhar Father Name.",
			icon: "error"
		});
		return;
	}

	var aadharNo = $("#aadharNo" + index).val();
	if (aadharNo === '' || !/^\d{12}$/.test(aadharNo)) {
		Swal.fire({
			text: "Please enter a valid 12-digit Aadhar number.",
			icon: "error"
		});
		return;
	}

	var anubhavadarExtent = parseFloat($("#availableExtent" + index).val());
	var occupantExtent = parseFloat($("#occupantExtent" + index).val());
	var newExtent = (parseFloat(occupantExtent) + parseFloat(addExtent)).round(4);
	var existingOccupantExtent = parseFloat($("#existingOccupantExtent" + index).val());
	var totalOccupantExtent = parseFloat($("#totalOccupantExtent" + index).val());
	console.log("anubhavadarExtent:" + anubhavadarExtent);
	console.log("occupantExtent:" + occupantExtent);
	console.log("existingOccupantExtent:" + existingOccupantExtent);
	console.log("totalOccupantExtent_1:" + totalOccupantExtent);
	anubhavadarExtent = anubhavadarExtent;
	var existingAvailableExtent = anubhavadarExtent - totalOccupantExtent;
	totalOccupantExtent = totalOccupantExtent - existingOccupantExtent;
	totalOccupantExtent = totalOccupantExtent + newExtent;
	if (addExtent === '' || addExtent == 0 || addExtent == null || isNaN(addExtent)) {
		Swal.fire({
			text: "Please Add Aditional Extent.",
			icon: "error"
		});
		return false;
	}
	else if (addExtent < 0) {
		Swal.fire({
			text: "Extent Cannot Be Negative.",
			icon: "error"
		});
		return false;
	} else {

		if (addExtent > anubhavadarExtent.round(4)) {
			swal.fire("Entered Occupant Extent is morethan available extent. Allowed Extent is :: " + anubhavadarExtent.round(4), "", "warning");
			return false;
		}
	}


	var part_key = $("#part_key" + index).val();
	var bookingId = $("#bookingId" + index).val();
	var cr_vcode = $("#cr_vcode" + index).val();
	var khNo = $("#khNo" + index).val();
	var crSno = $("#crSno" + index).val();


	$.ajax({
		type: "POST",
		url: "./cultivator/owner/details",
		data: {
			"part_key": part_key,
			"bookingId": bookingId,
			"ocName": ocName,
			"fatherName": fatherName,
			"aadharNo": aadharNo,
			"occupantExtent": newExtent,
			"oldExtent": occupantExtent,
			"cr_vcode": cr_vcode,
			"khNo": khNo,
			"crSno": crSno,
			"cultivatorType": $("#cultivatorType" + index).val(),
			"updatedby": $("#userid").val(),
		},
		success: function(resData) {
			searchData();

			resData ?
				alertify.notify("Data Updated Successfully!", "success", 10)
				: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
		},
		error: function(xhr, err) {
			console.log(err);
			console.log("Failed to Update Details");
		}
	});

}

function deleteCultivatorDetails(index) {
	Swal.fire({
		title: "Do you want to delete cultivator data?",
		showDenyButton: true,
		showCancelButton: false,
		confirmButtonText: "Yes",
		denyButtonText: "No"
	}).then((result) => {
		if (result.isConfirmed) {

			$.ajax({
				type: "DELETE",
				url: "./cultivator/delete",
				data: {
					"part_key": $("#part_key" + index).val(),
					"bookingId": $("#bookingId" + index).val(),
				},
				success: function(data) {
					$("#occupantExtentOE").val('');
					searchData();

					data ?
						alertify.notify("Data Deleted Successfully!", "success", 10)
						: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
				},
				error: function(xhr, err) {
					console.log(err);
					console.log("Failed to Delete Details");
				}
			});
		} else if (result.isDenied) {
		}
	});

}



function saveCultivatorData() {

	var type = $('#typeeOfC').val();
	if (validMobilenumber($("#MobileC").val())) {
		if ($("#occupantExtent").val() > 0) {
			if ($("#ocName").val() === '') {
				Swal.fire({
					text: "Please fill Cultivator Name.",
					icon: "error"
				});
				return;
			}

			if ($("#fatherName").val() === '') {
				Swal.fire({
					text: "Please fill Cultivator Father Name.",
					icon: "error"
				});
				return;
			}


			var aadharNo = $("#aadharNo").val();
			var mobile = ($("#MobileC").val());
			if (aadharNo === '' || !/^\d{12}$/.test(aadharNo)) {
				Swal.fire({
					text: "Please enter a valid 12-digit Aadhar number.",
					icon: "error"
				});
				return;
			}
			else {
				if (!validateVerhoeff(aadharNo)) {
					alert('Wrong Aadhaaar')
					Swal.fire({
						text: "Please enter a valid Aadhar number.",
						icon: "error"
					});
					return;
				}
			}

			if ($("#occupantExtent").val() === '') {
				Swal.fire({
					text: "Please fill Occupant Extent.",
					icon: "error"
				});
				return;
			}
			var url = './cultivator/save';


			if (type === 'LP') {
				url = './cultivator/saveLP';
			}
			var index = $("#cultivatorIndex").val();
			var availableExtent = parseFloat($("#availableExtent" + index).val()).round(4);
			var occupantExtent = parseFloat($("#occupantExtent").val()).round(4);

			if (occupantExtent > availableExtent) {
				swal.fire("Entered Occupant Extent is morethan available extent. Allowed Extent is - " + availableExtent, "", "warning");
				return false;
			}

			$.ajax({
				type: "post",
				url: url,
				data: {
					"khNo": $("#khNo").val(),
					"crSno": $("#crSno").val(),
					"occupname": $("#ocName").val(),
					"occupfname": $("#fatherName").val(),
					"cr_year": $("#cr_year").val(),
					"aadharNo": $("#aadharNo").val(),
					"part_key": $("#part_key").val(),
					"cr_vcode": $("#cr_vcode").val(),
					"crDistCode": $("#wbdcode").val(),
					"crMandCode": $("#wbmcode").val(),
					"cr_season": $("#cr_season").val(),
					"occupantExtent": occupantExtent,
					"refBookingId": $("#refBookingId").val(),
					"cultivatorType": $("#cultivatorType").val(),
					"owner_tenant": $("#owner_tenant").val(),
					"updatedby": $("#userid").val(),
					"cult_updatedby": $("#userid").val(),
					"srno_userid": $("#userid").val(),
					"dcode": $("#dcode").val(),
					"mcode": $("#mcode").val(),
					"mobile": mobile
				},
				success: function(data) {
					$('#ownerOrEnjoyerModal').modal('hide');
					searchData();

					$("#aadharNo").val('');
					$("#ocName").val('');
					$("#fatherName").val('');
					$("#occupantExtent").val('');
					data ?
						alertify.notify("Cultivator Data Saved Successfully", "success", 10)
						: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
					$('#cultivatorModal').modal('hide');
				},
				error: function(xhr, err) {
					console.log(err);
					console.log("Failed to Save Details");
				}
			});
		}
		else {
			alert('Extent Should be Greater Than Zero')
			return false;
		}
	}
}

function searchData() {
	$("#contentDivId").html('');
	var kh_no = $("#fromKhnoId").val();
	var vill = $("#village").val();
	if (kh_no === '' && vill === null) {
		alert('Please Select a Village And Enter Khata Number ')
		return false;
	}
	if (vill === '' || vill === null) {
		alert('Please Select a Village')
		return false;
	}
	if (kh_no === '' || kh_no === null) {
		alert('Please Enter Khata Number')
		return false;
	}
	$.ajax({
		type: "GET",
		url: './cultivator/kathaNo/',
		data: {
			"khNo": $("#fromKhnoId").val(),
			"village": $("#village").val(),
		},
		success: function(data) {
			$("#contentDivId").html(data)
		}
	});
}







// Change Label Text based on Search Type in Edit Crop Booking details Page
//---------------------------------
//Change Label Text based on Search Type in Edit Crop Booking details Page
function searchValueLabelText() {
	var searchType = $("#searchType").val();

	var searchType = document.getElementById('searchType').value;

	if (searchType === "" || searchType === null) {
		alert('Please select a value')

		return false;
	}
	if (searchType === "1") {
		$('#searchValueLabelId').text('Survey No');
	} else if (searchType === "2") {
		$('#searchValueLabelId').text('Katha No');
	} else if (searchType === "3") {
		$('#searchValueLabelId').text('Aadhar No');
	}
}

function searchEditCrBookingDetails() {

	var village = document.getElementById('vcode').value;
	if (village === "" || village === null) {
		alert('Please select village')
		return false;
	}


	var correctionType = document.getElementById('correctionType').value;
	if (correctionType === "" || correctionType === null) {
		alert('Please select a value')
		document.getElementById('correctionType').focus;
		return false;
	}


	var searchValue = document.getElementById('searchValue').value;
	if (searchValue === "" || searchValue === null) {
		alert('Please Enter value')
		document.getElementById('searchValue').focus;
		return false;
	}
	var searchType = $("#searchType").val();
	var aadharNo = '';
	var kathaNo = '';
	var surveyNo = '';
	var cropYearVal = $("#cropYear").val();
	var seasonCropYear = cropYearVal.split('@');


	var searchType = document.getElementById('searchType').value
	if (searchType === "" || searchType === null) {
		alert('Please select a value')
		return false;
	}

	if (searchType == 1) {
		surveyNo = $("#searchValue").val();
	} else if (searchType == 2) {
		kathaNo = $("#searchValue").val();
	} else if (searchType == 3) {
		aadharNo = $("#searchValue").val();
	}
	$("#contentDivId").html('');
	$.ajax({
		type: "GET",
		url: './editCropBookingDtls/details',
		data: {
			"cropYear": seasonCropYear[1],
			"vCode": $("#vcode").val(),
			"correctionType": $("#correctionType").val(),
			"searchType": searchType,
			"kathaNo": kathaNo,
			"surveyNo": surveyNo,
			"aadharNo": aadharNo,
			"season": seasonCropYear[0],
		},
		success: function(data) {
			$("#tableTitleTextId").css({ 'display': '' });
			$("#tableTitleTextId").text($("#correctionType option:selected").text());
			$("#contentDivId").html(data)
		}
	});
}


function updateUidDetails(index) {



	var uidNo = $("#newAadharNo" + index).val();

	if (uidNo.length == 12) {

		if (validateVerhoeff(uidNo)) {

		}
		else {
			alert('Enter valid Aadhaar')
			return false;
		}
	}
	else {
		alert('Enter 12 digits')
		return false;
	}


	$.ajax({
		type: "POST",
		url: "./editCropBookingDtls/update",
		data: {
			"bookingid": $("#bookingid" + index).val(),
			"season": $("#season" + index).val(),
			"oc_name": $("#oc_name" + index).val(),
			"oc_fname": $("#oc_fname" + index).val(),
			"occupname": $("#occupname" + index).val(),
			"occupfname": $("#occupfname" + index).val(),
			"cr_sno": $("#cr_sno" + index).val(),
			"kh_no": $("#kh_no" + index).val(),
			"cr_crop": $("#cr_crop" + index).val(),
			"cr_vcode": $("#cr_vcode" + index).val(),
			"variety": $("#variety" + index).val(),
			"cr_farmeruid": $("#cr_farmeruid" + index).val(),
			"newAadharNo": $("#newAadharNo" + index).val(),
			"cr_sow_date": $("#cr_sow_date" + index).val(),
			"cr_no": $("#cr_no" + index).val(),
			"cropyear": $("#cropyear" + index).val(),
			"wbdcode": $("#wbdcode").val(),
			"rec_id": $("#rec_id" + index).val(),
			"correctionType": $("#correctionType").val(),
		},
		success: function(data) {
			searchEditCrBookingDetails();
			data ?
				alertify.notify("Cultivator UID Details Updated Successfully", "success", 10)
				: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
		},
		error: function(xhr, err) {
			console.log(err);
			console.log("Failed to Save Details");
		}
	});
}

function updateCcrcDetails(index) {


	$.ajax({
		type: "POST",
		url: "./editCropBookingDtls/update",
		data: {
			"bookingid": $("#bookingid" + index).val(),
			"season": $("#season" + index).val(),
			"oc_name": $("#oc_name" + index).val(),
			"oc_fname": $("#oc_fname" + index).val(),
			"occupname": $("#occupname" + index).val(),
			"occupfname": $("#occupfname" + index).val(),
			"newOccupName": $("#newOccupName" + index).val(),
			"newOccupFName": $("#newOccupFName" + index).val(),
			"cr_sno": $("#cr_sno" + index).val(),
			"kh_no": $("#kh_no" + index).val(),
			"cr_crop": $("#cr_crop" + index).val(),
			"cr_vcode": $("#cr_vcode" + index).val(),
			"variety": $("#variety" + index).val(),
			"cr_farmeruid": $("#cr_farmeruid" + index).val(),
			"newAadharNo": $("#newAadharNo" + index).val(),
			"cr_sow_date": $("#cr_sow_date" + index).val(),
			"cr_no": $("#cr_no" + index).val(),
			"cropyear": $("#cropyear" + index).val(),
			"wbdcode": $("#wbdcode").val(),
			"rec_id": $("#rec_id" + index).val(),
			"correctionType": $("#correctionType").val(),
		},
		success: function(data) {
			searchEditCrBookingDetails();
			data ?
				alertify.notify("Cultivator CCRC Details Updated Successfully", "success", 10)
				: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
		},
		error: function(xhr, err) {
			console.log(err);
			console.log("Failed to Save Details");
		}
	});
}


function updateCultivatorCropDetails(index) {


	$.ajax({
		type: "POST",
		url: "./editCropBookingDtls/update",
		data: {
			"bookingid": $("#bookingid" + index).val(),
			"season": $("#season" + index).val(),
			"cropSeedScheme": $("#cropSeedScheme" + index).val(),
			"waterResId": $("#waterResId" + index).val(),
			"irrmethod": $("#irrmethod" + index).val(),
			"variety": $("#var_old" + index).val(),
			"variety_new": $("#var_new" + index).val(),
			"cr_sno": $("#cr_sno" + index).val(),
			"kh_no": $("#kh_no" + index).val(),
			"cr_crop": $("#cropname" + index).val(),
			"cr_farmeruid": $("#cr_farmeruid" + index).val(),
			"cr_sow_date": $("#cr_sow_date" + index).val(),
			"cr_no": $("#cr_no" + index).val(),
			"cropyear": $("#cropyear" + index).val(),
			"cr_vcode": $("#cr_vcode" + index).val(),
			"wbdcode": $("#wbdcode").val(),
			"rec_id": $("#rec_id" + index).val(),
			"correctionType": $("#correctionType").val(),
			"userId": $("#userid").val(),
			//			"var_old" : $("#var").val(),
		},
		success: function(data) {
			searchEditCrBookingDetails();
			data ?
				alertify.notify("Cultivator CropDetails Updated Successfully", "success", 10)
				: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
		},
		error: function(xhr, err) {
			console.log(err);
			console.log("Failed to Save Details");
		}
	});
}

function updateUidCorrectionOfPattaOrEnjoyer(index) {


	var uidNo = $("#newAadharNo" + index).val();


	if (uidNo.length == 12) {

		if (validateVerhoeff(uidNo)) {

		}
		else {
			alert('Enter valid Aadhaar')
			return false;
		}
	}
	else {
		alert('Enter 12 digits')
		return false;
	}

	$.ajax({
		type: "POST",
		url: "./editCropBookingDtls/update",
		data: {
			"bookingid": $("#bookingid" + index).val(),
			"season": $("#season" + index).val(),
			"oc_name": $("#oc_name" + index).val(),
			"oc_fname": $("#oc_fname" + index).val(),
			"occupname": $("#occupname" + index).val(),
			"occupfname": $("#occupfname" + index).val(),
			"cr_sno": $("#cr_sno" + index).val(),
			"kh_no": $("#kh_no" + index).val(),
			"cr_crop": $("#cr_crop" + index).val(),
			"cr_vcode": $("#cr_vcode" + index).val(),
			"variety": $("#variety" + index).val(),
			"cr_farmeruid": $("#cr_farmeruid" + index).val(),
			"newAadharNo": $("#newAadharNo" + index).val(),
			"cr_sow_date": $("#cr_sow_date" + index).val(),
			"cr_no": $("#cr_no" + index).val(),
			"cropyear": $("#cropyear" + index).val(),
			"wbdcode": $("#wbdcode").val(),
			"rec_id": $("#rec_id" + index).val(),
			"correctionType": $("#correctionType").val(),
		},
		success: function(data) {
			searchEditCrBookingDetails();
			data ?
				alertify.notify("Correction Of Pattadhar / Enjoyer Details Updated Successfully", "success", 10)
				: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
		},
		error: function(xhr, err) {
			console.log(err);
			console.log("Failed to Save Details");
		}
	});
}

function updateOthersDetails(index) {

	var uidNo = $("#newAadharNo" + index).val();

	if (uidNo.length == 12) {

		if (validateVerhoeff(uidNo)) {

		}
		else {
			alert('Enter valid Aadhaar')
			return false;
		}
	}
	else {
		alert('Enter 12 digits')
		return false;
	}
	$.ajax({
		type: "POST",
		url: "./editCropBookingDtls/update",
		data: {

			"bookingid": $("#bookingid" + index).val(),
			"season": $("#season" + index).val(),
			"oc_name": $("#oc_name" + index).val(),
			"oc_fname": $("#oc_fname" + index).val(),
			"occupname": $("#occupname" + index).val(),
			"occupfname": $("#occupfname" + index).val(),
			"newOccupName": $("#newOccupName" + index).val(),
			"newOccupFName": $("#newOccupFName" + index).val(),
			"cr_sno": $("#cr_sno" + index).val(),
			"kh_no": $("#kh_no" + index).val(),
			"cr_crop": $("#cr_crop" + index).val(),
			"cr_vcode": $("#cr_vcode" + index).val(),
			"variety": $("#variety" + index).val(),
			"cr_farmeruid": $("#cr_farmeruid" + index).val(),
			"newAadharNo": $("#newAadharNo" + index).val(),
			"cr_sow_date": $("#cr_sow_date" + index).val(),
			"cr_no": $("#cr_no" + index).val(),
			"cropyear": $("#cropyear" + index).val(),
			"wbdcode": $("#wbdcode").val(),
			"rec_id": $("#rec_id" + index).val(),
			"correctionType": $("#correctionType").val(),
		},
		success: function(data) {
			searchEditCrBookingDetails();
			data ?
				alertify.notify("updateOthersDetails Updated Successfully", "success", 10)
				: alertify.notify("Something went Wrong. Please Try again after some time or Please Contact Support Team", "warning", 10);
		},
		error: function(xhr, err) {
			console.log(err);
			console.log("Failed to Save Details");
		}
	});
}


//fetchFarmerMobileno

function fetchFarmerMobilenoOwner(adn, cr_vcode) {
	if (validateVerhoeff(adn)) {
		$.ajax({
			url: './farmer/mobileno/' + adn,
			type: 'GET',
			data: { cr_vcode: cr_vcode },
			success: function(data) {

				var parts = data.split('-');

				var mobileNumber = parts[0];
				var message = parts[1];

				//	alert(message)
				$("#MobileOE").val(mobileNumber);
				if (mobileNumber && mobileNumber != 0) {
					//    $("#MobileOE").prop('readonly', true); 
				}
				else {
					//	$("#MobileOE").prop('readonly', false); 
				}

			},
			error: function(xhr, status, error) {
				console.error("Error fetching farmer mobileno:", error);
				// Handle errors here
			}
		});
	}
	else {
		$("#MobileOE").empty();
		alert('Please Enter Correct Aadhaar No')
	}
}
function fetchFarmerMobilenoEn() {
	var eaahar = document.getElementById('aadharNoOE').value; // Correct way to get value
	var cr_vcode = $("#cr_vcode0").val();
	if (eaahar.length === 12) {
		if (validateVerhoeff(eaahar)) {
			$.ajax({
				url: './farmer/mobileno/' + eaahar,
				type: 'GET',
				data: { cr_vcode: cr_vcode },
				success: function(data) {

					var parts = data.split('-');

					var mobileNumber = parts[0];
					var message = parts[1];
					$("#MobileOE").empty();


					$("#MobileOE").val(mobileNumber);
					if (mobileNumber && mobileNumber != 0) {
						// $("#MobileOE").prop('readonly', true); 
					}
					else {
						$("#MobileOE").val('');
						//	$("#MobileOE").prop('readonly', false); 
					}
					//    alert(message);
				},
				error: function(xhr, status, error) {
					console.error("Error fetching farmer mobileno:", error);
					// Handle errors here
				}
			});
		}
		else {
			//	$("#MobileOE").prop('readonly', false);
			$("#MobileOE").val('');
			alert('Please Enter Correct Aadhaar No')
		}
	}

}


function fetchFarmerMobilenoCulti() {
	var cultiaahar = document.getElementById('aadharNo').value; // Correct way to get value
	var cr_vcode = $("#cr_vcode0").val();
	if (cultiaahar.length === 12) {
		if (validateVerhoeff(cultiaahar)) {
			$.ajax({
				url: './farmer/mobileno/' + cultiaahar,
				type: 'GET',
				data: { cr_vcode: cr_vcode },
				success: function(data) {

					var parts = data.split('-');

					var mobileNumber = parts[0];
					var message = parts[1];
					// 		 alert(message)
					$("#MobileC").empty();
					if (mobileNumber && mobileNumber != 0) {
						//  $("#MobileC").prop('readonly', true); 
						$("#MobileC").val(mobileNumber);
					}
					else {
						$("#MobileC").val('');
						//$("#MobileC").prop('readonly', false); 
					}

				},
				error: function(xhr, status, error) {
					console.error("Error fetching farmer mobileno:", error);

				}
			});
		}
		else {
			//$("#MobileC").prop('readonly', false); 
			$("#MobileC").val('');
			alert('Please Enter Correct Aadhaar No')
		}
	}
}

function fetchFarmerMobilenoCcrc(adn1, cr_vcode) {
	if (validateVerhoeff(adn1)) {
		$.ajax({
			url: './farmer/mobileno/' + adn1,
			type: 'GET',
			data: { cr_vcode: cr_vcode },
			success: function(data) {

				var parts = data.split('-');

				var mobileNumber = parts[0];
				var message = parts[1];

				//	alert(message)
				$("#MobileOE").val(mobileNumber);
				if (mobileNumber && mobileNumber != 0) {
					//    $("#MobileOE").prop('readonly', true); 
				}
				else {
					//	$("#MobileOE").prop('readonly', false); 
				}

			},
			error: function(xhr, status, error) {
				console.error("Error fetching farmer mobileno:", error);
				// Handle errors here
			}
		});
	}
	else {
		$("#MobileOE").empty();
		alert('Please Enter Correct Aadhaar No')
	}
}

function fetchFarmerMobilenoRofr(adn1, cr_vcode) {
	if (validateVerhoeff(adn1)) {
		$.ajax({
			url: './farmer/mobileno/' + adn1,
			type: 'GET',
			data: { cr_vcode: cr_vcode },
			success: function(data) {

				var parts = data.split('-');

				var mobileNumber = parts[0];
				var message = parts[1];

				//	alert(message)
				$("#MobileR").val(mobileNumber);
				if (mobileNumber && mobileNumber != 0) {
					//    $("#MobileOE").prop('readonly', true); 
				}
				else {
					//	$("#MobileOE").prop('readonly', false); 
				}

			},
			error: function(xhr, status, error) {
				console.error("Error fetching farmer mobileno:", error);
				// Handle errors here
			}
		});
	}
	else {
		$("#MobileOE").empty();
		alert('Please Enter Correct Aadhaar No')
	}
}

//Change Label Text based on Search Type in repCultivator details Page
function searchRepCultivatorDtls() {
	var seasonvalueArr = $("#cropYearId").val().split('@');
	$("#contentDivId").html('');
	$.ajax({
		type: "GET",
		url: './repCultivatorDtls/aadharNo'+ '?aadharNo=' + $("#aadharNo").val() + '&cropYear=' + seasonvalueArr[1] + '&season=' + seasonvalueArr[0],
		success: function(data) {
			$("#contentDivId").html(data)
		}
	});
}


function nameMatch() {
	$.ajax({
		type: "POST",
		url: "./repUpdateNameMatch/update" + "?m_value=" + $('#m_value').val(),
		success: function(response) {
			$('#repCultModal').modal('show');
			var infoToEncode = document.getElementById("repCultModal").textContent;
			generateQRCode(infoToEncode);
		},
		error: function(xhr, status, error) {

			console.error(xhr.responseText);
		}
	});

	return false;
}

function printPage() {
	
	
    // Hide the print button before printing
    var buttonToHide = document.getElementById("printBtn");
    buttonToHide.style.display = "none";

    // Get the content to be printed including the QR code
    var printContents = document.getElementById("savePage").innerHTML;
    
  var wbdcode = document.getElementById("wbdcode").value;
  var wbmcode = document.getElementById("wbmcode").value;
  var wbvcode = document.getElementById("wbvcode23").value;
  var userid = document.getElementById("userid").value;
  var crFarmeruid = document.getElementById("fullUid").value;
  

$.ajax({
    type: "POST",
    url: "./repUpdateNameMatch/Insert",
    contentType: "application/json", // Set content type to JSON
    data: JSON.stringify({
        wbdcode: wbdcode,
        wbmcode: wbmcode,
        wbvcode: wbvcode,
        userid: userid,
        crFarmeruid: crFarmeruid // Include this in the data payload
    }),
    success: function(response) {
        $('#repCultModal').modal('show');
        var infoToEncode = document.getElementById("repCultModal").textContent;
        generateQRCode(infoToEncode);
    },
    error: function(xhr, status, error) {
        console.error(xhr.responseText);
    }
});

    // Open a new window to print the content
    var printWindow = window.open('', '_blank', 'width=600,height=600');
    printWindow.document.write(`
        <html>
            <head>
                <title>Print</title>
                <style>
                   
                    body {
                        margin: 0;
                        padding: 20px;
                        text-align: center; 
                    }
                    .modal-title {
                        text-align: center; 
                        font-weight: bold; 
                        font-size: 24px;
                    }
                    .close {
                        display: none; 
                    }
                    table {
                        border-collapse: collapse;
                        width: 100%;
                    }
                    table, th, td {
                        border: 1px solid black;
                        padding: 8px;
                    }
                </style>
            </head>
            <body onload="window.print(); window.close();">
                ${printContents}
            </body>
        </html>
    `);

    printWindow.document.close();
   
    printWindow.focus();
     window.location.reload();

    buttonToHide.style.display = "block";
}

// Generate the QR code based on the information
function generateQRCode2(infoToEncode) {
    var qrcodeDiv = document.getElementById("qrcode");

    qrcodeDiv.innerHTML = "";

    new QRCode(qrcodeDiv, {
        text: infoToEncode,
        width: 128, // Adjust the size of the QR code
        height: 128,
        colorDark: "#000000",
        colorLight: "#ffffff",
    });
}



function generateQRCode() {
    

    var encodedValue = $('#encoded_value').val();
    
    
    if (!encodedValue) {
        alert('No encoded value found');
        return;
    }

   // var baseUrl = 'http://localhost:8081/';
   var baseUrl = 'https://karshak.ap.gov.in/ecrop/';
    
    
    var endpoint = 'repCultivatorDetailsAck/';
    var qrCodeUrl = `${baseUrl}${endpoint}${encodedValue}`;
   

    var qrcode = new QRCode(document.getElementById("qrcode"), {
		
        text: qrCodeUrl,
        width: 200,
        height: 200,
        correctLevel: QRCode.CorrectLevel.H,
    });
}


function nameMisMatch() {

	$.ajax({
		type: "POST",
		url: "./repUpdateNameMatch/update" + "?m_value=" + $('#n_value').val(),
		success: function(response) {
			alert('Name Mismatch Updated Successfully');
			$('#repCultModal').modal('hide');

		},
		error: function(xhr, status, error) {

			console.error(xhr.responseText);
		}
	});

	return false;
}


function mod(num, divisor) {
	//alert('in mod');
	return ((num % divisor) + divisor) % divisor;
}

function validateVerhoeff(num) {
	var d = [
		[0, 1, 2, 3, 4, 5, 6, 7, 8, 9],
		[1, 2, 3, 4, 0, 6, 7, 8, 9, 5],
		[2, 3, 4, 0, 1, 7, 8, 9, 5, 6],
		[3, 4, 0, 1, 2, 8, 9, 5, 6, 7],
		[4, 0, 1, 2, 3, 9, 5, 6, 7, 8],
		[5, 9, 8, 7, 6, 0, 4, 3, 2, 1],
		[6, 5, 9, 8, 7, 1, 0, 4, 3, 2],
		[7, 6, 5, 9, 8, 2, 1, 0, 4, 3],
		[8, 7, 6, 5, 9, 3, 2, 1, 0, 4],
		[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
	];

	// permutation table p
	var p = [
		[0, 1, 2, 3, 4, 5, 6, 7, 8, 9],
		[1, 5, 7, 6, 2, 8, 3, 0, 9, 4],
		[5, 8, 0, 3, 7, 9, 6, 1, 4, 2],
		[8, 9, 1, 6, 0, 4, 3, 5, 2, 7],
		[9, 4, 5, 3, 1, 2, 6, 8, 7, 0],
		[4, 2, 8, 6, 5, 7, 3, 9, 0, 1],
		[2, 7, 9, 3, 8, 0, 6, 4, 1, 5],
		[7, 0, 4, 6, 9, 1, 3, 2, 5, 8]
	];

	var c = 0;
	var myArray = [];
	myArray = StringToReversedIntArray(num);
	// alert(myArray);
	for (var i = 0; i < myArray.length; i++) {
		c = d[c][p[mod(i, 8)][myArray[i]]];
		//	alert(c);
	}
	return (c == 0);
}
function StringToReversedIntArray(num) {
	var myArray = [];

	for (var i = 0; i < num.length; i++) {
		myArray[i] = parseInt(num.substring(i, i + 1));
	}
	myArray = Reverse(myArray);

	return myArray;

}
function Reverse(myArray) {
	var reversed = [];

	for (var i = 0; i < myArray.length; i++) {
		reversed[i] = myArray[myArray.length - (i + 1)];
	}
	return reversed;
}


function Validate(e) {
	var key = e.keyCode;
	return (key >= 65 && key <= 90) || (key >= 97 && key <= 122) || key == 8 || key == 32 || key == 46; // Allow A-Z, a-z, backspace, space, and period
}
function ValidateNum(e) {
	var key = e.keyCode;
	return (key >= 48 && key <= 57) || key == 8;
}

function searchLpKh() {
	var crSno = $('#surveyNo').val();
	$.ajax({
		type: "GET",
		url: './getkhataDet',
		data: {
			"crSno": crSno,
			"village": $("#village").val(),
		},
		success: function(data) {
			$("#contentDivId").html(data)
		}
	});
}

function searchLpKhMao() {
	var crSno = $('#surveyNo').val();
	$.ajax({
		type: "GET",
		url: './getkhataDetMao',
		data: {
			"crSno": crSno,
			"village": $("#village").val(),
		},
		success: function(data) {
			$("#contentDivId").html(data)
		}
	});
}


function saveKh() {
	var size = $('#listSize').val();
	var cr_vcode = $('#village').val();
	var checkExt = parseFloat($('#anubhavadarExtent0').val());
	var tot = 0.0000;
	var ext = 0;
	var khData = []; // Array to store data for all entries

	for (var i = 0; i < size; i++) {
		ext = parseFloat($('#khExtent' + i).val());
		if (ext === 0) {
			alert('Extent cannot be zero')
			return false;
		}
		else {
			tot += ext;

			var entry = {
				khNo: $('#khNo' + i).val(),
				crSno: $('#crSno' + i).val(),
				rec_id: $('#recid' + i).val(),
				khExtent: $('#khExtent' + i).val(),
				oc_name: $('#ocName' + i).val(),
				oc_fname: $('#fatherName' + i).val(),
				cr_vcode: cr_vcode
			};
			khData.push(entry);
		}
	}
	if (tot.toFixed(4) == checkExt.toFixed(4)) {
		$.ajax({
			type: 'POST',
			url: './updateKh',
			contentType: 'application/json',
			data: JSON.stringify(khData),
			success: function(response) {
				alert('Data saved successfully');
			},
			error: function(xhr, status, error) {
				alert('Error saving data: ' + error);
			}
		});
		reloadFor();

	} else if (tot > checkExt) {
		alert('Extent Entered Is More Than The LP Extent');
		return false;
	} else if (tot < checkExt) {
		alert('Please Give Total Extent');
		return false;
	}

}

function reloadFor() {
	alert('Data saved successfully');
	location.reload();
}

function ApproveKh() {
	var size = $('#listSize').val();
	var cr_vcode = $('#village').val();
	var khData = [];

	for (var i = 0; i < size; i++) {

		var entry = {
			khNo: $('#khNo' + i).val(),
			crSno: $('#crSno' + i).val(),
			rec_id: $('#recid' + i).val(),
			khExtent: $('#occup_extent' + i).val(),
			oc_name: $('#ocName' + i).val(),
			oc_fname: $('#fatherName' + i).val(),
			remark: 'A',
			cr_vcode: cr_vcode
		};
		khData.push(entry);
	}
	$.ajax({
		type: 'POST',
		url: './updateKhMao',
		contentType: 'application/json',
		data: JSON.stringify(khData),
		success: function(response) {
			alert('Data saved successfully');
		},
		error: function(xhr, status, error) {
			alert('Error saving data: ' + error);
		}
	});
	reloadFor();


}


function RejectKh() {
	var size = $('#listSize').val();
	var cr_vcode = $('#village').val();
	var khData = [];

	for (var i = 0; i < size; i++) {

		var entry = {
			crSno: $('#crSno' + i).val(),
			remark: 'R',
			rec_id: $('#recid' + i).val(),
			cr_vcode: cr_vcode
		};
		khData.push(entry);
	}
	$.ajax({
		type: 'POST',
		url: './updateKhMao',
		contentType: 'application/json',
		data: JSON.stringify(khData),
		success: function(response) {
			alert('Data Deleted Successfully');
		},
		error: function(xhr, status, error) {
			alert('Error saving data: ' + error);
		}
	});
	reloadForDelete();

}


function reloadForDelete() {
	alert('Data Deleted Successfully');
	location.reload();
}


//---------------------------for CM------------------------------
function searchKhno() {
	var crSno = $('#surveyNo').val();
	$.ajax({
		type: "GET",
		url: './getDamagedDet',
		data: {
			"khNo": crSno,
			"village": $("#village").val(),
		},
		success: function(data) {
			$("#contentDivId").html(data)
		}
	});
}


function searchKhnoEdit() {
	var crSno = $('#surveyNo').val();
	$.ajax({
		type: "GET",
		url: './getDamagedDetEdit',
		data: {
			"khNo": crSno,
			"village": $("#village").val(),
		},
		success: function(data) {
			$("#contentDivId").html(data)
		}
	});
}



function getBranch(index, value) {
	$("#ifscCode" + index).val(' ');
	$("#bankbranch" + index).empty().append('<option value="">----Select----</option>');
	document.getElementById("bankbranch" + index).disabled = false;
	$.ajax({
		type: "GET",
		url: './getBranch',
		data: {
			"bankname": value,
		},
		success: function(resp) {
			for (var j = 0; j < resp.length; j++) {
				var bean = resp[j];
				$("#bankbranch" + index).append('<option value="' + bean.bnk_brnch_cod + '">' + bean.bnk_brnch_name + '</option>');
				//	$("#bankbranch"+index).disabled= 'false';

			}
		}
	});


}




function getIfsc(index, value) {
	$("#ifscCode" + index).empty();
	$.ajax({
		type: "GET",
		url: './getIfsc',
		data: {
			"branchname": value,
		},
		success: function(resp) {
			$("#ifscCode" + index).val(resp);
		}
	});


}

function getBranch_bkg(index, value) {
	$("#ifscCode_bkg" + index).val(' ');
	$("#bankbranch_bkg" + index).empty().append('<option value="">----Select----</option>');
	document.getElementById("bankbranch_bkg" + index).disabled = false;
	$.ajax({
		type: "GET",
		url: './getBranch',
		data: {
			"bankname": value,
		},
		success: function(resp) {
			for (var j = 0; j < resp.length; j++) {
				var bean = resp[j];
				$("#bankbranch_bkg" + index).append('<option value="' + bean.bnk_brnch_cod + '">' + bean.bnk_brnch_name + '</option>');
				//	$("#bankbranch"+index).disabled= 'false';

			}
		}
	});


}




function getIfsc_bkg(index, value) {
	$("#ifscCode_bkg" + index).empty();
	$.ajax({
		type: "GET",
		url: './getIfsc',
		data: {
			"branchname": value,
		},
		success: function(resp) {
			$("#ifscCode_bkg" + index).val(resp);
		}
	});


}

function toggleAllCheckboxes(masterCheckbox) {
	const checkboxes = document.querySelectorAll('input[type="checkbox"][id^="checkbox"]:not([id^="checkbox_bkg"])');
	checkboxes.forEach(function(checkbox) {
		checkbox.checked = masterCheckbox.checked;
		toggleFields(checkbox.id.replace('checkbox', ''));
	});
}

// Function to toggle all checkboxes with prefix 'checkbox_bkg'
function toggleAllCheckboxes_bkg(masterCheckbox) {
	const checkboxes = document.querySelectorAll('input[type="checkbox"][id^="checkbox_bkg"]');
	checkboxes.forEach(function(checkbox) {
		checkbox.checked = masterCheckbox.checked;
		toggleFields_bkg(checkbox.id.replace('checkbox_bkg', ''));
	});
}

// Toggle related fields for non-bkg checkboxes
function toggleFields(index) {
	console.log('toggleFields called with index:', index); // Debugging log
	let isChecked = $('#checkbox' + index).is(':checked');
	$('#damage' + index).prop('disabled', !isChecked);
	$('#bankaccount' + index).prop('disabled', !isChecked);
	$('#bankname' + index).prop('disabled', !isChecked);
	$('#bankbranch' + index).prop('disabled', !isChecked);
	$('#banktype' + index).prop('disabled', !isChecked);
	$('#ownername' + index).prop('disabled', !isChecked);
	$('#caste' + index).prop('disabled', !isChecked);
	$('#sandtype' + index).prop('disabled', !isChecked);
	$('#irr' + index).prop('disabled', !isChecked);

	$('#ownerfathername' + index).prop('disabled', !isChecked);
}

function toggleFields_bkg(index) {
	console.log('toggleFields_bkg called with index:', index); // Debugging log
	let isChecked = $('#checkbox_bkg' + index).is(':checked');
	$('#damage_bkg' + index).prop('disabled', !isChecked);
	$('#bankaccount_bkg' + index).prop('disabled', !isChecked);
	$('#bankname_bkg' + index).prop('disabled', !isChecked);
	$('#bankbranch_bkg' + index).prop('disabled', !isChecked);
	$('#banktype_bkg' + index).prop('disabled', !isChecked);
	$('#ownername_bkg' + index).prop('disabled', !isChecked);
	$('#caste_bkg' + index).prop('disabled', !isChecked);
	$('#crop_bkg' + index).prop('disabled', !isChecked);
	$('#irr_bkg' + index).prop('disabled', !isChecked);
	$('#sandtype_bkg' + index).prop('disabled', !isChecked);
	$('#extent_bkg' + index).prop('disabled', !isChecked);
}

function enablingExtent(index, value) {
	let isChecked = $('#checkbox' + index).is(':checked');
	if (value !== 'N') {
		$('#sandextent' + index).prop('disabled', !isChecked);
	}
	else {
		$('#sandextent' + index).val('')
		$('#sandextent' + index).prop('disabled', isChecked);
	}
}

function enablingExtent_bkg(index, value) {
	let isChecked = $('#checkbox_bkg' + index).is(':checked');
	if (value !== 'N') {
		$('#sandextent_bkg' + index).prop('disabled', !isChecked);
	}
	else {
		$('#sandextent_bkg' + index).val('')
		$('#sandextent_bkg' + index).prop('disabled', isChecked);
	}
}


function saveDamaged() {
	const table = document.getElementById("ownerGrid");
	const table_bkg = document.getElementById("detGrid");
	const rows = table.getElementsByTagName("tbody")[0].getElementsByTagName("tr");
	const rows_bkg = table_bkg.getElementsByTagName("tbody")[0].getElementsByTagName("tr");
	const selectedData = [];
	var count = 0;

	for (let i = 0; i < rows.length; i++) {
		const row = rows[i];
		const checkbox = row.querySelector('input[type="checkbox"]');
		if ((checkbox && checkbox.checked)) {
			count++;
		}

	}
	for (let i = 0; i < rows_bkg.length; i++) {
		const row = rows_bkg[i];
		const checkbox_bkg = row.querySelector('input[type="checkbox"]');
		if ((checkbox_bkg && checkbox_bkg.checked)) {
			count++;
		}

	}




	if (count === 0) {
		alert('Please Select Atleast One Record');
		return false;
	}

	for (let i = 0; i < rows.length; i++) {
		const row = rows[i];
		const checkbox = row.querySelector('input[type="checkbox"]');
		if (checkbox && checkbox.checked) {
			const damage = document.getElementById('damage' + i).value.trim();
			//	const bankAccount = document.getElementById('bankaccount' + i).value.trim();
			//	const bankName = document.getElementById('bankname' + i).value.trim();
			//		const bankBranch = document.getElementById('bankbranch' + i).value.trim();
			//		const bankType = document.getElementById('banktype' + i).value.trim();
			//     const ownerName = document.getElementById('ownername' + i).value.trim();
			//     const ownerFatherName = document.getElementById('ownerfathername' + i).value.trim();
			const extent = parseFloat(document.getElementById('extent' + i).value.trim());
			const caste = parseFloat(document.getElementById('caste' + i).value.trim());
			const sand = document.getElementById('sandtype' + i).value.trim();
			const sandextent = parseFloat(document.getElementById('sandextent' + i).value.trim());
			const damageValue = parseFloat(damage);

			if (caste === '' || (sand !== 'N' && sandextent === '')) {
				alert('Please Fill All The Details');
				return false;
			}


			if (damage === '' && sandextent === '') {
				alert('Please Fill Any Of The Extent')
				return false;
			}
			if (damage === '') {
				damage = parseFloat(0.00);
			}
			if (sandextent === '') {
				sandextent = parseFloat(0.00);
			}

			if (damageValue === 0 && sandextent === 0) {
				alert('Any Of The Extent Should Be Greater Than Zero');
				return false;
			}

			if (isNaN(extent) || isNaN(damageValue) || (sand !== 'N' && isNaN(sandextent))) {
				alert('Please Enter Valid Extent');
				return false;
			}
			if ((eval(damageValue) > eval(extent)) || (eval(sandextent) > eval(extent))) {
				alert('Extent Cannot Be Greater Than Crop Extent');
				return false;
			}
			if (damageValue < 0 || sandextent < 0) {
				alert('Extent Cannot Be Negative');
				return false;
			}


			const rowData = {
				districtName: document.getElementById('wbdcode' + i).value,
				mandalName: document.getElementById('wbmcode' + i).value,
				cr_vcode: document.getElementById('wbvcode' + i).value,
				bookingId: document.getElementById('booking' + i).value,
				aadhaar: document.getElementById('aadhaar' + i).value,
				oc_name: document.getElementById('ocname' + i).value,
				oc_fname: document.getElementById('ocfname' + i).value,
				crop: document.getElementById('crop' + i).value,
				tenantOrOwner: document.getElementById('owner' + i).value,
				khNo: document.getElementById('khata' + i).value,
				crSno: document.getElementById('survey' + i).value,
				extent: document.getElementById('extent' + i).value,
				irrigatedOrRainfed: document.getElementById('irrmethod' + i).value,
				variety: document.getElementById('variety' + i).value,
				cr_no: document.getElementById('cr_no' + i).value,
				sow_date: document.getElementById('cr_sow_date' + i).value,
				damagedArea: damage,
				caste: caste,
				sand: sand,
				sandextent: sandextent,
				//		ifscCode: document.getElementById('ifscCode' + i).value,
				//        ownerName: ownerName,
				//       ownerFatherName: ownerFatherName
			};

			selectedData.push(rowData);
		}
	}

	for (let i = 0; i < rows_bkg.length; i++) {
		const row = rows_bkg[i];
		const checkbox = row.querySelector('input[type="checkbox"]');
		if (checkbox && checkbox.checked) {
			const damage = document.getElementById('damage_bkg' + i).value.trim();
			//		const bankAccount = document.getElementById('bankaccount_bkg' + i).value.trim();
			//		const bankName = document.getElementById('bankname_bkg' + i).value.trim();
			//	const bankBranch = document.getElementById('bankbranch_bkg' + i).value.trim();
			//	const bankType = document.getElementById('banktype_bkg' + i).value.trim();
			const crop = document.getElementById('crop_bkg' + i).value.trim();
			const irr = document.getElementById('irr_bkg' + i).value.trim();
			//     const ownerName = document.getElementById('ownername' + i).value.trim();
			//     const ownerFatherName = document.getElementById('ownerfathername' + i).value.trim();
			const occup_extent = parseFloat(document.getElementById('occup_extent_bkg' + i).value.trim());
			const extent = parseFloat(document.getElementById('extent_bkg' + i).value.trim());
			const caste = parseFloat(document.getElementById('caste_bkg' + i).value.trim());
			const sandextent = parseFloat(document.getElementById('sandextent_bkg' + i).value.trim());
			const sand = document.getElementById('sandtype_bkg' + i).value.trim();
			const damageValue = parseFloat(damage);

			if (caste === '' || extent === '' || irr === '' || crop === '' || (sand !== 'N' && sandextent === '')) {
				alert('Please Fill All The Details');
				return false;
			}
			if (isNaN(extent) || isNaN(damageValue) || isNaN(extent) || (sand !== 'N' && isNaN(sandextent))) {
				alert('Please Enter Valid Extent');
				return false;
			}
			if (damage === '' && sandextent === '') {
				alert('Please Fill Any Of The Extent')
				return false;
			}
			if (damage === '') {
				damage = parseFloat(0.00);
			}
			if (sandextent === '') {
				sandextent = parseFloat(0.00);
			}
			if (eval(extent) > eval(occup_extent)) {
				alert('Crop Extent Cannot Be Greater Than Occupant Extent Which is ' + occup_extent);
				return false;
			}
			if ((eval(damageValue) > eval(extent)) || (eval(sandextent) > eval(extent))) {
				alert('Extent Cannot Be Greater Than Crop Extent');
				return false;
			}
			if (damageValue === 0 && sandextent === 0) {
				alert('Any Of The Extent Should Be Greater Than Zero');
				return false;
			}
			if (damageValue < 0 || sandextent < 0) {
				alert('Extent Cannot Be Negative');
				return false;
			}

			const rowData = {
				districtName: document.getElementById('wbdcode' + i).value,
				mandalName: document.getElementById('wbmcode' + i).value,
				cr_vcode: document.getElementById('wbvcode' + i).value,
				bookingId: document.getElementById('booking_bkg' + i).value,
				aadhaar: document.getElementById('aadhaar_bkg' + i).value,
				oc_name: document.getElementById('ocname_bkg' + i).value,
				oc_fname: document.getElementById('ocfname_bkg' + i).value,
				crop: 0,
				tenantOrOwner: document.getElementById('owner_bkg' + i).value,
				khNo: document.getElementById('khata_bkg' + i).value,
				crSno: document.getElementById('survey_bkg' + i).value,
				extent: document.getElementById('extent_bkg' + i).value,
				irrigatedOrRainfed: document.getElementById('irr_bkg' + i).value,
				damagedArea: damage,
				caste: caste,
				crop_bkg: crop,
				irr_bkg: irr,
				sand_bkg: sand,
				sandextent_bkg: sandextent,
				cropextent: extent,
				//	ifscCode: document.getElementById('ifscCode_bkg' + i).value,
				//        ownerName: ownerName,
				//       ownerFatherName: ownerFatherName
			};

			selectedData.push(rowData);
		}
	}

	$.ajax({
		url: './saveDamagedData',
		method: 'POST',
		contentType: 'application/json',
		data: JSON.stringify(selectedData),
		success: function(response) {
			alert('Data saved successfully');
			window.location.reload();
		},
		error: function(error) {
			alert('Error saving data');
		}
	});
}




function isAlpha(event) {
	const charCode = event.which ? event.which : event.keyCode;
	if ((charCode >= 65 && charCode <= 90) || (charCode >= 97 && charCode <= 122) || charCode === 8 || charCode === 32) {
		return true;
	}
	event.preventDefault();
	return false;
}

function isAlphanumeric(event) {
	const charCode = event.which ? event.which : event.keyCode;
	if ((charCode >= 48 && charCode <= 57) || (charCode >= 65 && charCode <= 90) || (charCode >= 97 && charCode <= 122) || charCode === 8) {
		return true;
	}
	event.preventDefault();
	return false;
}
