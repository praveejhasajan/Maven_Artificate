// Toggle navigation menu
const menuBtn = document.querySelector('.menu-btn');
const navLinks = document.querySelector('.nav-links');
const links = document.querySelectorAll('.nav-links li');

menuBtn.addEventListener('click', () => {
	navLinks.classList.toggle('open');
	links.forEach(link => {
		link.classList.toggle('fade');
	});
});

// Smooth scroll to anchor links
const anchors = document.querySelectorAll('a[href^="#"]');

for (let anchor of anchors) {
	anchor.addEventListener('click', function (e) {
		e.preventDefault();
		
		const target = document.querySelector(this.getAttribute('href'));
		
		if (target) {
			window.scrollTo({
				top: target.offsetTop,
				behavior: 'smooth'
			});
		}
	});
}

// Pricing plan selection
const pricingPlans = document.querySelectorAll('.pricing li');

pricingPlans.forEach(plan => {
	plan.addEventListener('click', () => {
		pricingPlans.forEach(p => p.classList.remove('active'));
		plan.classList.add('active');
	});
});
