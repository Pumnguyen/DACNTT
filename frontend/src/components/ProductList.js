import React, { useEffect, useState } from 'react';
import axios from 'axios';

function ProductList() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/products')
      .then((response) => {
        setProducts(response.data);
      })
      .catch((error) => {
        console.error('Lỗi khi tải dữ liệu sản phẩm:', error);
      });
  }, []);

  return (
    <div>
      <h2>Danh sách sản phẩm</h2>
      <ul>
        {products.map((product) => (
          <li key={product.id}>
            <strong>{product.name}</strong> - {product.price.toLocaleString()} VND
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ProductList;
