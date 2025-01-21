 // multiplication table d
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
            function validateVerhoeff(num) {
                //   alert(num);
                var c = 0;
                var myArray = [];
                myArray = StringToReversedIntArray(num);
                // alert(myArray);
                for (var i = 0; i < myArray.length; i++)
                {
                    c = d[c][p[(i % 8)][myArray[i]]];

                }

                return (c == 0);
            }
            function StringToReversedIntArray(num) {
                var myArray = [];

                for (var i = 0; i < num.length; i++)
                {
                    myArray[i] = parseInt(num.substring(i, i + 1));
                }
                myArray = Reverse(myArray);

                return myArray;

            }
            function Reverse(myArray) {
                var reversed = [];

                for (var i = 0; i < myArray.length; i++)
                {
                    reversed[i] = myArray[myArray.length - (i + 1)];
                }
                return reversed;
            }
            function isNumberKey(evt)
            {
                var charCode = (evt.which) ? evt.which : evt.keyCode;
                if (charCode != 46 && charCode > 31
                        && (charCode < 48 || charCode > 57))
                    return false;

                return true;
            }
            function confirm() {

                var emp_code = document.f2.empcode.value;
                var emp_name = document.f2.empname.value;
                var emp_desig = document.f2.empdesig.value;
                var mobile_phone = document.f2.mobile_phone.value;
                var email = document.f2.emailid.value;
                var adhaar = document.f2.aadhaar_id.value;


                if (emp_code === "") {
                    alert("Enter Employee Code ");
                    document.f2.empcode.focus();
                    return false;

                }
                if (emp_name === "") {
                    alert("Enter Employee Name ");
                    document.f2.empname.focus();
                    return false;

                }
                if (emp_desig === "") {
                    alert("Enter Employee Designation ");
                    document.f2.empdesig.focus();
                    return false;

                }

                if (mobile_phone.length != 10) {
                    alert("Invalid Mobile ");
                    document.f2.mobile_phone.focus();
                    return false;

                }
                var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
                if (email == 0) {
                    alert("Email  must be filled out");
                    return false;
                } else if (!filter.test(email)) {
                    email.value = "";
                    alert('please provide valid Email Id');
                    document.f2.emailid.focus();
                    return false;
                }


                if (adhaar === 0) {
                    alert("Aadhar Number must be filled out");
                    return false;
                }

                if (adhaar.length === 12) {
                    if (validateVerhoeff(adhaar)) {
                        // document.f2.userid.value=userid;
                        document.f2.method = "post";
                        document.f2.action = "emp_profilesave.jsp";
                        document.f2.submit();
                    } else {
                        alert("Invalid Aadhar");
                        document.f2.emailid.focus();
                        return false;
                    }
                } else {
                    alert("Invalid Aadhar");
                    return false;
                }
            }
            function validateEmail(email) {
                //var email = document.getElementById('emailid');
                alert(email);
                var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
                if (email === '') {
                    alert('Please Enter Email-Id');
                    document.f2.emailid.focus();
                    return false;

                } else if (!filter.test(email.value)) {
                    email.value = "";
                    alert('please provide valid Email Id');
                    document.f2.emailid.focus();
                    return false;
                }
            }