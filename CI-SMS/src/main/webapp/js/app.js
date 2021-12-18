function clearAll(){
	document.getElementById("sidErr").style.display = 'none';
	document.getElementById("snameErr").style.display = 'none';
	document.getElementById("sfeeErr").style.display = 'none';
}

function validateForm() {
	clearAll();
	
  let sid = document.forms["addStudent"]["sid"].value;
  let sname = document.forms["addStudent"]["sname"].value;
  let sfee = document.forms["addStudent"]["sfee"].value;
  
  console.log(sid+" "+sname+" "+sfee);
  let flag = true;
  
  if (sid == "") {
    // alert("Sid must be filled out");
	document.getElementById("sidErr").style.display = 'inline';
    flag = false;
  }
  
  if (sname == "") {
	   // alert("Name must be filled out");
	  document.getElementById("snameErr").style.display = 'inline';
	    flag = false;
  }
  
  if (sfee == "") {
	    //alert("Sfee must be filled out");
	  document.getElementById("sfeeErr").style.display = 'inline';
	  flag = false;
  }
  
  return flag;
}