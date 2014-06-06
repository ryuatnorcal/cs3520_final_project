/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/****************************************************
 * JQuery
 ****************************************************/

var ready;
ready = function() {
/************************************************************
	Authotication Bar 
************************************************************/

$("#login").click(function(){
  $("#signInForm").fadeIn(1500,function(){
    $(this).removeClass("hide").addClass("active");
  });
});
$("#signup").click(function(){
  $("#signUPForm").fadeIn(1500,function(){
    $(this).addClass("active").removeClass("hide");
  });
});

$(".exit").click(function(){
  $(".active").fadeOut(1500,function(){
    $(this).addClass("hide").removeClass("active");
  });
});
/************************************************************
	Scroll Bar 
************************************************************/
// panel 1 button action 
	$('#menuSelectedPanel2').click(function(){	
		$('html,body').animate({ 
			scrollTop: $("#panel2").offset().top
		}, 1500);
	});
	$('div#menuSelectedPanel3').click(function(){
		$('html,body').animate({
      scrollTop: $("#panel3").offset().top
    }, 1500);
	});
  // hover action 
  $('.menuCell').mouseover(function(){
    var target = "#" + $(this).attr('id');
      $(target).addClass("tar");
  }).mouseleave(function(){
      $(this).removeClass("tar");
  });
  
  
  //panel 2 button action 
	$('div#button1,div#button4').click(function(){
      $('html,body').animate({
        scrollTop: $("#panel1").offset().top
      }, 1500);
    });
  $('div#button5').click(function(){
    $('html,body').animate({
      scrollTop: $("#panel2").offset().top
    }, 1500);
  });
	$('div#button3').click(function(){
    $('html,body').animate({
      scrollTop: $("#panel3").offset().top
    }, 1500);
  });
  // hover action 
  $('div#button1').mouseover(function(){
      $(this).css("background-color","#000000");
      $('#buttonDisplay1').append("Home");
  }).mouseleave(function(){
      $(this).css("background-color","#ffffff");
      $('#buttonDisplay1').empty();
  });
  $('div#button4').mouseover(function(){
      $(this).css("background-color","#000000");
      $('#buttonDisplay2').append("Home");
  }).mouseleave(function(){
      $(this).css("background-color","#ffffff");
      $('#buttonDisplay2').empty();
  });
  
  $('div#button5').mouseover(function(){
      $(this).css("background-color","#000000");
      $('#buttonDisplay2').append("About");
  }).mouseleave(function(){
      $(this).css("background-color","#ffffff");
      $('#buttonDisplay2').empty();
  });
  
  $('div#button3').mouseover(function(){
      $(this).css("background-color","#000000");
      $('#buttonDisplay1').append("Shop");
  }).mouseleave(function(){
      $(this).css("background-color","#ffffff");
      $('#buttonDisplay1').empty();
  });
/************************************************************************
 * Store
 ************************************************************************/
  $("div#surfboard").mouseover(function(){
    $("#surf").addClass("show").removeClass("hide");
  }).mouseleave(function(){
    $("#surf").addClass("hide").removeClass("show");
  });
  $("div#pants").mouseover(function(){
    $("#bottom").addClass("show").removeClass("hide");
  }).mouseleave(function(){
    $("#bottom").addClass("hide").removeClass("show");
  });
  $("div#tee").mouseover(function(){
    $("#top").addClass("show").removeClass("hide");
  }).mouseleave(function(){
    $("#top").addClass("hide").removeClass("show");
  });
  
  $("div.goStoreTopsID").mouseover(function(){
    $("span.goStoreTop").addClass("show").removeClass("hide");
  }).mouseleave(function(){
    $("span.goStoreTop").addClass("hide").removeClass("show");
  });
  
  $("div.goTopsID").mouseover(function(){
    $("span.goTops").addClass("show").removeClass("hide");
  }).mouseleave(function(){
    $("span.goTops").addClass("hide").removeClass("show");
  });
  
  $("div.goBottomsID").mouseover(function(){
    $("span.goBottoms").addClass("show").removeClass("hide");
  }).mouseleave(function(){
    $("span.goBottoms").addClass("hide").removeClass("show");
  });
  
  $("div.goStoreTopID").mouseover(function(){
    $("span.goStoreTop").addClass("show").removeClass("hide");
  }).mouseleave(function(){
    $("span.goStoreTop").addClass("hide").removeClass("show");
  });
  
  $("div.goSurfboardsID").mouseover(function(){
    $("span.goSurfboards").addClass("show").removeClass("hide");
  }).mouseleave(function(){
    $("span.goSurfboards").addClass("hide").removeClass("show");
  });
  
  $("div.goStoreTopsID").click(function(){
    $('html,body').animate({
      scrollTop: $("#panel5").offset().top
    }, 1500);
  });
  
  $("div.surfboard,div#goSurfboards").click(function(){
    $('html,body').animate({
      scrollTop: $("#panel8").offset().top
    }, 1500);
  });
  $("div.pants,div#goBottoms").click(function(){
    $('html,body').animate({
      scrollTop: $("#panel7").offset().top
    }, 1500);
  });
  $("div.tee,div#goTops").click(function(){
    $('html,body').animate({
      scrollTop: $("#panel6").offset().top
    }, 1500);
  });
  
/****************************************************
 * Item Detail 
 *****************************************************/  

$(".cube").click(function(){
  var id = $(this).attr('id');
  var cube = "#"+id;
  id = "#big-" + id;
  $(id).toggle(1500,function(){
  });
});
/*************************************************************
 * storePageMenuController
 ************************************************************/

// end of JQuery   
};
$(document).ready(ready);
$(document).on('page:load', ready);

