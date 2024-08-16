import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
// import App from './App.tsx'
import './index.css'
import { BrowserRouter, Routes, Route } from 'react-router-dom'
import Layout from './pages/layout.tsx'
import Home from './pages/home.tsx'
import Blogs from './pages/blogs.tsx'
import ContactUs from './pages/contact-us.tsx'
import PokemonPage from './pages/pokemon.tsx'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path="*" element={<Layout />}>
        </Route>
      </Routes>
      <Routes>
        <Route index element={<Home />} />
        <Route path="/blogs" element={<Blogs />} />
        <Route path='/contact-us' element={<ContactUs />} />
        <Route path='/pokemon' element={<PokemonPage />} />
      </Routes>
    </BrowserRouter>
  </StrictMode>
)
