var _gaq = _gaq || [];
_gaq.push(['_setAccount', 'UA-29893903-1']);
_gaq.push(['_trackPageview', location.pathname + location.search + location.hash]);

(function() {
  var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
  ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
  var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
})();

function recordEvent(action,label) {
  if (typeof _gaq != "undefined") {
    _gaq.push(['_trackEvent', 'Link Click', action, label]);
  } else {
    if (console && console.log) console.log('Link click: '+action+" "+label);
  }
}

function isHashLink(index) {
  return this.href.indexOf(document.location.href+'#') == 0;
}

// Add a click event handler to all # links on the page:
$('a').filter(isHashLink).bind('click', function() {
  recordEvent('internal', this.href.substring(document.location.href.length));
} );

// Record links to other sites:
$('a').not(isHashLink).bind('click', function() {
  recordEvent('external', this.href);
} );

