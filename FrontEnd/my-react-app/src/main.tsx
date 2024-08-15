import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
// import App from './App.tsx'
import Intro from './components/Intro.tsx'
import Actor from './components/Actor-info.tsx'
import './index.css'
import MovieList from './components/MovieList.tsx'
import ContactForm from './components/ContactForm.tsx'
import Counter from './components/Counter.tsx'


const chris = {
  name: "Chris Evans",
  age: 42,
  worth: 250000000
}

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    {/* <App /> */}
    <Intro />
    <Actor name='Ryan Reynolds' age={47} worth={350000000} />
    <Actor name='Robert Downey Jr.' age={59} worth={300000000} />
    <Actor {...chris} />
    <MovieList />
    <ContactForm />
    <Counter />
  </StrictMode>
)
