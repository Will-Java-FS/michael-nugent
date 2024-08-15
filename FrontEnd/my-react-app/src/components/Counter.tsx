import { useState } from "react";

export default function Counter() {

    const [value, setValue] = useState(0);

    function increase() {
        setValue(value+1);
        console.log(value);
    }

    return (
        <div className="Counter">
            <h3>
                The value is: {value}
            </h3>
            <button onClick={increase}>Increase!</button>
        </div>
    )
}
