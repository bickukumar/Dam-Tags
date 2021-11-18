(function ($window) {


$window.adaptTo("foundation-registry").register("foundation.validation.validator", {
	selector: "[data-should-contain]",
    validate: function(el) {



		let shouldContain = parseInt(el.getAttribute("data-should-contain"));

        let input = el.value;
        console.log(input.length);

        if(input.length < shouldContain){
			return "The field should contain at least 6 characters!";
        } else {
            return "";
        }

    }

});
})($(window));
