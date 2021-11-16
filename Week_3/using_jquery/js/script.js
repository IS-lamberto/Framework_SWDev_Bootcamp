// invoke jQuery
$(function () {

    // listen to the button click
    $('#btnGetPhotos').click(function () {
        console.log("click")
        $('#output').empty() // empty out the 'output'
        // make a GET call to the API
        $.get('https://jsonplaceholder.typicode.com/photos', function (photos) {
            // construct a HTML fragment
            let html = "<div class='photo'>"
            // iterate over the returned data
            $.each(photos, function (i, photo) {
                console.log(photo)
                // add to the fragment of HTML
                html += `<h3><a href=${photo.url}>${photo.id}) ${photo.title}</a></h3>`
                html += `<img src="${photo.thumbnailUrl}">`
            }) // end of .each call-back function
            // inject the HTML fragment into the page
            html += '</div>'
            $('#output').append($(html))
        }) // end of .get call-back function
    }) // end of click event handler call-back
}) // end of jQuery call-back