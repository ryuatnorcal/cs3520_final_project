<script>
  
  // now web app knows where to find external files 
  var base_css_path = "css/base.css";
  var jquery_min_path = "javascript/jquery-1.11.0.min.js";
  var jquery_ui_path = "javascript/jquery-ui-1.10.4.min.js";
  var jquery_cookies_path = "javascript/jquery.cookie.js";
  var js_validation_path = "javascript/validation.js";
  var base_js_path = "javascript/base.js";
  var prefix_inSource = "../";
  var prefix_parentSource = "resources/";
  var css_head = "<link href='"; 
  var css_tail = "' rel='stylesheet' type='text/css' />";
  var js_head = "<script src='";
  var js_tail = "' ><\/script>";
  var full_url = document.URL;
  var directly;
  var i = 0;
  var bool = false;
  
  if(full_url.indexOf("resources") > 0){ bool = true;  }
  if(bool){  
    // if this true then you are already in resources directory 
    base_css_path = css_head + prefix_inSource + base_css_path + css_tail;
    jquery_min_path = js_head + prefix_inSource + jquery_min_path + js_tail;
    jquery_ui_path = js_head + prefix_inSource + jquery_ui_path + js_tail;
    jquery_cookies_path = js_head + prefix_inSource + jquery_cookies_path + js_tail;
    base_js_path = js_head + prefix_inSource + base_js_path + js_tail;
    js_validation_path = js_head + prefix_inSource + js_validation_path + js_tail;
  }
  else{
    base_css_path = css_head + prefix_parentSource + base_css_path + css_tail;
    jquery_min_path = js_head + prefix_parentSource + jquery_min_path + js_tail;
    jquery_ui_path = js_head + prefix_parentSource + jquery_ui_path + js_tail;
    jquery_cookies_path = js_head + prefix_parentSource + jquery_cookies_path + js_tail;
    base_js_path = js_head + prefix_parentSource + base_js_path + js_tail;
    js_validation_path = js_head + prefix_parentSource + js_validation_path + js_tail;
  }
  document.writeln(base_css_path);
  document.writeln(jquery_min_path);
  document.writeln(jquery_ui_path);
  document.writeln(jquery_cookies_path);
  document.writeln(base_js_path);
  document.writeln(js_validation_path);

</script>

<!-- @import form validation lib http://formvalidator.net/ -->
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery-form-validator/2.1.47/jquery.form-validator.min.js"></script>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
