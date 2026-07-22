import React, { Component } from "react";
import Cart from "./Cart";

class OnlineShopping extends Component {
    constructor(props) {
        super(props);

        this.items = [
            { itemName: "Laptop", price: 65000 },
            { itemName: "Smartphone", price: 25000 },
            { itemName: "Headphones", price: 3000 },
            { itemName: "Smart Watch", price: 5000 },
            { itemName: "Keyboard", price: 1500 }
        ];
    }

    render() {
        return (
            <div>
                <h2>Online Shopping</h2>

                <table border="1" cellPadding="10">
                    <thead>
                        <tr>
                            <th>Item Name</th>
                            <th>Price</th>
                        </tr>
                    </thead>

                    <tbody>
                        {this.items.map((item, index) => (
                            <Cart key={index} item={item} />
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default OnlineShopping;