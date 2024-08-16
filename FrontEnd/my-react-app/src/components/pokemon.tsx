import { useState } from "react";
import axios from 'axios'

export default function Pokemon() {
    const [pokemons, setPokemons] = useState([]);

    //asynchronous function to connect to our base endpoint
    const getPokemonData = async () => {

        //axios will return a response with our function
        const response = await axios.get("https://pokeapi.co/api/v2/pokemon?limit=30")
            .then(res => {
                return res.data;
            })
            .catch(err => {
                console.error("Error in pokemon data fetch: ", err)
            })
        console.log(response)
        setPokemons(response.results);
    }

    return (
        <>
            {/* <p>{pokemons}</p> */}
            <table>
                <thead>
                    <tr>
                        <th>Index</th>
                        <th>Name</th>
                        <th>Link</th>
                    </tr>
                </thead>
                <tbody>
                    {pokemons && pokemons.map &&
                        pokemons.map((pokemon: { name: string, url: string }, index) => {
                            return <tr key={pokemon.name}>
                                <td>{index}</td><td>{pokemon.name}</td>
                                <td>{pokemon.url}</td>
                            </tr>
                        })}
                </tbody>
            </table>
            <button onClick={getPokemonData}>Get Pokemon</button>
        </>
    )
}