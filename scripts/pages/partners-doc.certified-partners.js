var tabHander = function () {
	//enable link to tab
	var hash = window.location.hash;
	var menuItems = $('.sections li a','#scrollable-element');
	if (hash) {
		$('.nav-tabs a[href="'+hash+'"]').tab('show');
	}

	// Change hash for page-reload
	function hashUpdate(e) {
		window.location.hash = e.target.hash;
	}
	function menuUpdate(e) {		
		hashUpdate(e);
		menuItems.removeClass('active');
		$('.sections li a[aria-controls ="'+e.target.getAttribute('aria-controls')+'"]','#scrollable-element').addClass('active');
	}
	$('.nav-tabs a').on('shown', hashUpdate).on('click', menuUpdate);

	//left menu listener
	$('.sections li a','#scrollable-element').on('click', function(e) {
		e.preventDefault();
		// Find the target tab li (or anchor) that links to the content to show.		
		$('.nav-tabs li a[aria-controls="'+ e.target.getAttribute("aria-controls") +'"]').tab('show');
		hashUpdate(e);
		window.scrollTo(0,0);
		$(this).parent().siblings('li').find('a').removeClass('active');
		$(this).addClass('active');
	});
};

$( document ).on('ready', function(e){
	tabHander();	
});

// $(function(){
$( document ).on('ready', function(){
	$('.card').each(function () {
		var me = $(this);
		me.hover(function(){
			me.toggleClass('applyflip');
		});
	});
});


