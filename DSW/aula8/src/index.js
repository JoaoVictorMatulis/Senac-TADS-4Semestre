import React from 'react';
import ReactDOM from 'react-dom/client';

import './index.css';


import { BrowserRouter, Routes, Route } from 'react-router-dom'

import App from './pages/home/';
import Contato from './pages/contato/';
import Sobre from './pages/sobre/';
import NaoEncontrado from './pages/naoencontrado/';

const root = ReactDOM.createRoot(document.getElementById('root'));

root.render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        
        <Route path='/' element={<App />} />
        <Route path='/contato' element={<Contato />} />
        <Route path='/sobre' element={<Sobre />} />
        
        <Route path='/*' element={<NaoEncontrado />} />
        
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);