// data models

// event call-back functions
const handleButton = ()=> {

    event.preventDefault()
    // validate

    // grab the user-values for category and num
    c = category.value
    n = num.value
    apiUrl = `https://jsonplaceholder.typicode.com/${c}/${n}`
    // use these values to make a http request for data
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => console.log(data));
}

// event bindings
btnGetData.addEventListener('click', handleButton)