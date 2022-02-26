import './style.scss';
import { ReactComponent as MainImage } from '../../core/assets/images/main-image.svg';
const Home = () => (
  <div className='home-container'>
    <div className='row home-content'>
      <div className='col-6 home-text'>
        <h1 className='text-title'>
          The best ecommerce
          <br /> catalog maker
        </h1>
        <p className='text-subtitle'>
          This product catalog maker is fully <br/>equipped with all your product.
        </p>
      </div>
      <div className="col-6">
        <MainImage className='main-image'/>
      </div>
    </div>
  </div>
)
export default Home;