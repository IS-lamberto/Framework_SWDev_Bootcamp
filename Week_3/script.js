// JavaScript is never 'compiled', it is interpreted by the browser
// variables
var x = 1 // old
let y = 2 // new - do this
let usr = 'Grace Hopper' // a string of text
let age = 42 // a number

let c = `${usr} age ${age}` // same as concat usr + ' age ' + age, but more efficient
username.value = c

// functions
const handleButton = () => { // same as function(){}
    event.preventDefault() // we need to prevent the form from submitting
    console.log("The button was clicked") // this function responds to the button being clicked
    let u = username.value // grab the username field value
    let p = password.value // grab the password field value
    if (p.length < 8) {
        // alert('Password must be 8 or more characters')
        pwd.innerHTML = 'Password must be 8 or more characters'
    } else {
        pwd.innerHTML = p
    }
    person.innerHTML = u
}

// events
btnGo.addEventListener('click', handleButton)
        
// classes