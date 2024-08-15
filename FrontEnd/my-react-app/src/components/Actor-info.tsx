import React from 'react'

/**
 * 
 * @param props {name:string,age:number,worth:number}
 * @returns 
 */

function actor(props: { name: string, age: number, worth: number }) {

  const formatter = new Intl.NumberFormat('en-US', {
    style: 'currency',
    currency: 'USD',
  });
  
  // const name = props.name;

  const { name, age, worth } = props;

  return (
    <div>
      <table>
        <caption>Actor Information</caption>
        <tbody>
          <tr>
            <th>Name</th><td>{name}</td>
          </tr>
          <tr>
            <th>Age</th><td>{age}</td>
          </tr>
          <tr>
            <th>Worth</th><td>{formatter.format(worth)}</td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default actor