import React, { useRef } from 'react'

function ContactForm() {

    const emailInput = useRef<HTMLInputElement>(null);

    function sendEmail() {
        console.log(emailInput.current!.value);
    }

    return (
        <div className='ContactForm'>
            <h3>Request a follow-up email.</h3>
            <input type="text" ref={emailInput} />
            <button onClick={sendEmail}>Email Me</button>
        </div>
    )
}

export default ContactForm