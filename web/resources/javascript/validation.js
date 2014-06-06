/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/************************************************************
 * Form 
 ************************************************************/
function userRegFrom(){
  var first = document.forms["regForm"]["first_name"].value;
  var last = document.forms["regForm"]["last_name"].value;
  var email = document.forms["regForm"]["email"].value;
  var at = email.indexOf("@");
  var dot = email.indexOf(".");
  var phone = document.forms["regForm"]["phone"].value;
  var user = document.forms["regForm"]["username"].value;
  var pw = document.forms["regForm"]["pw"].value;
  var addr1 = document.forms["regForm"]["address1"].value;
  var city = document.forms["regForm"]["city"].value;
  var zip = document.forms["regForm"]["zip"].value;
  var error_string = "<p>";
  
  if(first.length < 3 || first === null || first === "" ){
    error_string = error_string + "First Name input must be more than 3 charactors<br /> \n";
  }
  if(last.length < 3 || last === null || last === ""){
    error_string = error_string + "Last Name input must be more than 3 charactors<br /> \n";
  }
  if(at < 1 || dot < at +2 ||dot + 2 >= email.length || email === null || email ==="" ){
    error_string = error_string + "Email is invalid<br /> \n";
  }
  if(isNaN(phone) || phone.length !== 10){
    error_string = error_string + "Phone Number is invalid<br />\n";
  }
  if(user.length < 3 || user === null || user === ""){
    error_string = error_string + "Username is invalid <br />\n";
  }
  if(pw.length < 7 || pw === null || pw === ""){
    error_string = error_string + "Password has to be more than 6 chars <br />\n";
  }
  if(isNaN(zip) || zip.length !== 5){
    error_string = error_string + "ZIP code has to be 5 digits. Invalid ZIP \n";
  }
  error_string = error_string + "</p>";
  //div.insertAdjacentHTML( 'error_msg_box', error_string );
  if(error_string.length > 7){
   
    $(".error_msg_box").empty();
    $(".error_msg_box").append(error_string).removeClass("hide").css("color","#FF0000");
    return false;
  }
  return true;
}

function userLoginForm(){
  var user = document.forms["userlogin"]["username"].value;
  var pw = document.forms["userlogin"]["password"].value;
  var error_str = "<p>";
  if(user.length < 3 || user === null || user === "")
  {
    error_str = error_str + "username has to be more than 3 letters<br />";
  }
  if(pw.length < 7 || pw === null || pw === ""){
    error_str = error_str + "pass words has to be more than 8 letters <br />";
  }
  error_str = error_str + "</p>";
  //div.insertAdjacentHTML( 'error_msg_box', error_string );
  if(error_str.length > 7 ){
    //alert(error_string);
    $(".error_msg_box").empty();
    $(".error_msg_box").append(error_str).removeClass("hide").css("color","#FF0000");
    return false;
  }
  return true;
}



