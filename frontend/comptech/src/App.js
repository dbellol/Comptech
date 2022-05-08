import NavBar from './common/navbar/NavBar';
import './App.css';
import Home from './pages/Home/Home';
import { BrowserRouter  as Router, Routes, Route } from 'react-router-dom'

function App() {
  return (
 
    <Router basename={process.env.PUBLIC_URL}>
      <NavBar />
      <Routes>
      <Route path="/" element={<Home />} />     
       </Routes>
    </Router>
       
  );
}

export default App;
