$(document).ready(function() {
    $('.toggle-nav').click(function(e) {
        $(this).toggleClass('active');
        $('.menu ul').fadeToggle(200);

        e.preventDefault();
    });
});