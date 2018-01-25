$(function() {
	// solving the active menu problem
	switch (menu) {
	case 'About Us':
		$('#about').addClass('active');
		break;
	case 'Service':
		$('#service').addClass('active');
		break;
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
	case 'Issue Problem':
		$('#issue').addClass('active');
		break;
	case 'All Products':
		$('#showAllproducts').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;

	}

});