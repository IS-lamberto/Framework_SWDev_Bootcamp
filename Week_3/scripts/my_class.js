class Weather { // no public, private, etc
    // members of this class
    _description = 'windy'
    _temperature = 8
    _wind_speed = 12

    constructor() { } // no data typing

    // methods of this class
    get description() {
        return this._description
    }

    set description(new_desc) {
        if (new_desc != '' && typeof (new_desc) == 'string') {
            this._description = new_desc
        } else {
            this._description = 'default'
        }
    }

    get temperature() {
        return this._temperature
    }

    set temperature(new_temp) {
        if(typeof(new_temp) == 'number' && (new_temp >= -18 && new_temp <= 42)) {
            this._temperature = new_temp
        } else {
            this._temperature = 12 // sensible temperature to default to
        }
    }

    showWeather() {
        let w = `It is ${this.description} at ${this.temperature}&deg; wind speed is ${this.wind_speed}.`
        output.innerHTML = w
    }
}