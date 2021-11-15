// data models
model = [
    {title:'Mass Effect', rating:7},
    {title:'Skyrim', rating:10},
    {title:'Red Dead Redemption 2', rating:10}
]

// explore JSON tools
let j = JSON.stringify(model)
console.log(j, typeof(j))

// event call-back functions
const handleButton = ()=> {

    event.preventDefault()
    // validate

    // grab the user-values for category and num
    let c = category.value
    let n = num.value
    let apiUrl = `https://jsonplaceholder.typicode.com/${c}/${n}`
    // use these values to make a http request for data
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => console.log(data));
}

// event bindings
btnGetData.addEventListener('click', handleButton)