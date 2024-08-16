// This component dynamically generates multiple JSX elements

function MovieList() {

    const movies = ["Thor", "Iron Man", "Captain America"];

    const movieLis = movies.map((movie, i) => <li key={i}>{movie}</li>)

    return (
        <div className='MovieList'>
            <ul>
                {movieLis}
            </ul>
        </div>
    )
}


export { MovieList }