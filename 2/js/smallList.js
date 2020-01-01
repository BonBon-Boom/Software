var http_request = false;

function getXMLHttpRequest() {
	if (window.XMLHttpRequest) {
		http_request = new XMLHttpRequest();
		if (http_request.overrideMimeType) {
			http_request.overrideMimeType("text/xml;charset=UTF-8");
		}
	} else {
		if (window.ActiveXObject) {
			try {
				http_request = new ActiveXObject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					http_request = new ActiveXObject("Microsoft.XMLHTTP");
				} catch (e) {
				}
			}
		}
	}
	if (!http_request) {
		window.alert("please update your ie");
		return false;
	}
}
/* callback */

function bigTypeChange() {
	getXMLHttpRequest();
	var bigTypeId = document.getElementById("bigType").value;
	http_request.onreadystatechange = biTypeBack;
	http_request.open("GET", "smallTypeAction!smallTypeSelectBigIdHead?bigId="
			+ bigTypeId, true);
	http_request.send(null);
	provinceCheck = true;
}
function biTypeBack() {
	if (http_request.readyState == 4) {
		if (http_request.status == 200) {
			var small = document.getElementById("smallList");
			small.innerHTML = http_request.responseText;
		}
	}
}
