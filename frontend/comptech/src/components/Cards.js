import Card from 'react-bootstrap/Card'
import Button from 'react-bootstrap/esm/Button';

const Cards = () => {
  return (
    <div>
      <Card style={{ width: "18rem" }}>
        <Card.Img variant="top" src="https://media.ldlc.com/r1600/ld/products/00/05/94/32/LD0005943216.jpg" />
        <Card.Body>
          <Card.Title>Nvidia RTX 3090 Ti</Card.Title>
          <Card.Text>
            Some quick example text to build on the card title and make up the
            bulk of the card's content.
          </Card.Text>
          <Button variant="primary">Go somewhere</Button>
        </Card.Body>
      </Card>
    </div>
  );
};

export default Cards;
