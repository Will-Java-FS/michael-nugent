//function component
import React from 'react'

export default function Intro() {


  const myName = "Mike";

  //JSX element
  return (
    <div>
      <h1>
        Intro
      </h1>
      <p>Hello!  Welcome to my site.  My name is {myName}.</p>
    </div>
  )
}
